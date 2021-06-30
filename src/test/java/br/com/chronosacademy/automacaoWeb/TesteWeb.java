package br.com.chronosacademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class TesteWeb {
    @Test
    public void primeiroTeste(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    //maximiza o navegador
        driver.manage().window().maximize();

        driver.get("https://www.chronosacademy.com.br");
        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement h4titulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = h4titulo.getText();

    //Comparar se o 'texto' está igual
        assertEquals("Porque Tempo É Conhecimento", titulo);

    //Fecha o navegador e o 'driver' do sistema
        driver.quit();

    }
}
