package ng.openbanking.api.payload.pos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import java.util.Date;

@Data
public class POS   extends BasePayload {
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
