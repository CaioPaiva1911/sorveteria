package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import bd.BDProdutos;
import bd.BDVendas;
import controller.ControllerProduto;
import model.Produto;
import model.Usuario;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListaProduto extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	public static Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaProduto frame = new ListaProduto(usuario);
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
	public ListaProduto(Usuario usuario) {
		this.usuario = usuario;
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListaProduto.class.getResource("/icons/lista.png")));
		setTitle("Relat\u00F3rio de Produtos");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 647, 76);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Lista Produtos");
		lblTitulo.setBounds(161, 22, 283, 32);
		panel.add(lblTitulo);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.BOLD, 25));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnVoltar.setBounds(484, 565, 153, 28);
		getContentPane().add(btnVoltar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 544, 627, -431);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBackground(Color.WHITE);
		table.setFont(new Font("Arial", Font.PLAIN, 12));
		
		BDProdutos bd = new BDProdutos();
		List<Produto> produtos = bd.getAll();
		
		int i = 120;
		for (Produto prod : produtos) {
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(59, i, 120, 100);
			getContentPane().add(textArea);
			textArea.setText(
					"Produto: " + prod.getNome() + "\n" +
					"Descricao: " + prod.getDesc() 	+ "\n" +
					"Sabor: " + prod.getColor() + "\n" +
					"Quantidade: " + prod.getQtd() + "\n" +
					"Preco: " + prod.getPreco()
			);
			
			
			JButton btnComprar = new JButton("Comprar 1 quantia");
			btnComprar.setBounds(500, i, 89, 23);
			getContentPane().add(btnComprar);
			setBounds(100, 100, 663, 643);
			btnComprar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					BDVendas bd = new BDVendas();
					bd.insertVenda(prod.getId(), 1);
				}
			});
			
			i+=120;
			
		}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(59, 124, 6, 22);
		getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(500, 124, 89, 23);
		getContentPane().add(btnNewButton);
		setBounds(100, 100, 663, 643);
		
	}
}
