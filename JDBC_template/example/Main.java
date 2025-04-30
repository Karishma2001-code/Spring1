package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        //----Insert Operation------
            int id=2;
            String name="Komal";
            String course="php";
            String query="insert into student (id, name, course) values(?,?,?)";
            int count=jdbcTemplate.update(query,id,name,course);
            if(count>0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("inserting of data is failed");
            }

        //---Update----
            int id=2;
            String course="Ai";
            String query="update student set course=? where id=?";
            int count=jdbcTemplate.update(query,course,id);
            if(count>0){
                System.out.println("data updated successfully");
            }else{
                System.out.println("updated of data is failed");
            }
        //---delete----
            int id=2;
            String query="delete from student where id=?";
            int count=jdbcTemplate.update(query,id);
            if(count>0){
                System.out.println("data deleted successfully");
            }else{
                System.out.println("delete of data is failed");
            }
        //--select All--
            String query="select * from student";
            List<Student> sl=jdbcTemplate.query(query,new StudentRowMapper());
            for(Student s:sl){
                System.out.println("id :"+s.getId());
                System.out.println("name :"+s.getName());
                System.out.println("course :"+s.getCourse());
                System.out.println("-----------------------");

            }
        // select one
        int id = 1;
        String query = "select * from student where id=?";
        List<Student> sl = jdbcTemplate.query(query, new StudentRowMapper(), id);
        for (Student s : sl) {
            System.out.println("id :" + s.getId());
            System.out.println("name :" + s.getName());
            System.out.println("course :" + s.getCourse());
            System.out.println("-----------------------");


        }
    }
}
