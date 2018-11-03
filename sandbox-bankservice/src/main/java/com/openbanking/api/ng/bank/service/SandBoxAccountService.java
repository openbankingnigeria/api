package com.openbanking.api.ng.bank.service;

import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;

@Service
public class SandBoxAccountService implements BankAccountService {

	public Account getAccountByAccountNumber(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported {
		return new Account();
	}

}
