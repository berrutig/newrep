
package countryinfo_schema;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "iso639_1",
    "iso639_2",
    "name",
    "nativeName"
})
public class Language {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("iso639_1")
    private String iso6391;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("iso639_2")
    private String iso6392;
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
    @JsonProperty("nativeName")
    private String nativeName;

    /**
     * 
     * (Required)
     * 
     * @return
     *     The iso6391
     */
    @JsonProperty("iso639_1")
    public String getIso6391() {
        return iso6391;
    }

    /**
     * 
     * (Required)
     * 
     * @param iso6391
     *     The iso639_1
     */
    @JsonProperty("iso639_1")
    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The iso6392
     */
    @JsonProperty("iso639_2")
    public String getIso6392() {
        return iso6392;
    }

    /**
     * 
     * (Required)
     * 
     * @param iso6392
     *     The iso639_2
     */
    @JsonProperty("iso639_2")
    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
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
     *     The nativeName
     */
    @JsonProperty("nativeName")
    public String getNativeName() {
        return nativeName;
    }

    /**
     * 
     * (Required)
     * 
     * @param nativeName
     *     The nativeName
     */
    @JsonProperty("nativeName")
    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

}
