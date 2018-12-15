package com.automationpractice.taller2.steps;

import com.automationpractice.taller2.pages.signin;

import net.thucydides.core.annotations.Step;

public class tiendaVeranoOnline {
	
	signin signin;
	
	@Step

	public void logeo() {
		signin.open();
		
		
		
	}

}
