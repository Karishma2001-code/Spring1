package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address1(){
        Address a=new Address(101,"burhanpur",450331);
        return  a;
    }
    @Bean
    public Address address2(){
        Address a=new Address(102,"pune",450331);
        return  a;
    }
    @Bean
    public Student stu1() {
        Student s = new Student(1,"Amruta","java");
        return s;
    }
}
