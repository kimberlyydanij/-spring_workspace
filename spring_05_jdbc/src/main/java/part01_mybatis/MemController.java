package part01_mybatis;

import javax.naming.directory.SchemaViolationException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// http://localhost:8090/myapp/list.do

@Controller
public class MemController {
	
	private MemDAO memDAO;
	
	public MemController() {
		
	}
	
	public void setMemDAO(MemDAO memDAO) {
		this.memDAO = memDAO;
	}

	@RequestMapping(value="list.do")
	public ModelAndView process(ModelAndView mav) {
		mav.addObject("list", memDAO. list());
		mav.setViewName("part01/list");
		
		return mav;
	} // mav
	
	@RequestMapping(value="/insert.do", method=RequestMethod.GET) 
	public String insertForm() {
		return "part01/insert";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST) 
	public String insertData(MemDTO dto) {
		memDAO.insertMethod(dto);
		return "redirect:/list.do";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.GET) 
	public ModelAndView updateForm(int num, ModelAndView mav) {
		mav.addObject("dto", memDAO.one(num));
		mav.setViewName("part01/update");
		return mav;
	}
} // end class


