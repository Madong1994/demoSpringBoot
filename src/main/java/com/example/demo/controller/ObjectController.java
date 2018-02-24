package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.ProjectBean.*;
import com.example.demo.util.SecretUtil;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.controller
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/14 12:00
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/api/v1")
public class ObjectController {
    @RequestMapping("/env/runtime")
    @ResponseBody
    public String accessoryOne(HttpServletRequest request, @RequestBody String projectBean){
        long current = System.currentTimeMillis() / 1000;
        String tims = request.getHeader("ts");
        long ts = Long.parseLong(tims);
        if(current - ts > 60.0){
            ReturnMsg returnMsg = new ReturnMsg();
            returnMsg.setErrMsg("请求过期");
            returnMsg.setStatusCode(4);
            returnMsg.setContent("请求过期");
            return JSON.toJSONString(returnMsg);
        }
        String keyId = request.getHeader("keyId");
        String rcode = request.getHeader("rcode");
        String signature = request.getHeader("signature");
        String secret = SecretUtil.shalHash(keyId,rcode,tims);
        if(secret.equals(signature)){
            //保存操作
//            request.get
            ReturnMsg returnMsg = new ReturnMsg();
            returnMsg.setErrMsg("正常");
            returnMsg.setStatusCode(0);
            returnMsg.setContent("正常");
            return JSON.toJSONString(returnMsg);
        }else {
            //没有权限
            ReturnMsg returnMsg = new ReturnMsg();
            returnMsg.setErrMsg("无操作权限");
            returnMsg.setStatusCode(2);
            returnMsg.setContent("无操作权限");
            return JSON.toJSONString(returnMsg);
        }
    }
    @RequestMapping("/video/info")
    @ResponseBody
    public String accessoryTwo(HttpServletRequest request,@RequestBody String projectBean){
        long current = System.currentTimeMillis() / 1000;
        String tims = request.getHeader("ts");
        long ts = Long.parseLong(tims);
        if(current - ts > 60.0){
            ReturnMsg returnMsg = new ReturnMsg();
            returnMsg.setErrMsg("请求过期");
            returnMsg.setStatusCode(4);
            returnMsg.setContent("请求过期");
            return JSON.toJSONString(returnMsg);
        }
        String keyId = request.getHeader("keyId");
        String rcode = request.getHeader("rcode");
        String signature = request.getHeader("signature");
        String secret = SecretUtil.shalHash(keyId,rcode,tims);
        if(secret.equals(signature)){
            //保存操作
//            request.get
            ReturnMsgt returnMsg = new ReturnMsgt();
            returnMsg.setErrMsg("正常");
            returnMsg.setStatusCode(0);

            return JSON.toJSONString(returnMsg);
        }else {
            //没有权限
            ReturnMsgt returnMsg = new ReturnMsgt();
            returnMsg.setErrMsg("无操作权限");
            returnMsg.setStatusCode(2);

            return JSON.toJSONString(returnMsg);
        }
    }
    @RequestMapping("")
    @ResponseBody
    public String accessoryThree(HttpServletRequest request,@RequestBody String projectBean){
        long current = System.currentTimeMillis() / 1000;
        String tims = request.getHeader("ts");
        long ts = Long.parseLong(tims);
        if(current - ts > 60.0){
            ReturnMsgtt returnMsg = new ReturnMsgtt();
            returnMsg.setMsg("请求过期");
            VdioUrl vdioUrl = new VdioUrl();
            returnMsg.setStatusCode(4);
            returnMsg.setContent(vdioUrl);
            return JSON.toJSONString(returnMsg);
        }
        String keyId = request.getHeader("keyId");
        String rcode = request.getHeader("rcode");
        String signature = request.getHeader("signature");
        String secret = SecretUtil.shalHash(keyId,rcode,tims);
        if(secret.equals(signature)){
            //保存操作
//            request.get
            ReturnMsgtt returnMsg = new ReturnMsgtt();
            returnMsg.setMsg("正常");
            VdioUrl vdioUrl = new VdioUrl();
            vdioUrl.setCamNo(1);
            vdioUrl.setPlayUrl("http://static.xxx.com/video/camVideo.m3u8");
            vdioUrl.setProjectCode("5001132017081501417001");
            returnMsg.setStatusCode(0);
            returnMsg.setContent(vdioUrl);
            return JSON.toJSONString(returnMsg);
        }else {
            //没有权限
            ReturnMsgtt returnMsg = new ReturnMsgtt();
            returnMsg.setMsg("无操作权限");
            VdioUrl vdioUrl = new VdioUrl();
//            vdioUrl.setCamNo(1);
//            vdioUrl.setPlayUrl("http://static.xxx.com/video/camVideo.m3u8");
//            vdioUrl.setProjectCode("5001132017081501417001");
            returnMsg.setStatusCode(2);
            returnMsg.setContent(vdioUrl);
            return JSON.toJSONString(returnMsg);
        }
    }
}
