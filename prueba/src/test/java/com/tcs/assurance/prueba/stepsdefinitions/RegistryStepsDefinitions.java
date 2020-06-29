package com.tcs.assurance.prueba.stepsdefinitions;

import com.tcs.assurance.prueba.exceptions.RegisterExceptions;
import com.tcs.assurance.prueba.models.builders.UserInformationBuilder;
import com.tcs.assurance.prueba.models.entity.UserInformation;
import com.tcs.assurance.prueba.questions.LocatedSubTitle;
import com.tcs.assurance.prueba.tasks.SignUpForFree;
import com.tcs.assurance.prueba.tasks.WriteInformation;
import com.tcs.assurance.prueba.utils.constans.MessagesException;
import com.tcs.assurance.prueba.utils.readers.PropsCsv;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class RegistryStepsDefinitions {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^The user is in home page$")
    public void theUserIsInHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/articles/best-websites-to-practice-test-automation-using-selenium-webdriver"));
    }

    @When("^He writes personal information to register account on utest$")
    public void heWritesPersonalInformationToRegisterAccountOnUtest(List<Map<String, String>> list) throws IOException {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUpForFree.toNextForm());
        OnStage.theActorInTheSpotlight().attemptsTo(WriteInformation.onRegisterForm(
                UserInformationBuilder.PersonInformation(PropsCsv.getDataCsv("UserInformation",
                list.get(0).get("userData"))).build()));
    }

    @Then("^he should see the message (.*)$")
    public void heShouldSeeTheMessageAddYourAddress(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(LocatedSubTitle.onRegisterPage(), is(equalTo(message)))
                .orComplainWith(RegisterExceptions.class, MessagesException.REGISTER));
    }
}