package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address(){
        Address a=new Address();
        a.setHouseNo(101);
        a.setCity("bpur");
        a.setPincode(4503310);

        return  a;
    }
    @Bean
    public Student stu1() {
        Student s = new Student();
        s.setId(1);
        s.setName("Amruta");
        s.setCourse("java");
        s.setAddress(address());
        return s;
    }


}
