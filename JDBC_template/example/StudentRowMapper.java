package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
    @Override
    //use when select use
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s=new Student();
        s.setId(rs.getInt("id"));
        s.setName(rs.getString("name"));
        s.setCourse(rs.getString("course"));
        return s;
    }
}
