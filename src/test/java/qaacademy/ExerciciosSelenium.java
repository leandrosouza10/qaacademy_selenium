package qaacademy;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosSelenium {
    static WebDriver driver;

    @Test    
    public void prencheFormulario(){

        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Amaral");
        driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Santos");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Rua XXXX, número 49, XXXX");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("amaral@gmail.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("11 977777777");
      

    }

    @AfterClass
    public static void after() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit(); //  Fecha o browser e encerra o processo        
    }
    
}
