package com.zoopla.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.utils.BaseClass;

public class SearchResultPage extends BaseClass{
	
	public SearchResultPage(){
		 PageFactory.initElements(driver, this);
	}

	@FindBy(css="a[class='listing-results-price text-price']")
	public List<WebElement> priceLinkList;
	
	
}
