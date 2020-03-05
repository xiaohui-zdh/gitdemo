package com.itcast.zdh.service;

import com.itcast.zdh.mapper.StudentMapper;
import com.itcast.zdh.pojo.StuAndScore;
import com.itcast.zdh.pojo.Student;
import com.itcast.zdh.pojo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private ValueOperations<String,Object> valueOperations;

    public List<Student> findAllStudent(){
        List<Student> students=new ArrayList<>();
    /*    students=(List<Student>)valueOperations.get("stu");
        if(null==students || students.size()==0){
            students = studentMapper.findAllStudent();
            valueOperations.set("stu",students);
            System.out.println("111");
        }*/
        students = studentMapper.findAllStudent();
        return students;
    }

    public List<StudentVo> findAvgScore(){
        List<StudentVo> avgScore = studentMapper.findAvgScore();
        return avgScore;
    };

    public Student findStudentById(String s_id){
        Student stu = studentMapper.findStudentById(s_id);
        return stu;
    }

    public void updateStudent(Student stu){
        studentMapper.updateStudent(stu);
    }

    public List<StuAndScore> findStuAndScore(){
        List<StuAndScore> stuAndScore = studentMapper.findStuAndScore();
        return stuAndScore;
    }
}
