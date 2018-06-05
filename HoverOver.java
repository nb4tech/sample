package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HoverOver {

	public static void main(String[] args) throws InterruptedException {
	 // TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement web_Element_To_Be_Hovered=driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement( web_Element_To_Be_Hovered).perform();
		Thread.sleep(5000);
		
		WebElement subMenu = driver.findElement(By.xpath("//a[contains(text(),'Hot Meals ')]"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='itineraryBody']/div/div[2]/div/p[3]")).click();
		Thread.sleep(5000);
		
		 Alert alert = driver.switchTo().alert();
		 String alertMessage= driver.switchTo().alert().getText();
		 System.out.println(alertMessage);	
	     Thread.sleep(5000);
	     alert.accept();
	     
	     WebElement confirmationNo = driver.findElement(By.xpath(".//*[@id='ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ConfirmationNumber']"));
	     confirmationNo.clear();
	     confirmationNo.sendKeys("ABCDEF");
	     
	     WebElement firstName = driver.findElement(By.xpath(" .//*[@id='ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_PAXFIRSTNAME2']"));
	     firstName.clear();
	     firstName.sendKeys("LMN");
	     
	     WebElement lastName = driver.findElement(By.xpath(".//*[@id='ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_PAXLASTNAME2']"));
	     lastName.clear();
	     lastName.sendKeys("XYZ");
	     
	     Select originCity = new Select(driver.findElement(By.xpath(".//*[@id='ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_ORIGINCITY2']")));
	     originCity.selectByVisibleText("Delhi (DEL)");
	     
	     WebElement destinationCity = driver.findElement(By.xpath(".//*[@id='ControlGroupRetrieveBookingView_BookingRetrieveInputRetrieveBookingView_DESTINATIONCITY2']"));
	     destinationCity.sendKeys("Goa");
	     Thread.sleep(5000);
	     
	     driver.findElement(By.xpath(".//*[@id='itineraryBody']/div/div[2]/div/p[3]")).click();
		 Thread.sleep(5000);
		 
		 driver.close();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
	     
		
	}

}
