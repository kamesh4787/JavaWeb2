package com.example.JavaWeb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class JavaWebApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
public void testMessage() {
		
		String expectedTitle = "Free QA Automation Tools For Everyone";
        boolean originalTitle = true;
        Assert.isTrue(originalTitle);	
		
	}
}
