package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class AppRunner {
	
	@CucumberOptions(
			features= "src\\test\\resources\\features\\",
						glue= {"stepdefs"},
						monochrome=true,
						dryRun=false,
						plugin= {"pretty"
								
							//	"usage:target/reports/usageReport",
							//	"usage:target/reports/HTMLReport.html",
							//	"usage:target/reports/JSONReport.json",
							//	"usage:target/reports/TestNGReport.testng"
								
							//	"rerun:target/reports/failedScenarios.txt"
							//	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			
			
			}
						
	)

	//https://github.com/shivavissu/BDDProject.git
	// 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
	//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


	public class GooglePageRunner extends AbstractTestNGCucumberTests {
	 
	}


}
