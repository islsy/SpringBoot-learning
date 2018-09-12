package com.lsy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//自动配置类
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)//判断HelloService这个类在路径中是否存在,再存在且容器中没有该类的Bean的情况下系统会自动配置需要的Bean
@ConditionalOnProperty(prefix="hello",value="enable",matchIfMissing = true)//表示指定的属性要满足的条件,在
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloServiceProperties helloServiceProperties;
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
