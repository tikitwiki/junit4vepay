package testo;

import com.fasterxml.jackson.annotation.JsonProperty;
import framework.StandardObject;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class OutpaycardRequest extends StandardObject {

    @JsonProperty ("card")
    protected Long card;
    @JsonProperty ("cardnum")
    protected String cardnum;
    @JsonProperty ("amount")
    protected Long amount;
    @JsonProperty ("extid")
    protected String extid;
    @JsonProperty ("document_id")
    protected  String document_id;
    @JsonProperty ("fullname")
    protected String fullname;

}
