package mate.academy.spring.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public String hello(Authentication authentication) {
        return String.format("Hello, %s!", authentication.getName());
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "Hello adman!";
    }

    @GetMapping("/user")
    public String helloUser() {
        return "Hello user";
    }
}
