package com.automationpractice.taller2.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")

public class loginPages extends PageObject {

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement btnregistro;
		
	@FindBy(xpath = "//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(id = "passwd")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	WebElement btnreg;
	
	public void registrarme() {
		btnregistro.click();		
	}

	public void password(DataTable datosAutenticacion) {
		List<List<String>> data = datosAutenticacion.raw();
		password.sendKeys(data.get(0).get(1));			
		}	

	public void email(DataTable datosAutenticacion) {
		List<List<String>> data = datosAutenticacion.raw();
	  email.sendKeys(data.get(0).get(0));		
	}

	public void btnregistrarme() {
	  btnreg.click();
	}

	public void clickPwd() {
		password.click();
		
	}	

}