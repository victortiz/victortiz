package com.automationpractice.taller2.steps;

import com.automationpractice.taller2.pages.compraPages;

import net.thucydides.core.annotations.Step;

public class compraSteps {
	
	compraPages comprarVes;
	compraPages pagoVes;
	compraPages pasarxCaja;
	compraPages envio;
	compraPages cheque;
	compraPages orden;
	compraPages conforden;
	compraPages checkout;

	@Step
	public void compraVestido() {
	comprarVes.realizarCompra();	
		
		
	}

	public void checkout() {
		checkout.checkout();		
	}

	public void pagoVestido() {
		pagoVes.realizarPago();		
	}
	
	public void pasarxCaja() {
		pasarxCaja.pagar();
		
	}

	public void envio() {
	  envio.enviar();

		
	}

	public void terminos() {
		envio.terminos();
		
	}

	public void cheque() {
		cheque.cheque();
		
	}

	public void confOrden() {
		orden.orden();	
		
	}

	public String completa() {
		return conforden.conf();
		
	}

}
