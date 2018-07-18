package com.accenture.YoutubeCucumber.steps.serenity;


import com.accenture.Youtube.Result.TheResult;
import com.accenture.YoutubeCucumber.pages.TwitterPage;
import com.accenture.YoutubeCucumber.pages.YoutubePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

public class UserSteps {

    YoutubePage youtubePage;
    TwitterPage tiwtterpage;
    
// abrir el navegador
    @Step
    public void is_the_home_page() {
        youtubePage.open();
    }
    
    // buscar el video y dar click en el boton 
    @Step
    public void enters(String keyword) {
        youtubePage.enter_keywords(keyword);
    }

    @Step 
    public void starts_search() {
        youtubePage.lookup_terms();
    }
    
    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
        starts_search_video();
    }
    
  //click en el video buscado
    
    @Step
  	 public void starts_search_video() {
         youtubePage.lookup_video();
     }
    
 //click en mute
    
    @Step
  	 public void mute() {
         youtubePage.mute_video();;
     }
    
    
    
    //click sobre share
    @Step
 	 public void clickShare() {
        youtubePage.share();
    }
    

    //click sobre google+
    @Step
 	 public void clickTwitter() {
        youtubePage.clickTwitter();
    }
    
    @Step
    public void cambiarPestaña() {
    	WebDriver driver =  youtubePage.getDriver();
    	ArrayList<String> pestañas = new ArrayList<>(driver.getWindowHandles());
    	driver.switchTo().window(pestañas.get(pestañas.size() - 1));
    }
    
    @Step
    public void enter_email(String keyword ) throws Exception {
    	Thread.sleep(5000);
    	tiwtterpage.enter_user_email(keyword);
    
    }
    
    @Step 
    public void enter_password(String keyword) throws Exception {
    	Thread.sleep(5000);
    	tiwtterpage.enter_user_password(keyword);
    	tiwtterpage.lookup_next();
    }
    
 

  
}