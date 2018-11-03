package com.openbanking.api.ng.payload.general;

import java.util.List;

import com.openbanking.api.ng.definition.VersionServices;

import lombok.Data;

@Data
public class GeneralInterfaceVersion {
    private String versionSupported;
    private List<VersionServices> versionService;

   
}
