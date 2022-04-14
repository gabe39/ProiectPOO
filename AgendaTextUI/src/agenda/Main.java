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
    public static MultiWindowTextGUI gui;
    public static BasicWindow mainWindow;
    public static Panel mainPanel;

    public static BasicWindow adaugaContactWindow;
    public static Panel adaugaContacPanel;

    public static BasicWindow currentWindow;

    public static void main(String[] args) throws IOException {
        // Setup terminal and screen layers
        DefaultTerminalFactory dtf = new DefaultTerminalFactory();
        dtf.setTerminalEmulatorTitle("Agenda");
        dtf.setInitialTerminalSize(new TerminalSize(50,30));
        Terminal terminal = dtf.createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        OptiuniWindow();
        //AdaugaContactWindow();


        // Create gui and start gui
        TextColor tc = new TextColor.RGB(125,125,125);
        gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(tc));
        gui.addWindow(currentWindow);
    }

    public static void AdaugaContactWindow()
    {
        adaugaContactWindow = new BasicWindow();
        adaugaContactWindow.setHints(Arrays.asList(Window.Hint.CENTERED,Window.Hint.NO_DECORATIONS, Window.Hint.NO_POST_RENDERING));
        adaugaContacPanel = new Panel();
        adaugaContacPanel.setLayoutManager(new GridLayout(2));
        adaugaContactWindow.setComponent(adaugaContacPanel.withBorder(Borders.singleLine()));

        Label textNume = new Label("Nume");
        TextBox txtBoxNume = new TextBox();
        Label textPrenume = new Label("Prenume");
        TextBox txtBoxPrenume = new TextBox();
        adaugaContacPanel.addComponent(textNume);
        adaugaContacPanel.addComponent(txtBoxNume);
        adaugaContacPanel.addComponent(new EmptySpace(new TerminalSize(1,1))); //new TerminalSize(0,0)
        adaugaContacPanel.addComponent(textPrenume);
        //adaugaContacPanel.addComponent(new EmptySpace()); //new TerminalSize(0,0)
        //adaugaContacPanel.addComponent(new EmptySpace()); //new TerminalSize(0,0)
        adaugaContacPanel.addComponent(txtBoxPrenume);
        currentWindow = adaugaContactWindow;

    }

    public static void OptiuniWindow()
    {

        // Create window to hold the panel
        mainWindow = new BasicWindow();
        mainWindow.setHints(Arrays.asList(Window.Hint.CENTERED,Window.Hint.NO_DECORATIONS, Window.Hint.NO_POST_RENDERING));
        mainPanel = new Panel();
        mainPanel.setLayoutManager(new GridLayout(1));
        //TextColor tc1 = TextColor.ANSI.BLUE;
        mainWindow.setComponent(mainPanel.withBorder(Borders.singleLine()));
        //mainPanel.setPreferredSize(new TerminalSize(50,30));

        Runnable rb1 = () -> {
            mainWindow.setVisible(false);
            mainPanel.setVisible(false);
            AdaugaContactWindow();
        };
        Button btn1 = new Button("Afisare contacte");
        Button btn2 = new Button("Adauga contact",rb1);
        mainPanel.addComponent(btn1);
        mainPanel.addComponent(btn2);
        currentWindow = mainWindow;
    }
}