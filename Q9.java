import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Q9" width=500 height=200></applet>*/

public class Q9 extends Applet implements ActionListener{
    TextField output;
    Button Red,Blue;		
    public void init(){
        Red=new Button("RED");
		Blue=new Button("BLUE");
        output=new TextField(20);
        output.setBackground(Color.white);
        add(output);
        add(Red);
		add(Blue);
        output.setText("");
        output.setEditable(false);
        output.addActionListener(this);
        Red.addActionListener(this);
		Blue.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){         
        String str=ae.getActionCommand();
        if(str.equals("RED")){
            output.setText("You have passed RED");
		}		
		else{
			output.setText("You have pressed BLUE");
		}		
        repaint();                                           
    }       
}