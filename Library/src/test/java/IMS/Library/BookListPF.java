package IMS.Library;
 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Utilities.ExcelUtility;


public class BookListPF {
	WebDriver driver;
	 
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl02_ctl00_InitInsertButton']"))
	WebElement NewRecordBtn;
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl02_ctl03_FilterTextBox_Title']"))
	WebElement FilterBookTitle; 

	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl02_ctl03_Filter_Title']"))
	WebElement FilterBookTitleBtn; 
	
	@FindBy (xpath=("//span[text()='Contains']"))
	WebElement FilterSelect; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl02_ctl03_FilterTextBox_AuthorName']"))
	WebElement FilterAuthor; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl02_ctl03_Filter_AuthorName']"))
	WebElement FilterAuthorBtn; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl02_ctl00_RefreshButton']"))
	WebElement RefreshBtn; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBookList_ctl00_ctl03_ctl01_PageSizeComboBox_Arrow']"))
	WebElement PageDDLArrow; 
	
	@FindBy (xpath=("//li[text()=10]"))
	WebElement PageSizeSelect; 
	
	@FindBy (xpath=("//div[@class='rgWrap rgNumPart']/a//span[text()=4]"))
	WebElement Pagenumberclick; 
	
	@FindBy (xpath=("//input[@title='First Page']"))
	WebElement FirstPage; 
	
	@FindBy (xpath=("//input[@title='Previous Page']"))
	WebElement Previouspage; 
	
	@FindBy (xpath=("//input[@title='Next Page']"))
	WebElement Nextpage; 
	
	@FindBy (xpath=("//input[@title='Last Page']"))
	WebElement LastPage; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_ddlSubject_Arrow']"))
	WebElement SubjectArrow; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_ddlSubject_Input']"))
	WebElement SubjectSet; 
	
	@FindBy (xpath=("//ul[@class='rcbList']//li"))
	List<WebElement> SubjectList;
	
	@FindBy (xpath=("//ul[@class='rcbList']//li/input"))
	List<WebElement> Subjectchkbox;
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_ddlText_Arrow']"))
	WebElement AccessionTypeArrow; 
	
	@FindBy (xpath=("//ul[@class='rcbList']/li"))
	List<WebElement> AccessionTypeSet; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbDegreeType_Arrow']"))
	WebElement DegreeTypeArrow; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbDegreeType_Input']"))
	WebElement DegreeTypeSet; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtNoOfCopies']"))
	WebElement NoofCopies; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtBookTitle']"))
	WebElement Title; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtLibraryAccessionNo']"))
	WebElement LibAccessionRead; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboAuthor_Arrow']"))
	WebElement AuthorArrow; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboAuthor_Input']"))
	WebElement Author; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboCoAuthor1_Arrow']"))
	WebElement CoAuthor1Arrow; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboCoAuthor1_Input']"))
	WebElement CoAuthor1; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboCoAuthor2_Arrow']"))
	WebElement CoAuthor2Arrow; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboCoAuthor2_Input']"))
	WebElement CoAuthor2; 

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboPublisher_Arrow']"))
	WebElement PublisherArrow; 
  
	@FindBy (xpath=("//Input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboPublisher_Input']"))
	WebElement Publisherset; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtEditiom']"))
	WebElement Editon; 
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radPublishYear_popupButton']"))
	WebElement PubMYBtn; 
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radPublishYear_dateInput']"))
	WebElement PubMY;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtKeyword']"))
	WebElement Keywrd;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtRemark']"))
	WebElement Remarks;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtIsbnNo']"))
	WebElement Isbn;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_RadArrivalDate_popupButton']"))
	WebElement  ArivaldteBtn;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_RadArrivalDate_dateInput']"))
	WebElement Arivaldteset ;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboAcquisitionType_Arrow']"))
	WebElement  AcquisitiontypeArrow;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboAcquisitionType_Input']"))
	WebElement  AcquisitionType;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtSeries']"))
	WebElement series ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_chkWithCd']"))
	WebElement  withCD;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_chkWithDVD']"))
	WebElement  withDVD;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_chkWithFloppy']"))
	WebElement  withFloppy;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radAccessionDate_popupButton']"))
	WebElement AccDatebtn ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radAccessionDate_dateInput']"))
	WebElement AccDate ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtNoOfpages']"))
	WebElement NoofPages ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_chkRareBook']"))
	WebElement RareBook ;

