package com.accenture.YoutubeCucumber.pages;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;

import com.accenture.YoutubeCucumber.steps.serenity.UserSteps;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TwitterPage extends PageObject {

	// localiza el user

	@FindBy(name = "session[username_or_email]")
	private WebElementFacade user;
	// localiza password
	@FindBy(name = "session[password]")
	private WebElementFacade password;

	// localiza el log in twitter
	@FindBy(xpath= "//*[@type=\"submit\"]")
	private WebElementFacade next;



	//busca el string de validacion 
	@FindBy(xpath = "//*[@id=\"bd\"]/div[1]/text()")
	private WebElementFacade validacion;
	
	public static Target VALIDACION = Target.the("validacion").located(By.xpath("//*[@id=\\\"bd\\\"]/div[1]/text()"));
	// -------------------------------------------------------------------------
	// escribir en user email
	public void enter_user_email(String email) {
		user.type(email);
	}

	// escribir password
	public void enter_user_password(String pass) {
		password.type(pass);
	}

	// click en next
	public void lookup_next() {
		next.click();
	}

	
	
	

	
}
