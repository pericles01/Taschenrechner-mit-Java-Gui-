import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Event implements ActionListener {

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==Gui.one) {
			Gui.label.setText(Gui.label.getText().concat("1"));
		}
		if(e.getSource()==Gui.two) {
			Gui.label.setText(Gui.label.getText().concat("2"));
		}
		if(e.getSource()==Gui.three) {
			Gui.label.setText(Gui.label.getText().concat("3"));
		}
		if(e.getSource()==Gui.four) {
			Gui.label.setText(Gui.label.getText().concat("4"));
		}
		if(e.getSource()==Gui.five) {
			Gui.label.setText(Gui.label.getText().concat("5"));
		}
		if(e.getSource()==Gui.six) {
			Gui.label.setText(Gui.label.getText().concat("6"));
		}
		if(e.getSource()==Gui.seven) {
			Gui.label.setText(Gui.label.getText().concat("7"));
		}
		if(e.getSource()==Gui.eight) {
			Gui.label.setText(Gui.label.getText().concat("8"));
		}
		if(e.getSource()==Gui.nine) {
			Gui.label.setText(Gui.label.getText().concat("9"));
		}
		if(e.getSource()==Gui.zero) {
			Gui.label.setText(Gui.label.getText().concat("0"));
		}
		if(e.getSource()==Gui.comma) {
			Gui.label.setText(Gui.label.getText().concat("."));
		}
		
		double a= Gui.firstNumber, b= Gui.lastNumber, result=0;		
		JButton btn = (JButton)e.getSource();
		
		if(a == 0) {

			if(btn.getText().equals("+")) {
				a=Double.parseDouble(Gui.label.getText());
				Gui.firstNumber = a;
				Gui.operator=1;
				Gui.label.setText("0");
			}
			else if(btn.getText().equals("X")) {
				a=Double.parseDouble(Gui.label.getText());
				Gui.firstNumber = a;
				Gui.operator=2;
				Gui.label.setText("0");
			}
			else if(btn.getText().equals("/")) {
				a=Double.parseDouble(Gui.label.getText());
				Gui.firstNumber = a;
				Gui.operator=3;
				Gui.label.setText("0");
			}
			else if(btn.getText().equals("-")) {
				a=Double.parseDouble(Gui.label.getText());
				Gui.firstNumber = a;
				Gui.operator=4;
				Gui.label.setText("0");
			}
		}
		
		
		if(btn.getText().equals("=")) {
			b=Double.parseDouble(Gui.label.getText());
			Gui.lastNumber = b;
			switch(Gui.operator) {
				case 1: result=a+b;
				break;
				case 2: result= a*b;
				break;
				case 3: result= a/b;
				break;
				case 4: result= a-b;
				break;
				default: result=0;
			}
			Gui.label.setText(""+result);
		}
		if(e.getSource()==Gui.reset) {
			Gui.label.setText("0");
			Gui.firstNumber = Gui.lastNumber = result=0;
			Gui.operator=0;
			
		}

	}

}
