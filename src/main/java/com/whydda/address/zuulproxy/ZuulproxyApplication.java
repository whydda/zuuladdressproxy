package com.whydda.address.zuulproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class ZuulproxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulproxyApplication.class, args);
    }

    @Bean
    public AddressHttpRoutingFilter addressHttpRoutingFilter(){
        return new AddressHttpRoutingFilter();
    }

    @Bean
    public FirstFilter filter(){
        return new FirstFilter();
    }
}
