import java.applet.*;
import java.awt.*;

public class Q2 extends Applet{
	
	public void paint(Graphics g){
		g.setColor(Color.YELLOW);    	//color of face
		g.fillOval(200,200,200,200); 	//face
		g.setColor(Color.BLACK);   		//color of eye
		g.fillOval(260,250,15,25); 		//left eye
		g.fillOval(330,250,15,25); 		//right eye
		g.drawArc(260,300,90,50,0,-180);
	}
}

/*
<applet code = "Q2.class" width = "320" height = "120"></applet>
*/