package com.automationpractice.taller2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")

public class compraPages extends PageObject {

	@FindBy(xpath = "//*[@id='center_column']/ul/li[3]")
	WebElement seleccion;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[3]/div/div[2]/div[2]/a[1]/span")
	WebElement btnAddCarrito;
							 
	@FindBy(xpath = "//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
	WebElement btnprocedercheckout;
	
	@FindBy(xpath = "//*[@id='center_column']/p[2]/a[1]/span/font/font")
	WebElement btnpasarCaja;
			
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]")
	WebElement capturadiv;
	
	@FindBy(xpath = "//*[@id='center_column']/form/p/button/span/text()")
	WebElement btncheckout;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button/span/font/font")
	WebElement btnenviar;

	@FindBy(xpath = "//*[@id='cgv']")
	WebElement checkbox;

	@FindBy(xpath = "//*[@id='HOOK_PAYMENT']/div[2]/div/p/a/font/font")
	WebElement checque;

	@FindBy(xpath = "//*[@id='cart_navigation']/button/span/font/font")
	WebElement confirmorden;

	@FindBy(xpath = "//*[@id=\"center_column\"]/p[1]/text()")
	WebElement ordenCompleta;

	public void realizarCompra() {

		Actions action = new Actions(this.getDriver());
		action.moveToElement(seleccion).build().perform();
		btnAddCarrito.click();
	}

	public void procederPago() throws InterruptedException {
		System.out.println("Estoy en: btnprocedercheckout");
		Thread.sleep(5000);
		Actions action = new Actions(this.getDriver());
		action.moveToElement(capturadiv).build().perform();
		btnprocedercheckout.click();
		
		
	}

	public void realizarPago() {
		btnpasarCaja.click();
	}

	public void pagar() {
		
		btncheckout.click();
	}

	public void terminos() {
		checkbox.click();
	}

	public void enviar() {
		btnenviar.click();
	}

	public void cheque() {
		checque.click();

	}

	public void orden() {
		confirmorden.click();

	}

	public String conf() {
		return ordenCompleta.getText();

	}

	public void checkout() {
		btnprocedercheckout.click();
		
	}

}
