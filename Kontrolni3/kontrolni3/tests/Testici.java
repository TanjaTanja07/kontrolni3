package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import kontrolni3.Cena;
import kontrolni3.Home;


public class Testici {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\IT Bootcamp\\Programi za kurs\\chromedriver_win32\\ChromeDriver.exe");
		driver = new ChromeDriver();
		
		}
		
		@Test(priority = 1)
		
		public void testSearch() {
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		Home.ulogujNa(driver);
		String current = driver.getCurrentUrl();
		String expected = Cena.URL_cena;	
		Assert.assertEquals(current, expected);

		}
		
		@Test(priority = 2)
		public void testLose () {
			Home.lose(driver);
			//driver.navigate().to(Cena.URL_cena);
			String current = driver.getCurrentUrl();
			String expected = "https://www.saucedemo.com/";
			
			Assert.assertEquals(current, expected);
		}
		
		
		@Test(priority = 3)
		public void testDobro() {
			Home.lose(driver);
			Home.pressBtn(driver);
			//driver.navigate().to(Cena.URL_cena);
			String current = driver.getCurrentUrl();
			String expected = "https://www.saucedemo.com/inventory.html";
			
			Assert.assertEquals(current, expected);
	}

	
		

		@Test(priority = 4)
		public void testCena() {
			Cena.sortiraj(driver);
			String current = driver.getCurrentUrl();
			String expected = Cena.URL_cena;
			Assert.assertEquals(current, expected);
}
}