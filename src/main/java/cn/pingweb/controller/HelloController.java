package cn.pingweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/7.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello () {
        return "Hello!";
    }

}
