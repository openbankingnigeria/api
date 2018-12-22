package ng.openbanking.api.payload.transaction;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.PeriodType;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SingleTransfer  extends BasePayload {
    private String referenceId;
    private String sourceAccount;
    private String sourceAccountName;
    private String sourceAmount;
    private CurrencyUnit sourceCurrency = Monetary.getCurrency("NGN");
    private String sourceNarration;
    private BigDecimal amount;
    private CurrencyUnit currency = Monetary.getCurrency("NGN");
    private String destinationNarration;
    private String transactionFee;
    private String channel;
    private double latitude ;
    private double longitude;
    private Date transactionDate;
    private PeriodType interval;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date startDate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date endDate;
    private int numberOfTime;
}
