

package task11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();//Open the chrome driver
		
		driver.get("http://the-internet.herokuapp.com/nested_frames"); //opens the url link
		
		driver.manage().window().maximize(); //window gets Maximized
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //waits for 15 seconds
		
		WebElement Top=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		WebElement TopLeft=driver.findElement(By.xpath("//frame[@name='frame-left']"));
		
		WebElement TopMiddle=driver.findElement(By.xpath("//frame[@name='frame-top']"));
		
		WebElement TopRight=driver.findElement(By.xpath("//frame[@name='frame-right']"));
		
		WebElement Bottom=driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		
		driver.switchTo().defaultContent();

		driver.switchTo().frame(Top);
		
		driver.switchTo().frame(TopLeft);
		
		driver.switchTo().frame(Top);
		
		driver.switchTo().frame(TopMiddle);
		
		driver.switchTo().frame(Top);
		
		driver.switchTo().frame(TopRight);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(Bottom);

	}

}
