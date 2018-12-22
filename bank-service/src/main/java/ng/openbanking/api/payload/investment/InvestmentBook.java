package ng.openbanking.api.payload.investment;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import java.util.Date;

@Data
public class InvestmentBook  extends BasePayload {
    private String productId;
    private String accountNumber;
    private String amount;
    private String currency ;
    
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateBooked;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date maturityDate;

}

