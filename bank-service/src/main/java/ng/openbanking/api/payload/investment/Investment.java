package ng.openbanking.api.payload.investment;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import ng.openbanking.api.payload.definition.InvestmentBookingType;

import lombok.Data;
@Data
public class Investment {
    private String investmentId;
    private String productId ;
    private String accountNumber;
    private String amount ;
    private String currency;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date dateBooked;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date maturityDate;
    private InvestmentBookingType bookingType;
    private String interestDiscountRate;

}
