package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        String filePath = "/Users/le.hu/workspace/jianshu/spring-cloud-yaml-demo/out/production/classes";
        URL[] urls = new URL[1];
        try (URLClassLoader classLoader = new URLClassLoader(urls);) {
            URL url = new URL("file", null, filePath);
            urls[0] = url;
            Class<?> contractController = classLoader.loadClass("com.example.demo.ContractController");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        SpringApplication.run(DemoApplication.class, args);
    }
}
