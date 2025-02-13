
import java.awt.*;

public class Player {


    public int xpos;                //the x position
    public int ypos;                //the y position
    public int width;
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public Rectangle rec;
    public Image pic;

    //movement booleans
    public boolean right;
    public boolean down;
    public boolean left;
    public boolean up;


    public Player(int pXpos, int pYpos, int dxParameter, int dyParameter, Image picParameter) {

        xpos = pXpos;
        ypos = pYpos;
        width = 100;
        height = 100;
        dx = dxParameter;
        dy = dyParameter;
        pic = picParameter;
        isAlive = true;
        rec = new Rectangle(xpos, ypos, width, height);

    } // constructor

    public void move2() {

        xpos = xpos + dx;
        xpos = xpos + dy;

        if (up == true) {
            dy = -5;
        } else if (down == true) {
            dy = 5;
        } else {
            dy = 0;
        }

    }


    //move( ) method for a keyboard controlled character
    public void move() {

        if(right){
            xpos = xpos +dx;
            if(xpos>1000-width){
                xpos = 1000-width;
            }
        }

        if(left){
            xpos = xpos +dx;
            if(xpos<1000-width){
                xpos = 1000+width;
            }
        }

        if(down){
            ypos = ypos +dy;
            if(ypos>700-height){
                ypos = 700-height;
            }
        }

        if(up){
            ypos = ypos +dy;
            if(ypos<700+height){
                ypos = 700+height;
            }
        }


        //always put this after you've done all the changing of the xpos and ypos values
        rec = new Rectangle(xpos, ypos, width, height);

    }















}
