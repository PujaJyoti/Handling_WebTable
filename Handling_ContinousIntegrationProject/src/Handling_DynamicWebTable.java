import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String Url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fProcess.aspx";
		driver.get(Url);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		driver.findElement(By.xpath("//a[text()='View all orders']")).click();
		WebElement table = driver.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']"));
		List<WebElement> tablerows = table.findElements(By.tagName("tr"));
		System.out.println(tablerows.size());
		for(int i=0;i<tablerows.size();i++){
		List<WebElement>tabledata=tablerows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<tabledata.size();j++){
			System.out.println(tabledata.get(j).getText());
		}
		}
		

	}

}
