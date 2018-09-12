package com.lsy;
//判断依据类
public class HelloService {
    private String msg;
    public String sayHello(){
        return "hello"+msg;
    }
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}
