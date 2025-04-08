package com.luizreis.msusers.config;

import io.github.cdimascio.dotenv.Dotenv;

public class LoadEnv {
    static {
        Dotenv dotenv = Dotenv.load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));
    }
}