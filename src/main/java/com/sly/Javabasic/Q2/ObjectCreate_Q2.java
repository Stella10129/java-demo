package com.sly.Javabasic.Q2;

import com.sun.xml.internal.ws.developer.Serialization;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreate_Q2 {
    @Test
    public void createDemo1(){
        User user = new User();
        User user1 = new User(1, "Stella", "12345@163.com");
        System.out.println(user1 == user);
        System.out.println(user);
        System.out.println(user1);
    }
    @Test
    public void createDemo2() throws InstantiationException, IllegalAccessException {
        User user = User.class.newInstance();
        System.out.println(user);
    }
    @Test
    public void createDemo3() throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<?>[] constructors = User.class.getConstructors();
        System.out.println(constructors.length);
        System.out.println(constructors[0]);
        System.out.println(constructors[1]);
        System.out.println(constructors[2]);
        Object user2 = constructors[0].newInstance();//实例化
        Object user3 = constructors[1].newInstance(2,"sly");
        Object user4 = constructors[2].newInstance(3,"sly","sly@qq.com");
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
    @Test
    public void createDemo4() throws CloneNotSupportedException {
        User user5 = new User(5, "sly");
        User clone = (User)user5.clone();
        System.out.println(clone);
        System.out.println(user5 == clone);
    }
    @Test
    public void createDemo5(){
        User user6 = new User(6, "xiaohai", "222@qq.com");
        byte[] serialize = SerializationUtils.serialize(user6);
        User deserialize = (User) SerializationUtils.deserialize(serialize);
        System.out.println(deserialize);
        System.out.println(user6 == deserialize);
    }
}
