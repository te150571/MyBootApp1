package jp.te4a.spring.boot.myapp1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloControllerTest {

	@Test
	public void HelloTest() {
		HelloController helloController = new HelloController();
		assertThat("Hello. Spring Boot!", is(helloController.index()));
	}
}
