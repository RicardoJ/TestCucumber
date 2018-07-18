package com.accenture.Youtube.Result;

import com.accenture.YoutubeCucumber.pages.TwitterPage;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;

public class TheResult implements Question<String>  {
 
	@Override
    public String answeredBy(Actor actor) {
                   // TODO Auto-generated method stub
                   return Text.of(TwitterPage.VALIDACION).viewedBy(actor).asString();
    }

    public static TheResult is() {
                   // TODO Auto-generated method stub
                   return new TheResult();
    }

}
