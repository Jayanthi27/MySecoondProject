package com.runner;

import org.junit.AfterClass;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\eclipse-seleniumproject\\com.naukri.project\\features1\\naukrifeatures.feature",
                 plugin = { "pretty","html:reports/cucumber-html-report", "json:reports/cucumber-html-report/jsonreport",
                 "com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" },
                 tags = {"@TC1_Naukri,@TC2_Naukri,@TC3_Naukri,@TC4_Naukri,@TC5_Naukri"},
                 glue = {"com.stepdefinition"}
)
public class TestRunner_runner {
	@AfterClass
	public static void extendReport() {

	Reporter.loadXMLConfig("src/test/resources/testdata/extend_reports.xml");
	Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	Reporter.setSystemInfo("Selenium", "3.141.59");
	Reporter.setSystemInfo("Maven", "4.0.0");
	Reporter.setSystemInfo("Java Version", "1.8.0_131");
	Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}
