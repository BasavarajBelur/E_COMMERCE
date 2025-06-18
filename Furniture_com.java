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
import javax.swing.SwingConstants;


abstract class Furniture_methdos extends Clothes_com  {
	 
	abstract void open_Furniture_category();
	abstract void open_Product_For_f1();
	abstract void open_product_for_f2();
	abstract void open_product_for_f3();
	abstract void createProductPanel();

}

public abstract class Furniture_com extends  Furniture_methdos {

	
	
	public void open_Furniture_category() {
        JFrame clothesFrame = new JFrame("Furniture Categories");
        clothesFrame.setSize(400, 200);
        clothesFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30)); // horizontal & vertical gaps

        JButton homefrBtn = new JButton("Home furniture");
        JButton OfficefrBtn = new JButton("Office furniture");
        JButton transportfrBtn = new JButton("Transport furniture");

        Dimension btnSize = new Dimension(100, 40);
        homefrBtn.setPreferredSize(btnSize);
        OfficefrBtn.setPreferredSize(btnSize);
        transportfrBtn.setPreferredSize(btnSize);

        clothesFrame.add(homefrBtn);
        clothesFrame.add(OfficefrBtn);
        clothesFrame.add(transportfrBtn);

        homefrBtn.addActionListener(e -> open_Product_For_f1("Home furniture"));
        OfficefrBtn.addActionListener(e -> open_product_for_f2("Office furniture"));
        transportfrBtn.addActionListener(e -> open_product_for_f3("Transport furniture"));

        clothesFrame.setVisible(true);
    }
	
	public void open_Product_For_f1(String category) {
        JFrame productFrame = new JFrame(category + "");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Sofas", 25000.00, "sofa_fr.jpg","<html>\r\n"
        		+ "Brand - CASASTYLE<br>\r\n"
        		+ "Assembly Required - No<br>\r\n"
        		+ "Seat Depth - 30 Centimeters<br>\r\n"
        		+ "Seat Height - 16 Centimetres<br>\r\n"
        		+ "Weight Limit - 500 Kilograms<br>\r\n"
        		+ "Product Dimensions - 1.52D x 2.58W x 0.84H Meters\r\n"
        		+ "</html>"));
        productPanel.add(createProductPanel("Beds", 30000.50, "bed_fr.jpg","<html>\r\n"
        		+ "Size - Queen<br>\r\n"
        		+ "Colour - Grey/Beige<br>\r\n"
        		+ "Product Dimensions - 160L x 208W x 99H Centimeters<br>\r\n"
        		+ "Brand - Royaloak<br>\r\n"
        		+ "Included Components - 1 x Bed<br>\r\n"
        		+ "Finish Type - Melamine<br>\r\n"
        		+ "Item Weight - 31500 Grams<br>\r\n"
        		+ "Material - Wood, Fabric<br>\r\n"
        		+ "Age Range (Description) - Adult<br>\r\n"
        		+ "Product Care Instructions - Clean it with soft and dry cloth\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Desks", 5000.00, "desk_fr.jpg","<html>\r\n"
        		+ "Brand - Green Soul<br>\r\n"
        		+ "Product Dimensions - 60D x 120W x 79H Centimeters<br>\r\n"
        		+ "Colour - Venue (Wenge)<br>\r\n"
        		+ "Style - Wenge<br>\r\n"
        		+ "Base Material - Engineered Wood<br>\r\n"
        		+ "Top Material Type - Engineered Wood<br>\r\n"
        		+ "Finish Type - Laminated<br>\r\n"
        		+ "Special Feature - Compact<br>\r\n"
        		+ "Room Type - Office, Garage, Store room, Bedroom, Study Room<br>\r\n"
        		+ "Number of Drawers - 1\r\n"
        		+ "</html>\r\n"
        		+ ""));
      
        productFrame.add(productPanel, BorderLayout.CENTER);
        productFrame.setVisible(true);
    }
	public void open_product_for_f2(String category) {
        JFrame productFrame = new JFrame(category +"Frunitures");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("armchairs", 1500.99, "armchair_fr.jpg","<html>\r\n"
        		+ "Brand - YSR FURNITURE<br>\r\n"
        		+ "Colour - Blue<br>\r\n"
        		+ "Material - Fabric<br>\r\n"
        		+ "Product Dimensions - 75D x 75W x 90H Centimeters<br>\r\n"
        		+ "Size - Standard<br>\r\n"
        		+ "Back Style - Channel Tufted<br>\r\n"
        		+ "Special Feature - Ottoman Included<br>\r\n"
        		+ "Product Care Instructions - Wipe Clean with wet cloth\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("bookcases", 7500.50, "bookcase_fr.jpg","<html>\r\n"
        		+ "Material - Engineered Wood<br>\r\n"
        		+ "Room Type - Home Office<br>\r\n"
        		+ "Number of Shelves - 6<br>\r\n"
        		+ "Special Feature - Durable<br>\r\n"
        		+ "Product Dimensions - 17D x 31W x 59.5H Centimeters<br>\r\n"
        		+ "Style - Modern<br>\r\n"
        		+ "Brand - Madhuran<br>\r\n"
        		+ "Product Care Instructions - dry_clean_only<br>\r\n"
        		+ "Size - Standard<br>\r\n"
        		+ "Assembly Required - Yes\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("drawer units", 1499.00, "drawer_fr.jpg","<html>\r\n"
        		+ "Colour - Chocolate Brown<br>\r\n"
        		+ "Material - Plastic<br>\r\n"
        		+ "Frame Material - Plastic<br>\r\n"
        		+ "Brand - Kuber Industries<br>\r\n"
        		+ "Product Dimensions - 36D x 30W x 77H Centimeters<br>\r\n"
        		+ "Number of Drawers - 5<br>\r\n"
        		+ "Item Weight - 300 Grams<br>\r\n"
        		+ "Assembly Required - Yes\r\n"
        		+ "</html>\r\n"));

        productFrame.add(productPanel, BorderLayout.CENTER);

        productFrame.setVisible(true);
    }
    
    public void open_product_for_f3(String category) {
        JFrame productFrame = new JFrame(category + " Home Appliacne");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the Transport Furniture Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Contemporary Furniture", 55000, "co_fr.jpg","<html>\r\n"
        		+ "Brand - Generic<br>\r\n"
        		+ "Assembly Required - No<br>\r\n"
        		+ "Seat Depth - 60 Centimeters<br>\r\n"
        		+ "Seat Height - 45 Centimetres<br>\r\n"
        		+ "Weight Limit - 300 Kilograms<br>\r\n"
        		+ "Product Dimensions - 0.9D x 2W x 0.85H Meters<br>\r\n"
        		+ "Item Weight - 40 Kilograms<br>\r\n"
        		+ "Leg Length - 10 Centimetres<br>\r\n"
        		+ "Type - Standard<br>\r\n"
        		+ "Colour - Brown And Grey\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Traditional Furniture", 18000.50, "trad_fr.jpg","<html>\r\n"
        		+ "Colour - Honey<br>\r\n"
        		+ "Brand - RK DECK INCREDIBLY DECOROUS<br>\r\n"
        		+ "Size - 6 Seater<br>\r\n"
        		+ "Item Depth - 18 inch<br>\r\n"
        		+ "Item Dimensions - 147.3L x 88.9W x 76.2H Centimeters\r\n"
        		+ "</html>\r\n"
        		+ ""));
        productPanel.add(createProductPanel("Modern Furniture", 45000.00, "mod-fr.jpg","<html>\r\n"
        		+ "Brand - Smart Furniture City<br>\r\n"
        		+ "Assembly Required - No<br>\r\n"
        		+ "Seat Depth - 55.9 Centimeters<br>\r\n"
        		+ "Seat Height - 18 Inches<br>\r\n"
        		+ "Weight Limit - 300 Kilograms<br>\r\n"
        		+ "Product Dimensions - 80D x 190W x 75H Centimeters<br>\r\n"
        		+ "Item Weight - 60 Kilograms<br>\r\n"
        		+ "Type - Standard<br>\r\n"
        		+ "Colour - Blue<br>\r\n"
        		+ "Special Feature - Ergonomic\r\n"
        		+ "</html>\r\n"
        		+ ""));

        productFrame.add(productPanel, BorderLayout.CENTER);

        productFrame.setVisible(true);
    }
    
    public JPanel createProductPanel(String name, double price, String imagePath, String description) {
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

        // Price and Button
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

        // Right: Product Name + Description
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
	


}
