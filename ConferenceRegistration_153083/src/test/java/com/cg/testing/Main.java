package com.cg.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.registration.bean.FirstPage;
import com.cg.registration.bean.SecondPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.Th;
//this is the main function of program
public class Main {
	WebDriver driver;
	FirstPage firstpage;
	SecondPage secondpage;

	@Before
	public void init() {
		//chromedriver location
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("D:\\JavaWorkspaceSTS\\Module\\ConferenceRegistartion.html");
		firstpage = PageFactory.initElements(driver, FirstPage.class);

	}
	//here its gets firstname

	@Given("^first name is \"([^\"]*)\"$")
	public void first_name_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.txtFirstName.sendKeys(arg1);
	}
//this code is for email lastname
	@Then("^lastname is \"([^\"]*)\"$")
	public void lastname_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.txtLastName.sendKeys(arg1);

	}
	//this code is for email validaition
	@Then("^email is \"([^\"]*)\"$")
	public void email_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.txtEmail.sendKeys(arg1);
	}
	//this code is for  phonenumber
	@Then("^contactno is \"([^\"]*)\"$")
	public void contactno_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.txtPhone.sendKeys(arg1);
	}
	//this code is for number people attending  for meeting
	@Then("^number of people attending is \"([^\"]*)\"$")
	public void number_of_people_attending_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.size.sendKeys(arg1);
	}
	//this code is for address validaition
	@Then("^address is \"([^\"]*)\"$")
	public void address_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.txtAddress1.sendKeys(arg1);
	}
	//this code is for area validaition
	@Then("^areaname is \"([^\"]*)\"$")
	public void areaname_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.txtAddress2.sendKeys(arg1);
	}
	//this code is for city name validaition
	@Then("^city name is \"([^\"]*)\"$")
	public void city_name_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.city.sendKeys(arg1);
	}
	//this code is for statename validaition
	@Then("^state name is \"([^\"]*)\"$")
	public void state_name_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.state.sendKeys(arg1);
	}
	//this code is for cost validaition
	@Then("^cost is \"([^\"]*)\"$")
	public void cost_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.memberStatus.click();
	}

	@Then("^cost is not working \"([^\"]*)\"$")
	public void cost_is_not_working(String arg1) throws Throwable {
	    Thread.sleep(1000);
	    firstpage.memberStatus.sendKeys(arg1);
	}
//this code is for going to next page
	@Then("^nextpage$")
	public void nextpage() throws Throwable {
		Thread.sleep(1000);
		firstpage.a.click();
		Thread.sleep(1000);
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.navigate().to("D:\\JavaWorkspaceSTS\\Module\\PaymentDetails.html");
		secondpage = PageFactory.initElements(driver, SecondPage.class);
	}
	@Then("^nextpage(\\d+)$")
	public void nextpage(int arg1) throws Throwable {
		Thread.sleep(1000);
		firstpage.a.click();
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.close();
	}
	@Then("^next$")
	public void next() throws Throwable {
		Thread.sleep(1000);
		firstpage.a.click();
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	@Then("^nextvalue$")
	public void nextvalue() throws Throwable {
		Thread.sleep(1000);
		secondpage.btnPayment.click();
		driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	//this code is for cardholdername validaition
	@Then("^cardholdername is \"([^\"]*)\"$")
	public void cardholdername_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		secondpage.txtCardholderName.sendKeys(arg1);
	}
//this code is for debitcardnumber validation
	@Then("^debitcardnumber is \"([^\"]*)\"$")
	public void debitcardnumber_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		secondpage.txtDebit.sendKeys(arg1);
	}
//this code is for cvv validation
	@Then("^cvv is \"([^\"]*)\"$")
	public void cvv_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		secondpage.txtCvv.sendKeys(arg1);
	}
//this code is for cardexpirymonth validation
	@Then("^cardexpiremonth is \"([^\"]*)\"$")
	public void cardexpiremonth_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		secondpage.txtMonth.sendKeys(arg1);
		
	}
//this code is for expiry year
	@Then("^cardexpireyear is \"([^\"]*)\"$")
	public void cardexpireyear_is(String arg1) throws Throwable {
		Thread.sleep(1000);
		secondpage.txtYear.sendKeys(arg1);
		
	}
//this code is for making payment
	@Then("^makepayment$")
	public void makepayment() throws Throwable {
		Thread.sleep(1000);
		secondpage.btnPayment.click();
		
	}
	//this closes the program
	@Then("^close$")
	public void close() throws Throwable{
		Thread.sleep(1000);
		driver.close();
	}
	



}
