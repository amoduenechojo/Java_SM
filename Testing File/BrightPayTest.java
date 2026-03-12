import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;



public class BrightPayTest{

	@Test	
	public void testThatIDeposit5kBalanceIs5k(){

		BrightPay account = new BrightPay ();
		assertEquals(account.getBalance(), 0);

		account.deposit(5000);
	
		double expectedBalance = account.getBalance();
		double actualBalance = 5000;
		
		assertEquals(expectedBalance, actualBalance);

	}

	@Test	
	public void testThatIWithdraw2kBalanceIs3k(){

		BrightPay account = new BrightPay ();
		account.deposit(5000);
	
		account.withdraw(2000);
		
		double expectedBalance = account.getBalance();
		double actualBalance = 3000;
		
		assertEquals(expectedBalance, actualBalance);

	}	

	@Test	
	public void testThatIWithdrawNegativeThrowsExceptionBalanceIs5k(){

		BrightPay account = new BrightPay ();
		account.deposit(5000);
		
		assertThrows(IllegalArgumentException.class, () ->account.withdraw(10000));		
	}


}