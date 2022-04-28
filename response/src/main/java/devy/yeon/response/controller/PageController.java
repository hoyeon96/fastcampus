package devy.yeon.response.controller;

import devy.yeon.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    // http://localhost:8080/main
    @RequestMapping("/main")
    public String main(){
        return "main.html";
    }

    // ResponseEntity
    // http://localhost:8080/user
    @ResponseBody
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setName("yeon");
        user.setAge(27);
        user.setAddress("패스트캠퍼스");
        user.setPhoneNumber("010-0000-0000");
        return user;
    }

}
