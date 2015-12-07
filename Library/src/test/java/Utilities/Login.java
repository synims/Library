package Utilities;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Login  {
	
	
	public void ImsLogin(WebDriver d) throws Exception {
		String Uid =  ExcelUtility.getCellData(3, 4);
		String Pass = ExcelUtility.getCellData(4, 4);
		String Upath = ExcelUtility.getCellData(3, 3);
		String Ppath = ExcelUtility.getCellData(4, 3);
		String Bpath = ExcelUtility.getCellData(5, 3);
		
		 try
		    {
		d.findElement(By.xpath(Upath)).sendKeys(Uid);
	    d.findElement(By.xpath(Ppath)).sendKeys(Pass);
	    d.findElement(By.xpath(Bpath)).click();
	    ExcelUtility.setCellData("Pass", 2, 5);
		
		}
		
		 catch (Exception e){
			 ExcelUtility.setCellData("Fail", 2, 5);
		 }
		     
	}
	    public void Loginpage(WebDriver d , String URL) throws Exception {
	    
        String link = d.getCurrentUrl();   
        
	    if(link.equals(URL+"/DashboardSelectCollege.aspx"))
		{
			
		    String selColg = ExcelUtility.getCellData(7, 3);
			String ColgValue = ExcelUtility.getCellData(7, 4);
			//String ColgArrow = ExcelUtility.getCellData(6, 3);
			d.findElement(By.id("ctl00_mainMasterContent_cmbCollege_Arrow")).click();
			List<WebElement> LibLists = d.findElements(By.xpath(selColg));
			for (int i = 0; i < LibLists.size();i++) {
				
				String temp = LibLists.get(i).getText();
			 	if (temp.equals(ColgValue)) {
					LibLists.get(i).click();
					Thread.sleep(2000);
					break;
				}
		    }
			Thread.sleep(2000);
			//d.findElement(By.xpath(selColg)).sendKeys(ColgValue);
			
			String nextclick = ExcelUtility.getCellData(8, 3);
			d.findElement(By.xpath(nextclick)).click();
			
		}

	    else if (link.equals(URL+"/StaffDashBoard.aspx"))
	    	
	    {	    String link1 ="";
	    	String men = ExcelUtility.getCellData(9, 3);
	    	 if(isElementPresent(By.xpath(men), d))
	    	 {
	    		 d.findElement(By.xpath(men)).click();
	    		   link1 = d.getCurrentUrl();
	    	 }
	       
	    		
	    try
	    {
	    	if((URL+ "/Dashboards/NewDashboard.aspx").equals(link1))
	    	{
	    		ExcelUtility.setCellData("Pass", 1, 5);
	    	}
	    }
	    	catch(Exception e){
	    		ExcelUtility.setCellData("Fail", 1, 5);
	    	}
	    	
		}
		 
	}
	    protected boolean isElementPresent(By by , WebDriver d ){
	        try{
	            d.findElement(by);
	            return true;
	        }
	        catch(NoSuchElementException e){
	            return false;
	        }
	    }
}
