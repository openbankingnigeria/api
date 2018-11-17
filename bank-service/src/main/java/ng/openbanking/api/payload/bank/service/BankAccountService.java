package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.account.Account;
import ng.openbanking.api.payload.account.AccountBlock;
import ng.openbanking.api.payload.account.AccountType;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.directdebit.DirectDebit;
import ng.openbanking.api.payload.directdebit.DirectDebitCancelRequest;
import ng.openbanking.api.payload.directdebit.DirectDebitSetup;
import ng.openbanking.api.payload.limit.Limit;
import ng.openbanking.api.payload.limit.LimitCustomer;

public interface BankAccountService {

	Account getAccountByAccountNumber(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByCustomerId(String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByBvn(String bvn) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByPhoneNumber(String phoneNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByEmail(String emailAddress) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	PocessingOperationResponse blockAccount(AccountBlock accountBlock) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<AccountType> getAccountTypes() throws ServiceOperationNotSupported  ;

	LimitCustomer getCustomerTransactionLimit(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	Limit getGlobalTransactionLimit() throws ServiceOperationNotSupported  ;
	
	PocessingOperationResponse setupDirectDebit(DirectDebitSetup directDebitSetup)throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse cancelDirectDebit(DirectDebitCancelRequest directDebitCancelRequest) throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	DirectDebit getDirectDebit(String accountNumber, String referenceNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported ;

}
