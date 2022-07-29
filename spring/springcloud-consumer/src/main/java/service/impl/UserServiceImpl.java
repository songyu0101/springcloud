package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import service.UserServiceInter;


@Service
public class UserServiceImpl implements UserServiceInter {

    public static String SERVIER_NAME = "SPRINGCLOUD-PRODUCER";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String fun() {
        //简单演示get和post请求
        String getFun = restTemplate.getForObject("http://" + SERVIER_NAME + "/order/getFun", String.class);
        String postFun = restTemplate.postForObject("http://" + SERVIER_NAME + "/order/postFun", null,String.class);
        return getFun+"    "+postFun;
    }


}
