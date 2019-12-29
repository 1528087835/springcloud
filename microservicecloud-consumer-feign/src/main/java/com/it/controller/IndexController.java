package com.it.controller;

import com.it.entity.User;
import com.it.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class IndexController {

    @Autowired
    private com.it.service.DeptClientService deptClientService;


    @RequestMapping ("/index")
    public User index(int id) {
        return deptClientService.index1(id);
    }



}
