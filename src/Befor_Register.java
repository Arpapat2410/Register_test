import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Befor_Register {

	@Test
	void test() throws InterruptedException {		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();

		
		//Add Valiabate  and Assert
        String result = driver.findElement(By.xpath("//*[@id=\"item-vfb-5\"]/label[2]")).getText();

        assertEquals("This field is required.",result);
        
		Thread.sleep(2000);
		driver.quit();
        driver = null;

	}

}
