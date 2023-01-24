package com.devskiller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BasicTest {

	@Test
	void shouldAddTwoNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.add(2, 3);

		//then
		assertThat(result).isEqualTo(5);
	}

	@Test
	void shouldSubtractTwoNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.subtract(5, 3);

		//then
		assertThat(result).isEqualTo(2);
	}

	@Test
	void shouldMultiplyTwoNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.multiply(2, 3);

		//then
		assertThat(result).isEqualTo(6);
	}

	@Test
	void shouldDivideTwoNumbers() {
		//given
		Calculator calculator = new Calculator();

		//when
		int result = calculator.divide(6, 3);

		//then
		assertThat(result).isEqualTo(2);
	}
}