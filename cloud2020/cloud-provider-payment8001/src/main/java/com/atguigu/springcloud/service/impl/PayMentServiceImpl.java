package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PayMentDao;
import com.atguigu.springcloud.entities.PayMent;
import com.atguigu.springcloud.service.PayMentService;
import org.springframework.stereotype.Service;

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
@Service
public class PayMentServiceImpl implements PayMentService {

    @Resource
    private PayMentDao payMentDao;
    @Override
    public int create(PayMent payment) {
        return payMentDao.create(payment);
    }

    @Override
    public PayMent getPayMentById(Long id) {
        return payMentDao.getPayMentById(id);
    }
}
