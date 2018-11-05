package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.definition.ProcessState;
import com.openbanking.api.ng.payload.account.Account;
import com.openbanking.api.ng.payload.account.AccountBlock;
import com.openbanking.api.ng.payload.account.AccountType;
import com.openbanking.api.ng.payload.card.Card;
import com.openbanking.api.ng.payload.card.CardLimit;
import com.openbanking.api.ng.payload.card.CardRequest;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;
import com.openbanking.api.ng.payload.limit.Limit;
import com.openbanking.api.ng.payload.limit.LimitCustomer;

@Service
public class SandBoxBankCardService  implements BankCardService {
	
	private static final String CARDLIMIT_MODEL_FILE_NAME = "cardLimit";
	
	private static final String CARD_MODEL_FILE_NAME = "card";
	
	
	
	@Autowired
	private DataService dataService;



	@Override
	public List<Card> getCardsByAccountNumber(String accountNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(CARD_MODEL_FILE_NAME);
	}



	@Override
	public PocessingOperationResponse requestCard(CardRequest cardRequest)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		PocessingOperationResponse response=new PocessingOperationResponse();
		response.setProcessState(ProcessState.SUBMITTED);
		return response;
	}



	@Override
	public List<CardLimit> getCardLimit(String accountNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(CARDLIMIT_MODEL_FILE_NAME);
	}



	@Override
	public PocessingOperationResponse setCardLimit(CardLimit cardLimit)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		PocessingOperationResponse response=new PocessingOperationResponse();
		response.setProcessState(ProcessState.SUBMITTED);
		return response;
	}
}
