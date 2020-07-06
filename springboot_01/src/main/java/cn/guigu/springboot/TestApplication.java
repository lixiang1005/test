package cn.guigu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import javax.sql.DataSource;

/*@EnableAutoConfiguration // 启用springboot应用的自动配置
@ComponentScan // 组件扫描,扫描该类所在的包以及它的子子孙孙包*/
@SpringBootApplication // 组合注解，相当于@ComponentScan+@EnableAutoConfiguration+@SpringBootConfiguration
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
