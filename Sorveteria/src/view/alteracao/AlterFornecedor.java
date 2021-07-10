package view.alteracao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controller.ControllerFornecedor;
import controller.ControllerProduto;
import model.Fornecedor;
import model.Usuario;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterFornecedor extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtBuscar;
	private JTextField txtNome;
	private JTextField txtEndereco;
	public static Usuario usuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterFornecedor frame = new AlterFornecedor(usuario);
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
	public AlterFornecedor(Usuario usuario) {
		ControllerFornecedor controller = new ControllerFornecedor();
		this.usuario = usuario;
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 15));
		setTitle("Altera\u00E7\u00E3o de Fornecedor");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesquisar.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPesquisar.setBounds(10, 92, 107, 28);
		getContentPane().add(lblPesquisar);
		
		txtBuscar = new JTextField();
		txtBuscar.setToolTipText("C\u00F3digo Fornecedor");
		txtBuscar.setBounds(106, 98, 107, 20);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(186, 85, 211));
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setIcon(new ImageIcon(AlterFornecedor.class.getResource("/icons/lupa.png")));
		btnBuscar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnBuscar.setBounds(237, 97, 135, 23);
		getContentPane().add(btnBuscar);
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor forn = controller.pegarFornecedor(Integer.parseInt(txtBuscar.getText()));
				txtNome.setText(forn.getNome());
				txtEndereco.setText(forn.getEndereco());
			}
		});
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNome.setBounds(10, 148, 107, 28);
		getContentPane().add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 16));
		lblEndereo.setBounds(10, 187, 107, 28);
		getContentPane().add(lblEndereo);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(127, 154, 262, 20);
		getContentPane().add(txtNome);
		
		txtEndereco = new JTextField();
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(127, 193, 262, 20);
		getContentPane().add(txtEndereco);
		
		JButton btnAlterar = new JButton("Alterar ");
		btnAlterar.setBackground(new Color(186, 85, 211));
		btnAlterar.setForeground(Color.WHITE);
		btnAlterar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnAlterar.setBounds(153, 255, 117, 23);
		getContentPane().add(btnAlterar);
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.alterarFornecedor(txtNome.getText(), txtEndereco.getText());
				dispose();
			}
		});
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnVoltar.setBounds(279, 376, 145, 23);
		getContentPane().add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 434, 81);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altera\u00E7\u00E3o de Fornecedor");
		lblNewLabel.setBounds(70, 25, 289, 26);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 20));
		setBounds(100, 100, 450, 449);

	}
}