	@FindBy (xpath=("//textarea[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rtTxtRareBookComments']"))
	WebElement  RareBookDescription;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtClassNo']"))
	WebElement  ClassifiNo;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbBranch_Arrow']"))
	WebElement  BranchArrow;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbBranch_Input']"))
	WebElement Branch ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtVolume']"))
	WebElement Volume ;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbCurrency_Arrow']"))
	WebElement  CurrencyArrow;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbCurrency_Input']"))
	WebElement Currency ;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbBBType_Arrow']"))
	WebElement  BookBindingTypeArrow;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_rcmbBBType_Input']"))
	WebElement  BookBindingType;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtPrice']"))
	WebElement PrintedPrice ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtDiscount']"))
	WebElement Discount ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtDiscountPrice']"))
	WebElement FinalPrice ;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboSupplier_Arrow']"))
	WebElement SuplierArrow ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radcomboSupplier_Input']"))
	WebElement Suplier ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtPlace']"))
	WebElement place ;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radPurchaseDate_popupButton']"))
	WebElement  PurchaseDateBtn;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radPurchaseDate_dateInput']"))
	WebElement  purchaseDate;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBillDatePicker_popupButton']"))
	WebElement BillDateBtn ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBillDatePicker_dateInput']"))
	WebElement BillDate ;
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtBillNo']"))
	WebElement  BillNO;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtRegNo']"))
	WebElement  Registrationno;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtPONo']"))
	WebElement  PONo;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_ddlBookStatus_Arrow']"))
	WebElement BookStatusArrow ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_ddlBookStatus_Input']"))
	WebElement  BookStatus;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtIssuedBy']"))
	WebElement  IssuedBy;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtCupboardNo']"))
	WebElement CupboardNo ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_txtRackNo']"))
	WebElement  RackNo;

	@FindBy (xpath=("//span[@class='rtPlus']"))
	WebElement  Categoryselect;

	@FindBy (xpath=("//a[@class='rtsLink rtsAfter']//span[@class='rtsTxt']"))
	WebElement SuplierDetailsTab ;

	@FindBy (xpath=("//a[@class='rtsLink']//span[@class='rtsTxt']"))
	WebElement BookStatusTab ;

	@FindBy (xpath=("//a[@class='rtsLink rtsSelected']//span[@class='rtsTxt']"))
	WebElement BookDetailsTab ;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_btnSaveBottom']"))
	WebElement  UpdateBtn;

	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_RadButton2']"))
	WebElement CancleBtn ;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_lnkTAdd_input']"))
	WebElement  SaveBtnTop;

	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_lnkTCancel_input']"))
	WebElement  CancleBtnTop;
	
	@FindBy (xpath=("//span[text()]"))
	WebElement  validationtext;
	
	@FindBy (xpath=("//div[@class='helpImage']"))
	WebElement  HelpImage;
	
	@FindBy (xpath=("//table[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radPublishYear_MonthYearTableViewID']/tbody/tr/td"))
	WebElement  Pmycal;
	
	@FindBy (xpath=("//table[@id='ctl00_ctl00_mainMasterContent_subMasterContent_RadArrivalDate_calendar_Top']/tbody/tr/td"))
	WebElement Arical;
	
	@FindBy (xpath=("//table[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radAccessionDate_calendar_Top']/tbody/tr/td"))
	WebElement Accdte;
	
	@FindBy (xpath=("//table[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radPurchaseDate_calendar_Top']/tbody/tr/td"))
	WebElement pudate;
	
	@FindBy (xpath=("//table[@id='ctl00_ctl00_mainMasterContent_subMasterContent_radBillDatePicker_calendar_Top']/tbody/tr/td"))
	WebElement Billdte;
	
	@FindBy (xpath=("//span[@class='rtIn']"))
	List<WebElement> Categoryselected;
	
	@FindBy (id=("ctl00_ctl00_mainMasterContent_subMasterContent_cmbLibrary_Input"))
	WebElement SelectLib;
	
	@FindBy(xpath=("//ul[@class='rcbList']/li"))
	List<WebElement> LibList;
	
	
	@FindBy (xpath=("//a[@id='ctl00_ctl00_mainMasterContent_subMasterContent_cmbLibrary_Arrow']"))
	WebElement selectLibarrow;
	
