package com.troy.presen;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class jazzclan {


    @GeneratedValue
    private Long id;

    private String name;
    private Long fans;
    private String members;

    public jazzclan() {
    }

    public jazzclan(String name, Long fans, String members) {
        this.name = name;
        this.fans = fans;
        this.members = members;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "jazzclan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fans=" + fans +
                ", members='" + members + '\'' +
                '}';
    }
}
