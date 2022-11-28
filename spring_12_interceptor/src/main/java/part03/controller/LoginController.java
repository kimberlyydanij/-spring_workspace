package part03.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import part03.dto.PersonDTO;

//http://localhost:8090/myapp/login.do

@Controller
public class LoginController {
	
	public LoginController() {
		
	}

	@RequestMapping("/login.do")	
	public String loginProcess() {
		
		return "part03/loginForm";
	} // end loginProcess
	
	@RequestMapping("/logpro.do")
	public String loginExecution(PersonDTO dto, HttpSession session) {
		if(dto.getId().equals("kim") && dto.getPass().equals("1234")) {
			session.setAttribute("chk", dto.getId());
			session.setMaxInactiveInterval(1000*60*30);  // 세션 만료시간 지정, 1000=1초
			System.out.println(session.getAttribute("chk"));		
		}
		return "redirect:/index.do";
	}
	

} // end class
