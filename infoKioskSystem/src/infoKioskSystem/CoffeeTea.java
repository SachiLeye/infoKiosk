package infoKioskSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import java.awt.Checkbox;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoffeeTea extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoffeeTea frame = new CoffeeTea();
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
	public CoffeeTea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(222, 184, 135));
		panel.setForeground(new Color(211, 211, 211));
		panel.setBounds(10, 10, 666, 773);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(255, 239, 213));
		panel_1.setBounds(32, 48, 186, 260);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("Binary Blend    P89.00");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 152, 166, 18);
		panel_1.add(lblNewLabel);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblQuantity.setBounds(10, 183, 72, 18);
		panel_1.add(lblQuantity);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(107, 180, 49, 28);
		panel_1.add(spinner);
		
		JButton btnBInaryBlend = new JButton("+");
		btnBInaryBlend.setBackground(new Color(233, 150, 122));
		btnBInaryBlend.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBInaryBlend.setBounds(10, 218, 166, 32);
		panel_1.add(btnBInaryBlend);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(10, 9, 166, 122);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Coffee and Tea");
		lblNewLabel_1.setBounds(275, 0, 148, 42);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("STZhongsong", Font.BOLD, 16));
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1.setBounds(246, 48, 186, 260);
		panel.add(panel_1_1);
		
		JLabel lblOverflowLatte = new JLabel("Overflow Latte P79.00");
		lblOverflowLatte.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblOverflowLatte.setBounds(10, 152, 166, 18);
		panel_1_1.add(lblOverflowLatte);
		
		JLabel lblQuantity_1 = new JLabel("Quantity:");
		lblQuantity_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblQuantity_1.setBounds(10, 183, 72, 18);
		panel_1_1.add(lblQuantity_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(107, 180, 49, 28);
		panel_1_1.add(spinner_1);
		
		JButton btnOverflowLatte = new JButton("+");
		btnOverflowLatte.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOverflowLatte.setBackground(new Color(233, 150, 122));
		btnOverflowLatte.setBounds(10, 218, 166, 32);
		panel_1_1.add(btnOverflowLatte);
		
		Panel panel_2_1 = new Panel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(10, 9, 166, 122);
		panel_1_1.add(panel_2_1);
		
		Panel panel_1_1_1 = new Panel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1.setBounds(458, 48, 186, 260);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Debug Decaf P89.00");
		lblNewLabel_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(10, 152, 166, 18);
		panel_1_1_1.add(lblNewLabel_2_1);
		
		JLabel lblQuantity_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblQuantity_1_1.setBounds(10, 183, 72, 18);
		panel_1_1_1.add(lblQuantity_1_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(107, 180, 49, 28);
		panel_1_1_1.add(spinner_1_1);
		
		JButton btnDebugDecaf = new JButton("+");
		btnDebugDecaf.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDebugDecaf.setBackground(new Color(233, 150, 122));
		btnDebugDecaf.setBounds(10, 218, 166, 32);
		panel_1_1_1.add(btnDebugDecaf);
		
		Panel panel_2_1_1 = new Panel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(10, 9, 166, 122);
		panel_1_1_1.add(panel_2_1_1);
		
		Panel panel_1_1_1_1 = new Panel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1.setBounds(32, 336, 186, 260);
		panel.add(panel_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Compiler Chai   P89.00");
		lblNewLabel_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(10, 152, 166, 18);
		panel_1_1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblQuantity_1_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblQuantity_1_1_1.setBounds(10, 183, 72, 18);
		panel_1_1_1_1.add(lblQuantity_1_1_1);
		
		JSpinner spinner_1_1_1 = new JSpinner();
		spinner_1_1_1.setBounds(107, 180, 49, 28);
		panel_1_1_1_1.add(spinner_1_1_1);
		
		JButton btnCompilerChai = new JButton("+");
		btnCompilerChai.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCompilerChai.setBackground(new Color(233, 150, 122));
		btnCompilerChai.setBounds(10, 218, 166, 32);
		panel_1_1_1_1.add(btnCompilerChai);
		
		Panel panel_2_1_1_1 = new Panel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(10, 9, 166, 122);
		panel_1_1_1_1.add(panel_2_1_1_1);
		
		Panel panel_1_1_1_1_1 = new Panel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1_1.setBounds(246, 336, 186, 260);
		panel.add(panel_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Boolean Brew  P79.00");
		lblNewLabel_2_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(10, 152, 166, 18);
		panel_1_1_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblQuantity_1_1_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblQuantity_1_1_1_1.setBounds(10, 183, 72, 18);
		panel_1_1_1_1_1.add(lblQuantity_1_1_1_1);
		
		JSpinner spinner_1_1_1_1 = new JSpinner();
		spinner_1_1_1_1.setBounds(107, 180, 49, 28);
		panel_1_1_1_1_1.add(spinner_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("+");
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1.setBackground(new Color(233, 150, 122));
		btnNewButton_1_1_1_1.setBounds(10, 218, 166, 32);
		panel_1_1_1_1_1.add(btnNewButton_1_1_1_1);
		
		Panel panel_2_1_1_1_1 = new Panel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(10, 9, 166, 122);
		panel_1_1_1_1_1.add(panel_2_1_1_1_1);
		
		Panel panel_1_1_1_1_2 = new Panel();
		panel_1_1_1_1_2.setLayout(null);
		panel_1_1_1_1_2.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1_2.setBounds(458, 336, 186, 260);
		panel.add(panel_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Algo Americano  P89.00");
		lblNewLabel_2_1_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_2_1_1_2.setBounds(10, 152, 166, 18);
		panel_1_1_1_1_2.add(lblNewLabel_2_1_1_2);
		
		JLabel lblQuantity_1_1_1_2 = new JLabel("Quantity:");
		lblQuantity_1_1_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblQuantity_1_1_1_2.setBounds(10, 183, 72, 18);
		panel_1_1_1_1_2.add(lblQuantity_1_1_1_2);
		
		JSpinner spinner_1_1_1_2 = new JSpinner();
		spinner_1_1_1_2.setBounds(107, 180, 49, 28);
		panel_1_1_1_1_2.add(spinner_1_1_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("+");
		btnNewButton_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_2.setBackground(new Color(233, 150, 122));
		btnNewButton_1_1_1_2.setBounds(10, 218, 166, 32);
		panel_1_1_1_1_2.add(btnNewButton_1_1_1_2);
		
		Panel panel_2_1_1_1_2 = new Panel();
		panel_2_1_1_1_2.setLayout(null);
		panel_2_1_1_1_2.setBounds(10, 9, 166, 122);
		panel_1_1_1_1_2.add(panel_2_1_1_1_2);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userPreference cancel = new userPreference();
				cancel.setVisible(true);
				dispose();
				
			}
		});
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCancel.setBounds(338, 697, 306, 42);
		panel.add(btnCancel);
		
		JButton btnViewOrder = new JButton("View Order");
		btnViewOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewOrder order = new ViewOrder();
				order.setVisible(true);
				dispose();
				
			}
		});
		btnViewOrder.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnViewOrder.setBounds(32, 639, 612, 42);
		panel.add(btnViewOrder);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCategories menu = new MenuCategories();
				menu.setVisible(true);
				dispose();
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMenu.setBounds(32, 697, 306, 42);
		panel.add(btnMenu);
	}
}
