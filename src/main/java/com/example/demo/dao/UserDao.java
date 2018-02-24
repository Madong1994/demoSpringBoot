package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.dao
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/13 15:30
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface UserDao extends CrudRepository<User,Integer>{
//    @Transactional
//    @Modifying
//    @Query("UPDATE b_user bu set bu.userName = :userName where bu.id = :id")
//    int updateUserNameById(@Param("userName")String userName,@Param("id")int id);

    @Query("select u from User u")
    List<User> getList();
}
