package com.miracle.netflix.eureka.client;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

/**
 * @author : sungm
 * @date : 2021-04-06 10:35
 */
@EnableEurekaClient
@SpringBootApplication
public class MyEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaClientApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> hystrixMetricsStreamServlet() {
        ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean = new ServletRegistrationBean<>();
        servletRegistrationBean.setServlet(new HystrixMetricsStreamServlet());
        servletRegistrationBean.addUrlMappings("/actuator/hystrix.stream");
        return servletRegistrationBean;
    }

}
