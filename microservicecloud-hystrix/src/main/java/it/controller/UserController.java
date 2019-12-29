package it.controller;

import com.it.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping ("/index1")
    @HystrixCommand (fallbackMethod="processHystrix_get")
    public User index1(int id) {
        System.out.println("provider");
        int index=10/0;
        return userService.queryUserById(id);
    }


    public User processHystrix_get(int id){
        System.out.println("processHystrix_get-------get");
        return new User();
    }

    @RequestMapping ("/add")
    public String add(int id,String name) {
        User u=new User();
        u.setName(name);
        u.setId(id);
        u.setDay(null);
        userService.addUser(u);
        return "success";
    }


}
