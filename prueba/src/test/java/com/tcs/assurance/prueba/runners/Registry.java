package com.tcs.assurance.prueba.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/registry.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.tcs.assurance.prueba.stepsdefinitions")
public class Registry {
}
