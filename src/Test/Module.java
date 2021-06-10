package Test;



import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
public class Module extends Assign {
	public static AndroidDriver driver;
	@BeforeTest
    public void setup() throws MalformedURLException
    {
        driver = capabilities();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @Test(enabled=false)
    public void testcase1() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
    	driver.findElement(By.id("org.khanacademy.android:id/tab_bar_button_search")).click();
        driver.findElement(By.xpath("//*[@text='Math']")).click();
        driver.findElement(By.xpath("//*[@text='Class 6 (Foundation)']")).click();
        Thread.sleep(3000);
       
        
        driver.findElement(By.xpath("//*[@text='Addition and subtraction']")).click();
        driver.findElement(By.xpath("//*[@content-desc='Add Bookmark']")).click();
        driver.findElement(By.id("android:id/button2")).click();
        driver.findElement(By.xpath("//*[@content-desc='Add Bookmark']")).click();
        }
    @Test(enabled=false)
    public void testcase2() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
    	driver.findElement(By.id("org.khanacademy.android:id/tab_bar_button_search")).click();
        driver.findElement(By.xpath("//*[@text='Math']")).click();
        driver.findElement(By.xpath("//*[@text='Class 6 (Foundation)']")).click();
        Thread.sleep(3000);
       
        
        driver.findElement(By.xpath("//*[@text='Addition and subtraction']")).click();
        driver.findElement(By.xpath("//*[@content-desc='Add Bookmark']")).click();
        driver.findElement(By.id("android:id/button2")).click();
        driver.findElement(By.xpath("//*[@content-desc='Add Bookmark']")).click();
    	
        driver.findElement(By.id("org.khanacademy.android:id/tab_bar_button_bookmarks")).click();
        driver.findElement(By.xpath("//*[@text='Edit']")).click();
        driver.findElement(By.xpath("//*[@content-desc='Select bookmark']")).click();
        driver.findElement(By.xpath("//*[@content-desc='Select bookmark']")).click();
        driver.findElement(By.xpath("//*[@text='Delete']")).click();
        Thread.sleep(3000);
        String finalvalue=((WebElement) driver.findElements(By.className("android.widget.TextView")).get(2)).getText();
        
        //i am removing the $ sysmbol
        String value="You have no bookmarks.";
        
       
        AssertJUnit.assertEquals(value, finalvalue);
    }
    @Test
    public void testcase3() throws InterruptedException
    {
    	driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
    	driver.findElement(By.id("org.khanacademy.android:id/tab_bar_button_search")).click();
        driver.findElement(By.className("android.widget.EditText")).sendKeys("Math");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@text='Math patterns']")).click();
        
        Thread.sleep(3000);
        ((WebElement) driver.findElements(By.className("android.widget.Button")).get(1)).click();
       
    }
   
    }

