//package com.example.demo.entity;
//
//import javax.persistence.*;
//
///**
// * All rights Reserved, Designed By hxjd
// *
// * @类名: ${CLASS_NAME}
// * @包名: com.example.demo.entity
// * @描述: ${TODO}(用一句话描述该文件做什么)
// * @所属: 华夏九鼎
// * @日期: 2017/9/14 10:26
// * @版本: V1.0
// * @创建人：马东
// * @修改人：马东
// * @版权: 2017 hxjd Inc. All rights reserved.
// * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
// */
//@Entity
//@Table(name = "b_permis")
//public class Permis {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//    private String permisName;
//    @ManyToOne
//    @JoinColumn(name = "role_id")
//    private Role role;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getPermisName() {
//        return permisName;
//    }
//
//    public void setPermisName(String permisName) {
//        this.permisName = permisName;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//}
