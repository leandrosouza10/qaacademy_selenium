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
        Thread.sleep(3000); // Espera 3 segundo
        driver.findElement(By.xpath("//*[@id='img_1_comp-k0wqferu']/img")).click();//clica no botão do linkedin

    }
    
}
