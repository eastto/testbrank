package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.PayMent;
import org.apache.ibatis.annotations.Param;

/**
 * Description：xxxx<br/>
 * Copyright (c) ，2020 ， tianzhuY <br/>
 * This program is protected by copyright laws. <br/>
 * Date： 2020年02月15日
 *
 * @author ytz
 * @version : 1.0
 */
public interface PayMentService {
    public int create(PayMent payment);

    public PayMent getPayMentById(@Param("id") Long id);
}
