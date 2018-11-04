package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;

@Service
public class SandBoxAccountService implements BankAccountService {

	@Autowired
	private DataService dataService;
	
	public Account getAccountByAccountNumber(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported {
		return dataService.getData("account", Account.class);
	}

	@Override
	public Account getAccountByCustomerId(String customerId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getData("account", Account.class);
	}

	@Override
	public Account getAccountByBvn(String bvn) throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getData("account", Account.class);
	}

	@Override
	public Account getAccountByPhoneNumber(String phoneNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getData("account", Account.class);
	}

	@Override
	public Account getAccountByEmail(String emailAddress)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getData("account", Account.class);
	}

	@Override
	public void blockAccount(AccountBlock accountBlock)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountType> getAccountTypes() {
		return dataService.getData("AccountType", List.class);
	}

}
