package com.accenture.YoutubeCucumber.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.youtube.com/")
public class YoutubePage extends PageObject {
//localiza la barra de busqueda

	@FindBy(name = "search_query")
	private WebElementFacade searchTerms;

//localiza el botn de buscar
	@FindBy(id = "search-icon-legacy")
	private WebElementFacade lookupButton;

// localiza el video a seleccionar
	@FindBy(xpath = "//a[@title='Tito Rojas - Señora Dé Madrugada']")
	private WebElementFacade clickvideo;
	//silenciar el video
	@FindBy(xpath = "//*[@title='Mute']")
	private WebElementFacade mute;

//localiza el boton share
	@FindBy(xpath = "//*[@id=\"top-level-buttons\"]/ytd-button-renderer[1]/a")
	private WebElementFacade share;

//localiza el boton de twitter
	
	@FindBy(xpath = "//*[text()=\"Twitter\"]")
	private WebElementFacade twitter;

//escribe el nombre del video a buscar
	public void enter_keywords(String keyword) {
		searchTerms.type(keyword);
	}
	
//click en el boton buscar
	public void lookup_terms() {
		lookupButton.click();
	}

	// click en el video a compartir
	public void lookup_video() {
		clickvideo.click();
	}
	
	//click en mute
	public void mute_video() {
		mute.click();
	}
	
	// click en 'SHARE'
	
	public void share() {
		share.click();
	}
	
	//click en google+
	public void clickTwitter() {
		twitter.click();
	}

	
}