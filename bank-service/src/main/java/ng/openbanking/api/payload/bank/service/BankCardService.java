package ng.openbanking.api.payload.bank.service;

import java.util.List;

import ng.openbanking.api.payload.bank.exception.BankResourceNotFoundException;
import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.card.Card;
import ng.openbanking.api.payload.card.CardLimit;
import ng.openbanking.api.payload.card.CardRequest;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;

public interface BankCardService {


	List<Card> getCardsByAccountNumber(String accountNumber)   throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse requestCard(CardRequest cardRequest)  throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	List<CardLimit> getCardLimit(String accountNumber)  throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse setCardLimit(CardLimit cardLimit)  throws BankResourceNotFoundException,ServiceOperationNotSupported ;



	

}
