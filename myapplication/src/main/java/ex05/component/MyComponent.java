package ex05.component;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	
	@Bean
	public void printHello(String s) {
		System.out.println(s);
	}
}
