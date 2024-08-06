package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.User;
import web.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String index(ModelMap model) {
        model.addAttribute("users", userService.getListOfUsers());
        return "index";
    }

    @PostMapping(value = "/addNewUserButton")
    public String addNewUser(){
        return "redirect:/new";
    }

    @GetMapping(value = "/new")
    public String newPerson(@ModelAttribute("user") User user){
        return "new";
    }

    @PostMapping(value = "/new")
    public String create(@ModelAttribute("user") User user){
        userService.addNewUser(user);
        return "redirect:/";
    }

    @GetMapping(value = "/edit")
    public String updatePerson(@ModelAttribute("user") User user){
        return "edit";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute("user") User user){
        return "edit";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@RequestParam(name = "id") long id){
        userService.removeUserById(id);
        return "redirect:/";
    }
}
