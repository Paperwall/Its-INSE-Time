package start;

import java.awt.Dimension;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AboutWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public AboutWindow() {
		super();
		setType(Type.POPUP);
		setTitle("About");
		
		setResizable(false);
		setSize(new Dimension(360, 462));
		setPreferredSize(new Dimension(400, 300));
		getContentPane().setBackground(SystemColor.desktop);
		getContentPane().setLayout(null); 
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(AboutWindow.class.getResource("/start/Its-INSE-Time.png")));
		lblNewLabel.setBounds(0, 0, 356, 438);
		getContentPane().add(lblNewLabel);
	}
}
