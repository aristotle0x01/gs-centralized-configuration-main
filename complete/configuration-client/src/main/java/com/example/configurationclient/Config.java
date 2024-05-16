package com.example.configurationclient;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@RefreshScope
//@Configuration
@Component
public class Config {
    @Value("${message:Hello default}")
    private String message;

    public Config() {
        System.out.println("hi new instance for Config!");
        try {
            throw new RuntimeException("hi");
        } catch (RuntimeException ex) {
            ex.printStackTrace();
        }
    }
}
