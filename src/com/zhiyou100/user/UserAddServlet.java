package com.zhiyou100.user;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.transport.http.DeploymentDescriptorParser.AdapterFactory;

/**
 * Servlet implementation class UserAddServlet
 */
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserAddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// String username = request.getParameter("username");
		// String remark = request.getParameter("remark");
		// String mobile = request.getParameter("mobile");
		// String age = request.getParameter("age");
		// String address = request.getParameter("address");
		// String password = request.getParameter("password");
		// String tel = request.getParameter("tel");
		// String email = request.getParameter("email");
		// String hobby = request.getParameter("hobby");
		// //String education = request.getParameter("education");
		// String card_num = request.getParameter("card_num");
		// String nation = request.getParameter("nation");
		// //String marry = request.getParameter("marry");
		// //String creater = request.getParameter("creater");
		// String create_time = request.getParameter("create_time");
		//// String updater = request.getParameter("updater");
		// // education
		// if (username == null || username.length() <= 0) {
		// return;
		// }
		// if (remark == null || remark.length() <= 0) {
		// return;
		// }
		// UserDao userDao = new UserDaoImpl();
		// User user = new User();
		// user.setUsername(username);
		// user.setRemark(remark);
		// user.setMobile(mobile);
		// user.setAge(Integer.valueOf(age));
		// user.setAddress(address);
		// user.setPassword(password);
		// user.setTel(tel);
		// user.setEmail(email);
		// user.setHobby(hobby);
		// //user.setEducation(education);
		// user.setCard_num(card_num);
		// user.setNation(nation);
		// //user.setMarry(marry);
		// //user.setCreater(creater);
		// //user.setUpdater(updater);
		// user.setCreate_time(create_time);
		// userDao.add(user);

		// -------------------------------------------------------------------------------------------------------
		/*
		 * PrintWriter out = response.getWriter(); Date create_time = null; Date
		 * enrolldeadline = null; try { //将String类型的数据解析成java.util.Date类型 new
		 * SimpleDateFormat("yyyy-MM-dd").prase(str); create_time = new
		 * SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter(
		 * "create_time")); User user = new User();
		 * user.setCreate_time(create_time); } catch (ParseException e) {
		 * e.printStackTrace(); }
		 * 
		 * 
		 * 
		 * if(adi.addGame(g)) { response.sendRedirect("admin/gamelist.jsp"); }
		 * else{ out.write("添加失败"); } out.flush(); out.close();
		 */

		// response.sendRedirect("UserShowServlet");

		/*
		 * try { long date = new
		 * SimpleDateFormat("yyyy-MM-dd").parse(create_time).getTime();
		 * user.setCreate_time(Timestamp.valueOf(create_time));
		 * 
		 * System.out.println(user); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		// Timestamp tsp = new Timestamp(Long.valueOf(create_time));
		
		
		
		// long date = new SimpleDateFormat("yyyy-MM-dd
		// HH:mm:ss").parse(create_time).getTime();
		// SimpleDateFormat adf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

//		try {
//			adf.parse(create_time);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		UserDao userDao = new UserDaoImpl();
		User user = new User();
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String create_time = request.getParameter("create_time");
		// 正则
		create_time = create_time.replaceAll("[A-Z]", " ").trim();
		request.getSession().setAttribute("create_time", create_time);
		String str = sdf.format(new Date());
		try {
			Date date = sdf.parse(str);
			System.out.println(date);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Timestamp tsp = new Timestamp((new Date()).getTime());
		user.setCreate_time(tsp);
		userDao.add(user);
		request.getRequestDispatcher("1.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
