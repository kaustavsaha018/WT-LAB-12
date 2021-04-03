import java.applet.*;
import java.awt.*;  

/*<applet code="Q3" width=500 height=200></applet>*/

public class Q3 extends Applet{
	public void init(){
		
		Button b=new Button("This is Button"); 
		add(b);
		
		Label l=new Label("This is Label");   
		add(l);	

		Checkbox mycheckbox = new Checkbox("This is Checkbox");
		add(mycheckbox);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox radiobutton = new Checkbox("This is Radio Button ", cbg, false);
		add(radiobutton);
  
		TextField t=new TextField("This is a TextBox");
		add(t);

		TextArea area=new TextArea("This is a Text Area"); 		
		add(area);
	}
}

