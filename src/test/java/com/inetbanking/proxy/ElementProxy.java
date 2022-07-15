package com.inetbanking.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.inetbanking.pageObject.LoginPage;

public class ElementProxy implements InvocationHandler {

    private final WebElement element;
    public static WebDriver driver;
    LoginPage lg=new LoginPage(driver);
    public ElementProxy(WebElement element) {
        this.element = element;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //before invoking actual method check for the popup
        this.checkForPopupAndKill();
        //at this point, popup would have been closed if it had appeared. element action can be called safely now.
        Object result = method.invoke(element, args);
        return result;
    }

    private void checkForPopupAndKill() throws InterruptedException {
    	System.out.print("Enetered");
        if (lg.dublicateUsage.isDisplayed()) {
        	Thread.sleep(2000);
            System.out.println("You damn popup, you appearded again!!?? I am gonna kill you now!!");
            lg.popup();
        }
    }
    
}