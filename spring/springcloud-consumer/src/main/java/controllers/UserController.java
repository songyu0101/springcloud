package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.UserServiceInter;

import javax.annotation.Resource;

@RestController

@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceInter userServiceInter;



    @RequestMapping("/world")
    public String fun(){
        return userServiceInter.fun();
    }



}
