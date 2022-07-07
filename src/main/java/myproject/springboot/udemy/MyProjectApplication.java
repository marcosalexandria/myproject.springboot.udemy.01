package myproject.springboot.udemy;

import myproject.springboot.udemy.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("app")
public class MyProjectApplication {

    @GetMapping("hellow")
    public String primer(){
        return "Hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }
}
