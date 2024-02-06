package com.user.um.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.user.um.service" })
public class UmServiceConfig {

    public UmServiceConfig() {
        super();
    }

    // beans

}
