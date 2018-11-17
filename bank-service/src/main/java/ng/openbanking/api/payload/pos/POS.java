package ng.openbanking.api.payload.pos;

import java.util.Date;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class POS {
    private String terminalId;
    private String merchantId;
    private String merchantName ;
    private String email ;
    private String phone;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateDeployed;
    private String currency ;
    private String terminalType;
    private String ptsa;
    private String ptsp;
    private String status;
    private double latitude;
    private double longitude;

}
