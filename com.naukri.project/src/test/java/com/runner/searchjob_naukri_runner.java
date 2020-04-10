package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-seleniumproject\\com.naukri.project\\features1\\naukrifeatures.feature",
                 plugin = {"pretty","html:target/htmlreports"},
                 tags = {"@TC3_Naukri"},
                 glue = {"com.stepdefinition"},
                 
                 
                 
                 monochrome = true)
public class searchjob_naukri_runner {


}
