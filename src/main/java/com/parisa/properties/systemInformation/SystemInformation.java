package com.parisa.properties.systemInformation;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "system")
@Data
public class SystemInformation {
    private String version;
    private String name;
    private String image;
}
