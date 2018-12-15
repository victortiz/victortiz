package com.automationpractice.taller2.steps;

import com.automationpractice.taller2.pages.comparacionPages;
import net.thucydides.core.annotations.Step;

public class comparacionSteps {
	
	comparacionPages compara = new comparacionPages();
	
	@Step
	public int recorrer() {
     return	compara.recorrer();
    	
	}
	@Step
	public void seleccionar(int index) {
		compara.seleccion(index);
		
	} 
	@Step
	public void seleccionarCarrito() {
		compara.listbtncomprar();
	}
	

}
