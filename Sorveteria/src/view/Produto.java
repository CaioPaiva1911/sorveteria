package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Produto extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtSabor;
	private JTextField txtPreco;
	private JTextField txtQtd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto();
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
	public Produto() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("Cadastro de Produto");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Produto");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		lblTitulo.setBounds(148, 46, 205, 24);
		getContentPane().add(lblTitulo);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescricao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDescricao.setBounds(65, 131, 123, 24);
		getContentPane().add(lblDescricao);
		
		JLabel lblSabor = new JLabel("Sabor");
		lblSabor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSabor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSabor.setBounds(65, 166, 123, 24);
		getContentPane().add(lblSabor);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPreo.setBounds(65, 201, 123, 24);
		getContentPane().add(lblPreo);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQuantidade.setBounds(65, 237, 123, 24);
		getContentPane().add(lblQuantidade);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(65, 96, 123, 24);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setBounds(198, 98, 180, 23);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(198, 133, 180, 23);
		getContentPane().add(txtDescricao);
		
		txtSabor = new JTextField();
		txtSabor.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSabor.setColumns(10);
		txtSabor.setBounds(198, 168, 180, 23);
		getContentPane().add(txtSabor);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPreco.setColumns(10);
		txtPreco.setBounds(198, 203, 180, 23);
		getContentPane().add(txtPreco);
		
		txtQtd = new JTextField();
		txtQtd.setFont(new Font("Arial", Font.PLAIN, 12));
		txtQtd.setColumns(10);
		txtQtd.setBounds(198, 239, 180, 23);
		getContentPane().add(txtQtd);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBounds(198, 300, 135, 32);
		getContentPane().add(btnNewButton);
		setBounds(100, 100, 491, 500);

	}
}
