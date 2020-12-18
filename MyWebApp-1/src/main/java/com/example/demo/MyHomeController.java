package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHomeController {
	@RequestMapping("home")
//	@ResponseBody
	public String home(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		String brow_name=req.getParameter("name");
		System.out.println("Hii home bla blaa "+brow_name);
		session.setAttribute(brow_name, brow_name);
		return "home";
	}
}
