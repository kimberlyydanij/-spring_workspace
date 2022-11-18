package part01_mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// http://localhost:8090/myapp/list.do

@Controller
public class MemController {
	
	@Autowired  //memDAO로 생성되는 빈을 자동적으로 매핑해줌. dispatch-mybtis에서 설정한 것들 임
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
		
	@RequestMapping(value="/update.do", method=RequestMethod.POST) 
	public String updateData(MemDTO dto) {
			memDAO.updateMethod(dto);
			return "redirect:/list.do";			
	} // end updateData
	
	@RequestMapping(value="/delete.do")
	public String deleteDate(int num) {
		memDAO.deleteMethod(num);
		return "redirect:/list.do";
	}
} // end class


