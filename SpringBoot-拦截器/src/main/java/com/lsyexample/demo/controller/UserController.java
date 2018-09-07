package com.lsyexample.demo.controller;


import com.lsyexample.demo.entity.UserEntity;
import com.lsyexample.demo.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//该注解编写一个控制器
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserJPA userJPA;

    /**
     * 查询用户列表的方法
     * @return
     */
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public List<UserEntity> list(){
        return userJPA.findAll();
    }

    /**
     * 添加\更新用户方法
     * @param entity
     * @return
     */
    @RequestMapping(value = "/save",method= RequestMethod.GET)
    public UserEntity save(UserEntity entity){
        return userJPA.save(entity);
    }

    /**
     * 删除指定id的用户并返回用户列表
     * @param id 需要删除用户的id
     * @return 用户列表
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public List<UserEntity> delete(Long id){
        userJPA.deleteById(id);
        return userJPA.findAll();
    }
}
