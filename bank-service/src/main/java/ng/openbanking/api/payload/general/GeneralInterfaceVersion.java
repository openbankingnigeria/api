package ng.openbanking.api.payload.general;

import lombok.Data;
import ng.openbanking.api.payload.base.BasePayload;
import ng.openbanking.api.payload.definition.VersionServices;

import java.util.List;

@Data
public class GeneralInterfaceVersion  extends BasePayload {
    private String versionSupported;
    private List<VersionServices> versionService;

   
}
