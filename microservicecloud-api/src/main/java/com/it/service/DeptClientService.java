package com.it.service;

import com.it.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="MICROSERVICECLOUD-PROVIDER")
public interface DeptClientService {

    @RequestMapping (value="/index1")
    public User index1(@RequestParam ("id") int id);
}
