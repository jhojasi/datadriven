package com.tcs.assurance.prueba.tasks;

import com.tcs.assurance.prueba.models.entity.UserInformation;
import com.tcs.assurance.prueba.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class WriteInformation implements Task {
    private UserInformation userInformation;

    public WriteInformation(UserInformation userInformation) {
        this.userInformation = userInformation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userInformation.getFirstName()).into(RegisterPage.FIRST_NAME),
                Enter.theValue(userInformation.getLastName()).into(RegisterPage.LAST_NAME),
                Enter.theValue(userInformation.getEmail()).into(RegisterPage.EMAIL),
                Click.on(RegisterPage.MONTH),
                Click.on(RegisterPage.INPUT.of(userInformation.getMonth())),
                Click.on(RegisterPage.DAY),
                Click.on(RegisterPage.INPUT.of(userInformation.getDay())),
                Click.on(RegisterPage.YEAR),
                Click.on(RegisterPage.INPUT.of(userInformation.getYear())),
                Click.on(RegisterPage.GENDER),
                Click.on(RegisterPage.INPUT.of(userInformation.getGender())),
                Click.on(RegisterPage.NEXT_LOCATION));
    }

    public static WriteInformation onRegisterForm(UserInformation userInformation) {
        return Tasks.instrumented(WriteInformation.class, userInformation);
    }
}
