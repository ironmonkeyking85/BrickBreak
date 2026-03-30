import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;

public class Hud{
    private JLabel uiTextLives;
    private JLabel uiTextScore;

     public void windowLabels(Container display){
        int textSpacing = 200;
        FlowLayout layout = new FlowLayout();

        display.setLayout(layout);
        layout.setAlignment(FlowLayout.CENTER);
        layout.setHgap(textSpacing);
        
        uiTextLives = new JLabel("LIVES:");
        uiTextScore = new JLabel("SCORE:");
        
        display.add(uiTextLives);
        display.add(uiTextScore);

        display.revalidate();
        display.repaint(); 
        
    }

    public void scoreCounter(int score){
        /* score will be recieved from collision class */
        uiTextScore.setText("Score:" + score);
    }
}
