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
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import java.awt.ComponentOrientation;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

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
		Menu = new JPanel();
		Menu.setSize(new Dimension(3800, 90));
		Menu.setFont(new Font("Arial", Font.PLAIN, 16));
		Menu.setBackground(new Color(255, 255, 153));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);
		
		JPanel dash_item1 = new JPanel();
		dash_item1.setBounds(626, 76, 240, 200);
		dash_item1.setBackground(new Color(176, 224, 230));
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
		dash_item2.setBounds(244, 76, 240, 200);
		dash_item2.setBackground(new Color(144, 238, 144));
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
		dash_item3.setBounds(244, 287, 240, 200);
		dash_item3.setBackground(new Color(176, 224, 230));
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
		dash_item4.setBounds(626, 287, 240, 200);
		dash_item4.setBackground(new Color(176, 224, 230));
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
		lblNewLabel.setBounds(41, 96, 233, 38);
		lblNewLabel.setFont(new Font("Book Antiqua", Font.BOLD, 31));
		Menu.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				menuBar.setPreferredSize(new Dimension(2000, 60));
			}
		});
		menuBar.setSize(new Dimension(3200, 80));
		menuBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuBar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		menuBar.setMaximumSize(new Dimension(3000, 60));
		
		menuBar.setBounds(0, 0, 893, 66);
		menuBar.setFont(new Font("Arial", Font.PLAIN, 14));
		menuBar.setBackground(new Color(255, 182, 193));
		Menu.add(menuBar);
		
		JMenu itemCadastro = new JMenu("Cadastro");
		itemCadastro.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/cadastro.png")));
		itemCadastro.setBackground(new Color(148, 0, 211));
		itemCadastro.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemCadastro);
		
		JMenu itemLogin = new JMenu("Login");
		itemLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		itemCadastro.add(itemLogin);
		
		JMenuItem itemCliente = new JMenuItem("Cliente");
		itemCliente.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin.add(itemCliente);
		
		JMenu itemProduto = new JMenu("Produto");
		itemProduto.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin.add(itemProduto);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Desconto");
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 16));
		itemProduto.add(mntmNewMenuItem);
		
		JMenuItem itemFornecedor = new JMenuItem("Fornecedor");
		itemFornecedor.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin.add(itemFornecedor);
		
		JMenu mnNewMenu = new JMenu("Altera\u00E7\u00E3o");
		mnNewMenu.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/alterar.png")));
		mnNewMenu.setBackground(new Color(148, 0, 211));
		mnNewMenu.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnNewMenu);
		
		JMenu itemLogin_1 = new JMenu("Login");
		itemLogin_1.setFont(new Font("Arial", Font.PLAIN, 16));
		mnNewMenu.add(itemLogin_1);
		
		JMenuItem itemCliente_1 = new JMenuItem("Cliente");
		itemCliente_1.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin_1.add(itemCliente_1);
		
		JMenu itemProduto_1 = new JMenu("Produto");
		itemProduto_1.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin_1.add(itemProduto_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Desconto");
		mntmNewMenuItem_1.setFont(new Font("Arial", Font.PLAIN, 16));
		itemProduto_1.add(mntmNewMenuItem_1);
		
		JMenuItem itemFornecedor_1 = new JMenuItem("Fornecedor");
		itemFornecedor_1.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin_1.add(itemFornecedor_1);
		
		JMenu itemLista = new JMenu("Lista");
		itemLista.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/lista.png")));
		itemLista.setBackground(new Color(148, 0, 211));
		itemLista.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemLista);
		
		JMenu mnNewMenu_1 = new JMenu("Produto");
		mnNewMenu_1.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLista.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Op\u00E7\u00E3o Comprar");
		mntmNewMenuItem_2.setFont(new Font("Arial", Font.PLAIN, 16));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem itemFornece = new JMenuItem("Fornecedor");
		itemFornece.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLista.add(itemFornece);
		
		JMenu itemPerfil = new JMenu("Perfil Compra");
		itemPerfil.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/perfil.png")));
		itemPerfil.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemPerfil);
		
		JMenu mnNewMenu_2 = new JMenu("Sair");
		mnNewMenu_2.setBackground(new Color(255, 0, 0));
		mnNewMenu_2.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/sair.png")));
		mnNewMenu_2.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnNewMenu_2);
		
		JLabel lblLogo = new JLabel("Sorveteria");
		lblLogo.setFont(new Font("Arial", Font.BOLD, 20));
		lblLogo.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/ice-cream.png")));
		menuBar.add(lblLogo);
		
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBounds(0, 498, 893, -423);
		Menu.add(desktop);
		
		// Center de form
		this.setLocationRelativeTo(null);
	}
}
