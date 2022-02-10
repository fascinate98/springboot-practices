package ex04;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex03.component.MyComponent;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes= {MyApplication.class})
/*
 * @COnfiguration 설정 클래스는 찾지 못함
 * 
 * 
 */

@SpringBootTest
public class MyApplicationTest {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}