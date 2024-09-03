package infoKioskSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JSpinner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class orderingSystem extends javax.swing.JFrame {

	public void setImage() {
	//	ImageIcon icon = new ImageIcon(getClass().getResource("insert image link"));
		
		
	}
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderingSystem frame = new orderingSystem();
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
	public orderingSystem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1040, 917);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 623, 880);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(119, 136, 153), 1, true));
		panel_1.setBackground(new Color(255, 235, 205));
		panel_1.setBounds(0, 0, 621, 42);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bitwise Brew");
		lblNewLabel.setFont(new Font("STZhongsong", Font.PLAIN, 17));
		lblNewLabel.setBounds(36, 10, 123, 27);
		panel_1.add(lblNewLabel);
		
		Panel panel_2 = new Panel();
		panel_2.setLayout(null);
		panel_2.setForeground(new Color(211, 211, 211));
		panel_2.setBackground(new Color(222, 184, 135));
		panel_2.setBounds(0, 48, 621, 719);
		panel.add(panel_2);
		
		Panel panel_1_1 = new Panel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1.setBounds(10, 49, 145, 203);
		panel_2.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Binary Blend    P89.00");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 136, 125, 18);
		panel_1_1.add(lblNewLabel_1);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity.setBounds(10, 155, 72, 18);
		panel_1_1.add(lblQuantity);
		
		JSpinner spinnerBinaryBlend = new JSpinner();
		spinnerBinaryBlend.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBinaryBlend.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBinaryBlend.setBounds(93, 155, 42, 21);
		panel_1_1.add(spinnerBinaryBlend);
		
		Panel panel_2_1 = new Panel();
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(10, 8, 125, 122);
		panel_1_1.add(panel_2_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox.setBounds(93, 175, 21, 25);
		panel_1_1.add(chckbxNewCheckBox);
		
		JLabel lblAddToOrder = new JLabel("Add to Order");
		lblAddToOrder.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder.setBounds(10, 172, 82, 28);
		panel_1_1.add(lblAddToOrder);
		
		Panel panel_1_1_2 = new Panel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(new Color(255, 239, 213));
		panel_1_1_2.setBounds(161, 49, 145, 203);
		panel_2.add(panel_1_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("OverFlow Latte   P79.00");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2.setBounds(10, 136, 135, 18);
		panel_1_1_2.add(lblNewLabel_1_2);
		
		JLabel lblQuantity_2 = new JLabel("Quantity:");
		lblQuantity_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_2.setBounds(10, 155, 72, 18);
		panel_1_1_2.add(lblQuantity_2);
		
		JSpinner spinnerOverFlow = new JSpinner();
		spinnerOverFlow.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerOverFlow.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerOverFlow.setBounds(93, 155, 42, 21);
		panel_1_1_2.add(spinnerOverFlow);
		
		Panel panel_2_1_2 = new Panel();
		panel_2_1_2.setLayout(null);
		panel_2_1_2.setBounds(10, 10, 125, 122);
		panel_1_1_2.add(panel_2_1_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_1.setBounds(93, 175, 21, 25);
		panel_1_1_2.add(chckbxNewCheckBox_1);
		
		JLabel lblAddToOrder_1 = new JLabel("Add to Order");
		lblAddToOrder_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_1.setBounds(10, 172, 82, 28);
		panel_1_1_2.add(lblAddToOrder_1);
		
		Panel panel_1_1_2_1 = new Panel();
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBackground(new Color(255, 239, 213));
		panel_1_1_2_1.setBounds(312, 49, 145, 203);
		panel_2.add(panel_1_1_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Boolean Brew   P79.00");
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_1.setBounds(10, 136, 135, 18);
		panel_1_1_2_1.add(lblNewLabel_1_2_1);
		
		JLabel lblQuantity_2_1 = new JLabel("Quantity:");
		lblQuantity_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_2_1.setBounds(10, 155, 72, 18);
		panel_1_1_2_1.add(lblQuantity_2_1);
		
		JSpinner spinnerBooleanBrew = new JSpinner();
		spinnerBooleanBrew.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBooleanBrew.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBooleanBrew.setBounds(93, 155, 42, 21);
		panel_1_1_2_1.add(spinnerBooleanBrew);
		
		Panel panel_2_1_2_1 = new Panel();
		panel_2_1_2_1.setLayout(null);
		panel_2_1_2_1.setBounds(10, 8, 125, 122);
		panel_1_1_2_1.add(panel_2_1_2_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_1_1.setBounds(93, 175, 21, 25);
		panel_1_1_2_1.add(chckbxNewCheckBox_1_1);
		
		JLabel lblAddToOrder_1_1 = new JLabel("Add to Order");
		lblAddToOrder_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_1_1.setBounds(10, 172, 82, 28);
		panel_1_1_2_1.add(lblAddToOrder_1_1);
		
		Panel panel_1_1_2_1_1 = new Panel();
		panel_1_1_2_1_1.setLayout(null);
		panel_1_1_2_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_2_1_1.setBounds(463, 49, 145, 203);
		panel_2.add(panel_1_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Compiler Chai   P89.00");
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_1_1.setBounds(10, 136, 135, 18);
		panel_1_1_2_1_1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblQuantity_2_1_1 = new JLabel("Quantity:");
		lblQuantity_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_2_1_1.setBounds(10, 155, 72, 18);
		panel_1_1_2_1_1.add(lblQuantity_2_1_1);
		
		JSpinner spinnerComChai = new JSpinner();
		spinnerComChai.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerComChai.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerComChai.setBounds(93, 155, 42, 21);
		panel_1_1_2_1_1.add(spinnerComChai);
		
		Panel panel_2_1_2_1_1 = new Panel();
		panel_2_1_2_1_1.setLayout(null);
		panel_2_1_2_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_2_1_1.add(panel_2_1_2_1_1);
		
		JCheckBox chckbxNewCheckBox_1_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_1_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_1_1_1.setBounds(93, 175, 21, 25);
		panel_1_1_2_1_1.add(chckbxNewCheckBox_1_1_1);
		
		JLabel lblAddToOrder_1_1_1 = new JLabel("Add to Order");
		lblAddToOrder_1_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_1_1_1.setBounds(10, 172, 82, 28);
		panel_1_1_2_1_1.add(lblAddToOrder_1_1_1);
		
		Panel panel_1_1_1 = new Panel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1.setBounds(10, 271, 145, 203);
		panel_2.add(panel_1_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("CodeCrunch    P49.00");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3.setBounds(10, 136, 125, 18);
		panel_1_1_1.add(lblNewLabel_1_3);
		
		JLabel lblQuantity_1 = new JLabel("Quantity:");
		lblQuantity_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_1.setBounds(10, 155, 72, 18);
		panel_1_1_1.add(lblQuantity_1);
		
		JSpinner spinnerBinaryBlend_1 = new JSpinner();
		spinnerBinaryBlend_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBinaryBlend_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBinaryBlend_1.setBounds(93, 155, 42, 21);
		panel_1_1_1.add(spinnerBinaryBlend_1);
		
		Panel panel_2_1_1 = new Panel();
		panel_2_1_1.setLayout(null);
		panel_2_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_1.add(panel_2_1_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_2.setBounds(93, 175, 21, 25);
		panel_1_1_1.add(chckbxNewCheckBox_2);
		
		JLabel lblAddToOrder_2 = new JLabel("Add to Order");
		lblAddToOrder_2.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_2.setBounds(10, 172, 82, 28);
		panel_1_1_1.add(lblAddToOrder_2);
		
		Panel panel_1_1_2_2 = new Panel();
		panel_1_1_2_2.setLayout(null);
		panel_1_1_2_2.setBackground(new Color(255, 239, 213));
		panel_1_1_2_2.setBounds(161, 271, 145, 203);
		panel_2.add(panel_1_1_2_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Debug Kit         P59.00");
		lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_2.setBounds(10, 136, 135, 18);
		panel_1_1_2_2.add(lblNewLabel_1_2_2);
		
		JLabel lblQuantity_2_2 = new JLabel("Quantity:");
		lblQuantity_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_2_2.setBounds(10, 155, 72, 18);
		panel_1_1_2_2.add(lblQuantity_2_2);
		
		JSpinner spinnerOverFlow_1 = new JSpinner();
		spinnerOverFlow_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerOverFlow_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerOverFlow_1.setBounds(93, 155, 42, 21);
		panel_1_1_2_2.add(spinnerOverFlow_1);
		
		Panel panel_2_1_2_2 = new Panel();
		panel_2_1_2_2.setLayout(null);
		panel_2_1_2_2.setBounds(10, 8, 125, 122);
		panel_1_1_2_2.add(panel_2_1_2_2);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("");
		chckbxNewCheckBox_1_2.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_1_2.setBounds(93, 175, 21, 25);
		panel_1_1_2_2.add(chckbxNewCheckBox_1_2);
		
		JLabel lblAddToOrder_1_2 = new JLabel("Add to Order");
		lblAddToOrder_1_2.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_1_2.setBounds(10, 172, 82, 28);
		panel_1_1_2_2.add(lblAddToOrder_1_2);
		
		Panel panel_1_1_2_2_1 = new Panel();
		panel_1_1_2_2_1.setLayout(null);
		panel_1_1_2_2_1.setBackground(new Color(255, 239, 213));
		panel_1_1_2_2_1.setBounds(312, 271, 145, 203);
		panel_2.add(panel_1_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("CodeCracker     P49.00");
		lblNewLabel_1_2_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_2_1.setBounds(10, 136, 135, 18);
		panel_1_1_2_2_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblQuantity_2_2_1 = new JLabel("Quantity:");
		lblQuantity_2_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_2_2_1.setBounds(10, 155, 72, 18);
		panel_1_1_2_2_1.add(lblQuantity_2_2_1);
		
		JSpinner spinnerOverFlow_1_1 = new JSpinner();
		spinnerOverFlow_1_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerOverFlow_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerOverFlow_1_1.setBounds(93, 155, 42, 21);
		panel_1_1_2_2_1.add(spinnerOverFlow_1_1);
		
		Panel panel_2_1_2_2_1 = new Panel();
		panel_2_1_2_2_1.setLayout(null);
		panel_2_1_2_2_1.setBounds(10, 8, 125, 122);
		panel_1_1_2_2_1.add(panel_2_1_2_2_1);
		
		JCheckBox chckbxNewCheckBox_1_2_1 = new JCheckBox("");
		chckbxNewCheckBox_1_2_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_1_2_1.setBounds(93, 175, 21, 25);
		panel_1_1_2_2_1.add(chckbxNewCheckBox_1_2_1);
		
		JLabel lblAddToOrder_1_2_1 = new JLabel("Add to Order");
		lblAddToOrder_1_2_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_1_2_1.setBounds(10, 172, 82, 28);
		panel_1_1_2_2_1.add(lblAddToOrder_1_2_1);
		
		Panel panel_1_1_2_2_1_1 = new Panel();
		panel_1_1_2_2_1_1.setLayout(null);
		panel_1_1_2_2_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_2_2_1_1.setBounds(463, 271, 145, 203);
		panel_2.add(panel_1_1_2_2_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Syntax Smoothie P49.00");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_2_2_1_1.setBounds(10, 136, 135, 18);
		panel_1_1_2_2_1_1.add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblQuantity_2_2_1_1 = new JLabel("Quantity:");
		lblQuantity_2_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_2_2_1_1.setBounds(10, 155, 72, 18);
		panel_1_1_2_2_1_1.add(lblQuantity_2_2_1_1);
		
		JSpinner spinnerOverFlow_1_1_1 = new JSpinner();
		spinnerOverFlow_1_1_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerOverFlow_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerOverFlow_1_1_1.setBounds(93, 155, 42, 21);
		panel_1_1_2_2_1_1.add(spinnerOverFlow_1_1_1);
		
		Panel panel_2_1_2_2_1_1 = new Panel();
		panel_2_1_2_2_1_1.setLayout(null);
		panel_2_1_2_2_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_2_2_1_1.add(panel_2_1_2_2_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2_1_1 = new JCheckBox("");
		chckbxNewCheckBox_1_2_1_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_1_2_1_1.setBounds(93, 175, 21, 25);
		panel_1_1_2_2_1_1.add(chckbxNewCheckBox_1_2_1_1);
		
		JLabel lblAddToOrder_1_2_1_1 = new JLabel("Add to Order");
		lblAddToOrder_1_2_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_1_2_1_1.setBounds(10, 172, 82, 28);
		panel_1_1_2_2_1_1.add(lblAddToOrder_1_2_1_1);
		
		Panel panel_1_1_1_1 = new Panel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1.setBounds(10, 494, 145, 203);
		panel_2.add(panel_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("BugLava            P49.00");
		lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1.setBounds(10, 136, 125, 18);
		panel_1_1_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblQuantity_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_1_1.setBounds(10, 155, 72, 18);
		panel_1_1_1_1.add(lblQuantity_1_1);
		
		JSpinner spinnerBinaryBlend_1_1 = new JSpinner();
		spinnerBinaryBlend_1_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBinaryBlend_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBinaryBlend_1_1.setBounds(93, 155, 42, 21);
		panel_1_1_1_1.add(spinnerBinaryBlend_1_1);
		
		Panel panel_2_1_1_1 = new Panel();
		panel_2_1_1_1.setLayout(null);
		panel_2_1_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_1_1.add(panel_2_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("");
		chckbxNewCheckBox_2_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_2_1.setBounds(93, 175, 21, 25);
		panel_1_1_1_1.add(chckbxNewCheckBox_2_1);
		
		JLabel lblAddToOrder_2_1 = new JLabel("Add to Order");
		lblAddToOrder_2_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_2_1.setBounds(10, 172, 82, 28);
		panel_1_1_1_1.add(lblAddToOrder_2_1);
		
		Panel panel_1_1_1_1_1 = new Panel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1_1.setBounds(161, 494, 145, 203);
		panel_2.add(panel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Byte bItes         P59.00");
		lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_1.setBounds(10, 136, 125, 18);
		panel_1_1_1_1_1.add(lblNewLabel_1_3_1_1);
		
		JLabel lblQuantity_1_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_1_1_1.setBounds(10, 155, 72, 18);
		panel_1_1_1_1_1.add(lblQuantity_1_1_1);
		
		JSpinner spinnerBinaryBlend_1_1_1 = new JSpinner();
		spinnerBinaryBlend_1_1_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBinaryBlend_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBinaryBlend_1_1_1.setBounds(93, 155, 42, 21);
		panel_1_1_1_1_1.add(spinnerBinaryBlend_1_1_1);
		
		Panel panel_2_1_1_1_1 = new Panel();
		panel_2_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_1_1_1.add(panel_2_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1_1 = new JCheckBox("");
		chckbxNewCheckBox_2_1_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_2_1_1.setBounds(93, 175, 21, 25);
		panel_1_1_1_1_1.add(chckbxNewCheckBox_2_1_1);
		
		JLabel lblAddToOrder_2_1_1 = new JLabel("Add to Order");
		lblAddToOrder_2_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_2_1_1.setBounds(10, 172, 82, 28);
		panel_1_1_1_1_1.add(lblAddToOrder_2_1_1);
		
		Panel panel_1_1_1_1_1_1 = new Panel();
		panel_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1_1_1.setBounds(312, 494, 145, 203);
		panel_2.add(panel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Glitch Cookies  P59.00");
		lblNewLabel_1_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_1_1.setBounds(10, 136, 125, 18);
		panel_1_1_1_1_1_1.add(lblNewLabel_1_3_1_1_1);
		
		JLabel lblQuantity_1_1_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_1_1_1_1.setBounds(10, 155, 72, 18);
		panel_1_1_1_1_1_1.add(lblQuantity_1_1_1_1);
		
		JSpinner spinnerBinaryBlend_1_1_1_1 = new JSpinner();
		spinnerBinaryBlend_1_1_1_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBinaryBlend_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBinaryBlend_1_1_1_1.setBounds(93, 155, 42, 21);
		panel_1_1_1_1_1_1.add(spinnerBinaryBlend_1_1_1_1);
		
		Panel panel_2_1_1_1_1_1 = new Panel();
		panel_2_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_1_1_1_1.add(panel_2_1_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_1_1_1 = new JCheckBox("");
		chckbxNewCheckBox_2_1_1_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_2_1_1_1.setBounds(93, 175, 21, 25);
		panel_1_1_1_1_1_1.add(chckbxNewCheckBox_2_1_1_1);
		
		JLabel lblAddToOrder_2_1_1_1 = new JLabel("Add to Order");
		lblAddToOrder_2_1_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_2_1_1_1.setBounds(10, 172, 82, 28);
		panel_1_1_1_1_1_1.add(lblAddToOrder_2_1_1_1);
		
		Panel panel_1_1_1_1_1_1_1 = new Panel();
		panel_1_1_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1_1_1.setBackground(new Color(255, 239, 213));
		panel_1_1_1_1_1_1_1.setBounds(463, 494, 145, 203);
		panel_2.add(panel_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1_1_1_1 = new JLabel("Hash Truffle      P49.00");
		lblNewLabel_1_3_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
		lblNewLabel_1_3_1_1_1_1.setBounds(10, 136, 125, 18);
		panel_1_1_1_1_1_1_1.add(lblNewLabel_1_3_1_1_1_1);
		
		JLabel lblQuantity_1_1_1_1_1 = new JLabel("Quantity:");
		lblQuantity_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantity_1_1_1_1_1.setBounds(10, 155, 72, 18);
		panel_1_1_1_1_1_1_1.add(lblQuantity_1_1_1_1_1);
		
		JSpinner spinnerBinaryBlend_1_1_1_1_1 = new JSpinner();
		spinnerBinaryBlend_1_1_1_1_1.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		spinnerBinaryBlend_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinnerBinaryBlend_1_1_1_1_1.setBounds(93, 155, 42, 21);
		panel_1_1_1_1_1_1_1.add(spinnerBinaryBlend_1_1_1_1_1);
		
		Panel panel_2_1_1_1_1_1_1 = new Panel();
		panel_2_1_1_1_1_1_1.setLayout(null);
		panel_2_1_1_1_1_1_1.setBounds(10, 8, 125, 122);
		panel_1_1_1_1_1_1_1.add(panel_2_1_1_1_1_1_1);
		
		
		
		JCheckBox chckbxNewCheckBox_2_1_1_1_1 = new JCheckBox("");
		chckbxNewCheckBox_2_1_1_1_1.setBackground(new Color(255, 239, 213));
		chckbxNewCheckBox_2_1_1_1_1.setBounds(93, 175, 21, 25);
		panel_1_1_1_1_1_1_1.add(chckbxNewCheckBox_2_1_1_1_1);
		
		JLabel lblAddToOrder_2_1_1_1_1 = new JLabel("Add to Order");
		lblAddToOrder_2_1_1_1_1.setFont(new Font("STZhongsong", Font.PLAIN, 12));
		lblAddToOrder_2_1_1_1_1.setBounds(10, 172, 82, 28);
		panel_1_1_1_1_1_1_1.add(lblAddToOrder_2_1_1_1_1);
		
		JLabel lblCoffeAndTea = new JLabel("COFFEE and TEA");
		lblCoffeAndTea.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblCoffeAndTea.setBounds(10, 34, 120, 13);
		panel_2.add(lblCoffeAndTea);
		
		JLabel lblPastriesAndTreats = new JLabel("PASTRIES and TREATS");
		lblPastriesAndTreats.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblPastriesAndTreats.setBounds(10, 480, 155, 13);
		panel_2.add(lblPastriesAndTreats);
		
		JLabel lblSandwichSalad = new JLabel("SANDWICHES and SALADS");
		lblSandwichSalad.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblSandwichSalad.setBounds(10, 258, 179, 13);
		panel_2.add(lblSandwichSalad);
		
		JLabel lblNewLabel_1_1 = new JLabel("MENU");
		lblNewLabel_1_1.setBounds(10, 0, 611, 42);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("STZhongsong", Font.BOLD, 16));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.GRAY));
		panel_3.setBounds(0, 783, 621, 87);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userPreference userPref = new userPreference();
				userPref.setVisible(true);
				dispose();
			}
		});
		btnCancel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.setBounds(10, 10, 191, 67);
		panel_3.add(btnCancel);
		
		JButton btnTotal = new JButton("TOTAL");
		btnTotal.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnTotal.setBackground(new Color(144, 238, 144));
		btnTotal.setBounds(419, 10, 192, 67);
		panel_3.add(btnTotal);
		
		JButton btnReceipt = new JButton("RECEIPT");
		btnReceipt.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		btnReceipt.setBackground(new Color(0, 191, 255));
		btnReceipt.setBounds(211, 10, 198, 67);
		panel_3.add(btnReceipt);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(253, 245, 230));
		panel_4.setBounds(633, 10, 383, 860);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(196, 726, 177, 38);
		panel_4.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("0.00");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(255, 250, 240));
		textField.setEditable(false);
		textField.setColumns(10);
		
		JLabel lblQuantity_1_1_1_1_1_1 = new JLabel("Total Price: ");
		lblQuantity_1_1_1_1_1_1.setBounds(10, 726, 105, 38);
		panel_4.add(lblQuantity_1_1_1_1_1_1);
		lblQuantity_1_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 10, 363, 706);
		panel_4.add(textArea);
		
		
	}
	
	
}
