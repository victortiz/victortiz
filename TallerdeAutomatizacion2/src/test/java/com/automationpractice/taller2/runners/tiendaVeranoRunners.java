package com.automationpractice.taller2.runners;

import org.junit.runner.RunWith;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.*;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
	features = "src/test/resources/features/TiendaVerano.feature",
	glue = "com.automationpractice.taller2.stepdefinitions",
	snippets = SnippetType.CAMELCASE)	

public class tiendaVeranoRunners {

}
