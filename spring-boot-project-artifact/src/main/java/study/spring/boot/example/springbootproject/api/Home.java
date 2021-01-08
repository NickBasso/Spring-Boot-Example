package study.spring.boot.example.springbootproject.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {

    @GetMapping
    public String home() {
        return "Application ran successfully! </br> " + new Date();
    }
}
