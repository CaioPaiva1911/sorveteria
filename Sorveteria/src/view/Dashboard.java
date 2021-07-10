package view;
import java.awt.EventQueue; 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.alteracao.AlterCliente;
import view.alteracao.AlterFornecedor;
import view.alteracao.AlterProduto;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.ComponentOrientation;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

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
	 * @throws PropertyVetoException 
	 */
	public Dashboard(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/icons/ice-cream.png")));
		setTitle("Sorveteria");
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
		dash_item1.setBounds(610, 76, 240, 200);
		dash_item1.setBackground(new Color(176, 224, 230));
		Menu.add(dash_item1);
		dash_item1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder());
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 240, 38);
		dash_item1.add(panel);
		panel.setLayout(null);
		
		JLabel lblResultadosOntem = new JLabel("Resultados do dia anterior");
		lblResultadosOntem.setFont(new Font("Arial", Font.BOLD, 16));
		lblResultadosOntem.setBounds(10, 0, 220, 38);
		panel.add(lblResultadosOntem);
		
		JLabel lblVendasAnteriores = new JLabel("100");
		lblVendasAnteriores.setFont(new Font("Arial", Font.BOLD, 24));
		lblVendasAnteriores.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendasAnteriores.setBounds(76, 49, 100, 100);
		dash_item1.add(lblVendasAnteriores);
		
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
		
		JLabel lblVendasHoje = new JLabel("78");
		lblVendasHoje.setForeground(Color.WHITE);
		lblVendasHoje.setHorizontalAlignment(SwingConstants.CENTER);
		lblVendasHoje.setFont(new Font("Arial", Font.BOLD, 24));
		lblVendasHoje.setBounds(69, 49, 100, 100);
		dash_item2.add(lblVendasHoje);
		
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
		
		JLabel lblLucro = new JLabel("Lucro Bruto");
		lblLucro.setFont(new Font("Arial", Font.BOLD, 16));
		lblLucro.setBounds(10, 0, 189, 38);
		panel_3.add(lblLucro);
		
		JLabel lblLucroBruto = new JLabel("R$ 1900,00");
		lblLucroBruto.setHorizontalAlignment(SwingConstants.CENTER);
		lblLucroBruto.setFont(new Font("Arial", Font.BOLD, 24));
		lblLucroBruto.setBounds(45, 54, 140, 100);
		dash_item3.add(lblLucroBruto);
		
		JPanel dash_item4 = new JPanel();
		dash_item4.setBounds(610, 287, 240, 200);
		dash_item4.setBackground(new Color(176, 224, 230));
		Menu.add(dash_item4);
		dash_item4.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new CompoundBorder());
		panel_2_1.setBackground(new Color(135, 206, 235));
		panel_2_1.setBounds(0, 0, 240, 38);
		dash_item4.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblGraficos = new JLabel("Gr\u00E1fico de Vendas");
		lblGraficos.setFont(new Font("Arial", Font.BOLD, 16));
		lblGraficos.setBounds(10, 0, 189, 38);
		panel_2_1.add(lblGraficos);
		
		JLabel lblTitulo = new JLabel("Dashboard");
		lblTitulo.setBounds(10, 262, 233, 38);
		lblTitulo.setFont(new Font("Book Antiqua", Font.BOLD, 31));
		Menu.add(lblTitulo);
		
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
		itemLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				new Login().setVisible(true);
			}
		});
		itemLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
			}
		});
		itemLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		itemCadastro.add(itemLogin);
		
		JMenuItem itemCliente = new JMenuItem("Cliente");
		itemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cl = new Cliente();
				cl.setVisible(true);
			}
		});
		itemCliente.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin.add(itemCliente);
		
		JMenu itemProduto = new JMenu("Produto");
		itemProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Produto po = new Produto();
				po.setVisible(true);
			}
		});
		itemProduto.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin.add(itemProduto);
		
		JMenuItem itemDesconto = new JMenuItem("Desconto");
		itemDesconto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desconto de = new Desconto();
				de.setVisible(true);
			}
		});
		itemDesconto.setFont(new Font("Arial", Font.PLAIN, 16));
		itemProduto.add(itemDesconto);
		
		JMenuItem itemFornecedor = new JMenuItem("Fornecedor");
		itemFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor fo = new Fornecedor();
				fo.setVisible(true);
			}
		});
		itemFornecedor.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLogin.add(itemFornecedor);
		
		JMenu itemAlteracao = new JMenu("Altera\u00E7\u00E3o");
		itemAlteracao.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/alterar.png")));
		itemAlteracao.setBackground(new Color(148, 0, 211));
		itemAlteracao.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemAlteracao);
		
		JMenu itemAlterLogin = new JMenu("Login");
		itemAlterLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Login lo = new Login();
				lo.setVisible(true);
			}
		});
	
		itemAlterLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		itemAlteracao.add(itemAlterLogin);
		
		JMenuItem itemAlterCliente = new JMenuItem("Cliente");
		itemAlterCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterCliente ac = new AlterCliente();
				ac.setVisible(true);
			}
		});
		itemAlterCliente.setFont(new Font("Arial", Font.PLAIN, 16));
		itemAlterLogin.add(itemAlterCliente);
		
		JMenu itemAlterProduto = new JMenu("Produto");
		itemAlterProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				AlterProduto ap = new AlterProduto();
				ap.setVisible(true);
			}
		});
		
		itemAlterProduto.setFont(new Font("Arial", Font.PLAIN, 16));
		itemAlterLogin.add(itemAlterProduto);
		
		JMenuItem itemAlterFornecedor = new JMenuItem("Fornecedor");
		itemAlterFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AlterFornecedor af = new AlterFornecedor();
				af.setVisible(true);
			}
		});
		itemAlterFornecedor.setFont(new Font("Arial", Font.PLAIN, 16));
		itemAlterLogin.add(itemAlterFornecedor);
		
		JMenu itemLista = new JMenu("Lista");
		itemLista.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/lista.png")));
		itemLista.setBackground(new Color(148, 0, 211));
		itemLista.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemLista);
		
		JMenuItem itemListFornecedor = new JMenuItem("Fornecedor");
		itemListFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarFornecedor lf = new ListarFornecedor();
				lf.setVisible(true);
				
			}
		});
		itemListFornecedor.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLista.add(itemListFornecedor);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Produto");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaProduto lp = new ListaProduto();
				lp.setVisible(true);
			}
		});
		mntmNewMenuItem.setFont(new Font("Arial", Font.PLAIN, 16));
		itemLista.add(mntmNewMenuItem);
		
		
		
		JMenu itemPerfil = new JMenu("Perfil Conta");
		itemPerfil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PerfilConta pf = new PerfilConta();
				pf.setVisible(true);
			}
		});
			
		itemPerfil.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/perfil.png")));
		itemPerfil.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemPerfil);
		
		JMenu itemSair = new JMenu("Sair");
		itemSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		itemSair.setBackground(new Color(255, 0, 0));
		itemSair.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/sair.png")));
		itemSair.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(itemSair);
		
		JLabel lblLogo = new JLabel("Sorveteria");
		lblLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				Dashboard frame = new Dashboard();
				frame.setVisible(true);
			}
		});
		lblLogo.setFont(new Font("Arial", Font.BOLD, 20));
		lblLogo.setIcon(new ImageIcon(Dashboard.class.getResource("/icons/ice-cream.png")));
		menuBar.add(lblLogo);
		
		// Center de form
		this.setLocationRelativeTo(null);
	}
}
