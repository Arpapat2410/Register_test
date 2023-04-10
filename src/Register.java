import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Register {

	@Test
	void test() throws InterruptedException {		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Arpapat");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Yipram");
		driver.findElement(By.xpath("//*[@id=\"vfb-31-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("123/1");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("ต้นสน");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("นครปฐม");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("นครปฐม");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("73180");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("Aonzamak54321@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("02/08/2023");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("1234567890");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("java c+");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
		
		
		//Add Valiabate  and Assert
        String result = driver.findElement(By.xpath("//*[@id=\"item-vfb-2\"]/div")).getText();

        assertEquals("Verification",result);
        
		Thread.sleep(2000);
		driver.quit();
        driver = null;

	}

}
