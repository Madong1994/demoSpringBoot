package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.controller
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/13 13:54
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
@Controller
@EnableAutoConfiguration
public class HollerController {
    @Autowired
     UserDao userDao;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("我在hello?");
        return "hello";
    }
    @RequestMapping("/jpa")
    @ResponseBody
    public String jpaTest(HttpServletRequest request){
//        List<User> users = userDao.getList();
        System.out.println(request.getHeader("keyId")+"--------------->");
        return "头部信息：" + request.getHeader("keyId");
    }
}
