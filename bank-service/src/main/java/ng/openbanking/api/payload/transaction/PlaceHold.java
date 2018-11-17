package ng.openbanking.api.payload.transaction;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class PlaceHold {
   

    private String accountNumber = "0123456789";
    private String holdReferenceId;
    private String amount = "10000";
    private String reason;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date startdate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date enddate;
}
