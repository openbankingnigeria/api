package ng.openbanking.api.payload.transaction;

import java.sql.Time;
import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


@Data
public class GetStatementOutput {
   

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
