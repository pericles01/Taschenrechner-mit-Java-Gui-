import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Gui {
	JFrame jf;
	static JTextField label;
	JPanel panel= new JPanel();
	FlowLayout layout;
	static JButton seven;
	static JButton eight;
	static JButton nine;
	static JButton one;
	static JButton two;
	static JButton three;
	static JButton four;
	static JButton five;
	static JButton six;
	static JButton zero;
	static JButton comma;
	static JButton plus;
	static JButton minus;
	static JButton equal;
	static JButton mal;
	static JButton reset;
	static JButton divide;
	static double firstNumber = 0;
	static double lastNumber = 0;
	static int operator = 0; 

	public Gui() {
		//window
		jf=new JFrame("Taschenrechner");
		jf.setSize(600,700);
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		/*try { 
            // set look and feel 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        } 
        catch (Exception e) { 
            System.err.println(e.getMessage()); 
        } */
		
		//layout
		layout= new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		panel.setLayout(layout);
		
		//Font
		Font policeLabel= new Font("Tahoma", Font.BOLD, 50);
		Font policeButton= new Font("Arial" ,Font.BOLD,18);
		
		//label
		label=new JTextField();
		label.setPreferredSize(new Dimension(530,200));;
		label.setBackground(Color.white);
		label.setFont(policeLabel);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setEditable(false);
		label.setVisible(true);
		panel.add(label);
		
		//Button
		seven= new JButton("7");
		seven.setPreferredSize(new Dimension(100,100));
		seven.setBackground(Color.GRAY);
		seven.addActionListener(new Event());
		seven.setFont(policeButton);
		seven.setVisible(true);
		panel.add(seven);
		
		eight= new JButton("8");
		eight.setPreferredSize(new Dimension(100,100));
		eight.setBackground(Color.GRAY);
		eight.addActionListener(new Event());
		eight.setFont(policeButton);
		eight.setVisible(true);
		panel.add(eight);
		
		nine= new JButton("9");
		nine.setPreferredSize(new Dimension(100,100));
		nine.setBackground(Color.GRAY);
		nine.addActionListener(new Event());
		nine.setFont(policeButton);
		nine.setVisible(true);
		panel.add(nine);
		
		mal= new JButton("X");
		mal.setPreferredSize(new Dimension(100,100));
		mal.setBackground(Color.blue);
		mal.addActionListener(new Event());
		mal.setFont(policeButton);
		mal.setVisible(true);
		panel.add(mal);
		
		divide= new JButton("/");
		divide.setPreferredSize(new Dimension(100,100));
		divide.setBackground(Color.blue);
		divide.addActionListener(new Event());
		divide.setFont(policeButton);
		divide.setVisible(true);
		panel.add(divide);
		
		four= new JButton("4");
		four.setPreferredSize(new Dimension(100,100));
		four.setBackground(Color.GRAY);
		four.addActionListener(new Event());
		four.setFont(policeButton);
		four.setVisible(true);
		panel.add(four);
		
		five= new JButton("5");
		five.setPreferredSize(new Dimension(100,100));
		five.setBackground(Color.GRAY);
		five.addActionListener(new Event());
		five.setFont(policeButton);
		five.setVisible(true);
		panel.add(five);
		
		six= new JButton("6");
		six.setPreferredSize(new Dimension(100,100));
		six.setBackground(Color.GRAY);
		six.addActionListener(new Event());
		six.setFont(policeButton);
		six.setVisible(true);
		panel.add(six);
		
		plus= new JButton("+");
		plus.setPreferredSize(new Dimension(100,100));
		plus.setBackground(Color.blue);
		plus.addActionListener(new Event());
		plus.setFont(policeButton);
		plus.setVisible(true);
		panel.add(plus);
		
		minus= new JButton("-");
		minus.setPreferredSize(new Dimension(100,100));
		minus.setBackground(Color.blue);
		minus.addActionListener(new Event());
		minus.setFont(policeButton);
		minus.setVisible(true);
		panel.add(minus);
		
		one= new JButton("1");
		one.setPreferredSize(new Dimension(100,100));
		one.setBackground(Color.GRAY);
		one.addActionListener(new Event());
		one.setFont(policeButton);
		one.setVisible(true);
		panel.add(one);
		
		two= new JButton("2");
		two.setPreferredSize(new Dimension(100,100));
		two.setBackground(Color.GRAY);
		two.addActionListener(new Event());
		two.setFont(policeButton);
		two.setVisible(true);
		panel.add(two);
		
		three= new JButton("3");
		three.setPreferredSize(new Dimension(100,100));
		three.setBackground(Color.GRAY);
		three.addActionListener(new Event());
		three.setFont(policeButton);
		three.setVisible(true);
		panel.add(three);
		
		zero= new JButton("0");
		zero.setPreferredSize(new Dimension(100,100));
		zero.setBackground(Color.GRAY);
		zero.addActionListener(new Event());
		zero.setFont(policeButton);
		zero.setVisible(true);
		panel.add(zero);
		
		comma= new JButton(".");
		comma.setPreferredSize(new Dimension(100,100));
		comma.setBackground(Color.GRAY);
		comma.addActionListener(new Event());
		comma.setFont(policeButton);
		comma.setVisible(true);
		panel.add(comma);
		
		reset= new JButton("Reset");
		reset.setPreferredSize(new Dimension(150,100));
		reset.setBackground(Color.red);
		reset.addActionListener(new Event());
		reset.setFont(policeButton);
		reset.setVisible(true);
		panel.add(reset);
		
		equal= new JButton("=");
		equal.setPreferredSize(new Dimension(150,100));
		equal.setBackground(Color.red);
		equal.addActionListener(new Event());
		equal.setFont(policeButton);
		equal.setVisible(true);
		panel.add(equal);
		
		jf.setContentPane(panel);
		jf.setVisible(true);
	}

}
