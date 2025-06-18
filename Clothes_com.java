package gqt_E_commerce;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Clothes_com {
	static double cartTotal = 0;
    static ArrayList<String> cartItems = new ArrayList<>();

    public void openClothesCategory() {
        JFrame clothesFrame = new JFrame("Clothes Categories");
        clothesFrame.setSize(400, 200);
        clothesFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));

        JButton menBtn = new JButton("Men");
        JButton womenBtn = new JButton("Women");
        JButton kidsBtn = new JButton("Kids");

        Dimension btnSize = new Dimension(100, 40);
        menBtn.setPreferredSize(btnSize);
        womenBtn.setPreferredSize(btnSize);
        kidsBtn.setPreferredSize(btnSize);

        clothesFrame.add(menBtn);
        clothesFrame.add(womenBtn);
        clothesFrame.add(kidsBtn);

        menBtn.addActionListener(e -> openProductSectionformen("Men"));
        womenBtn.addActionListener(e -> openProductSectionforwomen("Women"));
        kidsBtn.addActionListener(e -> openProductSectionforkids("Kids"));

        clothesFrame.setVisible(true);
    }

    public void openProductSectionformen(String category) {
        JFrame productFrame = new JFrame(category + " Clothing");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Hoodies", 600.00, "Hoodie.jpeg","<html>\r\n"
        		+ "Material Composition - Cotton Blend<br>\r\n"
        		+ "Sleeve Type - Long Sleeve<br>\r\n"
        		+ "Material Type - Cotton Blend<br>\r\n"
        		+ "Fit Type - Regular<br>\r\n"
        		+ "Length - Standard Length<br>\r\n"
        		+ "Neck Style - Hooded Neck<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Jeans", 800.00, "jeans.jpg","<html>\r\n"
        		+ "Material Type - Cotton Blend<br>\r\n"
        		+ "Length - Full Length<br>\r\n"
        		+ "Style - Jeans<br>\r\n"
        		+ "Closure Type - Button and Zip<br>\r\n"
        		+ "Occasion Type - Casual<br>\r\n"
        		+ "Care Instructions - Machine Wash<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Jacket", 1000.00, "men_jacket.jpg","<html>\r\n"
        		+ "Material Composition - 98% Cotton, 2% Elastane<br>\r\n"
        		+ "Style - Regular Jacket<br>\r\n"
        		+ "Fit Type - Regular<br>\r\n"
        		+ "Length - Standard Length<br>\r\n"
        		+ "Neck Style - Collared Neck<br>\r\n"
        		+ "Pattern - Solid<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
      
        productFrame.add(productPanel, BorderLayout.CENTER);
        productFrame.setVisible(true);
    }
    
    public void openProductSectionforwomen(String category) {
        JFrame productFrame = new JFrame(category + " Clothing");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Casual", 500.00, "wo_casual.jpg","<html>\r\n"
        		+ "Material Type - Cotton Blend<br>\r\n"
        		+ "Length - Midi<br>\r\n"
        		+ "Occasion Type - Party<br>\r\n"
        		+ "Sleeve Type - 3/4 Sleeve<br>\r\n"
        		+ "Pattern - Block Print<br>\r\n"
        		+ "Style - A-Line<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Kurta", 1200.00, "wo_kurta.jpg","<html>\r\n"
        		+ "Material Composition - 90% Rayon, 10% Cotton<br>\r\n"
        		+ "Sleeve Type - 3/4 Sleeve<br>\r\n"
        		+ "Length - Calf Length<br>\r\n"
        		+ "Neck Style - V-Neck<br>\r\n"
        		+ "Pattern - Floral<br>\r\n"
        		+ "Style - Regular<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("business professional", 1500.00, "wo_buiness_cal.jpg","<html>\r\n"
        		+ "Style - A-Line<br>\r\n"
        		+ "Neck Style - Banded Collar<br>\r\n"
        		+ "Pattern - Solid<br>\r\n"
        		+ "Care Instructions - Machine Wash<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));

        productFrame.add(productPanel, BorderLayout.CENTER);

        productFrame.setVisible(true);
    }
    
    public void openProductSectionforkids(String category) {
        JFrame productFrame = new JFrame(category + " Clothing");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("T-shirts", 100.00, "Kid-tshirt-1.jpg","<html>\r\n"
        		+ "Material Composition - Blended Cotton<br>\r\n"
        		+ "Care Instructions - Machine Wash<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Frock", 800.00, "frock_kid.jpg","<html>\r\n"
        		+ "Material Type - Net<br>\r\n"
        		+ "Length - Knee-Length<br>\r\n"
        		+ "Sleeve Type - Sleeveless<br>\r\n"
        		+ "Pattern - Solid<br>\r\n"
        		+ "Style - A-Line<br>\r\n"
        		+ "Neck Style - Round Neck<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Kid Shoes", 500.00, "kid_shoes.jpg","<html>\r\n"
        		+ "Material Type - Synthetic<br>\r\n"
        		+ "Closure Type - Lace-Up<br>\r\n"
        		+ "Heel Type - Platform Heel<br>\r\n"
        		+ "Water Resistance Level - Not Water Resistant<br>\r\n"
        		+ "Sole Material - Polyvinyl Chloride<br>\r\n"
        		+ "Style - Sneaker<br>\r\n"
        		+ "Country of Origin - India\r\n"
        		+ "</html>\r\n"
        		+ ""));

        productFrame.add(productPanel, BorderLayout.CENTER);

        productFrame.setVisible(true);
    }
    
    
    public JPanel createProductPanel(String name, double price, String imagePath,String description) {
        JPanel panel = new JPanel(new BorderLayout(10, 0));

        // Left: Image + Info below
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 10));

        JLabel imgLabel;
        try {
            ImageIcon icon = new ImageIcon(imagePath);
            Image scaledImage = icon.getImage().getScaledInstance(220, 300, Image.SCALE_SMOOTH);
            imgLabel = new JLabel(new ImageIcon(scaledImage));
        } catch (Exception e) {
            imgLabel = new JLabel("Image not found");
        }

        leftPanel.add(imgLabel);

        JLabel priceLabel = new JLabel("Price: ₹" + price);
        JButton addToCartBtn = new JButton("Add to Cart");

        addToCartBtn.addActionListener(e -> {
            cartItems.add(name + " - ₹" + price);
            cartTotal += price;
            JOptionPane.showMessageDialog(null, name + " added to cart!");
        });

        JPanel bottomInfoPanel = new JPanel();
        bottomInfoPanel.setLayout(new BoxLayout(bottomInfoPanel, BoxLayout.Y_AXIS));
        bottomInfoPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        bottomInfoPanel.add(priceLabel);
        bottomInfoPanel.add(Box.createVerticalStrut(5));
        bottomInfoPanel.add(addToCartBtn);

        leftPanel.add(bottomInfoPanel);
        panel.add(leftPanel, BorderLayout.WEST);

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel nameLabel = new JLabel("Product: " + name );
        nameLabel.setFont(new Font("SansSerif", Font.BOLD, 14));
        JLabel descriptionLabel = new JLabel("<html><i> " + description + "</i></html>");

        rightPanel.add(nameLabel);
        rightPanel.add(descriptionLabel);
        panel.add(rightPanel, BorderLayout.CENTER);

        return panel;
    }
  
	void showCart() {
        JFrame cartFrame = new JFrame("Your Cart");
        cartFrame.setSize(500, 400);
        cartFrame.setLayout(new BorderLayout(10, 10));  // Adjust spacing

        // Column names
        String[] columnNames = {"Product", "Price (₹)"};

        // Prepare data rows
        Object[][] data = new Object[cartItems.size() + 1][2];
        double total = 0.0;

        for (int i = 0; i < cartItems.size(); i++) {
            String[] parts = cartItems.get(i).split(" - ₹");
            data[i][0] = parts[0]; // Product name
            double price = Double.parseDouble(parts[1]);
            data[i][1] = String.format("%.2f", price); // Price formatted
            total += price;
        }

        data[cartItems.size()][0] = "Total"+ Font.BOLD;
        data[cartItems.size()][1] = "₹" + String.format("%.2f", total);

        JTable table = new JTable(data, columnNames);
        table.setEnabled(false);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(table);
        cartFrame.add(scrollPane, BorderLayout.CENTER);

        if(total == 0) {
        	JOptionPane.showMessageDialog(table, "Please add items to cart",null, JOptionPane.INFORMATION_MESSAGE);
        	
        }
        else {
        JButton buyNowButton = new JButton("Buy Now");
        buyNowButton.setFont(new Font("Arial", Font.BOLD, 16));
        buyNowButton.setFocusPainted(false);
        buyNowButton.setPreferredSize(new Dimension(150, 40));

        // Button action
        buyNowButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(cartFrame, "Thank you for your purchase!", "Order Placed", JOptionPane.INFORMATION_MESSAGE);
            cartItems.clear();  
            cartFrame.dispose(); 
        });

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(buyNowButton);
        
        cartFrame.add(southPanel, BorderLayout.SOUTH);

        cartFrame.setVisible(true);
        }
    }


}
