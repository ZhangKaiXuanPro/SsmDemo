package school.demo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import school.demo.dao.*;
import school.demo.entity.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class MapperTest {
    @Autowired
    TeacherMapper teacherMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    MyClassMapper myClassMapper;
    @Autowired
    CourseMapper courseMapper;
    @Autowired
    MyScoreMapper myScoreMapper;


    /**
     * teacher CRUD
     */
    @Test
    public void testCRUD(){
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-mybatis.xml");
//        TeacherMapper bean= ioc.getBean(TeacherMapper.class);

//        teacherMapper.insertSelective(new Teacher(1,"Li Ming","male",12));
        for(int i=0; i<100;i++){
            studentMapper.insertSelective(new Student("Limning"+i));
        }
//        myClassMapper.insertSelective(new MyClass(2,"yi ban"));
//        courseMapper.insertSelective(new Course(2,"Zhang S","wuweu"));
//        myScoreMapper.insertSelective(new MyScore(12,2,12));
//        teacherMapper.insertSelective(new Teacher(2,"Zhang S","female",23));
    }
}
