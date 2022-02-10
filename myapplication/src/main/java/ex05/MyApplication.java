package ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ex05.component.MyComponent;
import ex05.component.HelloWorldRunner;

/*
 * 
 * ApplicationContext 구성한 후, 실행 할 코드(Application Context 환경에 의존)가 있는 경우
 * ApplicationRunner 인터페이스 구현 클래스를 빈 생성하기.
 * 
 */
@SpringBootApplication
public class MyApplication {

	@Bean
	public ApplicationRunner applicationRunner() {
		// 1. 작성된 구현 클래스를 사용하느 방법
		// return new HelloWorldRunner();

		// 2. Anonymous Class 사용법
		return new ApplicationRunner() {
			
			@Autowired
			private MyComponent myComponent;
			
			@Override
			public void run(ApplicationArguments args) throws Exception {
				myComponent.printHello("dfdf");
			}
		};

		// 3. 함수형 (람다 표현식)
//		return(args) -> {
//			//함수하나, 인터페이스 생략 가능
//			System.out.println("HelloWorld");
//		};
		
		
	}

	public static void main(String[] args) {
		try (ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {
		}

		System.out.println("HelloWorld");
	}
}
