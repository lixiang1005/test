package cn.guigu.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

//@PropertySource("classpath:jdbc.properties")
@Configuration // 声明一个类是java配置类，相当于xml配置文件
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguraction {

    /**
     * 第一种方式 使用注解自动注入
     */
    //@Resource
    //private JdbcProperties jdbcProperties;

    /**
     * 第二种方式：构造方法注入
     * @param jdbcProperties
     */
    /*public JdbcConfiguraction(JdbcProperties jdbcProperties){
        this.jdbcProperties = jdbcProperties;
    }*/

    /**
     * 第三种方式：在方法中直接写形参
     */

    /*@Value("${driver}")
    private String driver;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String username;
    @Value("${password}")
    private String password;*/

    /**
     * 第四种方式：在@bean方法上使用@ConfigurationProperties(prefix = "jdbc")
     * @return
     */
    @Bean // 把方法的返回值注入到spring容器
    @ConfigurationProperties(prefix = "jdbc")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        /*dataSource.setDriverClassName(jdbcProperties.getDriver());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());*/
        return dataSource;
    }
}
