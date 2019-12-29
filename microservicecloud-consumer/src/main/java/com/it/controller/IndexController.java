package com.it.controller;

import com.it.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping ("/index")
    public User index(int id) {
        return restTemplate.getForObject("http://MICROSERVICECLOUD-PROVIDER/index1?id=" + id, User.class);
    }

//    @RequestMapping (value = "/consumer/discovery")
//    public Object discovery() {
//        return restTemplate.getForObject("http://MICROSERVICECLOUD-PROVIDER/dept/discovery", Object.class);
//    }

}
