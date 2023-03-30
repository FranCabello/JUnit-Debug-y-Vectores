package UD3;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestaTest {

	@Test
	public void test() {
		Resta R = new Resta(2, 3);
		assertTrue(R.Restar() == -1);
	}

}
