package com.pramati.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;

    public User(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    public User(){
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("User [id=").append(id+",");
        sb.append("name="+name+"]");
        return sb.toString();
    }
}
