package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    // by using bean
   /* @Bean
    public Student stu1(){
        Student s= new Student();
        s.setId(1);
        s.setName("Amruta");
        s.setCourse("java");
        return  s;
    }*/
}