	@FindBy (xpath=("//input[@id='ctl00_ctl00_mainMasterContent_subMasterContent_btnChangeLibrary_input']"))
	WebElement Nextbtn;
 
 
/*
 * Function for BookList and Add New Book
 */
	
	public BookListPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void AddNewRecord_click() throws Exception
	{
		 
		NewRecordBtn.click();
	}
	
	public void FilterBookTitleVal() throws Exception
	{
		String Booktitle = ExcelUtility.getCellData(1, 4);
		FilterBookTitle.sendKeys(Booktitle);
	}
	
	public void FilterBookTitleButton_click() throws Exception
	{
		 
		FilterBookTitleBtn.click();
	}
	
	public void FilterSelect() throws Exception
	{
		String val = ExcelUtility.getCellData(2, 4);
		FilterSelect.sendKeys(val);
	}
	
	public void FilterAuthorVal() throws Exception
	{
		String val = ExcelUtility.getCellData(3, 4);
		FilterAuthor.sendKeys(val);
	}
	
	public void FilterAuthorButton_click() throws Exception
	{
		 
		FilterAuthorBtn.click();
	}
	
	public void RefreshButton_click() throws Exception
	{
		 
		RefreshBtn.click();
	}
	
	public void PageDDL_Click() throws Exception
	{ 
		PageDDLArrow.click();
		PageSizeSelect.click();
	}
	
