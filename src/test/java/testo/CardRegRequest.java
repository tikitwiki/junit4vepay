package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.StandardObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CardRegRequest extends StandardObject {

    @JsonProperty("type")
    protected Long type;

    @JsonProperty("extid")
    protected String extid;

    @JsonProperty("timeout")
    protected Long timeout;



    @JsonProperty("successurl")
    protected String successurl;

    @JsonProperty("failurl")
    protected String failurl;

    @JsonProperty("cancelurl")
    protected String cancelurl;

}
