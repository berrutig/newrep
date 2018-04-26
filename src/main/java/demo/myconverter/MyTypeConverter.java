package demo.myconverter;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConverter;
import com.google.gson.Gson;

@Converter
public final class MyTypeConverter {

	@Converter
	public static InputStream doTransform(LinkedHashMap data, Exchange exchange) throws IOException {
		String json = new Gson().toJson(data);
		InputStream is = new ByteArrayInputStream(json.getBytes());
		is.close();
		System.out.println("OKLA message is "+json);
		//TypeConverter converter = exchange.getContext().getTypeConverter();
		//converter.convertTo(InputStream.class, data);
		return is;
	}
}
