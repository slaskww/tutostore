package pl.wwksals.tutostore.tutostore2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {


    @GetMapping({"/panel", "/"})
    public String user(){
        return "userPanel";
    }

    @GetMapping("/discount")
    public String discount(){
        return "discount";
    }

}
