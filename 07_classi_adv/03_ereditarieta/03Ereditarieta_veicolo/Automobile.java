import java.awt.Graphics;
import java.awt.Color;

public class Automobile {

    private int posizX, posizY;
    private Color colore;

    public Automobile(int a, int b) {
	posizX = a; 
	posizY = b;
	colore = Color.red;
    }

    public void cambiaColore(Color cl) {
	colore = cl;
    }

    public void disegna(Graphics gr) {
	gr.setColor(colore);
	gr.drawRect(posizX, posizY - 20, 60, 20);
	gr.drawLine(posizX + 10, posizY - 20, posizX + 20, posizY - 40);
	gr.drawLine(posizX + 20, posizY - 40, posizX + 40, posizY - 40);
	gr.drawLine(posizX + 40, posizY - 40, posizX + 50, posizY - 20);
	gr.fillOval(posizX + 4, posizY, 12, 12);
	gr.fillOval(posizX + 44, posizY, 12, 12);
    }

}
