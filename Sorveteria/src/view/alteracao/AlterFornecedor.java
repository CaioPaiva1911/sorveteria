package view.alteracao;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class AlterFornecedor extends JInternalFrame {
	private JTextField txtBuscar;
	private JTextField txtNome;
	private JTextField txtEndereco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlterFornecedor frame = new AlterFornecedor();
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
	public AlterFornecedor() {
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 15));
		setTitle("Altera\u00E7\u00E3o de Fornecedor");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Altera\u00E7\u00E3o de Fornecedor");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(83, 32, 250, 34);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPesquisar = new JLabel("Pesquisar");
		lblPesquisar.setHorizontalAlignment(SwingConstants.CENTER);
		lblPesquisar.setFont(new Font("Arial", Font.PLAIN, 16));
		lblPesquisar.setBounds(10, 92, 107, 28);
		getContentPane().add(lblPesquisar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(127, 98, 86, 20);
		getContentPane().add(txtBuscar);
		txtBuscar.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setIcon(new ImageIcon(AlterFornecedor.class.getResource("/icons/lupa.png")));
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnBuscar.setBounds(237, 97, 117, 23);
		getContentPane().add(btnBuscar);
		
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
		btnAlterar.setFont(new Font("Arial", Font.PLAIN, 15));
		btnAlterar.setBounds(153, 255, 117, 23);
		getContentPane().add(btnAlterar);
		setBounds(100, 100, 450, 449);

	}

}
