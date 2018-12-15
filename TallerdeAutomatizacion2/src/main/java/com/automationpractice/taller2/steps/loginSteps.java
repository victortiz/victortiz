package com.automationpractice.taller2.steps;

import com.automationpractice.taller2.pages.loginPages;

import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;


public class loginSteps {
	
	loginPages logearse;
	
   @Step
	public void abrirPagina() {
	 logearse.open();		
	}

    @Step
    public void registrarme() {
	logearse.registrarme();	
}

    @Step
	public void ingresarEmail(DataTable datosAutenticacion) {
	logearse.email(datosAutenticacion);		
	}

    @Step
	public void ingresarPwd(DataTable datosAutenticacion) {
	logearse.password(datosAutenticacion);
		
	}
  
    @Step
	public void btnregistrarme() {
	logearse.btnregistrarme();
		
	}
    
    @Step
	public void clickPwd() {
	logearse.clickPwd();
		
	}


}
