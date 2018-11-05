package com.tu.netty;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ClientHandler extends ChannelInboundHandlerAdapter {
	private static Log log = LogFactory.getLog(NettyClient.class);
	public static String checkResult = "0";
	static boolean firstCheck = true;

	@Override
	public void channelActive(ChannelHandlerContext ctx) {
		log.info("开始验证……");
		ctx.writeAndFlush(NettyClient.user.trim() + ","
				+ NettyClient.pass.trim());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) {
		if (firstCheck) {
			checkResult = msg.toString();
			firstCheck = false;
			if ("1".equals(checkResult)) {
				log.info("验证成功……");
				ctx.writeAndFlush("1");
			} else {
				log.info("验证失败……");
			}
		} else {
			NettyClient.resultList.clear();
			NettyClient.resultList = (List<Map<String, String>>) msg;
			try {
				Thread.sleep(50000);
				ctx.writeAndFlush("1");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
    	System.exit(0);
    }
	
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
		cause.printStackTrace();
		ctx.close();
	}
	
}