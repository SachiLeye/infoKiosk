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

public class Ordering extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextArea textArea;  // Declare textArea as a class-level variable
    
    double totalPrice = 0.0;
    boolean isBinaryBlendAdded = false;
    boolean isOverFlowLatteAdded = false;
    boolean isBooleanBrewAdded = false;
    boolean isCompilerChaiAdded = false;
    boolean isDebugKitAdded = false;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Ordering frame = new Ordering();
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
    public Ordering() {
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

        Panel panelBinaryBlend = new Panel();
        panelBinaryBlend.setLayout(null);
        panelBinaryBlend.setBackground(new Color(255, 239, 213));
        panelBinaryBlend.setBounds(85, 53, 145, 203);
        panel_2.add(panelBinaryBlend);

        JLabel lblNewLabel_1 = new JLabel("Binary Blend    P89.00");
        lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1.setBounds(10, 136, 125, 18);
        panelBinaryBlend.add(lblNewLabel_1);

        JLabel lblQuantity = new JLabel("Quantity:");
        lblQuantity.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity.setBounds(10, 155, 72, 18);
        panelBinaryBlend.add(lblQuantity);

        final JSpinner spinnerBinaryBlend = new JSpinner();
        spinnerBinaryBlend.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerBinaryBlend.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerBinaryBlend.setBounds(93, 155, 42, 21);
        panelBinaryBlend.add(spinnerBinaryBlend);

        Panel panel_2_1 = new Panel();
        panel_2_1.setLayout(null);
        panel_2_1.setBounds(10, 8, 125, 122);
        panelBinaryBlend.add(panel_2_1);

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
        btnAddToOrder.setBounds(0, 178, 145, 25);
        panelBinaryBlend.add(btnAddToOrder);
        
        Panel panelLatte = new Panel();
        panelLatte.setLayout(null);
        panelLatte.setBackground(new Color(255, 239, 213));
        panelLatte.setBounds(236, 53, 145, 203);
        panel_2.add(panelLatte);

        JLabel lblNewLabel_1_2 = new JLabel("OverFlow Latte   P79.00");
        lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_2.setBounds(10, 136, 135, 18);
        panelLatte.add(lblNewLabel_1_2);

        JLabel lblQuantity_2 = new JLabel("Quantity:");
        lblQuantity_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_2.setBounds(10, 155, 72, 18);
        panelLatte.add(lblQuantity_2);

        final JSpinner spinnerOverFlow = new JSpinner();
        spinnerOverFlow.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerOverFlow.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerOverFlow.setBounds(93, 155, 42, 21);
        panelLatte.add(spinnerOverFlow);

        Panel panel_2_1_2 = new Panel();
        panel_2_1_2.setLayout(null);
        panel_2_1_2.setBounds(10, 10, 125, 122);
        panelLatte.add(panel_2_1_2);

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
        btnAddToOrder2.setBounds(0, 178, 145, 25);
        panelLatte.add(btnAddToOrder2);
        
       
        
        Panel panelBoolBrew = new Panel();
        panelBoolBrew.setLayout(null);
        panelBoolBrew.setBackground(new Color(255, 239, 213));
        panelBoolBrew.setBounds(387, 53, 145, 203);
        panel_2.add(panelBoolBrew);

        JLabel lblNewLabel_1_2_1 = new JLabel("Boolean Brew   P79.00");
        lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_2_1.setBounds(10, 136, 135, 18);
        panelBoolBrew.add(lblNewLabel_1_2_1);

        JLabel lblQuantity_2_1 = new JLabel("Quantity:");
        lblQuantity_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_2_1.setBounds(10, 155, 72, 18);
        panelBoolBrew.add(lblQuantity_2_1);

        final JSpinner spinnerBooleanBrew = new JSpinner();
        spinnerBooleanBrew.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerBooleanBrew.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerBooleanBrew.setBounds(93, 155, 42, 21);
        panelBoolBrew.add(spinnerBooleanBrew);

        
        
        Panel panel_2_1_2_1 = new Panel();
        panel_2_1_2_1.setLayout(null);
        panel_2_1_2_1.setBounds(10, 8, 125, 122);
        panelBoolBrew.add(panel_2_1_2_1);
        
        JButton btnAddToOrder3 = new JButton("Add to Order");
        btnAddToOrder3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Integer quantityObj = (Integer) spinnerBooleanBrew.getValue();
                int quantity = quantityObj.intValue();

                if (quantity > 0) {
                    double pricePerItem = 79.00;
                    double itemTotalPrice = pricePerItem * quantity;

                    // Check if the item is already added to the order
                    if (isOverFlowLatteAdded) {
                        // Update the quantity and total price
                        String[] lines = textArea.getText().split("\n");
                        for (int i = 0; i < lines.length; i++) {
                            if (lines[i].startsWith("Boolean Brew")) {
                                lines[i] = "Boolean Brew P79.00 x " + quantity;
                                break;
                            }
                        }
                        textArea.setText(String.join("\n", lines));
                        totalPrice += itemTotalPrice - (pricePerItem * (Integer) spinnerBooleanBrew.getPreviousValue());
                    } else {
                        // Add the item to the order
                        textArea.append("Boolean Brew P79.00 x " + quantity + "\n");
                        totalPrice += itemTotalPrice;
                        isOverFlowLatteAdded = true;
                    }

                    // Update the total price in the JTextField
                    textField.setText("P" + String.valueOf(totalPrice));
                }
            }
        });
        btnAddToOrder3.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddToOrder3.setBounds(0, 178, 145, 25);
        panelBoolBrew.add(btnAddToOrder3);

        
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
                // Assuming userPreference is another JFrame class
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
            private JSpinner spinnerComChai;
			private JSpinner spinnerDebugKit;

			public void actionPerformed(ActionEvent e) {
                // Clear the text area first
                textArea.setText("");
                
                // Update receipt based on items added
                if (isBinaryBlendAdded) {
                    Integer quantityObj = (Integer) spinnerBinaryBlend.getValue();
                    int quantity = quantityObj.intValue();
                    
                    if (quantity > 0) {
                        double pricePerItem = 89.00;
                        double itemTotalPrice = pricePerItem * quantity;
                        
                        // Update the receipt text area
                        textArea.append("Binary Blend P89.00 x " + quantity + "\n");
                        textArea.append("Total: P" + String.valueOf(itemTotalPrice) + "\n");                      
                    }
                }

                
                if (isOverFlowLatteAdded) {
                    Integer quantityObj = (Integer) spinnerOverFlow.getValue();
                    int quantity = quantityObj.intValue();
                    
                    if (quantity > 0) {
                        double pricePerItem = 79.00;
                        double itemTotalPrice = pricePerItem * quantity;
                        
                        // Update the receipt text area
                        textArea.append("OverFlow Latte P79.00 x " + quantity + "\n");
                        textArea.append("Total: P" + String.valueOf(itemTotalPrice) + "\n");                      
                    }
                }
                
                if (isBooleanBrewAdded) {
                    Integer quantityObj = (Integer) spinnerBooleanBrew.getValue();
                    int quantity = quantityObj.intValue();
                    
                    if (quantity > 0) {
                        double pricePerItem = 79.00;
                        double itemTotalPrice = pricePerItem * quantity;
                        
                        // Update the receipt text area
                        textArea.append("OverFlow Latte P79.00 x " + quantity + "\n");
                        textArea.append("Total: P" + String.valueOf(itemTotalPrice) + "\n");                      
                    }
                }
                if (isCompilerChaiAdded) {
                    Integer quantityObj = (Integer) spinnerComChai.getValue();
                    int quantity = quantityObj.intValue();
                    
                    if (quantity > 0) {
                        double pricePerItem = 79.00;
                        double itemTotalPrice = pricePerItem * quantity;
                        
                        // Update the receipt text area
                        textArea.append("Compiler Chai P89.00 x " + quantity + "\n");
                        textArea.append("Total: P" + String.valueOf(itemTotalPrice) + "\n");                      
                    }
                }
                
                if (isDebugKitAdded) {
                    Integer quantityObj = (Integer) spinnerDebugKit.getValue();
                    int quantity = quantityObj.intValue();
                    
                    if (quantity > 0) {
                        double pricePerItem = 49.00;
                        double itemTotalPrice = pricePerItem * quantity;
                        
                        // Update the receipt text area
                        textArea.append("Debug Kit P49.00 x " + quantity + "\n");
                        textArea.append("Total: P" + String.valueOf(itemTotalPrice) + "\n");                      
                    }
                }
                
                
                
               
            }
        });
        
        Panel panelChai = new Panel();
        panelChai.setLayout(null);
        panelChai.setBackground(new Color(255, 239, 213));
        panelChai.setBounds(85, 277, 145, 203);
        panel_2.add(panelChai);

        JLabel lblNewLabel_1_2_1_1 = new JLabel("Compiler Chai   P89.00");
        lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_2_1_1.setBounds(10, 136, 135, 18);
        panelChai.add(lblNewLabel_1_2_1_1);

        JLabel lblQuantity_2_1_1 = new JLabel("Quantity:");
        lblQuantity_2_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_2_1_1.setBounds(10, 155, 72, 18);
        panelChai.add(lblQuantity_2_1_1);

        final JSpinner spinnerComChai = new JSpinner();
        spinnerComChai.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerComChai.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerComChai.setBounds(93, 155, 42, 21);
        panelChai.add(spinnerComChai);

        Panel panel_2_1_2_1_1 = new Panel();
        panel_2_1_2_1_1.setLayout(null);
        panel_2_1_2_1_1.setBounds(10, 8, 125, 122);
        panelChai.add(panel_2_1_2_1_1);
        
        JButton btnAddToOrder4 = new JButton("Add to Order");
        btnAddToOrder4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Integer quantityObj = (Integer) spinnerComChai.getValue();
                int quantity = quantityObj.intValue();

                if (quantity > 0) {
                    double pricePerItem = 89.00;
                    double itemTotalPrice = pricePerItem * quantity;

                    // Check if the item is already added to the order
                    if (isCompilerChaiAdded) {
                        // Update the quantity and total price
                        String[] lines = textArea.getText().split("\n");
                        for (int i = 0; i < lines.length; i++) {
                            if (lines[i].startsWith("Compiler Chai")) {
                                lines[i] = "Compiler Chai P89.00 x " + quantity;
                                break;
                            }
                        }
                        textArea.setText(String.join("\n", lines));
                        totalPrice += itemTotalPrice - (pricePerItem * (Integer) spinnerComChai.getPreviousValue());
                    } else {
                        // Add the item to the order
                        textArea.append("Compiler Chai P89.00 x " + quantity + "\n");
                        totalPrice += itemTotalPrice;
                        isCompilerChaiAdded = true;
                    }

                    // Update the total price in the JTextField
                    textField.setText("P" + String.valueOf(totalPrice));
                }
            }
        });
        
        btnAddToOrder4.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddToOrder4.setBounds(0, 178, 145, 25);
        panelChai.add(btnAddToOrder4);

       
        
        
        Panel panelDebugKit = new Panel();
        panelDebugKit.setLayout(null);
        panelDebugKit.setBackground(new Color(255, 239, 213));
        panelDebugKit.setBounds(236, 277, 145, 203);
        panel_2.add(panelDebugKit);

        JLabel lblNewLabel_1_2_2 = new JLabel("Debug Kit         P59.00");
        lblNewLabel_1_2_2.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_2_2.setBounds(10, 136, 135, 18);
        panelDebugKit.add(lblNewLabel_1_2_2);

        JLabel lblQuantity_2_2 = new JLabel("Quantity:");
        lblQuantity_2_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_2_2.setBounds(10, 155, 72, 18);
        panelDebugKit.add(lblQuantity_2_2);

        final JSpinner spinnerDebugKit = new JSpinner();
        spinnerDebugKit.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerDebugKit.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerDebugKit.setBounds(93, 155, 42, 21);
        panelDebugKit.add(spinnerDebugKit);

        Panel panel_2_1_2_2 = new Panel();
        panel_2_1_2_2.setLayout(null);
        panel_2_1_2_2.setBounds(10, 8, 125, 122);
        panelDebugKit.add(panel_2_1_2_2);
        
        JButton btnAddDebugKit = new JButton("Add to Order");
        btnAddDebugKit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Integer quantityObj = (Integer) spinnerDebugKit.getValue();
                int quantity = quantityObj.intValue();

                if (quantity > 0) {
                    double pricePerItem = 89.00;
                    double itemTotalPrice = pricePerItem * quantity;

                    // Check if the item is already added to the order
                    if (isDebugKitAdded) {
                        // Update the quantity and total price
                        String[] lines = textArea.getText().split("\n");
                        for (int i = 0; i < lines.length; i++) {
                            if (lines[i].startsWith("Debug Kit")) {
                                lines[i] = "Debug Kit x P59.00" + quantity;
                                break;
                            }
                        }
                        textArea.setText(String.join("\n", lines));
                        totalPrice += itemTotalPrice - (pricePerItem * (Integer) spinnerDebugKit.getPreviousValue());
                    } else {
                        // Add the item to the order
                        textArea.append("Debug Kit P59.00 x " + quantity + "\n");
                        totalPrice += itemTotalPrice;
                        isDebugKitAdded = true;
                    }

                    // Update the total price in the JTextField
                    textField.setText("P" + String.valueOf(totalPrice));
                }
        	}
        });
        btnAddDebugKit.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddDebugKit.setBounds(0, 178, 145, 25);
        panelDebugKit.add(btnAddDebugKit);

        
        
        
       
        Panel panelCodeCracker = new Panel();
        panelCodeCracker.setLayout(null);
        panelCodeCracker.setBackground(new Color(255, 239, 213));
        panelCodeCracker.setBounds(387, 277, 145, 203);
        panel_2.add(panelCodeCracker);

        JLabel lblNewLabel_1_2_2_1 = new JLabel("CodeCracker     P49.00");
        lblNewLabel_1_2_2_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_2_2_1.setBounds(10, 136, 135, 18);
        panelCodeCracker.add(lblNewLabel_1_2_2_1);

        JLabel lblQuantity_2_2_1 = new JLabel("Quantity:");
        lblQuantity_2_2_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_2_2_1.setBounds(10, 155, 72, 18);
        panelCodeCracker.add(lblQuantity_2_2_1);

        JSpinner spinnerCodeCracker = new JSpinner();
        spinnerCodeCracker.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerCodeCracker.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerCodeCracker.setBounds(93, 155, 42, 21);
        panelCodeCracker.add(spinnerCodeCracker);

        Panel panel_2_1_2_2_1 = new Panel();
        panel_2_1_2_2_1.setLayout(null);
        panel_2_1_2_2_1.setBounds(10, 8, 125, 122);
        panelCodeCracker.add(panel_2_1_2_2_1);
        
        JButton btnAddToOrder4_2 = new JButton("Add to Order");
        btnAddToOrder4_2.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddToOrder4_2.setBounds(0, 178, 145, 25);
        panelCodeCracker.add(btnAddToOrder4_2);

        
        
        

        Panel panelBugLava = new Panel();
        panelBugLava.setLayout(null);
        panelBugLava.setBackground(new Color(255, 239, 213));
        panelBugLava.setBounds(85, 498, 145, 203);
        panel_2.add(panelBugLava);

        JLabel lblNewLabel_1_3_1 = new JLabel("BugLava            P49.00");
        lblNewLabel_1_3_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_3_1.setBounds(10, 136, 125, 18);
        panelBugLava.add(lblNewLabel_1_3_1);

        JLabel lblQuantity_1_1 = new JLabel("Quantity:");
        lblQuantity_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_1_1.setBounds(10, 155, 72, 18);
        panelBugLava.add(lblQuantity_1_1);

        JSpinner spinnerBugLava = new JSpinner();
        spinnerBugLava.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerBugLava.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerBugLava.setBounds(93, 155, 42, 21);
        panelBugLava.add(spinnerBugLava);

        Panel panel_2_1_1_1 = new Panel();
        panel_2_1_1_1.setLayout(null);
        panel_2_1_1_1.setBounds(10, 8, 125, 122);
        panelBugLava.add(panel_2_1_1_1);
        
        JButton btnAddToOrder4_3 = new JButton("Add to Order");
        btnAddToOrder4_3.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddToOrder4_3.setBounds(0, 183, 145, 25);
        panelBugLava.add(btnAddToOrder4_3);

       
        
        
        Panel panelByteBites = new Panel();
        panelByteBites.setLayout(null);
        panelByteBites.setBackground(new Color(255, 239, 213));
        panelByteBites.setBounds(236, 498, 145, 203);
        panel_2.add(panelByteBites);

        JLabel lblNewLabel_1_3_1_1 = new JLabel("Byte Bites         P59.00");
        lblNewLabel_1_3_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_3_1_1.setBounds(10, 136, 125, 18);
        panelByteBites.add(lblNewLabel_1_3_1_1);

        JLabel lblQuantity_1_1_1 = new JLabel("Quantity:");
        lblQuantity_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_1_1_1.setBounds(10, 155, 72, 18);
        panelByteBites.add(lblQuantity_1_1_1);

        JSpinner spinnerBites = new JSpinner();
        spinnerBites.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerBites.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerBites.setBounds(93, 155, 42, 21);
        panelByteBites.add(spinnerBites);

        Panel panel_2_1_1_1_1 = new Panel();
        panel_2_1_1_1_1.setLayout(null);
        panel_2_1_1_1_1.setBounds(10, 8, 125, 122);
        panelByteBites.add(panel_2_1_1_1_1);
        
        JButton btnAddToOrder4_4 = new JButton("Add to Order");
        btnAddToOrder4_4.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddToOrder4_4.setBounds(0, 183, 145, 25);
        panelByteBites.add(btnAddToOrder4_4);

        
        
        
        Panel panelGlitchCookies = new Panel();
        panelGlitchCookies.setLayout(null);
        panelGlitchCookies.setBackground(new Color(255, 239, 213));
        panelGlitchCookies.setBounds(387, 498, 145, 203);
        panel_2.add(panelGlitchCookies);

        JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Glitch Cookies  P59.00");
        lblNewLabel_1_3_1_1_1.setFont(new Font("Dialog", Font.BOLD, 11));
        lblNewLabel_1_3_1_1_1.setBounds(10, 136, 125, 18);
        panelGlitchCookies.add(lblNewLabel_1_3_1_1_1);

        JLabel lblQuantity_1_1_1_1 = new JLabel("Quantity:");
        lblQuantity_1_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
        lblQuantity_1_1_1_1.setBounds(10, 155, 72, 18);
        panelGlitchCookies.add(lblQuantity_1_1_1_1);

        JSpinner spinnerGlitch = new JSpinner();
        spinnerGlitch.setModel(new SpinnerNumberModel(0, 0, 20, 1));
        spinnerGlitch.setFont(new Font("Tahoma", Font.PLAIN, 10));
        spinnerGlitch.setBounds(93, 155, 42, 21);
        panelGlitchCookies.add(spinnerGlitch);

        Panel panel_2_1_1_1_1_1 = new Panel();
        panel_2_1_1_1_1_1.setLayout(null);
        panel_2_1_1_1_1_1.setBounds(10, 8, 125, 122);
        panelGlitchCookies.add(panel_2_1_1_1_1_1);
        
        JButton btnAddToOrder4_5 = new JButton("Add to Order");
        btnAddToOrder4_5.setFont(new Font("STZhongsong", Font.PLAIN, 12));
        btnAddToOrder4_5.setBounds(0, 183, 145, 25);
        panelGlitchCookies.add(btnAddToOrder4_5);

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
