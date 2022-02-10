package ex04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
/*
@SpringBootApplication 메타 어노테이션

@SpringBootConfiguration (cf. @Configuration)
@ComponentScan 
@EnableAutoConfiguration //시큐리티 mvc aop설정 (웹 MVC설정 뷰리졸버 메세지컨버터 .. aop, security, jpa, .. 등을 자동 ~디폴트~ 설정 on Dependency를 기준으로 함 )
*/

/*
 */
@SpringBootApplication
public class MyApplication {

	
	public static void main(String[] args) {
		try(ConfigurableApplicationContext c = SpringApplication.run(MyApplication.class, args)) {
		}
	}

}