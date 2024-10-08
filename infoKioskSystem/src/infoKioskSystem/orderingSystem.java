	package infoKioskSystem;
	
	import java.awt.EventQueue;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JLabel;
	import java.awt.Font;
	import java.awt.Color;
	import javax.swing.border.LineBorder;
	import javax.swing.SwingConstants;
	import java.awt.Panel;
	import javax.swing.JSpinner;
	import javax.swing.JButton;
	import javax.swing.SpinnerNumberModel;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import javax.swing.JTextField;
	import javax.swing.JTextArea;
	
	public class orderingSystem extends javax.swing.JFrame {
	
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField textField;
	    private JTextArea textArea;  // Declare textArea as a class-level variable
	    
	    double totalPrice = 0.0;
	    boolean isBinaryBlendAdded = false;
	    boolean isOverFlowLatteAdded = false;
	
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
	
	        final JSpinner spinnerBinaryBlend = new JSpinner();
	        spinnerBinaryBlend.setModel(new SpinnerNumberModel(0, 0, 20, 1));
	        spinnerBinaryBlend.setFont(new Font("Tahoma", Font.PLAIN, 10));
	        spinnerBinaryBlend.setBounds(93, 155, 42, 21);
	        panel_1_1.add(spinnerBinaryBlend);
	
	        Panel panel_2_1 = new Panel();
	        panel_2_1.setLayout(null);
	        panel_2_1.setBounds(10, 8, 125, 122);
	        panel_1_1.add(panel_2_1);
	
	     // Replace the JCheckBox with a JButton
	        final JButton btnAddToOrder = new JButton("Add to Order");
	        btnAddToOrder.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Integer quantityObj = (Integer) spinnerBinaryBlend.getValue();
	                int quantity = quantityObj.intValue();
	
	                if (quantity > 0) {
	                    double pricePerItem = 89.00;
	                    double itemTotalPrice = pricePerItem * quantity;
	
	                    // Check if the item is already added to the order
	                    if (isBinaryBlendAdded) {
	                        // Update the quantity and total price
	                        String[] lines = textArea.getText().split("\n");
	                        for (int i = 0; i < lines.length; i++) {
	                            if (lines[i].startsWith("Binary Blend")) {
	                                lines[i] = "Binary Blend P89.00 x " + quantity;
	                                break;
	                            }
	                        }
	                        textArea.setText(String.join("\n", lines));
	                        totalPrice += itemTotalPrice - (pricePerItem * (Integer) spinnerBinaryBlend.getPreviousValue());
	                    } else {
	                        // Add the item to the order
	                        textArea.append("Binary Blend P89.00 x " + quantity + "\n");
	                        totalPrice += itemTotalPrice;
	                        isBinaryBlendAdded = true;
	                    }
	
	                    // Update the total price in the JTextField
	                    textField.setText("P" + String.valueOf(totalPrice));
	                }
	            }
	        });
	        btnAddToOrder.setFont(new Font("STZhongsong", Font.PLAIN, 12));
	        btnAddToOrder.setBounds(10, 175, 125, 25);
	        panel_1_1.add(btnAddToOrder);
	        
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
	
	        final JSpinner spinnerOverFlow = new JSpinner();
	        spinnerOverFlow.setModel(new SpinnerNumberModel(0, 0, 20, 1));
	        spinnerOverFlow.setFont(new Font("Tahoma", Font.PLAIN, 10));
	        spinnerOverFlow.setBounds(93, 155, 42, 21);
	        panel_1_1_2.add(spinnerOverFlow);
	
	        Panel panel_2_1_2 = new Panel();
	        panel_2_1_2.setLayout(null);
	        panel_2_1_2.setBounds(10, 10, 125, 122);
	        panel_1_1_2.add(panel_2_1_2);
	
	        // Add to Order button
	        final JButton btnAddToOrder2 = new JButton("Add to Order");
	        btnAddToOrder2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                Integer quantityObj = (Integer) spinnerOverFlow.getValue();
	                int quantity = quantityObj.intValue();
	
	                if (quantity > 0) {
	                    double pricePerItem = 79.00;
	                    double itemTotalPrice = pricePerItem * quantity;
	
	                    // Check if the item is already added to the order
	                    if (isOverFlowLatteAdded) {
	                        // Update the quantity and total price
	                        String[] lines = textArea.getText().split("\n");
	                        for (int i = 0; i < lines.length; i++) {
	                            if (lines[i].startsWith("OverFlow Latte")) {
	                                lines[i] = "OverFlow Latte P79.00 x " + quantity;
	                                break;
	                            }
	                        }
	                        textArea.setText(String.join("\n", lines));
	                        totalPrice += itemTotalPrice - (pricePerItem * (Integer) spinnerOverFlow.getPreviousValue());
	                    } else {
	                        // Add the item to the order
	                        textArea.append("OverFlow Latte P79.00 x " + quantity + "\n");
	                        totalPrice += itemTotalPrice;
	                        isOverFlowLatteAdded = true;
	                    }
	
	                    // Update the total price in the JTextField
	                    textField.setText("P" + String.valueOf(totalPrice));
	                }
	            }
	        });
	        btnAddToOrder2.setFont(new Font("STZhongsong", Font.PLAIN, 12));
	        btnAddToOrder2.setBounds(10, 175, 125, 25);
	        panel_1_1_2.add(btnAddToOrder2);
	        
	        
			
	
	        
	        
	        
	        
	
	        JLabel lblCoffeAndTea = new JLabel("COFFEE and TEA");
	        lblCoffeAndTea.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	        lblCoffeAndTea.setBounds(10, 34, 120, 13);
	        panel_2.add(lblCoffeAndTea);
	
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
	        btnReceipt.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Clear the text area first
	                textArea.setText("");
	                
	                // Check if "Add to Order" is selected
	             // Check if "Add to Order" is selected
	                if (btnAddToOrder.isSelected()) {
	                    // Get the quantity from the spinner
	                	Integer quantityObj = (Integer) spinnerBinaryBlend.getValue();
	                	int quantity = quantityObj.intValue();
	                    
	                    // Check if quantity is greater than 0
	                    if (quantity > 0) {
	                        // Calculate the total price for the item
	                        double pricePerItem = 89.00;
	                        double totalPrice = pricePerItem * quantity;
	                        
	                        // Update the receipt text area
	                     // Update the receipt text area
	                        textArea.append("Binary Blend P89.00 x " + quantity + "\n");
	                        textArea.append("Total: P" + String.valueOf(totalPrice) + "\n");                      
	                    }
	                }
	            }
	        });
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
	        textField.setText("0.00");  // Initial total price
	        textField.setHorizontalAlignment(SwingConstants.CENTER);
	        textField.setBackground(new Color(255, 250, 240));
	        textField.setEditable(false);
	        textField.setColumns(10);
	
	        JLabel lblQuantity_1_1_1_1_1_1 = new JLabel("Total Price: ");
	        lblQuantity_1_1_1_1_1_1.setBounds(10, 726, 105, 38);
	        panel_4.add(lblQuantity_1_1_1_1_1_1);
	        lblQuantity_1_1_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
	
	        textArea = new JTextArea();  // Initialize textArea
	        textArea.setBounds(10, 10, 363, 706);
	        textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
	        panel_4.add(textArea);
	    }
	}
	
	
	
	
