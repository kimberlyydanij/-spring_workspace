package sample01;

/*
 * 결합도
 * 1. 클래스간의 상호 연결성 측정을 의미한다.
 * 2. 낮은 결합도를 가지려면 하나의 객체 변경이 다른 객체에 영향을 미쳐서는 안된다.
 */

public class HelloSpring {

	public static void main(String[] args) {
		
		

	} // end main
	
	public static void display(MessageBeanKorea bean) {
		bean.sayHello("스프링");
	} //end display

} // end class
