package part03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

// http://localhost:8090/myapp/helloModelAndView.htm

@Controller
public class HelloModelAndViewController {

	@RequestMapping("/helloModelAndView.htm")
	public ModelAndView search(ModelAndView mav) {
		/*  public ModelAndView search(ModelAndView mav) {
		 * = public ModelAndView search() {
		 *    ModelAndView mav = new ModelAndVie();  와 같음
		 */  
			
		mav.addObject("name","kim");
		mav.addObject("age",30);
		mav.setViewName("part03/helloModelAndView");
		
		return mav;
	}  // end search
	
} // end class
