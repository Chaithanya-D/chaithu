package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.Browser;

public class Logout extends Browser {

	@FindBy(xpath="//*[@id=\"login_Layer\"]/div")
	WebElement login;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[2]/input")
	WebElement username;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[3]/input")
	WebElement password;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/form/div[5]/button")
	WebElement loginbtn;
	@FindBy(xpath="/html/body/div[1]/div/div/ul[2]/li[2]/a/div[2]")
	WebElement mynaukri;
	@FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/span/div/div/div/div[2]/div/div[2]/div[1]/div/a[1]/div[2]/div[2]")
	WebElement logout;
	
	
	public Logout() {
		PageFactory.initElements(driver,this);
	}
	public void logoutpg() {

		Actions action = new Actions(driver);
		action.moveToElement(mynaukri).build().perform();
		this.logout.click();
		
			
	}
	public void closed()
	{
		driver.quit();
	}
}
