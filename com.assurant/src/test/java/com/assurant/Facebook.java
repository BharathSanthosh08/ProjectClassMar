package com.assurant;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook {
BaseClass vb =new BaseClass(); 
	static WebDriver driver;
	
	
	
	
	@Given("Launch The Facebook Application {string}")
	public void launch_the_facebook_application(String url) {
		this.driver=vb.driver;
		vb.get_Application(url);	
	}

	@When("Click On The Create New Account Button")
	public void click_on_the_create_new_account_button() {
		WebElement createnewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		vb.button_Click(createnewAccount);
	}

	@When("Click The First Name {string}")
	public void click_the_first_name(String name) {
		  WebElement firstname = driver.findElement(By.xpath("//input[@aria-label=\"First name\"]"));
		  vb.button_Click(firstname);
		  vb.sendText(name);
	}
	@When("Click The Gmail {string}")
	public void click_the_gmail(String surname) {
		WebElement lastname = driver.findElement(By.xpath("//input[@name=\"lastname\"]"));

		vb.button_Click(lastname);
		vb.sendText(surname);
	}

	
	@When("Click The New Password {string}")
	public void click_the_new_password(String email) {
		WebElement 	Email = driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\""));
		vb.insert_Text(Email, email);

	}

	@When("Click The Date Month Year  {string} {string} {string}")
	public void click_the_date_month_year(String date, String month, String year) {
		
		WebElement day = driver.findElement(By.id("day"));
		vb.insert_Text(day,date);
		
		WebElement 	Month = driver.findElement(By.id("month"));
		vb.insert_Text(Month, month);
		
		WebElement Year = driver.findElement(By.id("year"));
		vb.insert_Text(Year, year);

	 
	}

	@When("Click The Gender")
	public void click_the_gender() {
	    
		WebElement male = driver.findElement(By.xpath("//label[text()=\"Male\"]"));
		vb.button_Click(male);
	}

	@When("Click The SignUp")
	public void click_the_sign_up() {
	   WebElement signup = driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
	vb.button_Click(signup);
	
	}

	@Then("Tacks ScreenShot")
	public void tacks_screen_shot(String name)  {
		
		vb.screenshot(name);	    
	
	}



}
