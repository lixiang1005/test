package cn.guigu.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 相当于@Controller+@ResponseBody，里面的所有方法返回值都是json类型的
public class HelloController2 {

    @RequestMapping("springboot2")
    public String test(){
        return "hello springboot2";
    }

}
