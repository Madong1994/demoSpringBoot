package com.example.demo.NettyServer;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Time: 9:30
 * Date: 2017/9/25
 * Corp: 华夏九鼎
 * Name: Nandem(nandem@126.com)
 * ----------------------------
 * Desc: 请输入描述
 */
public class NettyServerHandler extends SimpleChannelInboundHandler<Object>
{

    private static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    private final static Logger logger = LoggerFactory.getLogger(NettyServer.class);

    public NettyServerHandler()
    {
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        handleData(channelHandlerContext, o);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception
    {
        Channel incoming = ctx.channel();
        logger.info(incoming.remoteAddress() + "已连接");
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception
    {
        Channel incoming = ctx.channel();

        //移除断开连接的子系统channel并获取该子系统名称
        String inActiveSubSystemName = NettyServer.getInstance().removeFromClientMap(incoming);

        logger.info("【" + inActiveSubSystemName + "】断开连接");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
    {
        logger.error("【" + NettyServer.getInstance().getClientName(ctx.channel()) + "】关闭或网络异常");
        //NettyServer.getInstance().removeFromClientMap(incoming);
        ctx.close();
    }

    /*^_^*------以下------*^_^*/
    protected void handleData(ChannelHandlerContext channelHandlerContext, Object string)
    {
        System.out.println("收到客户端消息：" + string.toString());
    }
}