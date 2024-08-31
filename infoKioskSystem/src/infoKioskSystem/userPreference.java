package infoKioskSystem;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import infoKioskSystem.MenuCategories;//importing menu frame\
import java.util.Scanner;


public class userPreference extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userPreference frame = new userPreference();
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
	public userPreference() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 894);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 113, 91));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBitwiseBrew = new JLabel("Bitwise Brew!");
		lblBitwiseBrew.setForeground(new Color(128, 64, 0));
		lblBitwiseBrew.setFont(new Font("Snap ITC", Font.BOLD, 39));
		lblBitwiseBrew.setBounds(199, 141, 355, 96);
		contentPane.add(lblBitwiseBrew);
		
		txtUsername = new JTextField();
		txtUsername.setForeground(new Color(128, 128, 128));
		txtUsername.setBackground(new Color(255, 255, 255));
		txtUsername.setFont(new Font("SimSun", Font.PLAIN, 18));
		txtUsername.setBounds(230, 232, 251, 38);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JButton btnDineIn = new JButton("Dine In");
		btnDineIn.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnDineIn.setBounds(230, 380, 251, 55);
		contentPane.add(btnDineIn);
		
		JButton btnTakeOut = new JButton("Take Out");
		btnTakeOut.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnTakeOut.setBounds(230, 481, 251, 55);
		contentPane.add(btnTakeOut);
		
		btnDineIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCategories menuCategories = new MenuCategories();
				menuCategories.setVisible(true);
				dispose(); 
			}
		});
		
		btnTakeOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCategories menuCategories = new MenuCategories();
				menuCategories.setVisible(true);
				dispose(); 
			}
		});
	}
}