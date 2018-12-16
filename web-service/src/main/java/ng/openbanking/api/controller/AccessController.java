package ng.openbanking.api.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import ng.openbanking.api.payload.access.Access;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static ng.openbanking.api.controller.BaseApiController.apiPrefix;

@RestController
@RequestMapping(apiPrefix+"/access")
@Api(value = apiPrefix+"/access", description = "Access related operations", consumes = "application/json", tags = {"access"})
public class AccessController extends BaseApiController{


    @RequestMapping(value = "/getAuthorizationToken", method = RequestMethod.GET)
    public List<Access> getAuthorizationToken(@ApiParam(value = "Requires Client Identifier, Secret and Grant Type") String clientId, String clientSecret, String grantType ){
        return Collections.singletonList(new Access());
    }

}
