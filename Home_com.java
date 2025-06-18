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

import gqt_Quiz_app.Colors;

public class Home_com extends Clothes_com{


	public void openHomeCategory() {
		// TODO Auto-generated method stub
        JFrame clothesFrame = new JFrame("Home Appliances Categories");
        clothesFrame.setSize(400, 200);
        clothesFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30)); // horizontal & vertical gaps

        JButton kitchenBtn = new JButton("Kitchen");
        JButton EleBtn = new JButton("Electronics");
        JButton bedBtn = new JButton("Large Home Appliances");

        Dimension btnSize = new Dimension(100, 40);
        kitchenBtn.setPreferredSize(btnSize);
        EleBtn.setPreferredSize(btnSize);
        bedBtn.setPreferredSize(btnSize);

        clothesFrame.add(kitchenBtn);
        clothesFrame.add(EleBtn);
        clothesFrame.add(bedBtn);

        kitchenBtn.addActionListener(e -> openProductSectionforKitcehn("Kitchen"," "));
        EleBtn.addActionListener(e -> openProductSectionforElectronics("Electrnocis"," "));
        bedBtn.addActionListener(e -> openProductSectionfor_large_ha("Large Home Appliances"," "));

        clothesFrame.setVisible(true);
	}

	public void openProductSectionforKitcehn(String category, String desc1) {
        JFrame productFrame = new JFrame(category + "  Appliance");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 5, 10));
        productPanel.setFont(new Font("Arial", Font.TYPE1_FONT, 6));
        productPanel.add(createProductPanel("Mixer", 499.99, "mixer.jpg",
        	    "<html>"
        	    + "Brand - Philips<br>"
        	    + "Colour - Black & Grey<br>"
        	    + "Product Dimensions - 19D x 17.5W x 22.5H Centimeters<br>"
        	    + "Blade Material - Stainless Steel<br>"
        	    + "Capacity - 1.2 litres<br>"
        	    + "Controls Type - Knob Control"
        	    + "</html>"
        	));

        	productPanel.add(createProductPanel("Coffee Maker", 999.50, "cofee_maker.jpg",
        			"<html>"
        	    + "Brand - Preethi<br>"
        	    + "Colour - Black<br>"
        	    + "Product Dimensions - 22.5D x 26.5W x 16.5H Centimeters<br>"
        	    + "Special Feature - Timer<br>"
        	    + "Coffee Maker Type - Drip Coffee Machine<br>"
        	    + "Filter Type - Reusable"
        	    + "</html>"
        	));

        
        productPanel.add(createProductPanel(
        	    "Bread Toaster", 1499.00, "bread_toster.jpg",
        	    "<html>"
        	    + "Brand - Pigeon<br>"
        	    + "Colour - Black<br>"
        	    + "Material - Plastic<br>"
        	    + "Product Dimensions - 10D x 10W x 10H cm<br>"
        	    + "Specific Uses For Product - Bread"
        	    + "</html>"
        	));

        
        productFrame.add(productPanel, BorderLayout.CENTER);
        productFrame.setVisible(true);
    }
    
    public void openProductSectionforElectronics(String category,String desc2) {
        JFrame productFrame = new JFrame(category +"Electronics");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE ,50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 0, 0));
        productPanel.add(createProductPanel("Iron Box", 499.99, "iron_box.jpg","<html>"
        	    + "Brand - Havells<br>"
        	    + "Special Feature - Temperature Control, Shock proof<br>"
        	    + "Colour - Black<br>"
        	    + "Product Dimensions - 25L x 13W Centimeters<br>"
        	    + "Recommended Uses For Product - Not specified"
        	    + "</html>"
        	))	;
        productPanel.add(createProductPanel("Electric Kettle", 999.50, "kattle.jpg","<html>"
        		+ "Brand - Havells<br>"
        		+ "Colour - Black<br>"
        		+ "Special Feature - Wide Mouth, Boil Dry Protection, Cordless, Automatic Shut-Off, Double Wall<br>"
        		+ "Package Information - Kettle<br>"
        		+ "Finish Type - Painted<br>"
        		+ "Product Dimensions - 22.5L x 19W x 19.5H Centimeters<br>"
        		+ "Included Components - 1N Main Unit, 1N Detachable Base and 1N Instruction Manual<br>"
        		+ "Product Care Instructions - Switch off the kettle when not in use<br>"
        		+ "Model Name - Aqua Plus<br>"
        		+ "Item Weight - 1100 Grams"
        		+ "</html>"));
        productPanel.add(createProductPanel("Rice Cooker", 1499.00, "rice_cooker.jpg","<html>"
        		+ "Brand - PRESTIGE<br>"
        		+ "Capacity - 10 Cups<br>"
        		+ "Product Dimensions - 32D x 30W x 29H Centimeters<br>"
        		+ "Power Source - Corded Electric<br>"
        		+ "Product Care Instructions - Hand Wash"
        		+ "</html>"));

        productFrame.add(productPanel, BorderLayout.CENTER);

        productFrame.setVisible(true);
    }
    
    public void openProductSectionfor_large_ha(String category,String description) {
    	
        JFrame productFrame = new JFrame(category + " Home Appliacne");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        JLabel welcomeLabel = new JLabel("Welcome to the Large Home Appliance Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Refrigerator", 9.99, "refgirator.jpg","<html>\"\r\n"
        		+ "+ \"Product Dimensions - 66.5D x 59.5W x 143.5H Centimeters<br>\"\r\n"
        		+ "+ \"Brand - Whirlpool<br>\"\r\n"
        		+ "+ \"Capacity - 192 litres<br>\"\r\n"
        		+ "+ \"Configuration - Single Door\"\r\n"
        		+ "+ \"</html>\""));
        
        productPanel.add(createProductPanel("WashingMachine", 999.50, "washing_machine.jpg","\"<html>\"\r\n"
        		+ "+ \"Product Dimensions - 59D x 59.8W x 84.8H Centimeters<br>\"\r\n"
        		+ "+ \"Brand - Bosch<br>\"\r\n"
        		+ "+ \"Capacity - 7 Kilograms<br>\"\r\n"
        		+ "+ \"Special Feature - Child Lock, Hygiene Steam, Drum Clean, Delay Start, Inbuilt Heater<br>\"\r\n"
        		+ "+ \"Access Location - Front Load\"\r\n"
        		+ "+ \"</html>\""));
        
        productPanel.add(createProductPanel("Dish washer", 1499.00, "dish_washer.jpg","<html>"
        		+ "Brand - Bosch<br>"
        		+ "Installation Type - Freestanding<br>"
        		+ "Product Dimensions - 60D x 60W x 84.5H Centimeters<br>"
        		+ "Capacity - 13 Place Settings<br>"
        		+ "Special Feature - Eco silence drive, dosage Assist, Half Load option, extra dry and hygienic wash, Glass protection"
        		+ "</html>"
        		));

        productFrame.add(productPanel, BorderLayout.CENTER);
        productFrame.setVisible(true);
    
    }

    public JPanel createProductPanel(String name, double price, String imagePath, String description) {
        JPanel panel = new JPanel(new BorderLayout(10, 0));

        // Left: Image + Info below
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 10));

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
