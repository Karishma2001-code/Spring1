package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //using application context
       /* ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");
        student.displayInfo();*/
        // using java file
        /*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = (Student) context.getBean("stu1");
        student.displayInfo();*/

        //using Annotation
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationXml.xml");

        Student stud = (Student) context.getBean("student");
        stud.displayInfo();
    }
}