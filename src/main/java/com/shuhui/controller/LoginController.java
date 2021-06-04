package com.shuhui.controller;

import com.alibaba.fastjson.JSONObject;
import com.shuhui.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author 李东峰
 * @create_ 2021-05-19 11:06
 */
@RestController
public class LoginController {

    @PostMapping("/jsonOne")
    // @RequestMapping(value = "/jsonOne", method = RequestMethod.POST)
    public User getJsonOne(@RequestBody User user){
//        User user = new User();
//        user.setUsername("李东峰");
//        user.setPassword("123456");
        System.out.println(user);
        return user;
    }

    @PostMapping("/jsonTwo")
    public User getJsonTwo(@RequestParam User user){    // @RequestParam 只能指定需要接收的数据类型
        return user;
    }

    @PostMapping("/jsonThree")
    public User getJsonThree(User user){
        System.out.println(user);
        return user;
    }

    @PostMapping("/jsonFour")
    public void getJsonFour(@RequestBody JSONObject jsonObject){
        System.out.println("我执行了");
        Map<String, Object> mp = jsonObject.getInnerMap();
        mp.forEach((key, value) -> {
            System.out.println(key+":"+value);
        });
    }

    @PostMapping("/jsonFive")
    public void getJsonFive(JSONObject jsonObject){
        System.out.println("牛逼了");
        Map<String, Object> mp = jsonObject.getInnerMap();
        mp.forEach((key, value) -> {
            System.out.println(key+":"+value);
        });
    }
}
