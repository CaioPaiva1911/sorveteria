package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.SwingConstants;

import controller.ControllerUsuario;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	static boolean loggedAdmin = true;
	static boolean loggedComum = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					if (loggedComum) {
						frame.setVisible(true);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	public Login()  {
		ControllerUsuario ControllerUser = new ControllerUsuario();

		setTitle("Acessar");
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 16));
		
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		lblLogin.setBounds(66, 124, 97, 28);
		getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSenha.setBounds(66, 202, 79, 23);
		getContentPane().add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("Digite seu login");
		txtLogin.setFont(new Font("Arial", Font.PLAIN, 12));
		txtLogin.setBounds(66, 163, 249, 28);
		getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JButton btnAcessar = new JButton("Entrar");
		btnAcessar.setForeground(Color.WHITE);
		btnAcessar.setBackground(new Color(186, 85, 211));
		btnAcessar.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		btnAcessar.setBounds(141, 311, 116, 40);
		getContentPane().add(btnAcessar);
		btnAcessar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();

			}
		});
		JPanel labelPanel = new JPanel();
		labelPanel.setBackground(new Color(186, 85, 211));
		labelPanel.setBounds(0, 0, 408, 113);
		getContentPane().add(labelPanel);
		labelPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(78, 25, 233, 61);
		labelPanel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 60));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setFont(new Font("JetBrains Mono", Font.BOLD, 16));
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setBounds(247, 422, 138, 28);
		getContentPane().add(btnVoltar);
		
		txtSenha = new JPasswordField();
		txtSenha.setToolTipText("Digite sua senha");
		txtSenha.setBounds(66, 233, 249, 28);
		getContentPane().add(txtSenha);
		setBounds(100, 100, 424, 500);
		
		

	}

}
