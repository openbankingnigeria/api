package com.openbanking.api.ng.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openbanking.api.ng.bank.exception.ServiceOperationNotSupported;
import com.openbanking.api.ng.payload.general.BankMeta;
import com.openbanking.api.ng.payload.general.GeneralCharges;
import com.openbanking.api.ng.payload.general.GeneralGetProduct;
import com.openbanking.api.ng.payload.general.GeneralInterfaceVersion;

@Service
public class SandBoxGeneralInfoService implements GeneralInfoService {

	@Autowired
	private DataService dataService;
	
	private static final String BANK_META_MODEL_FILE_NAME = "bank_meta";
	
	private static final String CHARGES_MODEL_FILE_NAME = "charges";
	
	private static final String PRODUCTS_MODEL_FILE_NAME = "products";
	
	private static final String GENERAL_INFO_MODEL_FILE_NAME = "general";
	
	@Override
	public GeneralInterfaceVersion getInterfaceVersion() throws ServiceOperationNotSupported {
		return dataService.getSingleFromList(GENERAL_INFO_MODEL_FILE_NAME);
	}



	@Override
	public BankMeta getBankMeta() throws ServiceOperationNotSupported {
		return dataService.getSingleFromList(BANK_META_MODEL_FILE_NAME);
	}



	@Override
	public List<GeneralCharges> getCharges() throws ServiceOperationNotSupported {
		return dataService.getModelList(CHARGES_MODEL_FILE_NAME);
	}



	@Override
	public List<GeneralGetProduct> getProducts() throws ServiceOperationNotSupported {
		return dataService.getModelList(PRODUCTS_MODEL_FILE_NAME);
	}

}
