package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
	
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvno;
	
	@FindBy(id="book_now")
	private WebElement clickbooknow;
	
	public BookHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getClickbooknow() {
		return clickbooknow;
	}

	
	

}
