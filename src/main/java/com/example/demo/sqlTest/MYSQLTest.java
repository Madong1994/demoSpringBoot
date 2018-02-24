package com.example.demo.sqlTest;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.sqlTest
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/13 16:09
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MYSQLTest {
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/boot?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull";
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(conn!=null){

            System.out.println("chenggogggngngngngngngng");
        }

    }

}
