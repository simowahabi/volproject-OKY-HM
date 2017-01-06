package Swing;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaceprinc {
private administration admini=new administration();

private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaceprinc window = new Interfaceprinc();
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
	public Interfaceprinc() {
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
		
		JButton btnreservation = new JButton();
		btnreservation.setForeground(null);
		btnreservation.setBackground(null);
		btnreservation.setIcon(new ImageIcon("C:\\Users\\simo\\workspace\\Volproj\\res\\img\\reservation.png"));
		btnreservation.setOpaque(false);
		btnreservation.setContentAreaFilled(false);
		btnreservation.setBorderPainted(false);
		btnreservation.setBounds(340, 120, 300, 300);
		frame.getContentPane().add(btnreservation);
		
		JButton btnadmin = new JButton();
		btnadmin.setForeground(null);
		btnadmin.setBackground(null);
		btnadmin.setIcon(new ImageIcon("C:\\Users\\simo\\workspace\\Volproj\\res\\img\\admin.png"));
		btnadmin.setOpaque(false);
		btnadmin.setContentAreaFilled(false);
		btnadmin.setBorderPainted(false);
		btnadmin.setBounds(20, 120, 300, 300);
		frame.getContentPane().add(btnadmin);
		
		
		btnadmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 admini.getFrame().setVisible(true);
				 frame.setVisible(false);
			}
		});
		JButton btnregle = new JButton();
		btnregle.setForeground(null);
		btnregle.setBackground(null);
		btnregle.setIcon(new ImageIcon("C:\\Users\\simo\\workspace\\Volproj\\res\\img\\regl.png"));
		btnregle.setOpaque(false);
		btnregle.setContentAreaFilled(false);
		btnregle.setBorderPainted(false);
		btnregle.setBounds(660, 120, 300, 300);
		frame.getContentPane().add(btnregle);
		
		JLabel bienvenulable = new JLabel("Bienvenue");
		bienvenulable.setBounds(366, 439, 448, 143);
		//lblNewLabel_1.setFont (lblNewLabel_1.getFont ().deriveFont (645.0f));
		bienvenulable.setFont(bienvenulable.getFont().deriveFont(64f)); 
   		frame.getContentPane().add(bienvenulable);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 11, 994, 571);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\simo\\workspace\\Volproj\\res\\img\\bg.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		

		
        

	}
}
