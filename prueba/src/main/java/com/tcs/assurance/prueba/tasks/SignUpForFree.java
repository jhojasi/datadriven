package com.tcs.assurance.prueba.tasks;

import com.tcs.assurance.prueba.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SignUpForFree implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomePage.COOKIES),
                         Click.on(HomePage.SIGN_UP_FOR_FREE));
    }

    public static SignUpForFree toNextForm(){
        return Tasks.instrumented(SignUpForFree.class);
    }
}
