package POM_DataProvider3;

import org.openqa.selenium.WebDriver;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;
import ExcelUtil.ExcelApiTest4;

public class Verifydatabrowser {
	




	private static WebDriver driver;


	@DataProvider(name = "TC01_Add_Education")
	public static Object[][] Authentication1() throws Exception {
		
		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_Education.xlsx","Sheet2");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}

	
	
  @Test(dataProvider="TC01_Add_Education")
public    void  Startbrowser(String BrowserName,String TestURL,String username1,String password1,String Education) throws Exception {
	  
	  if(BrowserName.equalsIgnoreCase("Firefox"))
	  {
		  driver = TestBrowser.FirefoxBrowser();
		  driver.get(TestURL);
		 	  
	  }
	  else if(BrowserName.equalsIgnoreCase("Chrome"))
  
	  
	  {
	    driver = TestBrowser.OpenChromeBrowser();
	    driver.get(TestURL);
	  }
	  
	 
	  
	  
  
  
  
  Dataproviderbrowser A1= new Dataproviderbrowser(driver);
  A1.login1( username1, password1);
  A1.addEducation1(Education);
  driver.quit();
  
}

}
