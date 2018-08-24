package com.cg.registration.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
//payments details are fetched here
	@FindBy(id="txtCardholderName")
	 public WebElement txtCardholderName;
	
	@FindBy(id="txtDebit")
	 public WebElement txtDebit;
	
	@FindBy(id="txtCvv")
	 public WebElement txtCvv;
	
	@FindBy(id="txtMonth")
	 public WebElement txtMonth;
	
	@FindBy(id="txtYear")
	 public WebElement txtYear;
	
	@FindBy(id="btnPayment")
	 public WebElement btnPayment;

}
