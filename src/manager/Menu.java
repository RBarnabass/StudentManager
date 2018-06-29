package manager;

import java.io.IOException;

public class Menu {

    static int count;
    static boolean bool = true;
    static String[] list = new String[100];

    public void run() throws IOException {

        Messeger.greeting();

        while (bool) {

            Messeger.mainMenu();
            new Selected().selected();
        }
    }
}
