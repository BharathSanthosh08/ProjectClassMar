package com.assurant;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:\\Users\\BHARATH V\\eclipse-workspace\\com.assurant\\src\\test\\resources",
		glue ="com.assurant",
		tags= "@cheak",
//		plugin ={"html:intex.html","json:target/report.json"},
		dryRun = false,
		monochrome = true		
	
		
		 
		)
public class TestRunner {

}
