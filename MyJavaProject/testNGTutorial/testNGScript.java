package testNGTutorial;

import org.testng.annotations.Test;

public class testNGScript {

	@Test(priority=1, description = "This testcase will login")
	
	public void loginApp()
	
	{
		System.out.println("this is my fist test NG script");
	
	}
		
   @Test(priority=2, description = "This testcase will login")
	
	public void ItemSelection()
		{
		System.out.println("items selected");
		
	}
	

   @Test(priority=3, description = "This testcase will checkout")
   
public void CheckOut()

{
	System.out.println("Checkout done");
	
	
}




}



	
	



