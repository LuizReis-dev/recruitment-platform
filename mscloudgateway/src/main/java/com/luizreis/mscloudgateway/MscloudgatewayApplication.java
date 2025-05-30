package com.luizreis.mscloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MscloudgatewayApplication {
    static {
        new LoadEnv();
    }

    public static void main(String[] args) {
        SpringApplication.run(MscloudgatewayApplication.class, args);
    }

}
