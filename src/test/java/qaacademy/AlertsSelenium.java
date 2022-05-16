package qaacademy;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class AlertsSelenium {

    WebDriver driver;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Leandro/Desktop/Alerts.html");
        driver.manage().window().maximize();

    }

    @Test
    public void testAlertaSimples() throws InterruptedException{
        //clica no botão to display an alert box
        driver.findElement(By.xpath("// button [@class ='btn btn-danger']")).click();
        // caixa do alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals("I am an alert box!", alert.getText());
        //alert.dismiss(); // caso seja com Cancela e OK
        alert.accept();
        
      
    }
    @Test
    public void TestboxAlert() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        Assert.assertEquals("Press a Button !", alert.getText());
        alert.accept();
    }

    @Test
    public void TestAlertaComCaixaDeTexto() throws InterruptedException{
        //clica no botão Alert with Textbox
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        // clica em button demonstrate the prompt box
        driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
        // caixa do alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Testando 123");
        Thread.sleep(2000);
        alert.accept();

    }

    @After 
    public void after() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
    
    
}
