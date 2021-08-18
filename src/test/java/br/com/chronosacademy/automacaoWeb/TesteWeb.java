package br.com.chronosacademy.automacaoWeb;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.enums.Browser;
import br.com.chronosacademy.pages.CursoPage;
import br.com.chronosacademy.pages.PrincipalPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class TesteWeb {

    WebDriver driver;
    Driver driverWeb;
    PrincipalPage principalPage;
    CursoPage cursoPage;

    @Before
    public void inicializaTeste(){
        driverWeb = new Driver(Browser.CHROME);
        driver = Driver.getDriver();

        driver.get("https://www.chronosacademy.com.br");
        principalPage = new PrincipalPage(driver);
    }
    //@Ignore comando para ignorar o teste
    @Test
    public void primeiroTeste(){
    //Exemplo de xpath inteiro e depois diminuido
    //String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        String titulo = principalPage.getTitulo();

        //Comparar se o 'texto' está igual
        assertEquals("Porque Tempo É Conhecimento", titulo);

    }

    //@Ignore
    @Test
    public void segundoTeste(){

        principalPage.clickBotao();
        cursoPage = new CursoPage(driver);
        String titulo = cursoPage.getTitulo2();

        assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", titulo);
    }

    @After
    public void finalizaTeste(){
        //Fecha o navegador e o 'driver' do sistema
        driver.quit();
    }

}
