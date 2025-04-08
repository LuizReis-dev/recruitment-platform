package com.luizreis.msusers;

import com.luizreis.msusers.config.LoadEnv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsusersApplication {
    static {
        new LoadEnv();
    }

    public static void main(String[] args) {
        SpringApplication.run(MsusersApplication.class, args);
    }

}
