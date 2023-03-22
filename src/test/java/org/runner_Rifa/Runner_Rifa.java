package org.runner_Rifa;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\org\\feature_Rifa\\Login.feature",glue = "org.stepdef_Rifa",dryRun = false, monochrome = true,
publish = true)
public class Runner_Rifa {
     
	
	
}
