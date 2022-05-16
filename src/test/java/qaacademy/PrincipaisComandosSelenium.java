package qaacademy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrincipaisComandosSelenium {

    @Test
    public void  testeSeleniumClick() throws InterruptedException{
        
        WebDriver driver = new ChromeDriver(); // caminho para abrir o browser
        driver.get("https://qaacademy.com.br"); // url para acessar a página
        Thread.sleep(3000); //Espera de 3 segundos
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click(); //localiza o cookie  e clica em aceitar
        Thread.sleep(1000); // Espera 1 segundo
        driver.findElement(By.xpath("//*[@id='img_1_comp-k0wqferu']/img")).click();//clica no botão do linkedin             
    }
    
    @Test
    public void  testeSeleniumEnviarTextosParaTela() throws InterruptedException{
        
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://qaacademy.com.br"); 
        driver.manage().window().maximize();// maximiza a tela
        Thread.sleep(3000); 
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click(); //localiza o cookie e clica em aceitar
        driver.findElement(By.xpath("//*[@id='comp-k7g9c7sd3label']")).click();//clica no botão CONTATO          
        Thread.sleep(1000); //Espera de 1 segundos
        driver.findElement(By.xpath("//*[@placeholder='Nome']")).sendKeys("Roberto Munhoz"); // preenche o campo NOME
        driver.findElement(By.xpath("//*[@placeholder='Email']")).click();// clica no campo email
        Thread.sleep(1000); //Espera de 1 segundos
        driver.findElement(By.xpath("//*[@placeholder='Email']")).sendKeys("munhoz@gmail.com"); //preenche o campo com o email
        Thread.sleep(1000); //Espera de 1 segundos
        driver.findElement(By.xpath("//*[@id='comp-k37gdiro']/button")).click(); // clica no botão enviar        
        driver.quit();
    }
    
}
