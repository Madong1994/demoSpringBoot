//package com.example.demo.entity;
//
//
//import javax.persistence.*;
//import javax.persistence.Id;
//import javax.persistence.Transient;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * All rights Reserved, Designed By hxjd
// *
// * @类名: ${CLASS_NAME}
// * @包名: com.example.demo.entity
// * @描述: ${TODO}(用一句话描述该文件做什么)
// * @所属: 华夏九鼎
// * @日期: 2017/9/14 10:19
// * @版本: V1.0
// * @创建人：马东
// * @修改人：马东
// * @版权: 2017 hxjd Inc. All rights reserved.
// * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
// */
//@Entity
//@Table(name = "b_role")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Integer id;
//    private String roleName;
//    @OneToMany(mappedBy = "role",fetch = FetchType.EAGER)
//    private List<Permis> permisList;
//    @ManyToMany
//    @JoinTable(name = "b_userrole",joinColumns = {@JoinColumn(name = "role_id")},inverseJoinColumns = {@JoinColumn(name = "user_id")})
//    private List<User> userList;
//
//    public List<Permis> getPermisList() {
//        return permisList;
//    }
//
//    public void setPermisList(List<Permis> permisList) {
//        this.permisList = permisList;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getRoleName() {
//        return roleName;
//    }
//
//    public void setRoleName(String roleName) {
//        this.roleName = roleName;
//    }
//
//    public List<User> getUserList() {
//        return userList;
//    }
//
//    public void setUserList(List<User> userList) {
//        this.userList = userList;
//    }
//    @Transient
//    public List<String> getPermissionsName(){
//        List<String> list = new ArrayList<String>();
//        List<Permis> permisList = getPermisList();
//        for(Permis permis : permisList){
//            list.add(permis.getPermisName());
//        }
//        return list;
//    }
//}
