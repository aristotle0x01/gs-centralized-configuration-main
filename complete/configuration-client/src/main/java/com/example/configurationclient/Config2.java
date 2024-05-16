package com.example.configurationclient;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@RefreshScope
//@Configuration
@Component
public class Config2 {
    @Value("${key1:Hello default}")
    private String key1;
}
