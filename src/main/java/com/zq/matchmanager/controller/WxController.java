package com.zq.matchmanager.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zq.matchmanager.util.CheckUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class WxController {

	@RequestMapping(value = "wx",method=RequestMethod.GET)
	public void login(HttpServletRequest request,HttpServletResponse response){
		System.out.println("success");
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		PrintWriter out = null;
		try {
			  out = response.getWriter();
			if(CheckUtil.checkSignature(signature, timestamp, nonce)){
				out.write(echostr);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			out.close();
		}
		
	}
	
	/**
	 * 该方法定义为接收来自微信端的事件或者消息
	 * @param request
	 */
	@RequestMapping(value = "wx",method=RequestMethod.POST)
	public void post(HttpServletRequest request){
		System.out.println("谢谢关注");
		log.info(request.toString());
		//todo：当接收到来自微信端的事件或者消息，进行下一步的处理
		
	}

}