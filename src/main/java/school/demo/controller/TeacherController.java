package school.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import school.demo.entity.Student;
import school.demo.service.TeacherService;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    /**
     * 查询学生
     */
    @RequestMapping("/stuList")
    public String listStudent(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        PageHelper.startPage(pn,5);
        List<Student> list = teacherService.getStuList();

        PageInfo pi = new PageInfo(list);

        model.addAttribute("PageInfo",pi);

        return "stuList";
    }

}
