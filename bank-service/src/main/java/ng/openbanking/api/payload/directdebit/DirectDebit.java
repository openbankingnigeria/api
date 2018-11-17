package ng.openbanking.api.payload.directdebit;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import ng.openbanking.api.payload.definition.ChannelType;

import lombok.Data;

@Data
public class DirectDebit {
    private String status;
    private String referenceId ;
    private String sourceAccount;
    private String sourceAccountName;
    private String sourceEmail;
    private String sourcePhone;
    private String sourceBvn;
    private String sourceAmount;
    private String sourceCurrency ;
    private String sourceNation;
    private String sourceNarration;
    private String destinationBankCode;
    private String merchantId;
    private String productName;
    private String merchantAccount;
    private String merchantAccountName;
    private String merchantEmail;
    private String merchantPhone ;
    private String merchantBvn;
    private String amount;
    private String currency;
    private String minimumAmount;
    private String maximumAmount;
    private int numberOfTransactions;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date startDate;
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date endDate;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date recurringDate;
    private String recurringPeriod;
    private String transactionFee;
    private ChannelType channel;
    private double latitude;
    private double longitude;

}
