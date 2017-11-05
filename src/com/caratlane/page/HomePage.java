package com.caratlane.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	@FindBy(xpath="//a/span[.='GOLD JEWELLERY']")
	private WebElement GJmenu;
	
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void hoverGJmenu(){
		Actions actions=new Actions(driver);
		actions.moveToElement(GJmenu).perform();				
	}
	
}
	


