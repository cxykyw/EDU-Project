package com.kyw.eduproject.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * mybatis分页插件配置
 * @author : kangyw
 * @date : 下午 16:35 2020/4/21
 */
@Configuration
public class MybatisConfig {


    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();

        //设置为true时，会把ROWBOUNDS第一个的参数offset当成pageNum页码使用
        p.setProperty("offsetAsPageNum","true");

        //设置为true时，使用RowBounds分页会进行count查询
        p.setProperty("rowBoundsWithCount","true");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
