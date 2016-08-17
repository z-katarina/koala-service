package cn.edu.seu.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zxsky on 2016/8/15.
 * Description:
 */
@SpringBootApplication
@ImportResource("classpath*:dubbo-provider.xml")
public class App {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
        System.in.read();
    }
}
