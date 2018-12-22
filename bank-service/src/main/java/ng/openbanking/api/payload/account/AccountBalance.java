package ng.openbanking.api.payload.account;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountBalance  extends BasePayload {
    private String accountNumber = "0123456789";;
    private String accountName = "Adamu Alliu";
    private BigDecimal availableBalance = new BigDecimal(1000000);
    private BigDecimal clearedBalance = new BigDecimal(1000000);
    private BigDecimal unClearedBalance = new BigDecimal(1000000);
    private BigDecimal lienBalance = new BigDecimal(1000000);
    
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date date = new Date();

   
}
