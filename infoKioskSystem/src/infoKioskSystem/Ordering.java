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
        panelBinaryBlend.setBounds(10, 49, 145, 203);
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
        panelLatte.setBounds(161, 49, 145, 203);
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
        panelBoolBrew.setBounds(312, 49, 145, 203);
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
                
                
                
               
            }
        });
        
        Panel panelChai = new Panel();
        panelChai.setLayout(null);
        panelChai.setBackground(new Color(255, 239, 213));
        panelChai.setBounds(463, 49, 145, 203);
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
