package com.assurant;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	
	BaseClass cls = new BaseClass();
	
	@Before
	public void methodForLaunchBrowser() {
		
	cls.launching_Browser();
	
//	final byte[] Screenshot = ((TakesScreenshot)cls.driver).getScreenshotAs(OutputType.BYTES);	
}
	@After
	
	public void methoForClose() {
		
		//cls.browser_Close();
}}