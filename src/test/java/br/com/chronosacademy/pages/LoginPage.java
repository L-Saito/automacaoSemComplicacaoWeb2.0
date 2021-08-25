package br.com.chronosacademy.pages;

import br.com.chronosacademy.core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickBtnLogin(){
        //Visibility = aguarda um tempo para o elemento aparecer na tela
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickBtnFechar(){
        //Driver.visibilityOf(loginMap.btnFechar);
        loginMap.btnFechar.click();
    }

    public void clickDivFechaModal(){
        //Driver.visibilityOf((loginMap.divFechaModal));
        loginMap.divFechaModal.click();
    }

    public void setInpUserName(String username){
        //Driver.visibilityOf(loginMap.inpUserName);
        if (username != null){
            loginMap.inpUserName.sendKeys(username);
        }

    }

    public void setInpPassword(String password){
        //Driver.visibilityOf(loginMap.inpPassword);
        if (password != null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }
    public void clickInpRemember(){
        //Driver.visibilityOf(loginMap.inpRemember);
       loginMap.inpRemember.click();

    }
    public void clickBtnSignIn(){
        //Driver.visibilityOf(loginMap.btnSignIn);
        loginMap.btnSignIn.click();

    }
    public void clickLinkCreateAccount(){
        Driver.visibilityOf(loginMap.linkCreateAccount);
        loginMap.linkCreateAccount.click();
    }

    public boolean isBtnSignIn(){
        //Driver.visibilityOf(loginMap.btnSignIn);
        return loginMap.btnSignIn.isEnabled();

    }
    public void visibilityOfBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOfBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }
    public void aguardaLoader(){
        Driver.attributeChange(loginMap.divLoader, "display", "nome");
    }


}
