package com.p78o2.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author p78o2
 * @date 2021/5/27
 */
@RequestMapping(value = "/test")
@RestController
public class TestController {
    @Autowired
    private KafkaTemplate<String, String> template;

    //    kafka接口
    @GetMapping("/sendMsg/{msg}")
    public void sendMsg(@PathVariable("msg")String msg){
        this.template.send("test", msg);
    }
}
