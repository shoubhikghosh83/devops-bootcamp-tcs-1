package com.tcs.devops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.tcs.devops.controller.DemoController;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = { DevopsDemoApplication.class })
class DevopsDemoApplicationTests {

	@Test
	public void getHello() throws Exception {

		assertEquals("SUCCESS-200", new DemoController().health().getBody());

	}

}
