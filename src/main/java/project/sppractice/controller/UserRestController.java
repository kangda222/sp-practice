package project.sppractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import project.sppractice.model.User;
import project.sppractice.service.UserService;

import java.util.List;

@RestController
@RequestMapping("user/*")
public class UserRestController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public User addUser(@RequestBody User user) throws Exception{
        System.out.println("UserRestController=====addUser========");
        System.out.println(user);
        return userService.addUser(user);
    }

    @RequestMapping(value = "getAllUser", method = RequestMethod.GET)
    public List<User> getAllUser() throws Exception{
        System.out.println("UserRestController===getAllUser==========");

        return userService.getAllUser();
    }

    @RequestMapping(value = "getUserByName", method = RequestMethod.POST)
    public User getUserByName(@RequestBody User user) throws Exception{
        System.out.println("UserRestController=====getUserByName========");
        System.out.println(user);
        return userService.getUserByName(user.getName());
    }
}
