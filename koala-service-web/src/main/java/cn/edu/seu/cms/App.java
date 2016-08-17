package cn.edu.seu.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zxsky on 2016/8/17.
 * Description:
 */
@SpringBootApplication
@ImportResource("classpath*:dubbo-consumer.xml")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
