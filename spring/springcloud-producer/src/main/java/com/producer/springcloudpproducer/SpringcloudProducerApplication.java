package com.producer.springcloudpproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"controllers","dao"})
public class SpringcloudProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudProducerApplication.class, args);
    }

}
