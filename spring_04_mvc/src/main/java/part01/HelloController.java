package part01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// http://localhost:8090/myapp/hello.htm

@Controller  // 컨트롤러로 사용할 클래스에는 반드시 컨트롤러 어노테이션 선언을 해야 함
public class HelloController {
	
	public HelloController() {
		
	}

	@RequestMapping(value="hello.htm")
	public String search() {
			
		return "part01/hello"; //스트링값 전달
	} // end search
	
} // end class
