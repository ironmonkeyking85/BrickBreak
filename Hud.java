import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.concurrent.TimeUnit;

public class Hud{
    private JLabel uiTextLives;
    private JLabel uiTextScore;
    private int score;
    

     public void windowLabels(Container display){
        int textSpacing = 200;
        FlowLayout layout = new FlowLayout();

        display.setLayout(layout);
        layout.setAlignment(FlowLayout.CENTER);
        layout.setHgap(textSpacing);
        
        uiTextLives = new JLabel("LIVES:");
        uiTextScore = new JLabel("SCORE:" + score );
        
        display.add(uiTextLives);
        display.add(uiTextScore);

        display.revalidate();
        display.repaint(); 

         /* score will be recieved from score update class */
        /*  int plusOne = 0;
         for (int i = 0; i <= 1000; i++){
            setScoreCounter(plusOne + i); 
            try{
                TimeUnit.SECONDS.sleep(2);
            } catch(InterruptedException e) {
                
            } 
         } */
        setScoreCounter(100); 
        
    }

    public void setScoreCounter(int score){
       this.score = score;

       if (uiTextScore != null){
        uiTextScore.setText("SCORE:" + score);
       }
    }
}
