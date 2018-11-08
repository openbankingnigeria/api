package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.definition.OperationStatus;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.directdebit.DirectDebit;
import com.openbanking.api.ng.payload.directdebit.DirectDebitCancelRequest;
import com.openbanking.api.ng.payload.directdebit.DirectDebitSetup;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;

@Service
public class SandBoxAccountService  implements BankAccountService {

	private static final String ACCOUNT_MODEL_FILE_NAME = "Account";
	
	private static final String ACCOUNT_TYPE_MODEL_FILE_NAME = "AccountType";
	
	private static final String LIMIT_MODEL_FILE_NAME = "Limit";
	
	private static final String DD_MODEL_FILE_NAME="DiectDebit";
	
	
	
	@Autowired
	private DataService dataService;
	
	public Account getAccountByAccountNumber(String accountNumber) throws BankResourceNotFoundException,ServiceOperationNotSupported {
		return dataService.getSingleFromList(ACCOUNT_MODEL_FILE_NAME);
	}

	@Override
	public Account getAccountByCustomerId(String customerId)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(ACCOUNT_MODEL_FILE_NAME);
	}

	@Override
	public Account getAccountByBvn(String bvn) throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(ACCOUNT_MODEL_FILE_NAME);
	}

	@Override
	public Account getAccountByPhoneNumber(String phoneNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(ACCOUNT_MODEL_FILE_NAME);
	}

	@Override
	public Account getAccountByEmail(String emailAddress)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(ACCOUNT_MODEL_FILE_NAME);
	}

	@Override
	public PocessingOperationResponse blockAccount(AccountBlock accountBlock)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
		
	}

	@Override
	public List<AccountType> getAccountTypes() {
		return dataService.getModelList(ACCOUNT_TYPE_MODEL_FILE_NAME);
	}

	@Override
	public LimitCustomer getCustomerTransactionLimit(String accountNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(LIMIT_MODEL_FILE_NAME);
	}

	@Override
	public Limit getGlobalTransactionLimit() throws ServiceOperationNotSupported {
		return dataService.getSingleFromList(LIMIT_MODEL_FILE_NAME);
	}
	
	

	@Override
	public PocessingOperationResponse setupDirectDebit(DirectDebitSetup directDebitSetup)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}



	@Override
	public PocessingOperationResponse cancelDirectDebit(DirectDebitCancelRequest directDebitCancelRequest)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}



	@Override
	public DirectDebit getDirectDebit(String accountNumber, String referenceNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getSingleFromList(DD_MODEL_FILE_NAME);
	}

}
