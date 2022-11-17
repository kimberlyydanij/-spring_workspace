package part02_annotation;

import org.aspectj.lang.ProceedingJoinPoint;

// 공통 로직만을 구현해 놓은 클래스 - Advice
public class AdviceCommon {
	public AdviceCommon() {
	
	}
	
	public void comm1() {
		System.out.println("before");
	}
	
	public void comm2() {
		System.out.println("after");
	}

	public void comm3(String name) {
		System.out.println(name);
	}

	public void comm4(Exception ex) {
		System.out.println("comm4 " + ex);
		
	}
	
	public void comm5(ProceedingJoinPoint point) {
		System.out.println("comm5 start");
		try {
			point.proceed();
		} catch (Throwable e) {
		e.printStackTrace();
	}
		
		System.out.println("comm5 end");
	}
	
	
} // end class