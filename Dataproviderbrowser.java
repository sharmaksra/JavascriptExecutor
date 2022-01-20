  package POM_DataProvider3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Dataproviderbrowser {
	
	

		 WebDriver driver;
		
		By Username=By.id("txtUsername");
		By Password=By.id("txtPassword");
		By Login=By.name("Submit");
		By Admin=By.id("menu_admin_viewAdminModule");
		By Qualification1=By.linkText("Qualifications");
		By Education1=By.id("menu_admin_viewEducation");
		By add=By.id("btnAdd");
		By Level=By.name("education[name]");
		By save=By.name("btnSave");

		
		
		public  Dataproviderbrowser(WebDriver driver) {
			// TODO Auto-generated constructor stub
		  
		  {  
		        this.driver=driver;
		  }
		 
		}
		
		
		  public void login1(String username1,String password1) throws Exception {
			  driver.findElement(Username).sendKeys(username1);
			  driver.findElement(Password).sendKeys(password1);
			  driver.findElement(Login).click();
			  
			  }
		  
		  public void addEducation1(String Education) throws Exception {
			  
			  driver.findElement(Admin).click();
			  driver.findElement(Qualification1).click();
			  driver.findElement(Education1).click();
			  driver.findElement(add).click();
			  driver.findElement(Level).sendKeys(Education);
			  driver.findElement(save).click();
			  
			
		  
		  }
		  
		 
		  public   WebElement findElement(By by) throws Exception 
			{
						
				 WebElement elem = driver.findElement(by);    	    
				
				 
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
				}
				
				return elem;
	  
	  
			}
	  
	  
  }

	

	

	





	
	

