package com.automationpractice.taller2.steps;

import com.automationpractice.taller2.pages.vitrinaPages;

import net.thucydides.core.annotations.Step;

public class vitrinaSteps {

	vitrinaPages vitrina;
	
	
	@Step
	public void dresses() {
		vitrina.abrir();	
	}

	@Step
	public void summer() {
    	vitrina.abrir2();
		
	}

	
}
