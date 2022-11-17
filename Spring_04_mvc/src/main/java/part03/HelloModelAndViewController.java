package part03;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@Controller
public class HelloModelAndViewController {

	public ModelAndView search(ModelAndView mav) {
		/*  public ModelAndView search(ModelAndView mav) {
		 * = public ModelAndView search() {
		 *    ModelAndView mav = new ModelAndVie();  와 같음
		 */  
			
		mav.addObject("name","kim");
		mav.addObject("age",30);
		mav.setViewName("part03/helloModelView");
		
		return mav;
	}
	
} // end class
