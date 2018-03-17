package com.openbanking.api.ng.controller;

import com.openbanking.api.ng.payload.pos.POS;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pos")
@Api(value = "/pos", description = "pos", consumes = "application/json", tags = {"pos"})

public class POSController {
    @ApiOperation(value = "Finds a POS by Terminal ID",
            notes = "The Terminal ID is the unique identifier for a POS",
            response = POS.class)
    @ApiResponses(value = {@ApiResponse(code = 400, message = "Invalid Terminal ID supplied"),
            @ApiResponse(code = 404, message = "POS not found")})
    @RequestMapping(value = "/{terminalId}", method = RequestMethod.GET)
    public List<POS> getPosByTerminalId(@PathVariable @ApiParam(value = "The Terminal ID") String terminalId) {
        return Collections.singletonList(new POS());
    }

    @RequestMapping(value = "/merchant/{merchantId}", method = RequestMethod.GET)
    public List<POS> getPosByMerchantId(@PathVariable @ApiParam(value = "Merchant ID") String merchantId) {
        return Collections.singletonList(new POS());
    }

    @RequestMapping(value = "/branch/{branchId}", method = RequestMethod.GET)
    public List<POS> getPosByBranchId(@PathVariable @ApiParam(value = "Branch ID") String branchId) {
        return Collections.singletonList(new POS());
    }

    @RequestMapping(value = "/email/{email}", method = RequestMethod.GET)
    public List<POS> getPosByEmail(@PathVariable @ApiParam(value = "Email Address") String email) {
        return Collections.singletonList(new POS());
    }

    @RequestMapping(value = "/latitude/{latitude}/longitude/{longitude}", method = RequestMethod.GET)
    public List<POS> getPosNearLocation(@PathVariable @ApiParam(value = "The location's latitude") double latitude,
                                        @PathVariable @ApiParam(value = "The location's longitude") double longitude) {
        return Collections.nCopies(3, new POS());
    }
}
