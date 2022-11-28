package part03.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	public LoginInterceptor() {
	
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Login preHandle...");
		String uri = request.getRequestURI();
		//myapp/noticeList.do
		System.out.println("url: "+uri);
		
		uri = uri.substring(uri.lastIndexOf("/")+1);
		System.out.println("url: "+uri);
		
		HttpSession session = request.getSession();
		//로그인 상태가 아니면
		if(session.getAttribute("chk")==null) {
			response.sendRedirect("login.do?returnUrl="+uri);
			return false; 
		}
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
	
} // end class
