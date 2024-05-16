package com.example.configurationclient;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
// @RefreshScope
//@Configuration
// @Component
//@PropertySource("a-bootiful-client2.properties")
public class Config3 {
    @Value("${key100}")
    private String key100;
}
