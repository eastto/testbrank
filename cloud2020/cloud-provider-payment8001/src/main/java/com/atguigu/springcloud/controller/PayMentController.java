package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.service.PayMentService;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.PayMent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Description：xxxx<br/>
 * Copyright (c) ，2020 ， tianzhuY <br/>
 * This program is protected by copyright laws. <br/>
 * Date： 2020年02月15日
 *
 * @author ytz
 * @version : 1.0
 */
@RestController
@Slf4j
public class PayMentController {

    @Resource
    private PayMentService payMentServiceImpl;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody PayMent payment){
        int result = payMentServiceImpl.create(payment);
        log.info("插入结果：" + result);
        if(result>0){
            return new CommonResult(200, "插入数据库成功", result);
        }else{
            return new CommonResult(404, "插入数据库失败", result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPayMentById(@PathVariable("id") long id){
        PayMent result = payMentServiceImpl.getPayMentById(id);
        log.info("插入结果：" + result);
        if(result!=null){
            return new CommonResult(200, "查询成功", result);
        }else{
            return new CommonResult(404, "没有记录", null);
        }
    }

}
