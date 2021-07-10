package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Desconto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel FramePrincipal;
	private JTextField txtBusca;
	private JTextField txtDesconto;
	private JTextField txtvalorProduto;
	private JTextField txtValorFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Desconto frame = new Desconto();
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
	public Desconto() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Desconto.class.getResource("/icons/ice-cream.png")));
		setTitle("Aplicar Desconto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 414);
		FramePrincipal = new JPanel();
		FramePrincipal.setForeground(Color.WHITE);
		FramePrincipal.setBackground(new Color(255, 222, 173));
		FramePrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(FramePrincipal);
		FramePrincipal.setLayout(null);
		
		JPanel painel = new JPanel();
		painel.setBackground(new Color(186, 85, 211));
		painel.setBounds(0, 0, 366, 109);
		FramePrincipal.add(painel);
		painel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Desconto");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.PLAIN, 26));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(70, 34, 210, 32);
		painel.add(lblTitulo);
		
		JLabel lblNewLabel = new JLabel("Pesquisar");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(0, 162, 81, 21);
		FramePrincipal.add(lblNewLabel);
		
		txtBusca = new JTextField();
		txtBusca.setToolTipText("Nome do produto");
		txtBusca.setBounds(87, 163, 131, 20);
		FramePrincipal.add(txtBusca);
		txtBusca.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setToolTipText("Clique aqui para buscar");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(186, 85, 211));
		btnNewButton.setIcon(new ImageIcon(Desconto.class.getResource("/icons/lupa.png")));
		btnNewButton.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnNewButton.setBounds(228, 162, 128, 21);
		FramePrincipal.add(btnNewButton);
		
		JLabel lblDesconto = new JLabel("Desconto");
		lblDesconto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesconto.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDesconto.setBounds(0, 238, 81, 21);
		FramePrincipal.add(lblDesconto);
		
		txtDesconto = new JTextField();
		txtDesconto.setToolTipText("Em porcentagem");
		txtDesconto.setBounds(86, 239, 86, 20);
		FramePrincipal.add(txtDesconto);
		txtDesconto.setColumns(10);
		
		JLabel lblDesconto_1 = new JLabel("%");
		lblDesconto_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesconto_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblDesconto_1.setBounds(173, 238, 24, 21);
		FramePrincipal.add(lblDesconto_1);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setFont(new Font("Arial", Font.PLAIN, 16));
		lblValor.setBounds(0, 192, 81, 21);
		FramePrincipal.add(lblValor);
		
		txtvalorProduto = new JTextField();
		txtvalorProduto.setEditable(false);
		txtvalorProduto.setColumns(10);
		txtvalorProduto.setBounds(87, 193, 86, 20);
		FramePrincipal.add(txtvalorProduto);
		
		JLabel lblValorFinal = new JLabel("Valor Final");
		lblValorFinal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorFinal.setFont(new Font("Arial", Font.PLAIN, 16));
		lblValorFinal.setBounds(0, 290, 81, 21);
		FramePrincipal.add(lblValorFinal);
		
		txtValorFinal = new JTextField();
		txtValorFinal.setEditable(false);
		txtValorFinal.setColumns(10);
		txtValorFinal.setBounds(86, 291, 86, 20);
		FramePrincipal.add(txtValorFinal);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setIcon(new ImageIcon(Desconto.class.getResource("/icons/left.png")));
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnVoltar.setBounds(214, 343, 142, 21);
		FramePrincipal.add(btnVoltar);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setToolTipText("Aplicar desconto em produto");
		btnAplicar.setForeground(Color.WHITE);
		btnAplicar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnAplicar.setBackground(new Color(186, 85, 211));
		btnAplicar.setBounds(228, 239, 128, 21);
		FramePrincipal.add(btnAplicar);
	}

}
