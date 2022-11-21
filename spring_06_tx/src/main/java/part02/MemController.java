package part02;

import org.springframework.stereotype.Controller;

// http://localhost:8090/myapp/firstmain.st
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemController {
	
	private Service svc;
	
	public MemController() {
		
	}
	
	public void setSvc(Service svc) {
		this.svc = svc;
	} // end setSvc
	
	@RequestMapping("/firstmain.st")
	public void execute() {
		System.out.println("execute");
		svc.insertProcess();
	} // end execute
	
	
	
} // end class
