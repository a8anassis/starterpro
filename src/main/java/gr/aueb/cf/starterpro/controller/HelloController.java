package gr.aueb.cf.starterpro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/starter")
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name = "username", defaultValue = "Guest") String givenName,
                          Model model) {
        model.addAttribute("name", givenName);
        return "welcome";
    }
}
