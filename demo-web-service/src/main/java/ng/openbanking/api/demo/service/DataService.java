package ng.openbanking.api.demo.service;


import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.extern.slf4j.Slf4j;
import ng.openbanking.api.payload.customer.PocessingOperationResponse;
import ng.openbanking.api.payload.definition.OperationStatus;
import org.apache.commons.io.FileUtils;
import org.javamoney.moneta.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.zalando.jackson.datatype.money.MoneyModule;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.List;

@Service
@Slf4j
public class DataService {

    @Value("${OB_HOME:}")
    private String OB_HOME;

    @Autowired
    protected ApplicationEventPublisher eventPublisher;

    private ObjectMapper objectMapper;
    
    public <T> T getSingleFromList(String dataName) {
		T data=null;
		List<T> dataList=getModelList(dataName);
		if(CollectionUtils.isEmpty(dataList)) {
			data=dataList.get(0);
		}
		return data;
	}
	
	public <T> List<T>  getModelList(String dataName) {
		return getData(dataName, List.class) ;
	}


    private File getOBNDataFile(String modelName) throws Exception {
        if (StringUtils.isEmpty(OB_HOME)) {
        	OB_HOME="/OB_HOME";
        } 
        ClassPathResource classPathResource = new ClassPathResource(String.format("%s/data/%s.json", OB_HOME,modelName.toLowerCase()));
        return classPathResource.getFile();
    }

    protected <T> T getData(String modelName, Class<T> type) {
        try {
        	File dataFile=getOBNDataFile(modelName);
        	String data= FileUtils.readFileToString(dataFile,"UTF-8");
        	log.info("loaded data for {} {}",modelName,data);
            return this.objectMapper.readValue(dataFile, type);
        } catch (Exception e) {
            log.warn("Cannot convert json data for {} using file {}.json", type, modelName);
            log.error(null, e);
        }
        return null;
    }

    @PostConstruct
    protected void init() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        this.objectMapper.disable(SerializationFeature.INDENT_OUTPUT);
        this.objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        this.objectMapper .registerModule(new MoneyModule().withMonetaryAmount(Money::of));
        
        
    }

	public PocessingOperationResponse generateProcessingResponse(OperationStatus requiredStatus) {
		PocessingOperationResponse response=new PocessingOperationResponse();
		response.setResponseCode(requiredStatus);
		response.setTransactionReferenceId(System.currentTimeMillis()+"");
		response.setMessage(requiredStatus.name());
		return response;
	}
}
