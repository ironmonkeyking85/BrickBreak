import java.awt.Color;

public class Sprite {
    protected Color transparent = new Color(0,0,0,0); 
    protected Color black = Color.BLACK;
    protected Color red = Color.RED;
    protected Color blue = Color.BLUE;
    protected Color white = Color.WHITE;

    protected Color[][] spritearray = new Color[16][16];

    protected void initSpriteArr(){

        /*Do not call in subclass 
        spritearray is set to null by default 
        and can error at compile time*/
          for(int r = 0; r < 16; r++){
            for(int c = 0; c < 16; c++){
                spritearray[r][c] = transparent;
            }
        }
    }

    public void defineSpritePixels(int row, int col, Color colors){
        /*Creates a 16px by 16px sprite / 256 pixels */
        if(row >= 0 && row < 16 && col >= 0 && col < 16){
            spritearray[row][col] = colors;

            /*subclass example
            @override
            protected void drawSprite(){
            defineSpritePixels(0,0, white);
            } */
        } 
    }

    
}
