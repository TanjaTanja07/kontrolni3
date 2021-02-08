package kontrolni3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cena {
	
	private static WebDriver driver;
	
	public static final String URL_cena = "https://www.saucedemo.com/inventory.html";
	
	public static void sortiraj (WebDriver driver) {
		driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
		
		}
		
}
