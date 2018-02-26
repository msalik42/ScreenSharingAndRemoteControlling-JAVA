import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

public class SetPassword extends JFrame implements ActionListener{
	static String port="4907";
	JButton SUBMIT;
	JPanel panel;
	JLabel label1,label2;
	JTextField text1,text2;
	String value1;
	String value2;
	JLabel label;
	
   SetPassword(){
	    label1=new JLabel();
		label1.setText("Set Password");			//label
		text1 = new JTextField(15);				// input for password
		
		label=new JLabel();			
		label.setText("");
		
		
		this.setLayout(new BorderLayout());
		
		SUBMIT = new JButton("START");			//submit button
		SUBMIT.setBackground(Color.black);
		SUBMIT.setForeground(Color.white);
		
		panel=new JPanel(new GridLayout(2,1));
		panel.add(label1);
		panel.add(text1);
		
		panel.add(label);
		panel.add(SUBMIT);
		panel.setBackground(new Color(37,75,232));
		add(panel,BorderLayout.CENTER);
		SUBMIT.addActionListener(this);			//action listenter
		setTitle("Set Password");
	
	}
	
	public void actionPerformed(ActionEvent ae){


		value1=text1.getText();
		dispose();
		new InitConnection(Integer.parseInt(port),value1);		//it pass the port number and password
	}
	
	public String getValue1(){

		return value1;
	}
	

	public static void main(String[] args){

		SetPassword frame1= new SetPassword();

	    //frame1.setSize(300,80); 				
	    //frame1.setLocation(500,300);
		//frame1.setVisible(true);	 
		
		}

}
