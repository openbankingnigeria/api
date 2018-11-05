package com.openbanking.api.ng.bank.service;

import java.util.List;

import com.openbanking.api.ng.bank.exception.BankResourceNotFoundException;
import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.card.Card;
import com.openbanking.api.ng.payload.card.CardLimit;
import com.openbanking.api.ng.payload.card.CardRequest;
import com.openbanking.api.ng.payload.customer.PocessingOperationResponse;

public interface BankCardService {


	List<Card> getCardsByAccountNumber(String accountNumber)   throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse requestCard(CardRequest cardRequest)  throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	List<CardLimit> getCardLimit(String accountNumber)  throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	PocessingOperationResponse setCardLimit(CardLimit cardLimit)  throws BankResourceNotFoundException,ServiceOperationNotSupported ;

	

}
