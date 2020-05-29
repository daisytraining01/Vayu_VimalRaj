package com.vayu.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Location of the feature file folder
		features = { "classpath:feature/FeatureFile2.feature" },
		// Where my definition is written
		glue = { "classpath:com.vayu.stepdefination","classpath:com.vayu.action","classpath:com.vayu.afterhooks" },
		// Which tag needs to be executed
		tags = { "@All" },
		// Reports generations
		plugin = { "pretty", "html:src/main/resources/results/" },
		// creates body of the undefined functions
		dryRun = false,
		// To know the pass and fail statics
		monochrome = true)
public class Runner {

}
