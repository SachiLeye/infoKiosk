package infoKioskSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewOrder extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewOrder frame = new ViewOrder();
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
	public ViewOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setLayout(null);
		panel.setForeground(new Color(211, 211, 211));
		panel.setBackground(new Color(222, 184, 135));
		panel.setBounds(10, 10, 666, 773);
		contentPane.add(panel);
		
		JButton btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(338, 697, 306, 42);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_2 = new JButton("Menu");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2_2.setBounds(32, 697, 306, 42);
		panel.add(btnNewButton_2_2);
		
		JPanel panelOrders = new JPanel();
		panelOrders.setBackground(new Color(250, 235, 215));
		panelOrders.setBounds(28, 26, 610, 610);
		panel.add(panelOrders);
		panelOrders.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Product");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel.setBounds(47, 40, 75, 21);
		panelOrders.add(lblNewLabel);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblQuantity.setBounds(252, 40, 75, 21);
		panelOrders.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblPrice.setBounds(480, 40, 75, 21);
		panelOrders.add(lblPrice);
		
		JLabel lblNewLabel_2_1 = new JLabel("Total Price: ");
		lblNewLabel_2_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(47, 501, 110, 21);
		panelOrders.add(lblNewLabel_2_1);
		
		JComboBox cmbPaymentMethod = new JComboBox();
		cmbPaymentMethod.setBounds(363, 545, 226, 36);
		panelOrders.add(cmbPaymentMethod);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Payment Method:");
		lblNewLabel_2_1_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(47, 546, 138, 21);
		panelOrders.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_2_2_1 = new JButton(">>Order Complete<<");
		btnNewButton_2_2_1.setBounds(28, 636, 610, 42);
		panel.add(btnNewButton_2_2_1);
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
	}
}
