import javax.swing.*;
import java.awt.*;
public class Start{
	public static void main(String[] args){
		SetPassword frame1= new SetPassword();
			
			//TO set icon to the frame
			ImageIcon img = new ImageIcon("01.png");
			frame1.setIconImage(img.getImage());
			// TO make the frame not resizable
			frame1.setResizable(false);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    	frame1.setSize(400,100); 				
	    	frame1.setLocation(500,300);
			frame1.setVisible(true);	 
	}
}
