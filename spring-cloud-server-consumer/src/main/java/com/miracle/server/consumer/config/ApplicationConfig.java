package com.miracle.server.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : sungm
 * @date : 2021-04-04 21:04
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public RestTemplate serverProviderRestTemplate() {
        return new RestTemplate();
    }

}
