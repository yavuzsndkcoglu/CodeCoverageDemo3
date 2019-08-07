package deneme2.Try1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	String input1="noon";
	App app=new App();
	boolean excepted =true;
	
	@Test
	public void isPlaindromeTest() 
	{
		assertEquals(excepted, app.isPalindrom(input1));
	}

}
