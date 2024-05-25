package org.rpa;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

import org.rpa.Folio;


public class Machine {

    Robot bot;
    ArrayList<Folio> folios;

    public Machine() throws AWTException {
        bot = new Robot();
        folios = new ArrayList<>();
    }

    public void startBot(){
        try {
            downloadSpreadSheet();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void downloadSpreadSheet() throws Exception {
        // Hace clic en la celda inicial (X: 165, Y: 365)
        clickAtCoordinates(165, 365);

        while (true) {
            // Lee celda 1
            String folio = getCellValue();
            // Presiona Escape
            bot.keyPress(KeyEvent.VK_ESCAPE);
            bot.keyRelease(KeyEvent.VK_ESCAPE);

            // Mueve a la derecha
            bot.keyPress(KeyEvent.VK_RIGHT);
            bot.keyRelease(KeyEvent.VK_RIGHT);

            // Lee celda 2
            String agencia = getCellValue();

            // Guarda la fila
            folios.add(new Folio(folio, agencia));

            // Baja con Enter
            bot.keyPress(KeyEvent.VK_ENTER);
            bot.keyRelease(KeyEvent.VK_ENTER);

            // Lee celda 2
            agencia = getCellValue();
            // Mueve a la izquierda
            bot.keyPress(KeyEvent.VK_LEFT);
            bot.keyRelease(KeyEvent.VK_LEFT);

            // Lee celda 1
            folio = getCellValue();

            // Verifica si ambas celdas están vacías o nulas
            if (folio.isEmpty() || agencia.isEmpty()) {
                break;
            }

            // Guarda la fila
            folios.add(new Folio(folio, agencia));

            // Baja con Enter
            bot.keyPress(KeyEvent.VK_ENTER);
            bot.keyRelease(KeyEvent.VK_ENTER);
        }
    }

    public String getCellValue() throws AWTException, UnsupportedFlavorException, IOException, InterruptedException {

        // Presiona F2 para editar la celda
        bot.keyPress(KeyEvent.VK_F2);
        bot.keyRelease(KeyEvent.VK_F2);
        Thread.sleep(1000);

        // Presiona Ctrl + A para seleccionar todo el texto
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_A);
        bot.keyRelease(KeyEvent.VK_A);
        bot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);

        // Presiona Ctrl + C para copiar el texto al portapapeles
        bot.keyPress(KeyEvent.VK_CONTROL);
        bot.keyPress(KeyEvent.VK_C);
        bot.keyRelease(KeyEvent.VK_C);
        bot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(1000);


        // Obtiene el contenido del portapapeles
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        String cellValue = (String) ((Clipboard) clipboard).getData(DataFlavor.stringFlavor);

        return cellValue;
    }

    public void robotProcess() throws InterruptedException {
        bot.keyPress(KeyEvent.VK_WINDOWS);
        bot.keyRelease(KeyEvent.VK_WINDOWS);
        Thread.sleep(1000);

        textEntry("CHROME");
        Thread.sleep(1000);

        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(4000);

        textEntry("https://santandernet-my.sharepoint.com/:x:/r/personal/z285685_santander_com_mx/_layouts/15/doc2.aspx?sourcedoc=%7B14cb95b3-c20a-488a-8eb9-2d763cefde00%7D&action=edit&activeCell=%27Hoja2%27!C11&wdinitialsession=3291ac11-217e-4c5d-be25-ceffcf3bb6ef&wdrldsc=2&wdrldc=1&wdrldr=AccessTokenExpiredWarningOrgPolicyRestriction%2CRefr");
        Thread.sleep(1000);
        bot.keyPress(KeyEvent.VK_ENTER);
        bot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(1000);
    }

    public void timesTab(int times) throws InterruptedException {
        for (int j = 0; j < times; j++) {
            bot.keyPress(KeyEvent.VK_TAB);
            bot.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
        }
    }

    public void clickAtCoordinates(int x, int y) throws Exception {
        bot.mouseMove(x, y);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void textEntry(String text) {
        for (char c : text.toCharArray()) {
            if (Character.isUpperCase(c)) {
                bot.keyPress(KeyEvent.VK_SHIFT);
                int keyCode = KeyEvent.getExtendedKeyCodeForChar(Character.toLowerCase(c));
                bot.keyPress(keyCode);
                bot.keyRelease(keyCode);
                bot.keyRelease(KeyEvent.VK_SHIFT);
            } else {
                if (c == '&' || c == '%' || c == '!' || c == '=' || c == ':'
                        || c == '/' || c == ';' || c == '_' || c == '?' || c == '\"') {
                    switch (c) {
                        case '&':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_6);
                            bot.keyRelease(KeyEvent.VK_6);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case '%':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_5);
                            bot.keyRelease(KeyEvent.VK_5);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case '!':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_1);
                            bot.keyRelease(KeyEvent.VK_1);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case '=':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_0);
                            bot.keyRelease(KeyEvent.VK_0);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case ':':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_PERIOD);
                            bot.keyRelease(KeyEvent.VK_PERIOD);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case '/':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_7);
                            bot.keyRelease(KeyEvent.VK_7);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case '\"':
                            bot.keyPress(KeyEvent.VK_BACK_SLASH);
                            bot.keyRelease(KeyEvent.VK_BACK_SLASH);
                            break;
                        case ';':
                            bot.keyPress(KeyEvent.VK_SEMICOLON);
                            bot.keyRelease(KeyEvent.VK_SEMICOLON);
                            break;
                        case '?':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_QUOTE);
                            bot.keyRelease(KeyEvent.VK_QUOTE);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            break;
                        case '_':
                            bot.keyPress(KeyEvent.VK_SHIFT);
                            bot.keyPress(KeyEvent.VK_MINUS);
                            bot.keyRelease(KeyEvent.VK_SHIFT);
                            bot.keyRelease(KeyEvent.VK_MINUS);
                            break;
                        default:
                            System.out.println("Character " + c + " not handled.");
                            break;
                    }
                } else {
                    int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
                    bot.keyPress(keyCode);
                    bot.keyRelease(keyCode);
                }
            }
            bot.delay(100);
        }
    }

    public Robot getBot() {
        return bot;
    }

    public void setBot(Robot bot) {
        this.bot = bot;
    }
}
