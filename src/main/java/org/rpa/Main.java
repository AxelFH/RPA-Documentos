    package org.rpa;
    
    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    
    public class Main {
        public static void main(String[] args) {
            // Configura la ruta del ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z285641\\Downloads\\2\\chromedriver-win64\\chromedriver.exe");
    
            // Inicializa el WebDriver
            WebDriver driver = new ChromeDriver();
    
            try {
                // Abre la página web
                driver.get("https://creditoautobo.mx.corp/tekfinauto/tekorigination/default.aspx");
    
                // Espera a que la página cargue
                Thread.sleep(5000);
    
                // Encuentra el campo de usuario y escribe en él
                WebElement userField = driver.findElement(By.id("txtLogin"));
                userField.sendKeys("X318428");
    
                // Encuentra el campo de contraseña y escribe en él
                WebElement passwordField = driver.findElement(By.id("txtPassword"));
                passwordField.sendKeys("Documentos04");
    
                // Encuentra el botón de login y haz clic en él
                WebElement loginButton = driver.findElement(By.id("btnLogin"));
                loginButton.click();
    
                // Espera a que la página de inicio cargue
                Thread.sleep(5000);
    
                // Aquí puedes agregar más lógica para interactuar con la página después de iniciar sesión
    
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // Cierra el navegador
                driver.quit();
            }
        }
    }
