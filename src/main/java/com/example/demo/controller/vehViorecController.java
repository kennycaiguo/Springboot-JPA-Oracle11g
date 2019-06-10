package com.example.demo.controller;


import com.example.demo.task.CreateOracleDataTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 16:43
 */

@RestController
@RequestMapping("hello")
public class vehViorecController {

    @Resource
    CreateOracleDataTask createOracleDataTask;

    @GetMapping("world")
    public String hello(){
        createOracleDataTask.inputTimeTask();
        return "开始任务";
    }

}
