

package task11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//Open the chrome driver
		
		driver.get("https://the-internet.herokuapp.com/windows"); //opens the url link
		
		driver.manage().window().maximize(); //window gets Maximized
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds

		driver.findElement(By.name("Click Here")).click();
		
		String title=driver.getTitle(); 
		
		System.out.println("The text " +title+ "is present");
		
		driver.close();
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		driver.quit();
		
	}

}
