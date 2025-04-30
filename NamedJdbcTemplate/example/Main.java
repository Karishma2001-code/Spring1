package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       NamedParameterJdbcTemplate namedParameterJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        //----Insert Operation------
        Map<String,Object> map=new HashMap<>();
        map.put("id",2);
        map.put("name","karishma");
        map.put("course","Sql");

            String query="insert into student values(:id,:name,:course)";
            int count=namedParameterJdbcTemplate.update(query,map);
            if(count>0){
                System.out.println("data inserted successfully");
            }else{
                System.out.println("inserting of data is failed");
            }

        }
}
