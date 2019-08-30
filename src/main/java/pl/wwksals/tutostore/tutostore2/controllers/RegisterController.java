package pl.wwksals.tutostore.tutostore2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wwksals.tutostore.tutostore2.model.User;
import pl.wwksals.tutostore.tutostore2.services.UserService;

import javax.validation.Valid;
import java.math.BigDecimal;

@Controller
public class RegisterController {

    private UserService service;

    @Autowired
    public RegisterController(UserService service) {
        this.service = service;
    }

    @GetMapping({"/", "/homepage"})
    public String showHomePage(){
        return "home";
    }


    @GetMapping({"/register"})
    public String showRegisterForm(Model model){
        model.addAttribute("user", new User());
        return "registerForm";

    }

    @PostMapping("/create")
    public String createUser(@Valid @ModelAttribute User user){
        user.setBalance(BigDecimal.valueOf(500));
        service.create(user);
        return "loginForm";
    }

    @GetMapping({"/login"})
    public String showLoginForm(){
        return "loginForm";
    }

}
