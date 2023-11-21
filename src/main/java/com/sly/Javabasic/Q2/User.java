package com.sly.Javabasic.Q2;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable, Cloneable {
    private static final long serialVersionUID = -303793456610254190L; //显式地定义一个序列化地版本号，确保序列化和反序列化的正确性和稳定性
    private int id;
    private String name;
    private String email;

    public User(){}

    public User(int id, String name){
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (User)super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
