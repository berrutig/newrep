
package countryinfo_schema;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "languages",
    "name",
    "capital",
    "region"
})
public class CountryInfoschema {

    /**
     * languages
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("languages")
    private List<Language> languages = new ArrayList<Language>();
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("capital")
    private String capital;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("region")
    private String region;

    /**
     * languages
     * <p>
     * 
     * (Required)
     * 
     * @return
     *     The languages
     */
    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    /**
     * languages
     * <p>
     * 
     * (Required)
     * 
     * @param languages
     *     The languages
     */
    @JsonProperty("languages")
    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The capital
     */
    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    /**
     * 
     * (Required)
     * 
     * @param capital
     *     The capital
     */
    @JsonProperty("capital")
    public void setCapital(String capital) {
        this.capital = capital;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The region
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * 
     * (Required)
     * 
     * @param region
     *     The region
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

}
