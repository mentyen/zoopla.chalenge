package com.zoopla.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.utils.BaseClass;

public class ChoosenPageFromList extends BaseClass{
	
	public ChoosenPageFromList() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@class='dp-sidebar-wrapper__contact']/div/a/div[2]/h4")
	public WebElement agentData;
	
	@FindBy(xpath="//h1[@class='bottom-half']/b[1]")
	public WebElement agentDataFromAgentPage;
	
	

}
