package start;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AboutWindow extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public AboutWindow() {
		super();
		setIconImage(Toolkit.getDefaultToolkit().getImage(InputInterface.class.getResource("/start/SurgeBOX.png")));
		setType(Type.POPUP);
		setTitle("About Surge.BOX");
		
		setResizable(false);
		setSize(new Dimension(350, 200));
		setPreferredSize(new Dimension(350, 200));
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AboutWindow.class.getResource("/start/SurgeBOX.png")));
		lblNewLabel.setBounds(0, 0, 120, 120);
		getContentPane().add(lblNewLabel);
		
		JLabel lblSurgeBox = new JLabel("Surge.BOX");
		lblSurgeBox.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblSurgeBox.setBounds(140, 11, 204, 14);
		getContentPane().add(lblSurgeBox);
		
		JLabel lblNames_1 = new JLabel("Frazer Smith, Gary Malone,");
		lblNames_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNames_1.setBounds(140, 81, 204, 14);
		getContentPane().add(lblNames_1);
		
		JLabel lblNames_2 = new JLabel("Joseph Udonsak and Bobby Singh");
		lblNames_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNames_2.setBounds(140, 96, 204, 14);
		getContentPane().add(lblNames_2);
		
		JLabel lblCreatedBy = new JLabel("Created By:");
		lblCreatedBy.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblCreatedBy.setBounds(140, 53, 86, 14);
		getContentPane().add(lblCreatedBy);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 131, 344, 40);
		getContentPane().add(panel);
		
		JButton btnOK = new JButton("OK");
		panel.getRootPane().setDefaultButton(btnOK);
		
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		panel.add(btnOK);
	}
}

