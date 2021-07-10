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
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AlterProduto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtPesquisa;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtFornecedor;
	private JTextField txtSabor;
	private JTextField txtPreco;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(AlterProduto.class.getResource("/icons/alterar.png")));
		setTitle("Altera\u00E7\u00E3o de Produto");
		getContentPane().setForeground(Color.WHITE);
		getContentPane().setBackground(new Color(255, 222, 173));
		getContentPane().setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		getContentPane().setLayout(null);
		
		JLabel lblPesquisa = new JLabel("Pesquisar");
		lblPesquisa.setFont(new Font("Arial", Font.PLAIN, 15));
		lblPesquisa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPesquisa.setBounds(32, 89, 89, 24);
		getContentPane().add(lblPesquisa);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setFont(new Font("Arial", Font.PLAIN, 15));
		txtPesquisa.setBounds(131, 92, 136, 20);
		getContentPane().add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		JButton btnPesquisar = new JButton("Buscar");
		btnPesquisar.setBackground(new Color(186, 85, 211));
		btnPesquisar.setForeground(Color.WHITE);
		btnPesquisar.setIcon(new ImageIcon(AlterProduto.class.getResource("/icons/lupa.png")));
		btnPesquisar.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesquisar.setBounds(277, 90, 129, 23);
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
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Arial", Font.PLAIN, 15));
		txtNome.setColumns(10);
		txtNome.setBounds(131, 130, 176, 20);
		getContentPane().add(txtNome);
		
		txtDescricao = new JTextField();
		txtDescricao.setFont(new Font("Arial", Font.PLAIN, 15));
		txtDescricao.setColumns(10);
		txtDescricao.setBounds(131, 165, 176, 20);
		getContentPane().add(txtDescricao);
		
		txtFornecedor = new JTextField();
		txtFornecedor.setFont(new Font("Arial", Font.PLAIN, 15));
		txtFornecedor.setColumns(10);
		txtFornecedor.setBounds(131, 200, 176, 20);
		getContentPane().add(txtFornecedor);
		
		txtSabor = new JTextField();
		txtSabor.setFont(new Font("Arial", Font.PLAIN, 15));
		txtSabor.setColumns(10);
		txtSabor.setBounds(131, 235, 176, 20);
		getContentPane().add(txtSabor);
		
		txtPreco = new JTextField();
		txtPreco.setFont(new Font("Arial", Font.PLAIN, 15));
		txtPreco.setColumns(10);
		txtPreco.setBounds(131, 270, 104, 20);
		getContentPane().add(txtPreco);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBackground(new Color(186, 85, 211));
		btnAlterar.setForeground(Color.WHITE);
		btnAlterar.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		btnAlterar.setBounds(158, 328, 104, 23);
		getContentPane().add(btnAlterar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 435, 78);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Alterar Cadastro de Produto");
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(52, 24, 340, 24);
		panel.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.PLAIN, 20));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(AlterProduto.class.getResource("/icons/left.png")));
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnVoltar.setToolTipText("Voltar para a tela anterior");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 12));
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setBounds(277, 378, 129, 23);
		getContentPane().add(btnVoltar);
		setBounds(100, 100, 451, 451);

	}

}
