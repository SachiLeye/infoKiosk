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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class userPreference extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtUsername;
    private JButton btnDineIn;
    private JButton btnTakeOut;

    // Database connection object
    private db_connect db;

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
        // Initialize the database connection
        db = new db_connect();
        db.connect();

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

        btnDineIn = new JButton("Dine In");
        btnDineIn.setFont(new Font("Snap ITC", Font.PLAIN, 17));
        btnDineIn.setBounds(230, 380, 251, 55);
        btnDineIn.setEnabled(false); // Initially disabled
        contentPane.add(btnDineIn);

        btnTakeOut = new JButton("Take Out");
        btnTakeOut.setFont(new Font("Snap ITC", Font.PLAIN, 17));
        btnTakeOut.setBounds(230, 481, 251, 55);
        btnTakeOut.setEnabled(false); // Initially disabled
        contentPane.add(btnTakeOut);

        btnDineIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveorderPreference("Dine In"); // Save the username and preference to the database
               orderingSystem ordering = new orderingSystem();
                ordering.setVisible(true);
                dispose();
            }
        });

        btnTakeOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveorderPreference("Take Out"); // Save the username and preference to the database
                orderingSystem ordering = new orderingSystem();
                ordering.setVisible(true);
                dispose();
            }
        });

        // Add document listener to username field
        txtUsername.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                updateButtonStates();
            }

            public void removeUpdate(DocumentEvent e) {
                updateButtonStates();
            }

            public void changedUpdate(DocumentEvent e) {
                updateButtonStates();
            }
        });
    }

    // Method to update button states based on username field
    private void updateButtonStates() {
        String username = txtUsername.getText().trim();
        boolean isNotEmpty = !username.isEmpty();
        btnDineIn.setEnabled(isNotEmpty);
        btnTakeOut.setEnabled(isNotEmpty);
    }

    // Method to save the username and preference to the database
    private void saveorderPreference(String preference) {
        String username = txtUsername.getText().trim();

        if (username.isEmpty()) {
            return; // Exit if the username field is empty
        }

        try {
            // Insert the username and preference into the database
            String query = "INSERT INTO user (userName, orderPreference) VALUES (?, ?)";
            PreparedStatement stmt = db.con.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, preference);
            stmt.executeUpdate();
            System.out.println("Username and preference saved successfully.");
        } catch (Exception e) {
            System.err.println("Error saving user preference to the database.");
            e.printStackTrace();
        }
    }
}
