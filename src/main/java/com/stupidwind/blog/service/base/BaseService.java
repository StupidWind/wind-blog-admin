package com.stupidwind.blog.service.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:28
 * @description: 基础Service抽象类
 * @ver: 1.0.0
 */
@Service
public abstract class BaseService<DOMAIN> extends ServiceImpl<BaseMapper<DOMAIN>, DOMAIN> {
}
