package com.miracle.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : sungm
 * @date : 2021-04-07 17:52
 */
@RestController
public class MyTestController {

    @Value("${author:miracle}")
    private String author;

    @GetMapping(value = "getAuthor")
    public String getAuthor() {
        return author;
    }
}
