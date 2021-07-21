package com.ankur;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.ankur",
        tags = "@SignUpFeature",
        monochrome = true,
        plugin = {"pretty", "html:target/Destination"}

)
public class TestsToRun {

}
