package com.example.demo.util;

import java.util.HashMap;
import java.util.Map;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.util
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/14 14:23
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public class MapUtil {
    public static Map<String,String> secretMap = new HashMap<>();
    public static void put(String keyId,String secret){
        secretMap.put(keyId,secret);
    }
}
