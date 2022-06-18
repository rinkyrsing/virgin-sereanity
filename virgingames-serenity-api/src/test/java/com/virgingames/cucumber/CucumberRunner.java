package com.virgingames.cucumber;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
      features = "src/test/java/resources/feature",
        glue = "com/virgingames",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html",
        "com.cucumber.listener.ExtentCucumberFormatter:target/Extent_Reports/report.html",
                "json:target/RunCuke/cucumber.json"
        },

        tags = "@smoke"
)

public class CucumberRunner {

}
