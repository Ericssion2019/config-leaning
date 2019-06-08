package com.arbfintech.ericssion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CongfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CongfigServerApplication.class, args);
    }

}
