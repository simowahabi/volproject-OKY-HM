package Swing;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ajoute {

	private JFrame frame;
	private JTextField txtAjoute;
	private JTextField textField;
	public JFrame getFrame() {
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
					ajoute window = new ajoute();
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
	public ajoute() {
		initialize();
	}



	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
   	    frame.setBounds(300, 200, 600, 400);
		frame.setPreferredSize(new Dimension(1000,600));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().setLayout(null);
		
		JList listville = new JList();
		listville.setBounds(300, 100, 140, 30);
		frame.getContentPane().add(listville);
		
		textField = new JTextField();
		textField.setBounds(300, 160, 140, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtAjoute = new JTextField();
		txtAjoute.setBounds(300, 210, 140, 20);
		txtAjoute.setVisible(false);
		frame.getContentPane().add(txtAjoute);
		txtAjoute.setColumns(10);

		
		
		JLabel lblLaVilleDe = new JLabel("la ville de Aeroport");
		lblLaVilleDe.setBounds(100, 100, 150, 30);
		frame.getContentPane().add(lblLaVilleDe);
		
		JLabel lblLeNomAero = new JLabel("le nom de Aeroprt");
		lblLeNomAero.setBounds(100, 160, 150, 20);
		frame.getContentPane().add(lblLeNomAero);
		
		
		JButton btnajtville = new JButton("ajouter nouvel ville");
		btnajtville.setBounds(100, 210, 150, 20);
		btnajtville.setVisible(false);
		frame.getContentPane().add(btnajtville);
		
		
		JButton ajouteaeroport = new JButton("ajoute aeroport");
		ajouteaeroport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAjoute.setVisible(true);
			}
		});
		ajouteaeroport.setBounds(200, 300, 180, 40);
		frame.getContentPane().add(ajouteaeroport);

		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 594, 371);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\simo\\workspace\\Volproj\\res\\img\\bg.jpg"));
		frame.getContentPane().add(lblNewLabel);
	}
}
