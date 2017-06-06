package com.han;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Description：配置中心
 * Created by hqhan on 2017/6/5 0005.
 */

//@EnableOAuth2Resource
//@EnableOAuth2Sso
//@EnableOAuth2Client
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {



        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }
}
