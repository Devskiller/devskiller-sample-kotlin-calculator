package verify_pack;

import org.junit.jupiter.api.Test;

import com.devskiller.Calculator;

import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

class IllegalArgumentsTest {

	@Test
	void shouldThrowExceptionForDivisionByZero() {
		//given
		Calculator calculator = new Calculator();

		try {
			//when
			calculator.divide(10, 0);

			//then
			failBecauseExceptionWasNotThrown(IllegalArgumentException.class);
		} catch (IllegalArgumentException e) {
			//ignore
		}
	}

}