package selenium1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		List<WebElement> rows=driver.findElements(By.xpath("//table[@id='countries']//tr"));
		int rowsize=rows.size();
		System.out.println(rowsize);
		for(int i=1;i<rowsize;i++){
		List<WebElement> cells=rows.get(i).findElements(By.xpath(".//td"));
		for(WebElement cell:cells) {
			String countries=cell.getText();
			System.out.println(countries);
			if(countries.equals("Bangladesh")) {
			WebElement selectbox=rows.get(i).findElement(By.xpath(".//input[@type='checkbox']"));
			selectbox.click();
			break;
		}
		}
	}

}
}
