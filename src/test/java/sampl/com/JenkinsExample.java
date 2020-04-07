package sampl.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsExample {
  @Test
  public void sample() {
	  System.out.println("Hello From Jeknins");
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddiqui\\Documents\\Driver\\chromedriver.exe");
		
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.quit();

	  
  }
}
