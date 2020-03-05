package com.itcast.zdh.mapper;

import com.itcast.zdh.pojo.StuAndScore;
import com.itcast.zdh.pojo.Student;
import com.itcast.zdh.pojo.StudentVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> findAllStudent();

    public List<StudentVo> findAvgScore();

    public void updateStudent(Student stu);

    public Student findStudentById(String s_id);

    public List<StuAndScore> findStuAndScore();
}
