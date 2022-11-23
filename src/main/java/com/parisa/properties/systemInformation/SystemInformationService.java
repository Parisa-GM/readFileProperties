package com.parisa.properties.systemInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemInformationService {
    @Autowired
    SystemInformation systemInformation;

    public SystemInformation get() {
        return systemInformation;
    }
}
