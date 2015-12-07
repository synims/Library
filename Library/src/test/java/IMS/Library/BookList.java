package IMS.Library;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
 
import Utilities.Constants;
import Utilities.ExcelUtility;
import Utilities.Login;

@Test
public class BookList {
	
	long startTime;
	long endTime;
	long duration;
	double seconds;
	public WebDriver driver;
	public String baseUrl;
	BookListPF BLPF;
	static Logger log = Logger.getLogger(BookList.class);
  public void f( ) throws Exception {
	  
	  driver.navigate().to(baseUrl+"/LibPro/Books/BookList.aspx");
	  
	  BLPF.AddNewRecord_click();
	  BLPF.Subject_click();
	  BLPF.AccessionTypeArrow_set();
	  BLPF.DegreeType();
	  BLPF.NoCopies();
	  BLPF.BookTitle();
	  BLPF.LibAccessionReadonly();
	  BLPF.Authororignal();
	  BLPF.CoAuthorone();
	  BLPF.CoAuthortwo();
	  BLPF.Publisher();
	  BLPF.Editons();
	  BLPF.clickappdate();
	  BLPF.Keywords();
	  BLPF.Remark();
	  BLPF.Isbnno();
	  BLPF.ArivalDate();
	  BLPF.Acquisitiontype_click();
	  BLPF.seriesEnter();
	  BLPF.AcclDates();
	  BLPF.NoofPage();
	  BLPF.RareBooksdescription();
	  BLPF.ClassifiNos();
	  BLPF.Branch_select();
	  BLPF.Volumes();
	  BLPF.Currencys();
	  BLPF.BookBindingTypes();
	  BLPF.PrintedPrices();
	  BLPF.Discounts();
	  BLPF.FinalPrices();
	  BLPF.SuplierDetailsTabs();
	  BLPF.Supliers();
	  BLPF.places();
	  BLPF.purchasedtes();
	  BLPF.Billdtes();
	  BLPF.BillNOs();
	  BLPF.Registrationnos();
	  BLPF.PONos();
	  BLPF.BookDetailsTabs();
	  BLPF.BookStatuss();
	  BLPF.IssuedBys();
	  BLPF.CupboardNos();
	  BLPF.RackNos();
	  BLPF.UpdateBtns();
	  log.info("Sucess Saved");
	   
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  startTime = System.nanoTime();
	  driver.get(baseUrl);
		Thread.sleep(2000);
		//String Type = ExcelUtility.getCellData(9, 4);
		BLPF = new BookListPF(driver);
		//Login the Page
		Login login = new Login();
		login.ImsLogin(driver); // Login 
		login.Loginpage(driver, baseUrl); // Login Page Navigation
		
		log.info("Login Successfull" + "For Library Test");
		 
		if(isElementPresent("Library"))
		{
			driver.findElement(By.linkText("Library")).click();
			String Clib = baseUrl+"/LibPro/ChangeLibrary.aspx";
			if(driver.getCurrentUrl().equals(Clib))
			{
				driver.navigate().to(Clib);  // Move to Change Library Page
				log.info("Navigate to Library Module");
				BLPF.SelectLibs();
				BLPF.NextLibbtn();
			}
		}		
		else
		{			
			log.info("User Has no Library Permission");
			System.out.println("User Has no Library Permission");
			driver.quit();
		}
		ExcelUtility.setExcelFile(Constants.File_Path + Constants.Library, Constants.Booklist);
		
  }

  @AfterMethod
  public void afterMethod() throws Exception{
	  
	  driver.navigate().to(baseUrl+"/LibPro/Books/BookList.aspx");
	  BLPF.RefreshButton_click();
	  BLPF.FilterBookTitleVal();
	  BLPF.FilterBookTitleButton_click();
	  BLPF.FilterSelect();
}

  
  
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  PropertyConfigurator.configure("src/log4j.properties");
		// Tell the code about the location of Excel file
	  ExcelUtility.setExcelFile(Constants.File_Path + Constants.Library, Constants.LibproLogin);
		baseUrl = ExcelUtility.getCellData(1, 4);
		String Browser = ExcelUtility.getCellData(2, 4);		
		Thread.sleep(1000);
	    if(Browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E://Devendra//chromedriver.exe");
	         driver = new ChromeDriver(); 
		}
		else if (Browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E://Devendra//IEDriverServer.exe");
	         driver = new InternetExplorerDriver(); 
		}
		else if(Browser.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "E://Devendra//operadriver.exe");
			driver = new OperaDriver();
		}
		else 
		{
			driver = new FirefoxDriver();
		}
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

  protected boolean isElementPresent(String str){
      try{
    	  
          driver.findElement(By.linkText(str));
          return true;
      }
      catch(NoSuchElementException e){
          return false;
      }
  }

}
