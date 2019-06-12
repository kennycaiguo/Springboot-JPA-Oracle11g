package com.example.demo.controller;


import com.example.demo.config.StartConfig;
import com.example.demo.task.CreateOracleDataTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 16:43
 */

@RestController
@Slf4j
public class vehViorecController {

    @Resource
    CreateOracleDataTask createOracleDataTask;

    @GetMapping("start")
    public String start() {
        new Thread(() -> {
            try {
                StartConfig.start = true;
                createOracleDataTask.inputTimeTask();
            } catch (InterruptedException e) {
              log.error("【数据生成出现异常】= {}", e.getMessage());
            }
        }).start();
        return "开始任务";
    }

    @GetMapping("stop")
    public String stop() {
        StartConfig.start = false;
        return "停止任务";
    }

}
