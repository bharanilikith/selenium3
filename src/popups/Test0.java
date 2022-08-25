package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();

//alert popup appers
Alert a = driver.switchTo().alert();

//to get the text present on the popup
System.out.println(a.getText());

//click on OK
a.accept();
a.dismiss();


	}

}