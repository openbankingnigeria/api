package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.directdebit.DirectDebit;
import com.openbanking.api.ng.payload.directdebit.DirectDebitCancelRequest;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetup;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;

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
