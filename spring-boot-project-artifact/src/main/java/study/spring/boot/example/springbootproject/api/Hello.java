package study.spring.boot.example.springbootproject.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value = "/helloworld")
    public String greet() {
        return "Hello World!";
    }

    @RequestMapping(value = "/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
