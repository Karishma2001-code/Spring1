package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

            Student student = (Student) context.getBean("stud1");
            student.displayInfo();

}}
