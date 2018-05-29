package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloControllerTest {

	@Test
	public void HelloTest() {
		HelloController helloController = new HelloController();
		assertEquals("Hello. Spring Boot!", helloController.index());
	}
}
