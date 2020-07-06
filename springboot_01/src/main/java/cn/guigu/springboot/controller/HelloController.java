package cn.guigu.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RestController // 相当于@Controller+@ResponseBody，里面的所有方法返回值都是json类型的
public class HelloController {

    @Resource
    private DataSource dataSource;

    @RequestMapping("springboot")
    public String test(){
        return "hello springboot";
    }
}
