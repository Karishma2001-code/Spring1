package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public  Subject sub(){
        List<String> sl=new ArrayList<>();
        sl.add("java");
        sl.add("react");
        sl.add("angular");
        sl.add("sql");
        Subject s=new Subject(sl);
        return s;
    }
    @Bean
    public Address address1(){
        Address a=new Address(101,"burhanpur",450331);
        return  a;
    }
    @Bean
    public Student stud1() {
        Student s = new Student(1,"Amruta","java");
        return s;
    }
}
