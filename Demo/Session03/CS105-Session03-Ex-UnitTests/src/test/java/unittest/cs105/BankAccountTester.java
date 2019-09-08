package unittest.cs105;

import static org.junit.Assert.*;

import java.text.*;
import java.util.*;

import org.junit.*;
import org.junit.rules.*;

import edu.sbcc.cs105.*;

public class BankAccountTester {
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testCreditValidAmount() throws ParseException {

		Date lastPostDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/24/2016");

		BankAccount account = new BankAccount("Joe", 1000, .05, lastPostDate);

		account.credit(50.00);

		// Note, this is subject to approximation errors
		assertTrue("Amount should be $1050.00, was " + account.getBalance(), account.getBalance() == 1050.0);
	}

	@Test
	public void testCreditNegativeAmount() throws ParseException {

		Date lastPostDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/24/2016");

		BankAccount account = new BankAccount("Joe", 1000, .05, lastPostDate);

		// Tell JUNit to expect an IllegalArgumentException
		thrown.expect(IllegalArgumentException.class);

		account.credit(-50.00);

	}
}
