package selenium1;

import java.time.Duration;

import org.apache.xmlbeans.XmlDuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//String[] elementid = ("h2","hidden","disable","ch");
		//String[] buttonid=("populate-text","display-other-button","enable-button","checkbox");
		for(int i=0;i<elementid.length;i++) {
			driver.findElement(By.id(buttonid[i])).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementid(i))));
			System.out.println(driver.findElement(By.id(elementid[i])).getText());
		}
	

	}

	private static String elementid(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
