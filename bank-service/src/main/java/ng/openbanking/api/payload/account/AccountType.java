package ng.openbanking.api.payload.account;

import javax.money.CurrencyUnit;

import lombok.Data;

@Data
public class AccountType {
    private String accountTypeId = "1";
    private String accountTypeName = "Savings";
    private String minimumBalance = "1000";
    private String maximumBalance = "1000000";
    private String maximumTransactionLimit = "10000";
    private String maximumInFlow;
    private CurrencyUnit currency;
    private String  kycLevel;
    private String  documentation;
    private String  cardProduct = "Master Card";
    private String  digitalProduct;

   
}
