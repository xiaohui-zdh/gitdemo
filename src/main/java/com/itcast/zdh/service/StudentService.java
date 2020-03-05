package com.itcast.zdh.service;

import com.itcast.zdh.pojo.StuAndScore;
import com.itcast.zdh.pojo.Student;
import com.itcast.zdh.pojo.StudentVo;

import java.util.List;

public interface StudentService {
    public List<Student> findAllStudent();

    public List<StudentVo> findAvgScore();

    public Student findStudentById(String s_id);

    public void updateStudent(Student stu);

    public List<StuAndScore> findStuAndScore();
}
