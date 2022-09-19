package com.xuebin.kafka;

import java.io.Serializable;

public class UserMessage implements Serializable {

    private static final long serialVersionUID = 2610755805708559339L;

    public UserMessage() {
    }

    public UserMessage(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String id;

    private String name;

    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
