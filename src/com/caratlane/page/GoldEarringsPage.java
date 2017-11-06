package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class GoldEarringsPage extends BasePage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//label[@class='listing__checkbox chk']")
	private WebElement PriceChkBox;

	public GoldEarringsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void selectPriceChkBox()
	{
		PriceChkBox.click();
	}

}
