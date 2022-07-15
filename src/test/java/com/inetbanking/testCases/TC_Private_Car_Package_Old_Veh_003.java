package com.inetbanking.testCases;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.inetbanking.pageObject.LoginPage;
import com.inetbanking.pageObject.MotorPVTCar;

public class TC_Private_Car_Package_Old_Veh_003 extends BaseClass{
	
	
	@Test
	public void private_Car_Package_Old_Veh() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		lp.setUserName(userName);
		logger.info("UserName is Entered");
		
		lp.SetPassword(passWord);
		logger.info("Password is Entered");
		
		Thread.sleep(10000);
		
		lp.clickSubmit();
		logger.info("Submit btn is Clicked");
		Thread.sleep(3000);
		
		MotorPVTCar pvtCarOld= new MotorPVTCar(driver);
		
		pvtCarOld.mouseHoverMotor(driver);
		Thread.sleep(1000);
		logger.info("Mouse Has Been Hovered to Motor Menu");
		
		
		pvtCarOld.clicPVTCar();
		logger.info("PVT Car is clicked");
		
		
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(pvtCarOld.selectdrop()));
		logger.info("Select Sub Product dropdown is clicked");

		Thread.sleep(2000);
		pvtCarOld.Private_Car_Package_Old_Veh();
		logger.info("Select Sub Product Type is clicked");
		
		
		pvtCarOld.regNO1();
		logger.info("regNO1 is Entered");
		
		pvtCarOld.regNO2();
		logger.info("regNO2 is Entered");
		
		pvtCarOld.regNO3();
		logger.info("regNO3 is Entered");
		
		pvtCarOld.regNO4();
		logger.info("regNO4 is Entered");
		
		pvtCarOld.clicfetchVehDetails();
		logger.info("Fetch Vehicle btn is clicked");
		
		pvtCarOld.clicwarnOK();
		logger.info("Warning btn is clicked");
		
		pvtCarOld.enter_Model_Variant("MAHINDRA");
		logger.info("enter_Model_Variant is entered ");
		Thread.sleep(3000);
		
		pvtCarOld.vehicle_model_Select();
		logger.info("vehicle_model_Select is selected");
		
		pvtCarOld.fuelType();
		logger.info("fuel Type is clicked");
		
		wait.until(ExpectedConditions.elementToBeClickable(pvtCarOld.diesel()));
		logger.info("Diesel is selected");
		
		pvtCarOld.AregNo1();
		logger.info("AregNo1 is Entered");
		
		pvtCarOld.AregNo2();
		logger.info("AregNo2 is Entered");
		
		pvtCarOld.AregNo3();
		logger.info("AregNo3 is Entered");
		
		pvtCarOld.AregNo4();
		logger.info("AregNo4 is Entered");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		logger.info("Scrolling is done");
		
		pvtCarOld.manufacture_Year();
		Thread.sleep(2000);
		logger.info("manufacture_Year is clicked");
		
		pvtCarOld.yeaR2020();
		logger.info("2020 is selected");
		

		pvtCarOld.selectMonth();
		logger.info("selectMonth is clicked");
		Thread.sleep(2000);
		pvtCarOld.january_Month();
		logger.info("january_Month is selected");
		
		pvtCarOld.Purchase_Registration_Date("08-01-2020");
		logger.info("Purchase_Registration_Date is entered");
		
		pvtCarOld.Period_Of_Previous_Policy();
		logger.info("Purchase_Registration_Date is clicked");
		Thread.sleep(3000);
		
		pvtCarOld.period_Annual();
		logger.info("Annual is selected ");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		
		pvtCarOld.Calender_Img(driver);
		logger.info("Calender_Img is Clicked");
		
		Thread.sleep(2000);
		pvtCarOld.previous_Policy_Start_Date();
		pvtCarOld.NCB_Eligibility_Criteria();
		logger.info("Radio is NCB_Eligibility_Criteria ");
		
		pvtCarOld.Last_Year_NCB();
		logger.info("Last_Year_NCB is clicked");
		Thread.sleep(2000);
		pvtCarOld.NCB20();
		logger.info("NCB20 is selected");
		
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(pvtCarOld.btn_GetCoverageDetails()));
		
		logger.info("GetCoverageDetails button is clicked");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,250)", "");
		logger.info("Scrolling done");
		Thread.sleep(5000);
		
		pvtCarOld.calculate_Premium();
		logger.info("calculate_Premium btn is Clicked");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		logger.info("Scrolling done");
		Thread.sleep(2000);
		
		pvtCarOld.continue_To_Buy();
		logger.info("continue_To_Buy btn is Clicked");
		
		Thread.sleep(10000);
		
		pvtCarOld.CUST1("Tester");
		logger.info("CUST1 search is Selected");
		pvtCarOld.CUST2("Tester");
		logger.info("CUST1 search is Selected");
		Thread.sleep(2000);
		pvtCarOld.btn_search_Button();
		logger.info("btn_search_Button is Clicked");
		Thread.sleep(2000);
		pvtCarOld.search_Mobile_Number("9865326598");
		logger.info("Mobile_Number is Typed");
		Thread.sleep(2000);
		pvtCarOld.btn_Search();
		logger.info("btn_Search is clicked");
		Thread.sleep(5000);
		pvtCarOld.cust_Select();
		logger.info("Custumer is selected");
		Thread.sleep(2000);
		pvtCarOld.button_OK();
		logger.info("OK in search is clicked");
		Thread.sleep(5000);
		pvtCarOld.DOB("10-01-1985");
		logger.info("DOB is clicked");
		pvtCarOld.same_As_comm();
		logger.info("same_As_comm checkbox is selected");
		Thread.sleep(5000);
		pvtCarOld.validate_customer(driver);
		logger.info("validate_customer button is selected");
		Thread.sleep(5000);
		pvtCarOld.cut_Already_Exists();
		logger.info("popUp is cancelled");
		Thread.sleep(2000);
		pvtCarOld.engine_Number("564867564654");
		Thread.sleep(1000);
		pvtCarOld.chassis_Number("5485412645");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,250)", "");
		pvtCarOld.getCoverageDetails_TWO();
		Thread.sleep(10000);
		pvtCarOld.nominee_img_click();
		Thread.sleep(2000);
		pvtCarOld.nominee_Name("TESTER");
		Thread.sleep(1000);
		pvtCarOld.nominee_Age("49");
		Thread.sleep(1000);
		pvtCarOld.nominee_Relation_Click(driver);
		Thread.sleep(2000);
		pvtCarOld.Previous_Policy_No("574865154");
		pvtCarOld.document_Proof_Check();
		Thread.sleep(1000);
		pvtCarOld.Insurer_Name_Click(driver);
		Thread.sleep(1000);
//		pvtCarOld.Insurer_Name_Select();
//		Thread.sleep(1000);
		pvtCarOld.previous_Insurer_Branch_Name("Tester");
		Thread.sleep(2000);
		pvtCarOld.select_Doc_Type("Previous_year_Policy _ Covernote copy");
		Thread.sleep(2000);
		pvtCarOld.choose_File("C:\\Users\\dell\\eclipse-workspace\\inetBankingV1\\uploadDocuments\\tourism1.jpg");
		Thread.sleep(2000);
		pvtCarOld.btn_Upload();
		Thread.sleep(5000);
		pvtCarOld.is_Registration_Address_same_as_Comm();
		Thread.sleep(2000);
		pvtCarOld.calculate_Premium_TWO();
		Thread.sleep(5000);
		pvtCarOld.btn_save();
		Thread.sleep(20000);
		
		
	}
}
