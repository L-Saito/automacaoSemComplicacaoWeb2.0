package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver("chrome");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");

    }
    //@Ignore comando para ignorar o teste
    @Test
    public void primeiroTeste(){
            //Exemplo de xpath inteiro e dpeois diminuido
        //String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String xpathTitulo = "//section[2]//h4";
        WebElement h4titulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = h4titulo.getText();

    //Comparar se o 'texto' está igual
        assertEquals("Porque Tempo É Conhecimento", titulo);

    }
    @Ignore
    @Test
    public void segundoTeste(){

        String xpathBotao = "//section[2]/div[3]//a";
        WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));

        btnTitulo.click();

        String xpathTitulo = "//section[2]//h2";
        WebElement h2Titulo = driver.findElement(By.xpath(xpathTitulo));

        assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", h2Titulo.getText());

    }

    @After
    public void finalizaTeste(){
        //Fecha o navegador e o 'driver' do sistema
        driver.quit();
    }

}
