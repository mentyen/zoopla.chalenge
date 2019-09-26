package com.zoopla.steps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.zoopla.pages.ChoosenPageFromList;
import com.zoopla.pages.HomePage;
import com.zoopla.pages.SearchResultPage;
import com.zoopla.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class TC_01 extends CommonMethods{
	
	public HomePage home;
	public SearchResultPage search;
	public List<WebElement>priceData;
	public ChoosenPageFromList page;
	
	@Given("I am on a home page")
	public void i_am_on_a_home_page() {
		
		home=new HomePage();
		CommonMethods.jsClick(home.cookiesBtn);
	  
	}

	@Then("I enter {string} in to the search box and hit enter")
	public void i_enter_in_to_the_search_box_and_hit_enter(String name) {
		
		jsClick(home.searchBox);
		
		sendText(home.searchBox, name);
		
		jsClick(home.searchBox);
		
		home.searchBox.sendKeys(Keys.ENTER);
	}

	@Then("I will print all prices in descending order")
	public void i_will_print_all_prices_in_descending_order() {
		
		search=new SearchResultPage();
		
		priceData=search.priceLinkList;
		List<Long>priceList=new ArrayList<Long>();
	
		for(WebElement element:priceData) {
			
			String price=element.getText().replaceAll("[^0-9]", "");
			
			priceList.add(Long.parseLong(price));
		}
	
		Collections.sort(priceList, Collections.reverseOrder());
		
	System.out.println("-------------------PRICE LIST IN DESCENDING ORDER----------------------");
		
		for(Long run:priceList) {
			System.out.println(run);
		}
	  
	}

	@Then("I select {int} property from the list and click")
	public void i_select_property_from_the_list_and_click(Integer int1) {
		
		search=new SearchResultPage();
		
		priceData=search.priceLinkList;
		
		for(int i=0;i<priceData.size()-1;i++) {
			if(i==4) {
			jsClick(priceData.get(i));
			}
			
		}
	  
	}

	@Then("I click on a agent name and verify that its maching expected")
	public void i_click_on_a_agent_name_and_verify_that_its_maching_expected() {
		
		page=new ChoosenPageFromList();
		String agentExpected=page.agentData.getText();
		
		jsClick(page.agentData);
		String agentActual=page.agentDataFromAgentPage.getText();
		
		Assert.assertEquals(agentExpected, agentActual);
	 
	}


}
