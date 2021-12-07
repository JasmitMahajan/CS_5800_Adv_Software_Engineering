import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeTest {
	@Test
	public final void twoTest() {
		assertTrue(Prime.isPrime(2));
	}
	
	@Test
	public final void threeTest() {
		assertTrue(Prime.isPrime(3));
	}
	
	@Test
	public final void fourTest() {
		assertFalse(Prime.isPrime(4));
	}
	
	@Test
	public final void fiveTest() {
		assertTrue(Prime.isPrime(5));
	}
	
	@Test
	public final void sixTest() {
		assertFalse(Prime.isPrime(6));
	}
	
	@Test
	public final void sevenTest() {
		assertTrue(Prime.isPrime(7));
	}
}
