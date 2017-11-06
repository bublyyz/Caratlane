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
	
	@FindBy(xpath="//li[2]/a[.='Gold Earrings']")
	private WebElement Gearrings;

	
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
		
	public void hoverGJmenu(){
		Actions actions=new Actions(driver);
		actions.moveToElement(GJmenu).perform();				
	}
	
	public void clickGearrings()
	{
		Gearrings.click();
	}
	
	

	
}
	


