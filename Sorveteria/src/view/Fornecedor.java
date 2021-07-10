package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import controller.ControllerFornecedor;
import model.Usuario;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Fornecedor extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
					Fornecedor frame = new Fornecedor(usuario);
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
	public Fornecedor(Usuario usuario) {
		ControllerFornecedor controller = new ControllerFornecedor();
		this.usuario = usuario;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Fornecedor.class.getResource("/icons/cadastro.png")));
		setTitle("Cadastrar");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Cadastrar Fornecedor");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("JetBrains Mono", Font.BOLD, 25));
		lblTitulo.setBounds(43, 36, 345, 33);
		getContentPane().add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNome.setBounds(-22, 120, 122, 22);
		getContentPane().add(lblNome);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setFont(new Font("Arial", Font.PLAIN, 14));
		lblEndereo.setBounds(-22, 151, 122, 22);
		getContentPane().add(lblEndereo);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Digite o nome do fornecedor");
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setBounds(110, 122, 141, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setToolTipText("Digite o endere\u00E7o do fornecedor");
		txtEndereco.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(110, 153, 314, 20);
		getContentPane().add(txtEndereco);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setToolTipText("Cadastrar Fornecedor");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cadastrarFornecedor(txtNome.getText(), txtEndereco.getText());
			}
		});
		btnCadastrar.setForeground(Color.WHITE);
		btnCadastrar.setBackground(new Color(186, 85, 211));
		btnCadastrar.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnCadastrar.setBounds(133, 239, 141, 33);
		getContentPane().add(btnCadastrar);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 434, 98);
		getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setToolTipText("Voltar para a tela anterior");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(186, 85, 211));
		btnNewButton.setFont(new Font("JetBrains Mono", Font.PLAIN, 16));
		btnNewButton.setBounds(271, 357, 153, 28);
		getContentPane().add(btnNewButton);
		setBounds(100, 100, 450, 450);

	}
}
