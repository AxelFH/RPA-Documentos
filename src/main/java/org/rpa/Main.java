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

        // Configura la ruta del EdgeDriver
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z285641\\Downloads\\2\\chromedriver-win64\\chromedriver.exe");
//
//        // Inicializa el WebDriver
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        WebDriver driver = new ChromeDriver(options);

        try {

            Machine bot = new Machine();
            bot.startBot();




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
//
//            // Navega a la nueva URL dentro del mismo sitio
//            driver.get("https://creditoautobo.mx.corp/tekfinauto/tekorigination//CustomerASPx/wbCustomerCenterResumeBPM.aspx?PersonId=@1&cntPrmA=X318428&cntPrmB=5&iOpReference=0&iIdReference=0&customerCode=&searchCriteria=&path=&impoundIdOperation=0");
//
//            // Espera a que la nueva página cargue completamente
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
//            Thread.sleep(5000);
//
//            // Ubicar el text-input que está junto al label ID
//            WebElement idField = driver.findElement(By.id("txiSPersonId"));





//
//            // Abrir una pestaña nueva en la URL de la hoja de Excel
//            ((JavascriptExecutor) driver).executeScript("window.open()");
//            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//            driver.switchTo().window(tabs.get(1));
//            driver.get("%7D&wsucxt=1&cobrandid=11bd8083-87e0-41b5-bb78-0bc43c8a8e8a&client-request-id=fdf02ba1-904a-8000-ee41-13a03070e8d1");
//
//            // Espera a que la página de login cargue
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i0116")));
//            WebElement emailField = driver.findElement(By.id("i0116"));
//            emailField.sendKeys("z285641@santander.com.mx");
//
//            WebElement nextButton = driver.findElement(By.id("idSIButton9"));
//            nextButton.click();
//
//            // Espera a que cargue el input para la contraseña
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.id("i0118")));
//            WebElement passwordInput = driver.findElement(By.id("i0118"));
//            passwordInput.sendKeys("Se14n91S2");
//
//            WebElement signInButton = driver.findElement(By.id("idSIButton9"));
//            signInButton.click();
//
//            // Espera a que la página cargue completamente después del login
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
//            Thread.sleep(5000);
//
//            // Ahora carga la hoja de Excel
//            driver.get("https://santandernet-my.sharepoint.com/:x:/r/personal/z285685_santander_com_mx/_layouts/15/doc2.aspx?sourcedoc=%7B14cb95b3-c20a-488a-8eb9-2d763cefde00%7D&action=edit&activeCell=%27Hoja2%27!C11&wdinitialsession=3291ac11-217e-4c5d-be25-ceffcf3bb6ef&wdrldsc=2&wdrldc=1&wdrldr=AccessTokenExpiredWarningOrgPolicyRestriction%2CRefr");
//
//            // Espera a que la nueva página cargue completamente
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("html")));
//            Thread.sleep(5000);
//
//            int x = 200; // Offset to the right
//            int y = 150; // Offset downward
//            robot.mouseMove(x, y);
//            robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cierra el navegador
            System.out.println("Proceso finalizado");
            System.exit(1);
        }
    }
}
