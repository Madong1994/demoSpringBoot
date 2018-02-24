//package com.example.demo.redis;
//
//
//import com.mysql.jdbc.StringUtils;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import redis.clients.jedis.Jedis;
//import redis.clients.jedis.exceptions.JedisException;
//
///**
// * All rights Reserved, Designed By hxjd
// *
// * @类名: ${CLASS_NAME}
// * @包名: com.example.demo.redis
// * @描述: ${TODO}(用一句话描述该文件做什么)
// * @所属: 华夏九鼎
// * @日期: 2017/9/14 11:26
// * @版本: V1.0
// * @创建人：马东
// * @修改人：马东
// * @版权: 2017 hxjd Inc. All rights reserved.
// * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
// */
//public class RedisClient {
//    private JedisConnectionFactory factory;
//
//    public RedisClient(JedisConnectionFactory factory) {
//        this.factory = factory;
//    }
//
//    /**
//     * 添加操作
//     * @param key
//     * @param value
//     * @param cacheSeconds
//     */
//    public void putObject(final String key,final Object value,final int cacheSeconds){
//        if(StringUtils.isNullOrEmpty(key)){
//
//        }
//    }
//
//    /**
//     * 取出操作
//     * @param key
//     * @return
//     */
//    public Object getObject(final String key){
//
//    }
//    public String set(final String key,final String value,final int cacheSeconds){
//
//    }
//    public String get(final String key){
//
//    }
//    public long del(final String key){
//
//    }
//    public Jedis getResource() throws JedisException{
//        Jedis jedis = null;
//        jedis = factory.fe
//    }
//    public Jedis getJedis() throws JedisException{
//        return getResource();
//    }
//    public void returnBrokenResource(Jedis jedis){
//        if(jedis != null){
//            jedis.close();
//        }
//    }
//    public <R> R redisTemp
//}
