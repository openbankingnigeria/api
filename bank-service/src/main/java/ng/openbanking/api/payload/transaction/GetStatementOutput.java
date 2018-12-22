package ng.openbanking.api.payload.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import java.sql.Time;
import java.util.Date;


@Data
public class GetStatementOutput  extends BasePayload {
   

    private String accountNumber;
    private String transactionType;
    private String currency;
    private String narration;
    private String amount;
    private String channel;
    private String debitOrCredit;
    private String referenceId ;
    private Time transactionTime;
    
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date valueDate;
    
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date bookDate;
}
