package com.lxg.springboot;

import org.springframework.boot.SpringApplication;

/**
 * Created by lxg
 * on 2017/2/18.
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
public class Application {

    public static void main(String[] args){
        new SpringApplication(Application.class).run(args);
    }
}
