package com.example.demo.config;

import com.example.demo.entity.User;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.config
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/18 15:54
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SetTset {
    public static void main(String[] args) {
        ArrayList<Integer> users =new ArrayList<>();
        users.add(1);
        users.add(2);
        users.add(1);
        users.add(3);
        Set set = new HashSet(users);
        System.out.println("ddd");
        for (Object i:set){
            System.out.println(Integer.parseInt(i.toString()));
        }
    }
}
