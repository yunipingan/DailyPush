package cn.pingweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2017/8/7.
 */
@SpringBootApplication
@ImportResource("classpath:spring-config.xml")
public class Application {

    public static void main (String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
