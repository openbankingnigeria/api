package ng.openbanking.api.payload.account;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;

import javax.money.CurrencyUnit;

@Data
public class AccountType  extends BasePayload {
    private String accountTypeId ;
    private String accountTypeName ;
    private String minimumBalance;
    private String maximumBalance;
    private String maximumTransactionLimit;
    private String maximumInFlow;
    private CurrencyUnit currency;
    private String  kycLevel;
    private String  documentation;
    private String  cardProduct;
    private String  digitalProduct;

   
}
