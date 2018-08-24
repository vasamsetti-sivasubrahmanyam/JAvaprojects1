package com.cg.registration.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//here we are assigning every tags using html id's and names
public class FirstPage {

	@FindBy(id="txtFirstName")
	 public WebElement txtFirstName;

	@FindBy(id="txtLastName")
	 public WebElement txtLastName;

	@FindBy(id="txtEmail")
	 public WebElement txtEmail;

	@FindBy(id="txtPhone")
	 public WebElement txtPhone;

	@FindBy(name="size")
	 public WebElement size;

	@FindBy(id="txtAddress1")
	public WebElement txtAddress1;
	@FindBy(id="txtAddress2")
	public WebElement txtAddress2;
	
	@FindBy(name="city")
	public WebElement city;
	
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="memberStatus")
	public WebElement memberStatus;
	
	@FindBy(tagName="a")
	public WebElement a;
	
}
