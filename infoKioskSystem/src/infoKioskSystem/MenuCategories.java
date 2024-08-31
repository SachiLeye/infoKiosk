package infoKioskSystem;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

import infoKioskSystem.CoffeeTea;
public class MenuCategories extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCategories frame = new MenuCategories();
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
	public MenuCategories() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 830);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCoffeeTea = new JButton("Coffee and Tea");
		btnCoffeeTea.setBackground(new Color(222, 184, 135));
		btnCoffeeTea.setForeground(new Color(128, 64, 0));
		btnCoffeeTea.setBounds(107, 166, 207, 228);
		contentPane.add(btnCoffeeTea);
		
		JButton btnPastriesAndTreats = new JButton("Pastries and Treats");
		btnPastriesAndTreats.setForeground(new Color(128, 64, 0));
		btnPastriesAndTreats.setBackground(new Color(222, 184, 135));
		btnPastriesAndTreats.setBounds(364, 166, 207, 228);
		contentPane.add(btnPastriesAndTreats);
		
		JButton btnSandwichSalad = new JButton("Sandwiches and Salads");
		btnSandwichSalad.setForeground(new Color(128, 64, 0));
		btnSandwichSalad.setBackground(new Color(222, 184, 135));
		btnSandwichSalad.setBounds(107, 442, 207, 228);
		contentPane.add(btnSandwichSalad);
		
		JButton btnCancel = new JButton("x Cancel");
		btnCancel.setForeground(new Color(128, 64, 0));
		btnCancel.setBackground(new Color(222, 184, 135));
		btnCancel.setBounds(364, 442, 207, 228);
		contentPane.add(btnCancel);
		
		btnCoffeeTea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CoffeeTea coffeeTea = new CoffeeTea();
				coffeeTea.setVisible(true);
				dispose(); 
			}
		});
	}
}
