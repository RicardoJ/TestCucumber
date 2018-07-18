package com.accenture.YoutubeCucumber.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import static org.junit.Assert.assertThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import com.accenture.Youtube.Result.TheResult;
import com.accenture.YoutubeCucumber.pages.TwitterPage;
import com.accenture.YoutubeCucumber.steps.serenity.UserSteps;

public class DefinitionSteps {

    @Steps
    UserSteps anna;

    @Given("el usuario esta en la pagina de youtube")
    public void el_usuario_esta_en_la_pagina_de_youtube() {
        anna.is_the_home_page();
    }

    @When("busca el video '(.*)', click en el video, click en share , click en la red social, cambia de pestaña")
    public void busca_el_video(String word) throws Exception{
        anna.looks_for(word);
        anna.mute();
        try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
        anna.clickShare();
        anna.clickTwitter();
        anna.cambiarPestaña();
        try {
 			Thread.sleep(5000);
 		} catch (Exception e) {
 			// TODO: handle exception
 		}
       
             
    }
    
    @When("agrega en gmail el correo '(.*)' y la contraseña '(.*)',click en Log In")
    public void agrega_en_gmail_el_correo_y_la_contraseña_click_en_Log_In(String email, String pass) throws Exception{
    	 
   			anna.enter_email(email);
   			anna.enter_password(pass);
   			
   			
   			Thread.sleep(5000);
   			
    }
    
  

    @Then("el usuario debe ver que el video compartido diga '(.*)'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) throws InterruptedException {
    	Thread.sleep(5000);
      
        seeThat(TheResult.is(), containsString("Your Tweet has been posted"));
        
    }
}
