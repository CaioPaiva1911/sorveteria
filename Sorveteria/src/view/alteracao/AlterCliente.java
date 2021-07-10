package view.alteracao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

import javax.swing.JPanel;

public class AlterCliente extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtBuscaNome;
	private JTextField txtLogin;
	private JPasswordField passSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterCliente frame = new AlterCliente();
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
	public AlterCliente() {
		setTitle("Alterar Cliente");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Alterar Cadastro de CLiente");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.PLAIN, 22));
		lblTitulo.setBounds(10, 28, 390, 24);
		getContentPane().add(lblTitulo);
		
		JLabel lblPesquisa = new JLabel("Pesquisar");
		lblPesquisa.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPesquisa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesquisa.setBounds(32, 89, 89, 24);
		getContentPane().add(lblPesquisa);
		
		txtBuscaNome = new JTextField();
		txtBuscaNome.setToolTipText("Digite o nome do Cliente");
		txtBuscaNome.setFont(new Font("Arial", Font.PLAIN, 15));
		txtBuscaNome.setBounds(131, 92, 155, 20);
		getContentPane().add(txtBuscaNome);
		txtBuscaNome.setColumns(10);
		
		JButton btnPesquisar = new JButton("Buscar");
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setBackground(new Color(255, 140, 0));
		btnPesquisar.setIcon(new ImageIcon(AlterCliente.class.getResource("/icons/lupa.png")));
		btnPesquisar.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(296, 90, 129, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Login");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(32, 127, 89, 24);
		getContentPane().add(lblNome);
		
		JLabel lblDescrio = new JLabel("Senha");
		lblDescrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescrio.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDescrio.setBounds(32, 162, 89, 24);
		getContentPane().add(lblDescrio);
		
		JLabel lblIsta = new JLabel("Lista de Desejos");
		lblIsta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIsta.setFont(new Font("Arial", Font.PLAIN, 15));
		lblIsta.setBounds(0, 197, 129, 24);
		getContentPane().add(lblIsta);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Arial", Font.PLAIN, 15));
		txtLogin.setColumns(10);
		txtLogin.setBounds(131, 130, 176, 20);
		getContentPane().add(txtLogin);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setForeground(Color.WHITE);
		btnAlterar.setBackground(new Color(255, 140, 0));
		btnAlterar.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		btnAlterar.setBounds(158, 328, 104, 23);
		getContentPane().add(btnAlterar);
		
		passSenha = new JPasswordField();
		passSenha.setBounds(131, 165, 176, 20);
		getContentPane().add(passSenha);
		
		JTextPane txtLista = new JTextPane();
		txtLista.setBounds(131, 197, 176, 81);
		getContentPane().add(txtLista);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 140, 0));
		panel.setBounds(0, 0, 435, 78);
		getContentPane().add(panel);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(AlterCliente.class.getResource("/icons/left.png")));
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		btnVoltar.setBackground(new Color(255, 140, 0));
		btnVoltar.setBounds(296, 387, 129, 23);
		getContentPane().add(btnVoltar);
		setBounds(100, 100, 451, 451);

	}
}
