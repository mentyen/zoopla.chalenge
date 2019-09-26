package com.zoopla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.utils.BaseClass;

public class HomePage  extends BaseClass{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="button[class='button cookie-banner__button']")
	public WebElement cookiesBtn;
	
	@FindBy(id="search-input-location")
	public WebElement searchBox;
	
	@FindBy(id="search-submit")
	public WebElement submitBtn;
	

}
