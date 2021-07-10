package view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ControllerUsuario;
import model.Usuario;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Cliente extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -364223932974469585L;
	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	public static Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente frame = new Cliente(usuario);
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
	public Cliente(Usuario usuario) {
		this.usuario = usuario;
		ControllerUsuario ControllerUser = new ControllerUsuario();
		
		setTitle("Cadastro de Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 772);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(96, 124, 82, 28);
		contentPane.add(lblNewLabel);
		
		JPanel painelView = new JPanel();
		painelView.setBackground(new Color(186, 85, 211));
		painelView.setBounds(0, 0, 484, 102);
		contentPane.add(painelView);
		painelView.setLayout(null);
		
		JLabel lblCadastroCliente = new JLabel("Cadastro Cliente");
		lblCadastroCliente.setForeground(Color.WHITE);
		lblCadastroCliente.setBounds(108, 34, 267, 33);
		lblCadastroCliente.setHorizontalAlignment(SwingConstants.CENTER);
		lblCadastroCliente.setFont(new Font("JetBrains Mono", Font.PLAIN, 26));
		painelView.add(lblCadastroCliente);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setHorizontalAlignment(SwingConstants.CENTER);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 16));
		lblSenha.setBounds(96, 163, 82, 28);
		contentPane.add(lblSenha);
		
		JLabel lblListaDeDesejos = new JLabel("Lista de Desejos");
		lblListaDeDesejos.setHorizontalAlignment(SwingConstants.CENTER);
		lblListaDeDesejos.setFont(new Font("Arial", Font.PLAIN, 16));
		lblListaDeDesejos.setBounds(54, 234, 124, 28);
		contentPane.add(lblListaDeDesejos);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(179, 130, 159, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(179, 163, 159, 20);
		contentPane.add(txtSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(new Color(186, 85, 211));
		btnCadastrar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnCadastrar.setBounds(179, 311, 124, 23);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String login = txtLogin.getText();
				String senha = String.valueOf( txtSenha.getPassword() );
				
						ControllerUser.cadastrarUsuario(usuario,login, senha);					
						dispose();
				}
				
			
		});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 14));
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setBounds(350, 700, 124, 23);
		contentPane.add(btnVoltar);
		
		JTextPane txtListaDesejos = new JTextPane();
		txtListaDesejos.setBounds(179, 202, 159, 87);
		contentPane.add(txtListaDesejos);
		
	}
}
