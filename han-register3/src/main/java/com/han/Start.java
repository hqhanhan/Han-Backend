package com.han;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description：注册服务3
 * Created by hqhan on 2017/6/5 0005.
 */

@EnableEurekaServer
@SpringBootApplication
public class Start {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Start.class).web(true).run(args);
    }
}
