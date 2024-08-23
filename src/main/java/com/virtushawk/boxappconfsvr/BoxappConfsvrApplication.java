package com.virtushawk.boxappconfsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BoxappConfsvrApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoxappConfsvrApplication.class, args);
    }

}
