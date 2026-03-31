

public class App{
    static boolean isrunning = true;

    public void gameActive(){
        new GameWindow();
        while (isrunning) {
            update();
            render();
            
        }
    }

    private void update(){

    }

    private void render(){

    }

    public static void main(String[] args){
        new App().gameActive();
        
    }
}