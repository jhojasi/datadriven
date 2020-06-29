package com.tcs.assurance.prueba.questions;

import com.tcs.assurance.prueba.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LocatedSubTitle implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(RegisterPage.SUB_TITLE).viewedBy(actor).asString();
    }

    public static LocatedSubTitle onRegisterPage() {
        return new LocatedSubTitle();
    }
}
