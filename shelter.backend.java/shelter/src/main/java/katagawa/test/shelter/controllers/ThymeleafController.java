package katagawa.test.shelter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @GetMapping("/test")
    public String index(Model model) {
        model.addAttribute("message", "Hallo, Thymeleaf!");
        return "index"; 
    }
}
