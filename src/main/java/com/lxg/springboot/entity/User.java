package com.lxg.springboot.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by lxg
 * on 2017/2/20.
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    private int id;
    private String username;
    private String password;
    private List<Role> list = new ArrayList<Role>();

    @OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
            joinColumns={ @JoinColumn(name="uid",referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="rid",referencedColumnName="id")})
    public List<Role> getList() {
        return list;
    }

    public void setList(List<Role> list) {
        this.list = list;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
