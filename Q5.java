import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Q5" width=500 height=200></applet>*/

public class Q5 extends Applet implements ActionListener{
    TextField input,output;
    Button compute;		
    public void init(){
        compute=new Button("Compute");
        Label inp=new Label("Enter any number :",Label.RIGHT);
        Label opt=new Label("The Entered number is : ",Label.RIGHT);
        input=new TextField(5);
        output=new TextField(10);
        input.setBackground(Color.white);
        output.setBackground(Color.white);
        add(inp);
        add(input);
        add(opt);
        add(output);
        add(compute);
        output.setText("Blank");
        output.setEditable(false);
        input.addActionListener(this);
        output.addActionListener(this);
        compute.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){         
        String str=ae.getActionCommand();
        if(str.equals("Compute")){
            if(input.getText() != null && !input.getText().isEmpty()){
				int n=Integer.parseInt(input.getText());
		
				if(n%2==0){                                                
					output.setText("Even");
				}
				else{
					output.setText("Odd");
				}
			}
			else{
			output.setText("Blank");}		
			}
        repaint();                                           
    }       
}