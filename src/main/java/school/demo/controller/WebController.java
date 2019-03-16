package school.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebController {
    @RequestMapping("/")
    public String stuLogin(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/plain;charset='utf-8'");
        return "redirect:login.jsp";
    }
}
