package com.openbanking.api.ng.payload.general;

import com.openbanking.api.ng.definition.VersionServices;

import java.util.List;

public class GeneralInterfaceVersion {
    private String versionSupported;
    private List<VersionServices> versionService;

    public String getVersionSupported() {
        return versionSupported;
    }

    public void setVersionSupported(String versionSupported) {
        this.versionSupported = versionSupported;
    }

    public List<VersionServices> getVersionService() {
        return versionService;
    }

    public void setVersionService(List<VersionServices> versionService) {
        this.versionService = versionService;
    }
}