	public void Pagenumberclick_Click() throws Exception
	{
		Pagenumberclick.click();
	}
	public void Previouspage_Click() throws Exception
	{ 
		Previouspage.click(); 
	}
	public void FirstPage_Click() throws Exception
	{ 
		FirstPage.click();
	}
	public void Nextpage_Click() throws Exception
	{ 
		Nextpage.click();
	}
	public void LastPage_Click() throws Exception
	{ 
		LastPage.click();
	}
	public void Subject_click() throws Exception
	{
		SubjectArrow.click();
		String val = ExcelUtility.getCellData(4, 4);
		List<WebElement> subjectname = SubjectList;
	 	List<WebElement> subjectchk = Subjectchkbox; 
	 	int j = subjectname.size(); 
	     for (int i = 0; i <=j ;i++)
	     { 
	    	 subjectname.get(i).isSelected();
	    	 String  sub =  subjectname.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 	 	subjectchk.get(i).click();
			 	//	subjectname.get(i).click();
					Thread.sleep(1000);
					break;
			 	}
			}
	}
	   
	   
	public void AccessionTypeArrow_set() throws Exception
	{ 
		AccessionTypeArrow.click();
		String val = ExcelUtility.getCellData(5, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
		int j = subjectchk.size(); 
		for (int i = 0; i <=j;i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	public void DegreeType () throws Exception
	{
		DegreeTypeArrow.click();
		String val = ExcelUtility.getCellData(6, 4);
		List<WebElement> subjectchk = AccessionTypeSet;
		int j = subjectchk.size();
	     for (int i = 0; i <=j;i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		//DegreeTypeSet.sendKeys(val);
	}
	public void NoCopies() throws Exception
	{ 	 
		String val = ExcelUtility.getCellData(7, 4);
		NoofCopies.sendKeys(val);
	}
	public void BookTitle() throws Exception
	{ 	 
		String val = ExcelUtility.getCellData(8, 4);
		Title.sendKeys(val);
	}
	public void LibAccessionReadonly() throws Exception
	{
		String accno =  LibAccessionRead.getText();
		ExcelUtility.setCellData(accno, 9, 4);
		
	}
	public void Authororignal() throws Exception
	{
		AuthorArrow.click();
		String val = ExcelUtility.getCellData(10, 4);
		List<WebElement> authorg = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	    int j = authorg.size();
	   
	    for (int i = 0; i <= j ;i++)
	     { 
	    	authorg.get(i).isSelected();
	    	 String  sub =  authorg.get(i).getText();
	    	 System.out.println(sub);
			 	if (sub.equals(val))
			 	{
			 		authorg.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	
	public void CoAuthorone() throws Exception
	{
		CoAuthor1Arrow.click();
		String val = ExcelUtility.getCellData(11, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	
	public void CoAuthortwo() throws Exception
	{
		CoAuthor2Arrow.click();
		String val = ExcelUtility.getCellData(12, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	public void Publisher() throws Exception
	{
		PublisherArrow.click();
		String val = ExcelUtility.getCellData(13, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	public void Editons() throws Exception
	{  
		String val = ExcelUtility.getCellData(14, 4);
		Editon.sendKeys(val);
	}
	public void clickappdate() throws InterruptedException
	    {
		 PubMYBtn.click();
	    	Thread.sleep(1000);
	    	List<WebElement> columns = Pmycal.findElements(By.tagName("a"));
	        Thread.sleep(2000);
	    	for (WebElement cell : columns) 
	    	{
	    		if (cell.getText().equals("Jan"))
	    		{
	    			cell.click();
	    			 
	    		}
	    		else if  (cell.getText().equals("2013"))
	    		{
	    			cell.click();
	                break;     		
	    		}
	    	}
	    } 
	public void Keywords() throws Exception
		{  
			String val = ExcelUtility.getCellData(15, 4);
			Keywrd.sendKeys(val);
		}
	public void Remark() throws Exception
		{  
			String val = ExcelUtility.getCellData(16, 4);
			Remarks.sendKeys(val);
		}
	public void Isbnno() throws Exception
		{  
			String val = ExcelUtility.getCellData(17, 4);
			Isbn.sendKeys(val);
		}
	public void ArivalDate() throws InterruptedException
	    {
		 ArivaldteBtn.click();
	    	Thread.sleep(1000);
	    	List<WebElement> columns = Arical.findElements(By.tagName("a"));
	        Thread.sleep(2000);
	    	for (WebElement cell : columns) {
	    		if (cell.getText().equals("25")) {
	    			cell.click();
	    			break;
	    		}
	    	}
	    }
	public void Acquisitiontype_click() throws Exception
		{
		 AcquisitiontypeArrow.click();
			String val = ExcelUtility.getCellData(18, 4);
			List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
		     for (int i = 0; i < subjectchk.size();i++)
		     { 
		    	 subjectchk.get(i).isSelected();
		    	 String  sub =  subjectchk.get(i).getText();
				 	if (sub.equals(val))
				 	{
				 		subjectchk.get(i).click();
						Thread.sleep(1000);
						break;
					}
			    }
			  }
		
	public void seriesEnter() throws Exception
		{  
			String val = ExcelUtility.getCellData(19, 4);
			series.sendKeys(val);
		}
	public void withCDs() throws Exception
		{  
			 withCD.click();;
		}
	public void withDVDs() throws Exception
		{  
		 	withDVD.click();;
		}
	public void withFloppys() throws Exception
		{  
		 	withFloppy.click();;
		}
	public void AcclDates() throws InterruptedException
	    {
		 	AccDatebtn.click();
	    	Thread.sleep(1000);
	    	List<WebElement> columns = Accdte.findElements(By.tagName("a"));
	        Thread.sleep(2000);
	    	for (WebElement cell : columns) {
	    		if (cell.getText().equals("29")) {
	    			cell.click();
	    			break;
	    		}
	    	}
	    }
	public void NoofPage() throws Exception
	{  
		String val = ExcelUtility.getCellData(20, 4);
		NoofPages.sendKeys(val);
	}
	public void RareBooksdescription() throws Exception
	{  
		RareBook.click();
		String val = ExcelUtility.getCellData(21, 4);
		RareBook.sendKeys(val);
	}
	public void ClassifiNos() throws Exception
	{  
		String val = ExcelUtility.getCellData(22, 4);
		ClassifiNo.sendKeys(val);
	}
	public void Branch_select() throws Exception
	{  
		BranchArrow.click();
		String val = ExcelUtility.getCellData(23, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	
	public void Volumes() throws Exception
	{  
		String val = ExcelUtility.getCellData(24, 4);
		Volume.sendKeys(val);
	}
	public void Currencys() throws Exception
	{  
		CurrencyArrow.click();
		String val = ExcelUtility.getCellData(25, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  
	}
	public void BookBindingTypes() throws Exception
	{  
		BookBindingTypeArrow.click();
		String val = ExcelUtility.getCellData(26, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	public void PrintedPrices() throws Exception
	{  
		String val = ExcelUtility.getCellData(27, 4);
		PrintedPrice.sendKeys(val);
	}
	public void Discounts() throws Exception
	{  
		String val = ExcelUtility.getCellData(28, 4);
		Discount.sendKeys(val);
	}
	public void FinalPrices() throws Exception
	{  
		String val = ExcelUtility.getCellData(29, 4);
		FinalPrice.sendKeys(val);
	}
	public void Supliers() throws Exception
	{  
		SuplierArrow.click();
		String val = ExcelUtility.getCellData(30, 4);
		List<WebElement> subjectchk = AccessionTypeSet;// driver.findElements(By.xpath("//input[@type='radio']"));
	     for (int i = 0; i < subjectchk.size();i++)
	     { 
	    	 subjectchk.get(i).isSelected();
	    	 String  sub =  subjectchk.get(i).getText();
			 	if (sub.equals(val))
			 	{
			 		subjectchk.get(i).click();
					Thread.sleep(1000);
					break;
				}
		    }
		  }
	public void places() throws Exception
	{  
		String val = ExcelUtility.getCellData(31, 4);
		place.sendKeys(val);
	}
	public void Billdtes() throws InterruptedException
    {
		BillDateBtn.click();
    	Thread.sleep(1000);
    	List<WebElement> columns = Billdte.findElements(By.tagName("a"));
        Thread.sleep(2000);
    	for (WebElement cell : columns) {
    		if (cell.getText().equals("27")) {
    			cell.click();
    			break;
    		}
    	}
    }
	public void purchasedtes() throws InterruptedException
    {
		PurchaseDateBtn.click();
    	Thread.sleep(1000);
    	List<WebElement> columns = pudate.findElements(By.tagName("a"));
        Thread.sleep(2000);
    	for (WebElement cell : columns) {
    		if (cell.getText().equals("25")) {
    			cell.click();
    			break;
    		}
    	}
    }
	public void BillNOs() throws Exception
	{  
		String val = ExcelUtility.getCellData(32, 4);
		BillNO.sendKeys(val);
	}
	public void Registrationnos() throws Exception
	{  
		String val = ExcelUtility.getCellData(33, 4);
		Registrationno.sendKeys(val);
	}
	public void PONos() throws Exception
	{  
		String val = ExcelUtility.getCellData(34, 4);
		PONo.sendKeys(val);
	}
	public void BookStatuss() throws Exception
	{  
		String val = ExcelUtility.getCellData(35, 4);
		BookStatus.sendKeys(val);
	}
	public void IssuedBys() throws Exception
	{  
		String val = ExcelUtility.getCellData(36, 4);
		IssuedBy.sendKeys(val);
	}
	public void CupboardNos() throws Exception
	{  
		String val = ExcelUtility.getCellData(37, 4);
		CupboardNo.sendKeys(val);
	}
	public void RackNos() throws Exception
	{  
		String val = ExcelUtility.getCellData(38, 4);
		RackNo.sendKeys(val);
	}
	public void SuplierDetailsTabs() throws Exception
	{  
		SuplierDetailsTab.click();
	}
	public void BookStatusTabs() throws Exception
	{  
		BookStatusTab.click();
	}
	public void BookDetailsTabs() throws Exception
	{  
		BookDetailsTab.click();
	}
	public void UpdateBtns() throws Exception
	{  
		UpdateBtn.click();
	}
	public void CancleBtns() throws Exception
	{  
		CancleBtn.click();
	}
	public void SaveBtnTops() throws Exception
	{  
		SaveBtnTop.click();
	}
	public void CancleBtnTops() throws Exception
	{  
		CancleBtnTop.click();
	}
	public void HelpImages() throws Exception
	{  
		HelpImage.click();
	}
	public void Categoryselects() throws Exception
	{  
 
		Categoryselect.click();
		String val = ExcelUtility.getCellData(39, 4);
		Select selectBox = new Select(driver.findElement(By.className("rtIn")));
	    List<WebElement> selectOptions = selectBox.getOptions();
	    for (WebElement temp : selectOptions) 
	    {
	    	if(selectOptions.equals(val))
	    		temp.click();
	      System.out.println(temp.getText());
	    }
	}	
	public void SelectLibs() throws Exception
	{
		selectLibarrow.click();
		String val = ExcelUtility.getCellData(10, 4);
		List<WebElement> LibLists = LibList;
		for (int i = 0; i < LibLists.size();i++) {
			
			String temp = LibLists.get(i).getText();
		 	if (temp.equals(val)) {
				LibLists.get(i).click();
				Thread.sleep(2000);
				break;
			}
	    }
  }
		 
		//SelectLib.sendKeys(val);
	
	public void NextLibbtn() throws Exception
	{
		Nextbtn.click();
	}
	
	
	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
}
