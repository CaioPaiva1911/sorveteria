package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.ControllerProduto;
import model.Usuario;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Produto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtSabor;
	private JTextField txtPreco;
	private JTextField txtQtd;
	public static Usuario usuario;
	private JTextField fornecedorId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Produto frame = new Produto(usuario);
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
	public Produto(Usuario usuario) {
		this.usuario = usuario;
		ControllerProduto controller = new ControllerProduto();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Produto.class.getResource("/icons/cadastro.png")));
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 12));
		setTitle("Cadastro de Produto");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescricao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblDescricao.setBounds(54, 146, 123, 24);
		getContentPane().add(lblDescricao);
		
		JLabel lblSabor = new JLabel("Sabor");
		lblSabor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSabor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblSabor.setBounds(54, 216, 123, 24);
		getContentPane().add(lblSabor);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblPreo.setBounds(54, 251, 123, 24);
		getContentPane().add(lblPreo);
		
		JLabel lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantidade.setFont(new Font("Arial", Font.PLAIN, 14));
		lblQuantidade.setBounds(54, 286, 123, 24);
		getContentPane().add(lblQuantidade);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(54, 111, 123, 24);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setBounds(187, 113, 180, 23);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Arial", Font.PLAIN, 12));
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(187, 148, 233, 23);
		getContentPane().add(txtDescricao);
		
		txtSabor = new JTextField();
		txtSabor.setFont(new Font("Arial", Font.PLAIN, 12));
		txtSabor.setColumns(10);
		txtSabor.setBounds(187, 218, 147, 23);
		getContentPane().add(txtSabor);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPreco.setColumns(10);
		txtPreco.setBounds(187, 254, 90, 23);
		getContentPane().add(txtPreco);
		
		txtQtd = new JTextField();
		txtQtd.setFont(new Font("Arial", Font.PLAIN, 12));
		txtQtd.setColumns(10);
		txtQtd.setBounds(187, 288, 79, 23);
		getContentPane().add(txtQtd);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(SystemColor.window);
		btnCadastrar.setBackground(new Color(186, 85, 211));
		btnCadastrar.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		btnCadastrar.setBounds(187, 342, 135, 32);
		getContentPane().add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.Produto prod = new model.Produto(
						txtNome.getText(),
						txtDescricao.getText(),
						Integer.parseInt( fornecedorId.getText() ),
						txtSabor.getText(),
						Float.parseFloat( txtPreco.getText() ),
						Integer.parseInt( txtQtd.getText() )
						);
				controller.inserirProduto(usuario, prod);
				dispose();
			}
		});
		
		JPanel painel = new JPanel();
		painel.setBackground(new Color(186, 85, 211));
		painel.setBounds(0, 0, 475, 94);
		getContentPane().add(painel);
		painel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastro de Produto");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setBounds(86, 21, 318, 44);
		painel.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.PLAIN, 26));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setForeground(SystemColor.window);
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 15));
		btnVoltar.setBounds(311, 415, 135, 32);
		getContentPane().add(btnVoltar);
		
		fornecedorId = new JTextField();
		fornecedorId.setBounds(187, 182, 86, 20);
		getContentPane().add(fornecedorId);
		fornecedorId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("fornecedorId");
		lblNewLabel.setBounds(107, 191, 70, 14);
		getContentPane().add(lblNewLabel);
		setBounds(100, 100, 491, 500);

	}
}
