package com.automationpractice.taller2.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com")

public class comparacionPages {
				     //*[@id="center_column"]/ul/li/div/div[2]/div[1]/span[1]
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[1]/span[1]/font/font")
	java.util.List <WebElement> listavestidos;

	//asi es como lo quiero y me sirve con el index, en el li coloco valor del index y sale
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	java.util.List <WebElement> listbtncomprar;

	public int recorrer() {

		double min = 0;
		double max = 0;
		String pepito = "";
		boolean sw = false;
		int index = 0;
		int minimo = 0;

		for (WebElement element : listavestidos) {
			index++;
			pepito = element.getText();
			pepito = pepito.toString().replace("$", "");
			System.out.println(pepito.toString());
			
			
			
			if (sw == false) {
				min = max = Double.parseDouble(element.getText().replace("$", ""));
				sw = true;
			}
			
			if (Double.parseDouble(element.getText().replace("$", "")) > max) {
				max = Double.parseDouble(element.getText().replace("$", ""));
			}else if (Double.parseDouble(pepito.toString().replace("$", "")) < min) {
				min = Double.parseDouble(pepito.toString().replace("$", ""));
				minimo = index;
			}

		}
		System.out.println("Minnimo: " + min);
		System.out.println("Maximo: " + max);
		return minimo;
	}

	public void seleccion(int index) {
		listavestidos.get(index);
	}

	public void listbtncomprar() {
		for (WebElement totalBtnCarritos : listbtncomprar) {
			System.out.println(totalBtnCarritos.getText());
			
		}
		
	}
	
}
