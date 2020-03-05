package com.itcast.zdh.Controller;

import com.itcast.zdh.mapper.StudentMapper;
import com.itcast.zdh.pojo.StuAndScore;
import com.itcast.zdh.pojo.Student;
import com.itcast.zdh.pojo.StudentVo;
import com.itcast.zdh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class HelloController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private ValueOperations<String,Object> valueOperations;

    @RequestMapping("/hello")
    public String hello() {
        return "hello springboot";
    }

    @RequestMapping("/findAllStudent")
    public ModelAndView findAllStudent() {
        List<Student> list = studentService.findAllStudent();
        ModelAndView mv=new ModelAndView();
        mv.setViewName("stuList");
        mv.addObject("list",list);
        return mv;
    }

    @RequestMapping("/findAvgScore")
    public ModelAndView findAvgScore() {
        List<StudentVo> list = studentService.findAvgScore();
        ModelAndView mv=new ModelAndView();
        mv.setViewName("avgScore");
        mv.addObject("list",list);
        System.out.println(list);
        return mv;
    }

    @RequestMapping("/updateStudent")
    public ModelAndView updateStudent(String s_id) {
        Student stu = studentService.findStudentById(s_id);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("updateStu");
        mv.addObject("stu",stu);
        return mv;
    }

    @RequestMapping("/saveStudent")
    public String saveStudent(Student stu) {
       studentService.updateStudent(stu);
        return "updateStu";
    }

    @RequestMapping("/findStuAndScore")
    public ModelAndView  findStuAndScore() {
        List<StuAndScore> stuAndScore = studentService.findStuAndScore();
        System.out.println(stuAndScore);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("stuAndScore");
        mv.addObject("stuAndScore",stuAndScore);
        return mv;
    }
}
