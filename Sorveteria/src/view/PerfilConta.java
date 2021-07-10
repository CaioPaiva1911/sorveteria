package view;

import java.awt.EventQueue;


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class PerfilConta extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNomeUsuario;
	private JTextField txtNome;
	private JTextField txtTipeUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PerfilConta frame = new PerfilConta();
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
	public PerfilConta() {
		setTitle("Perfil de Conta Usu\u00E1rio");
		getContentPane().setBackground(new Color(255, 255, 153));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Pesquisar");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(46, 99, 109, 27);
		getContentPane().add(lblNewLabel_1);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setToolTipText("Nome Usu\u00E1rio");
		txtNomeUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNomeUsuario.setBounds(165, 104, 199, 20);
		getContentPane().add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(186, 85, 211));
		btnBuscar.setForeground(Color.WHITE);
		btnBuscar.setIcon(new ImageIcon(PerfilConta.class.getResource("/icons/lupa.png")));
		btnBuscar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnBuscar.setBounds(379, 103, 133, 23);
		getContentPane().add(btnBuscar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(46, 285, 109, 27);
		getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tipo Usu\u00E1rio");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(46, 346, 109, 27);
		getContentPane().add(lblNewLabel_1_2);
		
		txtNome = new JTextField();
		txtNome.setEditable(false);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNome.setColumns(10);
		txtNome.setBounds(165, 290, 199, 20);
		getContentPane().add(txtNome);
		
		txtTipeUser = new JTextField();
		txtTipeUser.setEditable(false);
		txtTipeUser.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTipeUser.setColumns(10);
		txtTipeUser.setBounds(165, 351, 199, 20);
		getContentPane().add(txtTipeUser);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(PerfilConta.class.getResource("/icons/user.png")));
		lblNewLabel_2.setBounds(165, 133, 170, 146);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(186, 85, 211));
		btnVoltar.setForeground(Color.WHITE);
		btnVoltar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnVoltar.setIcon(new ImageIcon(PerfilConta.class.getResource("/icons/left.png")));
		btnVoltar.setFont(new Font("Arial", Font.PLAIN, 16));
		btnVoltar.setBounds(424, 382, 122, 23);
		getContentPane().add(btnVoltar);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(186, 85, 211));
		panel.setBounds(0, 0, 556, 85);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Perfil Conta Usu\u00E1rio");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(113, 33, 377, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("JetBrains Mono", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setBounds(100, 100, 572, 455);

	}
}
