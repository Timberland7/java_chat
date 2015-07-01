package com.chat.java_chat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtname;
	private JTextField txtip;
	private JTextField txtPort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 380);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtname = new JTextField();
		txtname.setBounds(82, 48, 129, 20);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(124, 33, 46, 14);
		contentPane.add(lblName);
		
		txtip = new JTextField();
		txtip.setBounds(89, 144, 122, 20);
		contentPane.add(txtip);
		txtip.setColumns(10);
		
		txtPort = new JTextField();
		txtPort.setBounds(89, 235, 122, 20);
		contentPane.add(txtPort);
		txtPort.setColumns(10);
		
		JLabel lblIpAdress = new JLabel("Ip adress:");
		lblIpAdress.setBounds(124, 119, 56, 14);
		contentPane.add(lblIpAdress);
		
		JLabel lblPort = new JLabel("Port:");
		lblPort.setBounds(124, 210, 46, 14);
		contentPane.add(lblPort);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(102, 299, 89, 23);
		contentPane.add(btnLogin);
	}
}
