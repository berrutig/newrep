package demo.myaggregator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

//import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class MyAggregator implements AggregationStrategy {

	private byte[] documentToByte(Document document) throws TransformerException
	{
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    StreamResult result=new StreamResult(baos);
	    transformer.transform(new DOMSource(document), result);
	    return baos.toByteArray();
	}
	
	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setNamespaceAware(true);
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document xmlDoc = null;
			
			System.out.println("In body class is " + newExchange.getIn().getBody().getClass().getSimpleName());
			System.out.println("Property value is "+ newExchange.getProperty("result_text"));

			if(oldExchange == null) {
				xmlDoc = builder.newDocument();
				Element countries = xmlDoc.createElement("countries");
				xmlDoc.appendChild(countries );
				Element countryInfo = xmlDoc.createElement("information");
				countries.appendChild(countryInfo);
				countryInfo.appendChild(xmlDoc.createTextNode(newExchange.getProperty("result_text",String.class)));
				
			}else {
				byte[] body =(byte[]) oldExchange.getIn().getBody();
				xmlDoc= builder.parse(new ByteArrayInputStream(body));
				Element rootCountries = xmlDoc.getDocumentElement();
				Element countryInfo = xmlDoc.createElement("information");
				countryInfo.appendChild(xmlDoc.createTextNode(newExchange.getProperty("result_text",String.class)));
				rootCountries.appendChild(countryInfo);
			}
			newExchange.getIn().setBody(documentToByte(xmlDoc));
			return newExchange;

		} catch (Exception e) {
			System.out.println("Unable to parse xml from body");
			e.printStackTrace();
		} 
		return newExchange;
	}

}
