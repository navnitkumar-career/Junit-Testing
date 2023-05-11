package com.example.junit;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Calculator.class)
class JunitTestingApplicationTests {

	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
		System.out.println("hello");
	}

// 	@Disabled => testing ne disable kar va mate
	
	@Test
	void testSum() {
		int excepetedResult = 50;
		int Result = c.doSum(20, 25, 5);
		assertThat(Result).isEqualTo(excepetedResult);
	}

	@Test
	void testMuliti() {
		int excepetedResult = 14;
		int Result = c.doMuliti(7, 2);

		assertThat(Result).isEqualTo(excepetedResult);
	}
	

	@Test
	void testCompare() {
		Boolean excepetedResult = false;
		Boolean Result = c.doComparision(7, 2);

		assertThat(Result).isEqualTo(excepetedResult);
	}

}
