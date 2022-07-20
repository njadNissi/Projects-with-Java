package com.njad.app;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private static GamePlay gamePlay;
    /**
     * Toolkit.getDefaultToolkit().getScreenSize() => Cross Hardware
     */
    public static int WIDTH;
    public static int HEIGHT;
    public static final int TOP_BORDER = 50;

    public Window() {
        WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
        HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setTitle("Anjie_snake");
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        gamePlay = new GamePlay();
        this.add(gamePlay);

        this.setVisible(true);
    }

}
