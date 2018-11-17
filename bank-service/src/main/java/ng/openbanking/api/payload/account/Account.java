package ng.openbanking.api.payload.account;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import ng.openbanking.api.payload.definition.AccountType;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Account {
    @ApiModelProperty(value = "10 digit NUBAN")
    private String accountNumber;

    @ApiModelProperty(value = "The Customer ID as defined by the Bank")
    private String customerId;

    @ApiModelProperty(value = "The BVN tied to the Account")
    private String bvn;

    @ApiModelProperty(value = "The full Name registered with the Account") 
    private String fullName ;
    private String shortName ;
    
    private String currency = "NGN";
    
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date accountOpeningDate;
    @JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy hh:mm:ss")
    private Date lastTransactionDate;
    private String status ;
    private String bankSortCode;
    private String accountBalance;
    private String phoneNumber;
    private AccountType accountType;
    private String accountManagerName;
    private String accountManagerPhone;

   
}
