package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.models.User;
import web.service.UserService;
import web.service.UserServiceImpl;

@Controller
@RequestMapping(value = "/users" )
public class UserController {

@Autowired
    private final UserService userService = new UserServiceImpl();

    @GetMapping()
    public String allUsers (Model model) {
        model.addAttribute("users2",userService.allUsers());
        return "index";
    }

    @GetMapping(value = "/new")
    public String newUser (Model model) {
        model.addAttribute("user", new User());
        return "new";
    }
    @PostMapping()
    public String createUser (@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";

    }

}
