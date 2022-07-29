package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/getFun")
    public  String getFun(){
        return "getFun";
    }

    @PostMapping("/postFun")
    public String postFun(){
        return "postFun";
    }

}
