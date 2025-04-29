package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address(){
        Address a=new Address(101,"burhanpur",450331);
        return  a;
    }
    @Bean
    public Student stu1() {
        Student s = new Student(1,"Amruta","java",address());
        return s;
    }
}
