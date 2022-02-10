package ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Bootstrapping class 
 * 
 * 1. 스프링부터 어플리케이션의 부트스트르핑(Bootstrapping)
 * 2. 설정 클래스로 역할(Configuration Class)
 * 
 * 
 */



@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
