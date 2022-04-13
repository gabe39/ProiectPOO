package agenda;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Terminal term = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(term);

        TextGraphics tg = screen.newTextGraphics();
        screen.startScreen();
        tg.putCSIStyledString(5,5,"ASADS");
        screen.refresh();
        screen.readInput();
        //screen.stopScreen();
    }
}
