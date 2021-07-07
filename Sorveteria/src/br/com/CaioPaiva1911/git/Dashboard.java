package br.com.CaioPaiva1911.git;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.Cursor;

public class Dashboard extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel Menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 543);
		Menu = 
				new JPanel();
		Menu.setBackground(new Color(255, 255, 153));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);
		
		JPanel navbar = new JPanel();
		navbar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		navbar.setForeground(Color.WHITE);
		navbar.setBackground(new Color(147, 112, 219));
		navbar.setBounds(0, 0, 207, 535);
		Menu.add(navbar);
		navbar.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 207, 98);
		panel_1.setBackground(new Color(128, 0, 128));
		navbar.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel logo = new JLabel("Logo e nome do marca");
		logo.setForeground(Color.WHITE);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setFont(new Font("Arial", Font.PLAIN, 24));
		logo.setBounds(0, 11, 184, 58);
		panel_1.add(logo);
		
		JLabel llbl1 = new JLabel("Cadastro");
		llbl1.setOpaque(true);
		llbl1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		llbl1.setBorder(null);
		llbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
		
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				llbl1.setBackground(new Color(128, 0, 128));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				llbl1.setBackground(new Color(147, 112, 219));
			}
		});
		llbl1.setForeground(Color.WHITE);
		llbl1.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		llbl1.setBounds(34, 109, 125, 30);
		navbar.add(llbl1);
		
		JLabel lbl2 = new JLabel("Altera\u00E7\u00E3o");
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl2.setBackground(new Color(128, 0, 128));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lbl2.setBackground(new Color(147, 112, 219));
			}
		});
		lbl2.setOpaque(true);
		lbl2.setForeground(Color.WHITE);
		lbl2.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lbl2.setBounds(34, 150, 125, 30);
		navbar.add(lbl2);
		
		JLabel lbl3 = new JLabel("Lista");
		lbl3.setOpaque(true);
		lbl3.setForeground(Color.WHITE);
		lbl3.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lbl3.setBounds(34, 191, 125, 30);
		navbar.add(lbl3);
		
		JLabel lbl4 = new JLabel("Perfil Conta");
		lbl4.setOpaque(true);
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lbl4.setBounds(34, 236, 125, 30);
		navbar.add(lbl4);
		
		JLabel lblSair = new JLabel("Sair");
		lblSair.setOpaque(true);
		lblSair.setForeground(Color.WHITE);
		lblSair.setFont(new Font("Book Antiqua", Font.PLAIN, 18));
		lblSair.setBounds(34, 287, 125, 30);
		navbar.add(lblSair);
		
		JPanel dash_item1 = new JPanel();
		dash_item1.setBackground(new Color(176, 224, 230));
		dash_item1.setBounds(626, 76, 240, 200);
		Menu.add(dash_item1);
		dash_item1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 240, 38);
		dash_item1.add(panel);
		panel.setLayout(null);
		
		JLabel lblDash = new JLabel("Resultados do dia anterior");
		lblDash.setFont(new Font("Arial", Font.BOLD, 16));
		lblDash.setBounds(10, 0, 220, 38);
		panel.add(lblDash);
		
		JLabel lblNewLabel_1 = new JLabel("100");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(70, 49, 100, 100);
		dash_item1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de produtos vendidos");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(25, 154, 205, 14);
		dash_item1.add(lblNewLabel_2);
		
		JPanel dash_item2 = new JPanel();
		dash_item2.setBackground(new Color(144, 238, 144));
		dash_item2.setBounds(244, 76, 240, 200);
		Menu.add(dash_item2);
		dash_item2.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new CompoundBorder());
		panel_2.setBackground(new Color(60, 179, 113));
		panel_2.setBounds(0, 0, 240, 38);
		dash_item2.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblResultadosDeHoje = new JLabel("Resultados de hoje");
		lblResultadosDeHoje.setForeground(Color.WHITE);
		lblResultadosDeHoje.setFont(new Font("Arial", Font.BOLD, 16));
		lblResultadosDeHoje.setBounds(10, 0, 189, 38);
		panel_2.add(lblResultadosDeHoje);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("78");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(104, 49, 100, 100);
		dash_item2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Quantidade de produtos vendidos");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(25, 159, 205, 14);
		dash_item2.add(lblNewLabel_2_1);
		
		JPanel dash_item3 = new JPanel();
		dash_item3.setBackground(new Color(176, 224, 230));
		dash_item3.setBounds(244, 287, 240, 200);
		Menu.add(dash_item3);
		dash_item3.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new CompoundBorder());
		panel_3.setBackground(new Color(135, 206, 235));
		panel_3.setBounds(0, 0, 240, 38);
		dash_item3.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDash_1_1 = new JLabel("Lucro Bruto");
		lblDash_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblDash_1_1.setBounds(10, 0, 189, 38);
		panel_3.add(lblDash_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("R$ 1900,00");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(45, 54, 140, 100);
		dash_item3.add(lblNewLabel_1_1);
		
		JPanel dash_item4 = new JPanel();
		dash_item4.setBackground(new Color(176, 224, 230));
		dash_item4.setBounds(626, 287, 240, 200);
		Menu.add(dash_item4);
		dash_item4.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new CompoundBorder());
		panel_2_1.setBackground(new Color(135, 206, 235));
		panel_2_1.setBounds(0, 0, 240, 38);
		dash_item4.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblDash_1_2 = new JLabel("Gr\u00E1fico de Vendas");
		lblDash_1_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblDash_1_2.setBounds(10, 0, 189, 38);
		panel_2_1.add(lblDash_1_2);
		
		JLabel lblNewLabel = new JLabel("Dashboard");
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 31));
		lblNewLabel.setBounds(244, 11, 233, 38);
		Menu.add(lblNewLabel);
		
		// Center de form
		this.setLocationRelativeTo(null);
		
		
		
	}
}
