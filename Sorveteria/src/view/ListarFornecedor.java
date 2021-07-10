package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import bd.BDFornecedor;
import bd.BDVendas;
import model.Fornecedor;
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

public class ListarFornecedor extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarFornecedor frame = new ListarFornecedor(usuario);
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
	public ListarFornecedor(Usuario usuario) {
		this.usuario = usuario;
		setIconImage(Toolkit.getDefaultToolkit().getImage(ListarFornecedor.class.getResource("/icons/lista.png")));
		setTitle("Relat\u00F3rio de Fornecedores");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 647, 76);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Lista Fornecedores");
		lblTitulo.setBounds(161, 22, 283, 32);
		panel.add(lblTitulo);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.BOLD, 25));
		
		
		BDFornecedor bd = new BDFornecedor();
		List<Fornecedor> listforn = bd.getAll();
		int i = 120;
		for (Fornecedor forn : listforn) {
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(59, i, 400, 100);
			getContentPane().add(textArea);
			textArea.setText(
					"Id: " + forn.getId() + "\n" +
					"Nome: " + forn.getNome() 	+ "\n" +
					"Endereco: " + forn.getEndereco() + "\n"
			);
			
			
			i+=120;
			
		}
		
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
		setBounds(100, 100, 663, 643);
		
	}
}
