package part03;

import org.springframework.stereotype.Controller;

// http://localhost:8090/myapp/firstmain.st
import org.springframework.web.bind.annotation.RequestMapping;


// http://localhost:8090/myapp/threemain.se
@Controller
public class MemController {
	
	private Service svc;
	
	public MemController() {
		
	}
	
	public void setSvc(Service svc) {
		this.svc = svc;
	} // end setSvc
	
	@RequestMapping("/threemain.se")
	public void execute() {
		System.out.println("execute");
		//트랜젝션이 설정된 메소드에서는 try~catch를 설정하며 ㄴ안되고
		//메소드를 호출하는 곳에서  try~catch를 한다
		
		try {		
		svc.insertProcess();
		System.out.println("result OK");
		} catch(Exception ex) {
			System.out.println("result : " + ex.toString());
		}
	} // end execute
	
} // end class
