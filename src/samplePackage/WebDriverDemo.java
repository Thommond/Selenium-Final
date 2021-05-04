
package samplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// Make sure to comment out each part if you want one at a time.


public class WebDriverDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/thommondeaux/Desktop/chromedriver");
		driver=new ChromeDriver();
		
		// Part one:
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("http://automationpractice.com/index.php");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//div[@class='TbwUpd NJjxre']")).click();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.name("email_create")).sendKeys("Thomond@protonmail.com");
		driver.findElement(By.name("SubmitCreate")).click();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Thomas");
		driver.findElement(By.name("customer_lastname")).sendKeys("Mondeaux");
		driver.findElement(By.name("passwd")).sendKeys("SpaceXisCool3?");
		driver.findElement(By.name("customer_firstname")).sendKeys("Thomas");
		driver.findElement(By.name("days")).click();
		driver.findElement(By.name("days")).sendKeys("24");
		driver.findElement(By.name("months")).click();
		driver.findElement(By.name("months")).sendKeys("January");
		driver.findElement(By.name("years")).click();
		driver.findElement(By.name("years")).sendKeys("2002");
		driver.findElement(By.name("address1")).sendKeys("175 Stone House Lane");
		driver.findElement(By.name("city")).sendKeys("Columbia");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("id_state")).sendKeys("Alabama");
		driver.findElement(By.id("postcode")).sendKeys("17512");
		driver.findElement(By.name("phone")).sendKeys("(123) 222-2222");
		driver.findElement(By.name("phone_mobile")).sendKeys("(223) 221-2204");
		driver.findElement(By.name("submitAccount")).click();
		
		WebElement a = driver.findElement(By.linkText("ThomasThomas Mondeaux"));
		System.out.println(a.getText());
		
		Thread.sleep(2000);
		
		// Part two:
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("http://automationpractice.com/index.php");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//div[@class='TbwUpd NJjxre']")).click();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.name("email")).sendKeys("Thommond@protonmail.com");
		driver.findElement(By.name("passwd")).sendKeys("kaPkkPHEMBUSfMy");
		driver.findElement(By.name("SubmitLogin")).click();
		
		// Action Hover 1
		WebElement hoverElement = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
		WebElement clickElement = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverElement).perform();
		action.moveToElement(clickElement).click().perform();
		
		driver.findElement(By.id("selectProductSort")).click();
		driver.findElement(By.id("selectProductSort")).sendKeys("P");
		driver.findElement(By.id("selectProductSort")).sendKeys(Keys.RETURN);
		
		// Action Hover 2
		Actions action1 = new Actions(driver);
		WebElement ele1 = driver.findElement(By.linkText("Printed Chiffon Dress"));
		
		action1.moveToElement(ele1).perform();
		
		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.linkText("Continue shopping")).click();
		
		WebElement a = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a/span[1]"));
a
		
		
		// Part Three:
		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("http://automationpractice.com/index.php");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.findElement(By.xpath("//div[@class='TbwUpd NJjxre']")).click();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.name("email")).sendKeys("Thommond@protonmail.com");
		driver.findElement(By.name("passwd")).sendKeys("kaPkkPHEMBUSfMy");
		driver.findElement(By.name("SubmitLogin")).click();
		
		
		
		WebElement hoverElement2 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a"));
		WebElement clickElement2 = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a"));
		// Hover get to products
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(hoverElement2).perform();
		action2.moveToElement(clickElement2).click().perform();
		
		// Hover add to cart
		WebElement ele3 = driver.findElement(By.linkText("Printed Chiffon Dress"));
		Actions action3 = new Actions(driver);
		
		action3.moveToElement(ele3).perform();
		
		driver.findElement(By.linkText("Add to cart")).click();
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
	
		
		// Action Hover cart
		WebElement hoverElement3 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div"));
		WebElement clickElement3 = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/p[2]/a/span"));
		
	
		Actions action4 = new Actions(driver);
		action4.moveToElement(hoverElement3).perform();
		action4.moveToElement(clickElement3).click().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"cart_quantity_up_7_34_0_451986\"]/span")).click();
		
		WebElement b = driver.findElement(By.xpath("//*[@id=\"product_7_34_0_451986\"]/td[5]/input[2]"));
		System.out.println(b.getText());
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a")).click();
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
