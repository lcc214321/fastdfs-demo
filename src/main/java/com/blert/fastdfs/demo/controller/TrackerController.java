package com.blert.fastdfs.demo.controller;

import com.github.tobato.fastdfs.domain.fdfs.GroupState;
import com.github.tobato.fastdfs.service.TrackerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackerController {

    @Autowired
    private TrackerClient trackerClient;

    @RequestMapping(value = {"/hello", "/hi"},method = RequestMethod.GET)
    public String say(){
        return "hello world";
    }

    @RequestMapping(value = "/listGroups",method = RequestMethod.GET)
    public List<GroupState> listGroups(){
        return trackerClient.listGroups();
    }

}
