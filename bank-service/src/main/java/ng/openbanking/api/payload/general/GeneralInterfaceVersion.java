package ng.openbanking.api.payload.general;

import java.util.List;

import ng.openbanking.api.payload.definition.VersionServices;

import lombok.Data;

@Data
public class GeneralInterfaceVersion {
    private String versionSupported;
    private List<VersionServices> versionService;

   
}
