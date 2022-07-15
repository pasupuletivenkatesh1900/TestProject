package com.inetbanking.pageObject;

import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MotorPVTCar {
	WebDriver ldriver;
	public MotorPVTCar(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@id='divMainMotors']")
	@CacheLookup
	WebElement MotorMenu;
	

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Private Car')]")
	@CacheLookup
	WebElement privateCar;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]")
	@CacheLookup
	WebElement selectSubProduct;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Private Car Package (Old Veh.)')]")
	@CacheLookup
	WebElement Private_Car_Package_Old_Veh;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number1Vehicle1']")
	@CacheLookup
	WebElement regNo1;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number2Vehicle2']")
	@CacheLookup
	WebElement regNo2;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number3Vehicle3']")
	@CacheLookup
	WebElement regNo3;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number4Vehicle4']")
	@CacheLookup
	WebElement regNo4;

	@FindBy(how = How.XPATH, using = "//input[@id='btnFastlane']")
	@CacheLookup
	WebElement btnFetchvehDetails;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ok')]")
	@CacheLookup
	WebElement warnOK;

	@FindBy(how = How.XPATH, using = "//input[@id='VehicleDetailsMakeModel']")
	@CacheLookup
	WebElement enter_Model_Variant;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[13]/div[1]/ul[1]/li[1]/div[1]")
	@CacheLookup
	WebElement vehicle_model_Select;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Type')]")
	@CacheLookup
	WebElement fuel_Type;

	@FindBy(how = How.XPATH, using = "//li[normalize-space()='Diesel']")
	@CacheLookup
	WebElement diesel;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number1Vehicle']")
	@CacheLookup
	WebElement AregNo1;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number2Vehicle']")
	@CacheLookup
	WebElement AregNo2;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number3Vehicle']")
	@CacheLookup
	WebElement AregNo3;

	@FindBy(how = How.XPATH, using = "//input[@id='Registration_Number4Vehicle']")
	@CacheLookup
	WebElement AregNo4;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Select Month')]")
	@CacheLookup
	WebElement selectMonth;

	@FindBy(how = How.XPATH, using = "//div[@class='k-animation-container km-popup']//li[text()='JANUARY']")
	@CacheLookup
	WebElement january;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'2022')]")
	@CacheLookup
	WebElement manufacture_year;

	@FindBy(how = How.XPATH, using = "//div[@class='k-animation-container km-popup']//li[@role='option'][normalize-space()='2020']")
	@CacheLookup
	WebElement Y2020;

	@FindBy(how = How.XPATH, using = "//input[@id='Date_PurchaseVehicle']")
	@CacheLookup
	WebElement Purchase_Registration_Date;

	@FindBy(how = How.XPATH, using = "//div[@id='divNCBDetails']//span[@class='k-input'][normalize-space()='Select']")
	@CacheLookup
	WebElement Period_Of_Previous_Policy;

	@FindBy(how = How.XPATH, using = "//div[@class='k-animation-container km-popup']//li[@role='option'][normalize-space()='Annual']")
	@CacheLookup
	WebElement period_Annual;

	@FindBy(how = How.XPATH, using = "(//input[@name='objvehicleDetails.NCBEligibilityCriteria'])[3]")
	@CacheLookup
	WebElement NCB_Eligibility_Criteria;

	@FindBy(how = How.XPATH, using = "//div[@id='divPrevPolicyDetails']//div[@class='oneColumn']//span[@class='k-dropdown-wrap k-state-default']//span[@class='k-input'][normalize-space()='Select']")
	@CacheLookup
	WebElement Last_Year_NCB;

	@FindBy(how = How.XPATH, using = "//div[@class='k-animation-container km-popup']//li[@role='option'][normalize-space()='20%']")
	@CacheLookup
	WebElement NCB20;
	@FindBy(how = How.XPATH, using = "//input[@value='Get Coverage Details']")
	@CacheLookup
	WebElement btn_GetCoverageDetails;

	@FindBy(how = How.XPATH, using = "//span[@aria-controls='dpPrevPolicyStartDate_dateview']//span[@class='k-icon k-i-calendar'][normalize-space()='select']")
	@CacheLookup
	WebElement Calender_Img;

	@FindBy(how = How.XPATH, using = "//input[@id='btnCalculate']")
	@CacheLookup
	WebElement calculate_Premium;

	@FindBy(how = How.XPATH, using = "//input[@id='continueToBuy']")
	@CacheLookup
	WebElement continue_To_Buy;

	@FindBy(how = How.XPATH, using = "//input[@id='IdDynamicControl0']")
	@CacheLookup
	WebElement CUST1;

	@FindBy(how = How.XPATH, using = "//input[@id='IdDynamicControl1']")
	@CacheLookup
	WebElement CUST2;

	@FindBy(how = How.XPATH, using = "//input[@id='BtnSearchClient']")
	@CacheLookup
	WebElement btn_search_Button;

	@FindBy(how = How.XPATH, using = "//input[@id='txtId1']")
	@CacheLookup
	WebElement search_Mobile_Number;

	@FindBy(how = How.XPATH, using = "//div[@id='divAdvancedSearch']//input[@value='Search']")
	@CacheLookup
	WebElement btn_Search;

	@FindBy(how = How.XPATH, using = "//body[1]/div[91]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]")
	@CacheLookup
	WebElement cust_Select;

	@FindBy(how = How.XPATH, using = "//input[@value='Ok']")
	@CacheLookup
	WebElement button_OK;

	@FindBy(how = How.XPATH, using = "//input[@id='DPDateOfBirth']")
	@CacheLookup
	WebElement DOB;

	@FindBy(how = How.XPATH, using = "//input[@id='chkIsPermanentAddrSame']")
	@CacheLookup
	WebElement same_As_comm;

	@FindBy(how = How.XPATH, using = "//input[@id='BtnSaveClientDetails']")
	@CacheLookup
	WebElement validate_customer;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Cancel']")
	@CacheLookup
	WebElement cut_Already_Exists;

	@FindBy(how = How.XPATH, using = "//input[@id='EngineNumberVehicle']")
	@CacheLookup
	WebElement engine_Number;

	@FindBy(how = How.XPATH, using = "//input[@id='ChasisNumberVehicle']")
	@CacheLookup
	WebElement chassis_Number;

	@FindBy(how = How.XPATH, using = "//input[@id='btnFetchIDV']")
	@CacheLookup
	WebElement getCoverageDetails_TWO;

	@FindBy(how = How.XPATH, using = "//img[@id='ImgExpand1']")
	@CacheLookup
	WebElement nominee_img_click;

	@FindBy(how = How.XPATH, using = "//input[@id='txtPAOwnerCoverNomineeName']")
	@CacheLookup
	WebElement nominee_Name;

	@FindBy(how = How.XPATH, using = "//input[@id='txtNomineeAge']")
	@CacheLookup
	WebElement nominee_Age;

	@FindBy(how = How.XPATH, using = "//div[@class='oneColumn twocolumnalt']//span[@class='k-input'][normalize-space()='Select']")
	@CacheLookup
	WebElement nominee_Relation_Click;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Mother']")
	@CacheLookup
	WebElement nominee_Relation_Select;

	@FindBy(how = How.XPATH, using = "//input[@id='txtPrevPolicyNo']")
	@CacheLookup
	WebElement Previous_Policy_No;

	@FindBy(how = How.XPATH, using = "//div[@id='lstvDocumentProofs']//input[@id='111']")
	@CacheLookup
	WebElement document_Proof_Check;

	@FindBy(how = How.XPATH, using = "//div[@id='divPnlPreviousInsuranceDetails']//div//span[@class='k-input'][normalize-space()='Select']")
	@CacheLookup
	WebElement Insurer_Name_Click;

	@FindBy(how = How.XPATH, using = "//li[@id='InsurerName_option_selected']")
	@CacheLookup
	WebElement Insurer_Name_Select;

	@FindBy(how = How.XPATH, using = "//input[@id='txtPrevInsurerBranchName']")
	@CacheLookup
	WebElement previous_Insurer_Branch_Name;

	@FindBy(how = How.XPATH, using = "//select[@id='ddlDocType']")
	@CacheLookup
	WebElement select_Doc_Type;

	@FindBy(how = How.XPATH, using = "//input[@id='UploadedFile']")
	@CacheLookup
	WebElement choose_File;

	@FindBy(how = How.XPATH, using = "//input[@id='IsRegistrationAddresssame']")
	@CacheLookup
	WebElement is_Registration_Address_same_as_Comm;

	@FindBy(how = How.XPATH, using = "//input[@id='btnCalculate']")
	@CacheLookup
	WebElement calculate_Premium_TWO;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Upload']")
	@CacheLookup
	WebElement btn_Upload;

	@FindBy(how = How.XPATH, using = "//input[@id='btnSave']")
	@CacheLookup
	WebElement btn_save;

	// @FindBy(how = How.XPATH, using="")
	// @CacheLookup
	// WebElement nameenter;

	public void mouseHoverMotor(WebDriver rdriver) {

		ldriver = rdriver;
		Actions action = new Actions(rdriver);
		action.moveToElement(MotorMenu).click().perform();
	}

	public WebElement clicPVTCar() {
		  privateCar.click();
		  return privateCar;
	}

	public WebElement selectdrop() {
		selectSubProduct.click();
		return selectSubProduct;
	}

	public WebElement Private_Car_Package_Old_Veh() {
		Private_Car_Package_Old_Veh.click();
		return Private_Car_Package_Old_Veh;
	}

	public void regNO1() {
		regNo1.sendKeys("MH");
	}

	public void regNO2() {
		regNo2.sendKeys("46");
	}

	public void regNO3() {
		regNo3.sendKeys("RT");
	}

	public void regNO4() {
		regNo4.sendKeys("9756");
	}

	public void clicfetchVehDetails() {
		btnFetchvehDetails.click();
	}

	public void clicwarnOK() {
		warnOK.click();
	}

	public void enter_Model_Variant(String enter_Model_Variant01) {
		enter_Model_Variant.sendKeys(enter_Model_Variant01);
	}

	public void vehicle_model_Select() {
		vehicle_model_Select.click();
	}
	// span[contains(text(),'Select Type')]

	public void fuelType() {
		fuel_Type.click();
	}

	public WebElement diesel() {
		diesel.click();
		return diesel;
	}

	public void AregNo1() {
		AregNo1.sendKeys("MH");
	}

	public void AregNo2() {
		AregNo2.sendKeys("46");
	}

	public void AregNo3() {
		AregNo3.sendKeys("RT");
	}

	public void AregNo4() {
		AregNo4.sendKeys("9853");
	}

	public void selectMonth() {
		selectMonth.click();
	}

	public void january_Month() {
		january.click();
	}

	public void manufacture_Year() {
		manufacture_year.click();
	}

	public void yeaR2020() {
		Y2020.click();
	}

	public void Purchase_Registration_Date(String prDate) {
		Purchase_Registration_Date.sendKeys(prDate);
	}

	public void Period_Of_Previous_Policy() {
		Period_Of_Previous_Policy.click();
	}

	public void period_Annual() {
		period_Annual.click();
	}

	public void Calender_Img(WebDriver rdriver) {
		ldriver = rdriver;
		Actions action = new Actions(rdriver);
		action.moveToElement(Calender_Img).click().perform();
	}

	public void NCB_Eligibility_Criteria() {
		NCB_Eligibility_Criteria.click();

	}

	public void Last_Year_NCB() {
		Last_Year_NCB.click();
	}

	public void NCB20() {
		NCB20.click();
	}

	public WebElement btn_GetCoverageDetails() {
		btn_GetCoverageDetails.click();
		return btn_GetCoverageDetails;
	}

	public void previous_Policy_Start_Date() throws InterruptedException {
		Calendar c = Calendar.getInstance();
		int currentYear = c.getWeekYear();
		String monthDay = c.getTime().toString();
		String monthDayArr[] = monthDay.trim().split(" ");
		String currentMonth = monthDayArr[1];
		String CurrentDay = monthDayArr[2].replace("0", "");
		WebElement years = ldriver.findElement(By.xpath("/html[1]/body[1]/div[24]/div[1]/div[1]/div[1]/a[2]"));
		years.click();
		Thread.sleep(2000);
		years.click();
		int previousYear = currentYear - 1;
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//a[normalize-space()='" + previousYear + "']")).click();
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//a[normalize-space()='" + currentMonth + "']")).click();
		Thread.sleep(2000);
		ldriver.findElement(By.xpath("//a[normalize-space()='" + CurrentDay + "']")).click();

	}

	public WebElement calculate_Premium() {
		calculate_Premium.click();
		return calculate_Premium;
	}

	public WebElement continue_To_Buy() {
		continue_To_Buy.click();
		return continue_To_Buy;
	}

	public void CUST1(String cUST1) {
		CUST1.sendKeys(cUST1);
	}

	public void CUST2(String cUST2) {
		CUST2.sendKeys(cUST2);
	}

	public void btn_search_Button() {
		btn_search_Button.click();
	}

	public void search_Mobile_Number(String mobile_Number) {
		search_Mobile_Number.sendKeys(mobile_Number);
	}

	public void btn_Search() {
		btn_Search.click();
	}

	public void cust_Select() {
		cust_Select.click();
	}

	public void button_OK() {
		button_OK.click();
	}

	public void DOB(String dob) {
		DOB.sendKeys(dob);
	}

	public void same_As_comm() {
		same_As_comm.click();
	}

	public void validate_customer(WebDriver rdriver) {
		Actions action = new Actions(rdriver);
		action.moveToElement(validate_customer).doubleClick().perform();
	}

	public void cut_Already_Exists() {
		cut_Already_Exists.click();
	}

	public void engine_Number(String engineNumber) {
		engine_Number.sendKeys(engineNumber);
	}

	public void chassis_Number(String chassisNumber) {
		chassis_Number.sendKeys(chassisNumber);
	}

	public void getCoverageDetails_TWO() {
		getCoverageDetails_TWO.click();
	}

	public void nominee_img_click() {
		nominee_img_click.click();
	}

	public void nominee_Name(String nomineeName) {
		nominee_Name.sendKeys(nomineeName);
	}

	public void nominee_Age(String age) {
		nominee_Age.sendKeys(age);
	}

	public void nominee_Relation_Click(WebDriver rdriver) {
		Actions action = new Actions(rdriver);
		action.moveToElement(nominee_Age).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();

	}

	public void nominee_Relation_Select(WebDriver rdriver) {
		Actions action = new Actions(rdriver);
		action.moveToElement(nominee_Relation_Click).keyDown(Keys.SHIFT).perform();
	}

	public void Previous_Policy_No(String previous_Policy_No) {
		Previous_Policy_No.sendKeys(previous_Policy_No);
	}

	public void document_Proof_Check() {
		document_Proof_Check.click();
	}

	public void Insurer_Name_Click(WebDriver rdriver) {
		Insurer_Name_Click.click();
		Actions action = new Actions(rdriver);
		action.moveToElement(Insurer_Name_Click).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
				.perform();
	}

	public void Insurer_Name_Select() {
		Insurer_Name_Select.click();
	}

	public void previous_Insurer_Branch_Name(String previousInsurerBranchName) {
		previous_Insurer_Branch_Name.sendKeys(previousInsurerBranchName);
	}

	public void select_Doc_Type(String previous_year_doc) {
		Select select = new Select(select_Doc_Type);
		select.selectByVisibleText(previous_year_doc);
	}

	public void choose_File(String Choose_File) {
		choose_File.sendKeys(Choose_File);
	}

	public void btn_Upload() {
		btn_Upload.click();
	}

	public void is_Registration_Address_same_as_Comm() {
		is_Registration_Address_same_as_Comm.click();
	}

	public void calculate_Premium_TWO() {
		calculate_Premium_TWO.click();
	}

	public void btn_save() {
		btn_save.click();
	}

}
