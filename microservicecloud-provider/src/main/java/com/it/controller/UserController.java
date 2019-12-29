package com.it.controller;

import com.it.entity.User;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping ("/index1")
    public User index1(int id) {
        System.out.println("provider");
        return userService.queryUserById(id);
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

    @RequestMapping(value="/dept/discovery")
    public Object discovery(){
        List<String> list=client.getServices();
        List<ServiceInstance> srvList=client.getInstances("MICROSERVICELOUD-DEPT");
        for(ServiceInstance element :srvList){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }
        return this.client;
    }
}
