package pl.poznachowski.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    @GetMapping("/greet/{name}")
    public String greeting(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
