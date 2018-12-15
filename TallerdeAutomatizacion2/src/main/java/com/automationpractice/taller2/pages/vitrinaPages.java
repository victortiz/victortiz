package com.automationpractice.taller2.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")

public class vitrinaPages extends PageObject {

	public static WebDriver driver;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement ubicarse1;
	
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")
	WebElement listdresses;
	
	@FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[1]/div/a[1]/img")
	WebElement ubicarse2;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]/span")
	WebElement listsummer;


	
	
	public void abrir() {
		// driver = new ChromeDriver();

		Actions action = new Actions(this.getDriver());
		action.moveToElement(ubicarse1).build().perform();
		listdresses.click();
	}

	public void abrir2() {
		Actions action = new Actions(this.getDriver());
		action.moveToElement(ubicarse2).build().perform();
		listsummer.click();
	}

	
	
}
