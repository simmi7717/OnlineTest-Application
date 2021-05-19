package swing;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;
import swing.OnlineTest;

public class Test extends JFrame implements ActionListener
	{
	JLabel l1,l2,l3;
	JTextArea a1;
	JTextField t1,t2;
	JRadioButton rb1,rb2;
	JButton b1;
	ButtonGroup g1;
	
	public Test(String s)
	{
		super(s);
	
	a1=new JTextArea("Fill your info:");
	l1=new JLabel("Name");
	l1.setBackground(Color.GREEN);
	l2=new JLabel("age");
	l3=new JLabel("Gender");
	t1=new JTextField();
	t2=new JTextField();
	rb1=new JRadioButton("Male");
	rb2=new JRadioButton("Female");
	b1=new JButton("click");
	g1=new ButtonGroup();
	add(a1);add(l1);add(l2);add(l3);add(rb1);add(rb2);add(b1);add(t1);add(t2);
	g1.add(rb1);g1.add(rb2);
	setLayout(null);
	a1.setBounds(30, 30, 100, 20);
	l1.setBounds(50, 50, 80, 20);
	t1.setBounds(120, 50, 100, 20);
	l2.setBounds(50,100,80,20);
	t2.setBounds(120, 100, 100, 20);
	l3.setBounds(50, 160, 80, 20);
	rb1.setBounds(100, 160, 100, 20);
	rb2.setBounds(100, 210, 100, 20);
	b1.setBounds(150, 260, 100, 20);
     b1.addActionListener(this);
	
	}
	public static void main(String[] args) {
    // OnlineTest on=new	OnlineTest();
     //on.setTitle("Online Test");
      Test jf=new Test("Fill your info");
     // jf.setBackground(Color.yellow);
      jf.setBackground(Color.YELLOW);
      jf.setVisible(true);
      jf.setSize(450,450);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
      String gender=" ";
        		 if(rb1.isSelected())
        			 gender="male";
        		 else if(rb2.isSelected())
        			gender="female";
        		 else
        			 gender=" Transgender";
	JOptionPane.showMessageDialog(Test.this, gender);
	JOptionPane.showConfirmDialog(Test.this, "Are You Sure?");
    OnlineTest on=new OnlineTest();
   // on.setBackground(getForeground());
    on.setBackground(Color.orange );
	    on.setTitle("Online Test quiz");

	
	
	}
	
     
	}







	
