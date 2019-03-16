package school.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import school.demo.dao.StudentMapper;
import school.demo.entity.Student;

import java.util.List;

public class TeacherService {

    @Autowired
    StudentMapper studentMapper;

    /**
     *
     * @return Student List
     */
    public List<Student> getStuList(){

        return studentMapper.selectByExample(null);

    }
}
