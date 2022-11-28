package part03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	public LoginController() {
		
	}

	@RequestMapping("/login.do")	
	public String loginProcess() {
		
		return "part03/loginForm";
	} // end loginProcess

} // end class
