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

@Controller
public class RegisterController {

    private UserService service;


    @Autowired
    public RegisterController(UserService service) {
        this.service = service;
    }

    @GetMapping({"/", "/home"})
    public String showHomePage(){
        return "home";
    }


    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "registerForm";

    }

    @PostMapping("/registration")
    public String registration(@Valid @ModelAttribute User user){
        service.create(user);
        return "redirect:/user/panel";
    }

    @GetMapping({"/login"})
    public String showLoginForm(){
        return "login";
    }



   /* @GetMapping("/hello")
    public String hello(){
        return "hello";
    }*/

}
