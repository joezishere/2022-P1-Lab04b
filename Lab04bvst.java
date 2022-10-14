// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
g.drawRect(20, 20, 64, 64);
        g.drawRect(40, 40, 64, 64);
g.drawLine(20,20,40,40);
        g.drawLine(84,20,104,40);
        g.drawLine(20,84,40,104);
        g.drawLine(84,84,104,104);

        // DRAW SPHERE
        g.drawOval(325, 275, 125,125);
        g.drawOval(350, 275, 75, 125 );
        g.drawOval(375, 275, 25, 125);
        g.drawOval(375, 275, 25, 125);
        g.drawOval(325, 300, 125, 75);
        g.drawOval(325, 286, 125, 100);
        g.drawOval(325,325,125,25);


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(200, 100, 100, 100);
        g.drawLine(200, 150, 250, 200);
        g.drawLine(250, 200, 290, 120);
        g.drawLine(200, 150,290 , 120);
        g.drawOval(220, 136, 47, 47 );
        // DRAW APCS



        // DRAW PACMEN FLOWER



    }

}


