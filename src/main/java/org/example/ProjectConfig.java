package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean(name = "alex")
    People people(){
        var p = new People();
        p.setName("Alex");
        return p;
    }

    @Primary
    @Bean(value = "masha")
    People people2(){
        var p = new People();
        p.setName("Masha");
        return p;
    }

    @Bean("andrey")
    People people3(){
        var p = new People();
        p.setName("Andrey");
        return p;
    }


    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}
