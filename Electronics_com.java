package gqt_E_commerce;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

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

public class Electronics_com extends Clothes_com{

	public void open_Electronics_Category() {
		// TODO Auto-generated method stub
        JFrame clothesFrame = new JFrame("Electonics Categories");
        clothesFrame.setSize(400, 200);
        clothesFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30)); // horizontal & vertical gaps

        JButton wireBtn = new JButton("Wires & Cables");
        JButton switchBtn = new JButton("Switches & Sokets");
        JButton heaterBtn = new JButton("Water Heaters");

        Dimension btnSize = new Dimension(100, 40);
        wireBtn.setPreferredSize(btnSize);
        switchBtn.setPreferredSize(btnSize);
        heaterBtn.setPreferredSize(btnSize);

        clothesFrame.add (wireBtn);
        clothesFrame.add(switchBtn);
        clothesFrame.add(heaterBtn);

        wireBtn.addActionListener(e -> open_Product_Section_for_wires("Wires & Cables",""));
        switchBtn.addActionListener(e -> open_Product_Section_for_sockets("Switches & Sokets",""));
        heaterBtn.addActionListener(e -> open_Product_Section_for_heaters("Water Heaters",""));

        clothesFrame.setVisible(true);
	}

	public void open_Product_Section_for_wires(String category,String desc1) {
        JFrame productFrame = new JFrame(category + " Home Appliance");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Copper Wires", 300.00, "copper_wires.jpg","<html>"
        		+ "Colour - White<br>"
        		+ "Brand - KERFORA<br>"
        		+ "Material - Copper<br>"
        		+ "Voltage - 220 Volts<br>"
        		+ "No. of wires - 3"
        		+ "</html>"
));
        productPanel.add(createProductPanel("LAN Cables",250.50, "lan_cable.jpg","<html>"
        		+ "Colour - White<br>"
        		+ "Brand - KERFORA<br>"
        		+ "Material - Copper<br>"
        		+ "Voltage - 220 Volts<br>"
        		+ "No. of wires - 3"
        		+ "</html>"
));
        productPanel.add(createProductPanel("CCTV Cables", 2500.00, "cctv_cable.jpg","<html>"
        		+ "Brand - FEDUS<br>"
        		+ "Connector Type - BNC<br>"
        		+ "Cable Type - Coaxial<br>"
        		+ "Compatible Devices - DVR Camera Systems, Surveillance DVR Camera Systems, 4K Monitor, CCTV Surveillance DVR Camera Systems<br>"
        		+ "Recommended Uses For Product - Not specified"
        		+ "</html>"
));
      
        productFrame.add(productPanel, BorderLayout.CENTER);
        productFrame.setVisible(true);
    }
    
    public void open_Product_Section_for_sockets(String category,String desc2) {
        JFrame productFrame = new JFrame(category +"Electronics");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the " + category + " Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Lamp Holder", 499.99, "lamp_holder.jpg","<html>"
        		+ "Finish Type - Polished<br>"
        		+ "Base Material - Wood<br>"
        		+ "Lamp Type - Table Lamp<br>"
        		+ "Shade Colour - Beige, Black<br>"
        		+ "Shade Material - Wood<br>"
        		+ "Switch Type - Touch<br>"
        		+ "Style - Round"
        		+ "</html>"));
        productPanel.add(createProductPanel("Switch", 200.00, "switches.jpg","<html>"
        		+ "Operation Mode - ON-OFF<br>"
        		+ "Current Rating - 10 Amps<br>"
        		+ "Operating Voltage - 220 Volts<br>"
        		+ "Contact Type - Normally Closed<br>"
        		+ "Connector Type - Plug In"
        		+ "</html>"
));
        productPanel.add(createProductPanel("Sockets", 100.00, "socket.jpg","<html>"
        		+ "Brand - GM<br>"
        		+ "Colour - Multicolor<br>"
        		+ "Total Power Outlets - 4<br>"
        		+ "Voltage - 250 Volts<br>"
        		+ "Special Feature - Light Indicator"
        		+ "</html>"
));

        productFrame.add(productPanel, BorderLayout.CENTER);

        productFrame.setVisible(true);
    }
    
    public void open_Product_Section_for_heaters(String category,String desc3) {
        JFrame productFrame = new JFrame(category + " ");
        productFrame.setSize(800, 600);
        productFrame.setLayout(new BorderLayout(10, 10)); 

        // Welcome message at the top
        JLabel welcomeLabel = new JLabel("Welcome to the Heaters Section!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.HANGING_BASELINE, 50));
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 10, 0)); 
        productFrame.add(welcomeLabel, BorderLayout.NORTH);

    
        JPanel productPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        productPanel.add(createProductPanel("Instant Heater", 15000.00, "instant_heater.jpg","<html>"
        		+ "Brand - V-Guard<br>"
        		+ "Product Dimensions - 22.3W x 43.5H Centimeters<br>"
        		+ "Special Feature - Energy Efficient, Rust Proof<br>"
        		+ "Colour - White<br>"
        		+ "Wattage - 3000 Watts"
        		+ "</html>"));
        productPanel.add(createProductPanel("Solar water Heater", 20000.00, "solar_heater.jpg","<html>"
        		+ "Brand - SUPREME SOLAR<br>"
        		+ "Material - Stainless Steel<br>"
        		+ "Connector Type - USB<br>"
        		+ "Included Components - Batteries<br>"
        		+ "Maximum Power - 200 Watts"
        		+ "</html>"));
        productPanel.add(createProductPanel("Storage Heater", 10000.00, "storage_heater.jpg","<html>"
        		+ "Brand - Haier<br>"
        		+ "Product Dimensions - 31.7W x 41.2H Centimeters<br>"
        		+ "Special Feature - Rustproof, Overheat Protection, Healthy Shower<br>"
        		+ "Colour - White<br>"
        		+ "Wattage - 2200 Watts"
        		+ "</html>"));

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
