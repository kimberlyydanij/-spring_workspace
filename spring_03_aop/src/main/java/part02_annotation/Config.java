package part02_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration  //환경설정을 자바를 이용해 하겠다는 내용
@EnableAspectJAutoProxy
public class Config {
	public Config() {
		
	}
	
	@Bean
	public ServiceImp svc() {  //메소드 명이 Bean의 id 값이 됨
		return new ServiceImp();
	}
	
	@Bean
	public AdviceCommon common() {
		return new AdviceCommon();
	}
} // end class
