package com.example.demo.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.util
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/14 14:20
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public class SecretUtil {

    public static String shalHash(String keyId,String rcode,String tims){
        String scret = rcode+"_"+tims+"_8Yn8vptQYzsx3WX9nV72NyB4Q3p6U8";
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        try {
            sha.update(scret.getBytes("utf8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        byte [] bytes=sha.digest();
        StringBuilder ret=new StringBuilder(bytes.length<<1);
        for(int i=0;i<bytes.length;i++){
            ret.append(Character.forDigit((bytes[i]>>4)&0xf,16));
            ret.append(Character.forDigit(bytes[i]&0xf,16));
        }
        return ret.toString();
    }
}
