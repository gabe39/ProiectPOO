package agenda;
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Setup terminal and screen layers
        DefaultTerminalFactory dtf = new DefaultTerminalFactory();
        dtf.setTerminalEmulatorTitle("Agenda");
        dtf.setInitialTerminalSize(new TerminalSize(50,30));
        Terminal terminal = dtf.createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        // Create window to hold the panel
        BasicWindow bw = new BasicWindow();
        bw.setHints(Arrays.asList(Window.Hint.CENTERED,Window.Hint.NO_DECORATIONS));
        Panel mainPanel = new Panel();
        mainPanel.setLayoutManager(new GridLayout(1));

        Button btn1 = new Button("Afisare contacte");
        Button btn2 = new Button("Adauga contact");
        

        mainPanel.addComponent(btn1);
        mainPanel.addComponent(btn2);


        TextColor tc = new TextColor.RGB(125,125,125);
        //TextColor tc1 = TextColor.ANSI.BLUE;
        bw.setComponent(mainPanel.withBorder(Borders.singleLine()));
        // Create gui and start gui
        MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(tc));
        gui.addWindowAndWait(bw);
    }
}