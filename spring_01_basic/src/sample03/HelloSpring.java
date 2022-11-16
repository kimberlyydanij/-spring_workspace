package sample03;
/*
 * factory을 이용하면 결합도는 인터페이스보다 낮지만
 * factory가 정확히 구현되어 ㅇ;ㅆ지 않으면 참조하는 객체에 영향이 간다.
 */

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean Bean = null;
		//bean = MessageFactory.getInstance("ko");
		//display(bean,"스프링")

		bean = MessageFactory.getInstance("en");
		display(bean,"Spring")
		
	} // end main
	
	public static void display(MessageBean bean, String subject) {

		bean.sayHello(subject);
	}

 } // end class
 