package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.beans.PropertyVetoException;

import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class login extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public login() throws PropertyVetoException {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 16));
		setMaximum(true);
		setIconifiable(true);
		setMaximizable(true);
		getContentPane().setBackground(new Color(255, 255, 102));
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		lblLogin.setBounds(66, 124, 97, 28);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSenha.setBounds(66, 202, 79, 23);
		getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(66, 163, 249, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAcessar = new JButton("Entrar");
		btnAcessar.setBackground(new Color(148, 0, 211));
		btnAcessar.setFont(new Font("Arial", Font.BOLD, 18));
		btnAcessar.setBounds(141, 311, 116, 40);
		getContentPane().add(btnAcessar);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 236, 249, 28);
		getContentPane().add(textField_1);
		
		JPanel labelPanel = new JPanel();
		labelPanel.setBackground(new Color(138, 43, 226));
		labelPanel.setBounds(0, 0, 408, 113);
		getContentPane().add(labelPanel);
		labelPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(114, 24, 165, 61);
		labelPanel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Brush Script MT", Font.BOLD, 60));
		setBounds(100, 100, 424, 500);

	}
}
