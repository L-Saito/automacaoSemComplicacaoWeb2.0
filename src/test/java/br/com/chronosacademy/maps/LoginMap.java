package br.com.chronosacademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    // ao mapear: # é para ID, .(ponto) para classe, ao usar *[] ele inspeciona todos os elementos para localizar
    // somente um elemento para mapear, exemplo: *[name='username'], quando for link, inciado com <a href,
    // pode ser usado o texto como mapeamento
    @FindBy(css = "#menuUser")
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFechaModal;
    @FindBy(css = "*[name='username']")
    public WebElement inpUserName;
    @FindBy(css = "*[name='password']")
    public WebElement inpPassword;
    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember;
    @FindBy(css = "#sign_in_btnundefined")
    public WebElement btnSignIn;
    @FindBy(linkText = "CREATE NEW ACCOUNT")
    public WebElement linkCreateAccount;
    @FindBy(css = ".loader")
    public WebElement divLoader;
    @FindBy(css = ".containMiniTitle")
    public WebElement textLogado;
    @FindBy(xpath = "//label[contains(text(), 'Incorrect')]")
    public WebElement textErroLogin;
}
