package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;

public interface BankAccountService {

	Account getAccountByAccountNumber(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByCustomerId(String customerId) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByBvn(String bvn) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByPhoneNumber(String phoneNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	Account getAccountByEmail(String emailAddress) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	void blockAccount(AccountBlock accountBlock) throws BankResourceNotFoundException,ServiceOperationNotSupported;

	List<AccountType> getAccountTypes();

}
