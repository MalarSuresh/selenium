package com.cucumberPJT.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\malar\\eclipse-workspace\\cucumberPJT\\src\\test\\java\\com\\cucumberPJT\\feature\\featureFile.feature",
					 glue="com.cucumberPJT.stepDefinition",
					 monochrome=false,dryRun=false,
					 plugin= {"pretty","html:reports/cucumberHTML","json:jsonReport/rep"})
public class Runner {

}
