package com.han;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description：服务提供者
 * Created by hqhan on 2017/6/5 0005.
 */

@EnableDiscoveryClient//激活Eureka中的DiscoveryClient实现
@SpringBootApplication
public class Provider2Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Provider2Application.class).web(true).run(args);
    }
}
