package com.example.demo.entity;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.entity
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/13 15:35
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
@Entity
@Table(name = "b_user")
public class User implements Serializable {
    private static final long serialVersionUID = 8127035730921338189L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false,name = "USERNAME")
    @NotEmpty(message = "用户名不能为空")
    private String userName;
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "b_userrole",joinColumns = {@JoinColumn(name = "user_id")},inverseJoinColumns = {@JoinColumn(name = "role_id")})
//    private List<Role> roleList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
