package Swing;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class administration {
	private ajoute ajframe=new ajoute();

	private JFrame frame;
	

	public  JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					administration window = new administration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public administration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
   	    frame.setBounds(100, 100, 1000, 600);
		frame.setPreferredSize(new Dimension(1000,600));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("Ajoute NV Aeroport");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ajframe.getFrame().setVisible(true);
				
			}
		});
		btnNewButton.setBounds(30, 100, 200, 70);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ajoute nv vol");
		btnNewButton_1.setBounds(30, 200, 200, 70);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ajoute nv ste");
		btnNewButton_2.setBounds(30, 300, 200, 70);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("mod/sup Aeroport");
		btnNewButton_3.setBounds(260, 100, 200, 70);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("mod/sup vol");
		btnNewButton_4.setBounds(260, 200, 200, 70);
		frame.getContentPane().add(btnNewButton_4);
		JButton btnNewButton_5 = new JButton("mod/sup ste");
		btnNewButton_5.setBounds(260, 300, 200, 70);
		frame.getContentPane().add(btnNewButton_5);

		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 1000, 600);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\simo\\workspace\\Volproj\\res\\img\\bg.jpg"));
		frame.getContentPane().add(lblNewLabel);
	}

}
