package kontrolni3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


public class Home {
	 
	private static WebDriver driver;
	
	// public void createDriver() {
			//System.setProperty("webdriver.chrome.driver", "E:\\IT Bootcamp\\Programi za kurs\\chromedriver_win32\\ChromeDriver.exe");
			//WebDriver driver = new ChromeDriver();
			public static final String URL = "https://www.saucedemo.com/inventory.html";
			private static final String USERNAME_XPATH = "//*[@id=\"user-name\"]";
			private static final String TXTPASSWORD_XPATH = "//*[@id=\"password\"]";
			public static final String TXTBTN_XPATH ="//*[@id=\"login-button\"]";
			
			public static void ulogujNa (WebDriver driver) {
				driver.navigate().to(URL);
				
			}
			
			public static void lose (WebDriver driver) {
				WebElement username  = driver.findElement(By.xpath(USERNAME_XPATH));
				username.sendKeys(excel(0,0));
				
				WebElement password = driver.findElement(By.xpath(TXTPASSWORD_XPATH));
				username.sendKeys(excel (0,1));
				
			}
			
			public static void dobro (WebDriver driver) {
				WebElement username  = driver.findElement(By.xpath(USERNAME_XPATH));
				username.click();
				username.sendKeys(excel (1,1));
				
				WebElement password = driver.findElement(By.xpath(TXTPASSWORD_XPATH));
				password.click();
				password.sendKeys(excel (1,1));
			}
				
			public static void pressBtn (WebDriver driver) {
				WebElement btn  = driver.findElement(By.xpath(TXTBTN_XPATH));
				btn.click();
					
					
			}
		
			public static String excel(int red, int kolona) {
				File f = new File("data.xlsx"); 
				InputStream  inp = null;
				try {
					 inp = new FileInputStream(f);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
				XSSFWorkbook wb = null;
				try {
					wb = new XSSFWorkbook(inp);
					
						 wb = new XSSFWorkbook(inp);
					} catch (IOException e) {
						e.printStackTrace();
					Sheet sheet = wb.getSheetAt(0); 
					Row row = sheet.getRow(0);
					Cell c1 = row.getCell(1);
					String excels = c1.getStringCellValue();
					
					return excels.toString();
			}
				return null;
					
					
}
			}

	