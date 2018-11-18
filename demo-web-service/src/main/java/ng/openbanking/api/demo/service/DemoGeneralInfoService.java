package ng.openbanking.api.demo.service;


import ng.openbanking.api.payload.bank.exception.ServiceOperationNotSupported;
import ng.openbanking.api.payload.bank.service.GeneralInfoService;
import ng.openbanking.api.payload.general.BankMeta;
import ng.openbanking.api.payload.general.GeneralCharges;
import ng.openbanking.api.payload.general.GeneralGetProduct;
import ng.openbanking.api.payload.general.GeneralInterfaceVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoGeneralInfoService implements GeneralInfoService {

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
