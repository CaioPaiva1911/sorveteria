package view.alteracao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class AlterProduto extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterProduto frame = new AlterProduto();
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
	public AlterProduto() {
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Alterar Cadastro de Produto");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTitulo.setBounds(69, 28, 263, 24);
		getContentPane().add(lblTitulo);
		
		JLabel lblPesquisa = new JLabel("Pesquisar");
		lblPesquisa.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPesquisa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesquisa.setBounds(32, 89, 89, 24);
		getContentPane().add(lblPesquisa);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 15));
		textField.setBounds(131, 92, 62, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnPesquisar = new JButton("Buscar");
		btnPesquisar.setIcon(new ImageIcon(AlterProduto.class.getResource("/icons/lupa.png")));
		btnPesquisar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(203, 91, 129, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNome.setBounds(32, 127, 89, 24);
		getContentPane().add(lblNome);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescrio.setFont(new Font("Arial", Font.PLAIN, 15));
		lblDescrio.setBounds(32, 162, 89, 24);
		getContentPane().add(lblDescrio);
		
		JLabel lblFornecedor = new JLabel("Fornecedor");
		lblFornecedor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFornecedor.setFont(new Font("Arial", Font.PLAIN, 15));
		lblFornecedor.setBounds(32, 197, 89, 24);
		getContentPane().add(lblFornecedor);
		
		JLabel lblSabor = new JLabel("Sabor");
		lblSabor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSabor.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSabor.setBounds(32, 232, 89, 24);
		getContentPane().add(lblSabor);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPreo.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPreo.setBounds(32, 267, 89, 24);
		getContentPane().add(lblPreo);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(131, 130, 176, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(131, 165, 176, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(131, 200, 176, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(131, 235, 176, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBounds(131, 270, 104, 20);
		getContentPane().add(textField_5);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAlterar.setBounds(158, 328, 104, 23);
		getContentPane().add(btnAlterar);
		setBounds(100, 100, 451, 451);

	}

}
