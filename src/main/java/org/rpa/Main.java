package org.rpa;

import org.rpa.Machine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        KeyPress.KeyPressListener keyPressListener = new KeyPress.KeyPressListener();
        keyPressListener.start();
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z285641\\Downloads\\2\\chromedriver-win64\\chromedriver.exe");
       // Inicializa el WebDriver
       // ChromeOptions options = new ChromeOptions();
       // options.addArguments("start-maximized");


        try {

            Machine bot = new Machine();
            //WebDriver driver = new ChromeDriver(options);

            bot.startBot();
            bot.showFoliosModal();




            // Abre la página web
//            driver.get("https://creditoautobo.mx.corp/tekfinauto/tekorigination/default.aspx");
//
//            // Espera a que la página cargue
//            WebDriverWait wait = new WebDriverWait(driver, 20);
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
//            Thread.sleep(5000);
//
//            // Encuentra el campo de usuario y escribe en él
//            WebElement userField = driver.findElement(By.id("txtLogin"));
//            userField.sendKeys("X318428");
//
//            // Encuentra el campo de contraseña y escribe en él
//            WebElement passwordField = driver.findElement(By.id("txtPassword"));
//            passwordField.sendKeys("Documentos04");
//
//            // Encuentra el botón de login y haz clic en él
//            WebElement loginButton = driver.findElement(By.id("btnLogin"));
//            loginButton.click();
//
//            // Espera a que la página de inicio cargue después del inicio de sesión
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
//            Thread.sleep(5000);

//            // Navega a la nueva URL dentro del mismo sitio
//            driver.get("https://creditoautobo.mx.corp/tekfinauto/tekorigination//CustomerASPx/wbCustomerCenterResumeBPM.aspx?PersonId=@1&cntPrmA=X318428&cntPrmB=5&iOpReference=0&iIdReference=0&customerCode=&searchCriteria=&path=&impoundIdOperation=0");
//
//            // Espera a que la nueva página cargue completamente
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
//            Thread.sleep(5000);
//
//            // Ubicar el text-input que está junto al label ID
//            WebElement idField = driver.findElement(By.id("txiSPersonId"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cierra el navegador
            System.out.println("Proceso finalizado");
            System.exit(1);
        }
    }
}
