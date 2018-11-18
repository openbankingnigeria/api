package ng.openbanking.api.demo.service;


import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.BankCardService;
import ng.openbanking.api.payload.card.Card;
import ng.openbanking.api.payload.card.CardLimit;
import ng.openbanking.api.payload.card.CardRequest;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoBankCardService implements BankCardService {
	
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
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}



	@Override
	public List<CardLimit> getCardLimit(String accountNumber)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.getModelList(CARDLIMIT_MODEL_FILE_NAME);
	}



	@Override
	public PocessingOperationResponse setCardLimit(CardLimit cardLimit)
			throws BankResourceNotFoundException, ServiceOperationNotSupported {
		return dataService.generateProcessingResponse(OperationStatus.SUCCESSFUL);
	}



}
