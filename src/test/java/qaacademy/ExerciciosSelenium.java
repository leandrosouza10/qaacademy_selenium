package qaacademy;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class ExerciciosSelenium {
    static WebDriver driver;

    @Test    
    public void preencheFormulario(){

        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Leandro/Desktop/Register.html");
        driver.manage().window().maximize();// maximiza a tela
        
        //Register
        driver.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Amaral");
        driver.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Santos");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Rua XXXX, número 49, XXXX");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("amaral@gmail.com");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("1196796578");
        //Seleciona o combobox Gender(Genero)
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")).click();      
       
        //clica no campo Languages
        driver.findElement(By.xpath("//*[@id='msdd']")).click();  
        //clica na opçao de languages        
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[29]/a")).click(); 

         //Seleciona o checkbox Hobbies
        driver.findElement(By.xpath("//*[@id='checkbox1']")).click();
        driver.findElement(By.xpath("//*[@id='checkbox2']")).click();
        driver.findElement(By.xpath("//*[@id='checkbox3']")).click();
        driver.findElement(By.xpath("//*[@id='Skills']")).click();//clica no campo Skills
        driver.findElement(By.xpath("//*[@id='Skills']/option[12]")).click(); 

        //Date Of Birth
        driver.findElement(By.id("yearbox")).click();// clica no campo  ano
        driver.findElement(By.xpath("//*[@id='yearbox']/option[14]")).click();// escolhe o ano
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select")).click(); // clica no campo mês
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select/option[4]")).click(); // seleciona o mês
        driver.findElement(By.id("daybox")).click();// clica no campo dia
        driver.findElement(By.xpath("//*[@id='daybox']/option[11]")).click();// seleciona o dia

        //Password
        driver.findElement(By.xpath("//*[@id='firstpassword']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='secondpassword']")).sendKeys("123456"); 

        // finalizada clicando no botão
        driver.findElement(By.xpath("//*[@id='submitbtn']")).click();

    } 

    @AfterClass
    public static void after() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit(); //  Fecha o browser e encerra o processo        
    }


    
}
