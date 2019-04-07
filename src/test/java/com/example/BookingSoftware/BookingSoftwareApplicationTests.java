package com.example.BookingSoftware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hibernate.validator.internal.util.Contracts.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookingSoftwareApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue(true,"true");
	}

}
