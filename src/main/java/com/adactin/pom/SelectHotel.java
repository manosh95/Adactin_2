package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {

	public WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radioclick;

	public WebElement getRadioclick() {
		return radioclick;
	}

	public SelectHotel(WebDriver ldriver) {

		this.driver = ldriver;
        PageFactory.initElements(driver, this);
	}

	public WebElement getClicksearch() {
		return clicksearch;
	}

	@FindBy(id = "continue")
	private WebElement clicksearch;

}
