package cn.itcast.User.Web.servlet;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.vcode.utils.VerifyCode;

public class VerifyCodeServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
	/**
	 * 1.创建验证码类
	 */
		VerifyCode vc=new VerifyCode();
		/**
		 * 2.得到验证码图片
		 */
		BufferedImage image=vc.getImage();
		/**
		 * 3.把图片上的文本保存到到session中
		 */
		request.getSession().setAttribute("session_vcode",vc.getText());
		/**
		 * 把图片响应给客户端
		 */
		VerifyCode.output(image,response.getOutputStream());
	}

}