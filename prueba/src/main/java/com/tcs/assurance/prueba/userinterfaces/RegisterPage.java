package com.tcs.assurance.prueba.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {
    public static final Target FIRST_NAME =
            Target.the("First name field")
                    .located(By.id("firstName"));

    public static final Target LAST_NAME =
            Target.the("Last name field")
                    .located(By.id("lastName"));

    public static final Target EMAIL =
            Target.the("Email field")
                    .located(By.id("email"));

    public static final Target MONTH =
            Target.the("Month field")
                    .locatedBy("(//i[@class='caret pull-right'])[1]");

    public static final Target DAY =
            Target.the("Day field")
                    .locatedBy("(//i[@class='caret pull-right'])[2]");

    public static final Target YEAR =
            Target.the("Year field ")
                    .locatedBy("(//i[@class='caret pull-right'])[3]");

    public static final Target GENDER =
            Target.the("Gender field")
                    .locatedBy("(//i[@class='caret pull-right'])[4]");

    public static final Target INPUT =
            Target.the("input {0}")
                    .locatedBy("//div[text()='{0}']");

    public static final Target NEXT_LOCATION =
            Target.the("Next location button")
                    .locatedBy("//*[text()='Next: Location']");

    public static final Target SUB_TITLE =
            Target.the("Sub title field")
                    .locatedBy("//*[text()='Add your address']");
}