import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class GameWindow extends JFrame {
    public GameWindow(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Brick Break");
        setSize(600, 600);
        setVisible(true);
        windowFormatting();
        
    }

    public void windowFormatting(){
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(12, 1));

        JPanel rowOne = new JPanel();
        pane.add(rowOne);
        rowOne.setBackground(Color.WHITE);

        Hud guistyle = new Hud();
        guistyle.windowLabels(rowOne);
        
        pane.setBackground(Color.BLACK);
    }

}
