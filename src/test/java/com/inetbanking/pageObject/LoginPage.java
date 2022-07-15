package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
  @FindBy(xpath="//input[@id='txtUserName']")
  @CacheLookup
  WebElement txtUserName;
  
  @FindBy(xpath="//input[@id='txtPassword']")
  @CacheLookup
  WebElement txtPassword;
  
  
  @FindBy(xpath="//img[@id='btnLogin']")
  @CacheLookup
  WebElement btnlogin;
  

  @FindBy(xpath="//body/div[@id='forceDisconnectPopup']/div[1]")
  @CacheLookup
public WebElement dublicateUsage;
  
  @FindBy(xpath="//input[@value='Ok']")
  @CacheLookup
public WebElement popup;
  
  public void setUserName(String uname) {
	  txtUserName.sendKeys(uname);
  }
  
  public void SetPassword(String pwd) {
	  txtPassword.sendKeys(pwd);
  }
  
  public void clickSubmit() {
	  btnlogin.click();
  }
  
  public void popup() {
	  popup.click();
  }
}