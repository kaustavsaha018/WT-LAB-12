import java.applet.*;
import java.awt.*;

/*<applet code="Q6" width=500 height=200></applet>*/

public class Q6 extends Applet{
	public void init(){
		setBackground(Color.BLACK);	
	} 
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawRect(10,10,50,100);
		g.setColor(Color.GREEN);
		g.drawRoundRect(100,10,50,50,10,10);
		g.setColor(Color.BLUE);
		g.draw3DRect(180,10,100,150,true);
		g.setColor(Color.YELLOW);
		g.fillRect(300,10,50,100);
		
	}
}