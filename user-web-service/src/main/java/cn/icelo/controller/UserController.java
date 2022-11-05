package cn.icelo.controller;

import cn.icelo.entity.BaseUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author icelo
 * @date 2022/11/5 21:38
 */
@Controller
@RestController
public class UserController {


    @GetMapping("/hello")
    public String getUser(){
        return new BaseUser().getSystemType().toString();
    }
}
