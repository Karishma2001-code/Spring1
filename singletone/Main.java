package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
        public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            Student student1 = (Student) context.getBean("stu1",Student.class);
            Student student2 = (Student) context.getBean("stu1",Student.class);
            System.out.println(student1 == student2 );

}}
