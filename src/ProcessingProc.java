import processing.core.PApplet;

public class ProcessingProc extends PApplet {
    static int WIDTH = 640;
    static int HEIGHT = 480;
    static int DIAMETER = 20;
    int x = 4;

    //int speed =10;


    public static void main(String[] args) {
        PApplet.main("ProcessingProc", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircle(HEIGHT / 5, 1);
     
        drawCircle(2 * HEIGHT / 5,2);

        drawCircle(3 * HEIGHT / 5,4);

        drawCircle(4 * HEIGHT / 5, 8);
   }

    public void drawCircle(int height, double a) {

        ellipse(x, height, DIAMETER, DIAMETER);
        if (x < WIDTH)
            x+=a;

    }



}

   // public void paintWhite(){
         //background(255);


