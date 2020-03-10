package ejercicio1;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import utils.PageBasic;

public class Ejercicio1 {
    static WebDriver driver;
    static Logger logger = Logger.getLogger(Ejercicio1.class);

    public static void main(String[] args) {
        abrir();
        borrarCookies();
        obtenerTitulo();
    }

    public static void abrir(){
        PageBasic.openBrowser(" http://www.seleniumeasy.com/test/basic-first-form-demo.html", "driver/chromedriver.exe");
    }

    public static void borrarCookies(){
        PageBasic.deleteCookies();

        logger.info("Todas las cookies han sido eliminadas");
    }

    public static void obtenerTitulo(){
        PageBasic.getTitle();
        logger.info("Se obtuvo el titulo de la pagina");
    }

    public static void cerrar(){
        PageBasic.closeBrowser();
    }
}
