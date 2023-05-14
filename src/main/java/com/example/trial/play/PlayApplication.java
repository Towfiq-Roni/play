package com.example.trial.play;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PlayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlayApplication.class, args);
    }

    
 
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args -> {
            System.out.println("What are the Beans? -> ");
            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }
}
