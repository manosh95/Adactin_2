package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.BookHotel;
import com.adactin.pom.HomePage;
import com.adactin.pom.SearchHotel;
import com.adactin.pom.SelectHotel;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private BookHotel bh;
	private SelectHotel sl;
	private SearchHotel  sh;
	private HomePage hp;
	
	
	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public BookHotel getBh() {
      bh=new BookHotel(driver);
		return bh;
	}
	public SelectHotel getSl() {
		sl=new SelectHotel(driver);
		return sl;
	}
	public SearchHotel getSh() {
		sh = new SearchHotel(driver);
		return sh;
	}
	public HomePage getHp() {
		hp =new HomePage(driver);
		
		return hp;
	}

}
