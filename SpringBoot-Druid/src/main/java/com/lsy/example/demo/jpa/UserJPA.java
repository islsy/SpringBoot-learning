package com.lsy.example.demo.jpa;

import com.lsy.example.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

//JPA完成数据操作的类
public interface UserJPA extends
        JpaRepository<UserEntity,Long>,//提供简单的数据操作接口
        JpaSpecificationExecutor<UserEntity>,//提供复杂的查询接口
        Serializable {//提供序列化接口
}
