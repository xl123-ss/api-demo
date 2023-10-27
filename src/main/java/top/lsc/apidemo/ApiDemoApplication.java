package top.lsc.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ApiDemoApplication
 * @Author: lsc
 * @Date: 2023/10/27/11:00
 */
@SpringBootApplication
@CrossOrigin
@RestController
public class ApiDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiDemoApplication.class,args);
    }
    @GetMapping("list")
    public List<String> list(){
        List<String> list = new ArrayList<>();
        list.add("吃饭");
        list.add("睡觉");
        list.add("玩游戏");
        return list;
    }
}
