package com.tcs.assurance.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target SIGN_UP_FOR_FREE =
            Target.the("Sign up for free button")
                    .locatedBy("//*[text()='Sign Up For Free']");

    public static final Target COOKIES =
            Target.the("Cookie button")
                    .locatedBy("//*[text()='Accept']");
}
