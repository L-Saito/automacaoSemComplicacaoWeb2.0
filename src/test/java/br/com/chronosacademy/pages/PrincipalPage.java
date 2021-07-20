package br.com.chronosacademy.pages;

import br.com.chronosacademy.maps.PrincipalMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PrincipalPage {
    private WebDriver driver;
    private final PrincipalMap principalMap;

    public PrincipalPage(WebDriver driver) {
        this.driver = driver;
        principalMap = new PrincipalMap();
        PageFactory.initElements(driver, principalMap);

    }
    public String getTitulo() {

        return principalMap.h4titulo.getText();
    }

     public void clickBotao() {

        principalMap.btnTitulo.click();
    }
}
