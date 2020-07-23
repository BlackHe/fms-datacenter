package com.exchange.datacenter.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesHolder {

//    @Value("${mock.enabled}")
    private volatile String enableMock = "true";

    public String getEnableMock() {
        return enableMock;
    }

    public void setEnableMock(String enableMock) {
        this.enableMock = enableMock;
    }
}
