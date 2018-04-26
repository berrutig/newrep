
package country_info;

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
public class Countryinfo {

    @JsonProperty("languages")
    private List<Language> languages = new ArrayList<Language>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("region")
    private String region;

    /**
     * 
     * @return
     *     The languages
     */
    @JsonProperty("languages")
    public List<Language> getLanguages() {
        return languages;
    }

    /**
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
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
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
     * @return
     *     The capital
     */
    @JsonProperty("capital")
    public String getCapital() {
        return capital;
    }

    /**
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
     * @return
     *     The region
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     * 
     * @param region
     *     The region
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

}
