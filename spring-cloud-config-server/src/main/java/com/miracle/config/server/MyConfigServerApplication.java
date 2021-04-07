package com.miracle.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author : sungm
 * @date : 2021-04-07 17:06
 */
@EnableConfigServer
@SpringBootApplication
public class MyConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyConfigServerApplication.class, args);
    }

}
