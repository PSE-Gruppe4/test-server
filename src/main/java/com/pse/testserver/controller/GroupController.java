package com.pse.testserver.controller;

import com.pse.testserver.entities.Group;
import com.pse.testserver.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "com.pse.testserver.service")
@RequestMapping
public class GroupController {

    @Autowired
    GroupService groupService;

    @PostMapping("/createGroup")
    public void createGroup(@RequestBody Group group) {
        //groupService.createGroup(group)
    }


}