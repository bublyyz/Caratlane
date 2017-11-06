package com.caratlane.test;

import org.testng.annotations.Test;

import com.caratlane.page.GoldEarringsPage;
import com.caratlane.page.HomePage;

import generic.BaseTest;

public class FilterByPrice extends BaseTest {

	@Test
	public void testFilterByPrice() throws InterruptedException
	{
		HomePage hp= new HomePage(driver);
		
		Thread.sleep(5000);
		//Go to Gold Jewellery Menu
		hp.hoverGJmenu();
		
		//Click on Gold Earrings
		hp.clickGearrings();
		
		//Check the price filter by(Rs 5001-Rs10000)
		GoldEarringsPage ge=new GoldEarringsPage(driver);
		ge.selectPriceChkBox();
	}
}
