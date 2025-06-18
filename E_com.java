package gqt_E_commerce;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class E_com {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("ShopEase - E-commerce");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(255, 239, 210)); 
        
 
        JLabel welcomeLabel = new JLabel("Welcome to ShopEase!", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.HANGING_BASELINE, 50));  
        welcomeLabel.setForeground(new Color(34, 49, 63)); 
        welcomeLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 20, 0)); 
       
        frame.add(welcomeLabel, BorderLayout.NORTH);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1, 50, 100)); 
        buttonPanel.setBackground(new Color(245, 245, 245));

        JButton homeBtn = createStyledButton("Home Appliances");
        JButton clothesBtn = createStyledButton("Clothes");
        JButton electronicsBtn = createStyledButton("Electronics");
        JButton furnitureBtn = createStyledButton("Furniture");
        JButton cartBtn = createStyledButton("Cart");

        buttonPanel.add(homeBtn);
        buttonPanel.add(clothesBtn);
        buttonPanel.add(electronicsBtn);
        buttonPanel.add(furnitureBtn);
        buttonPanel.add(cartBtn);

        frame.add(buttonPanel, BorderLayout.WEST);
        
        
        Clothes_com cl = new Clothes_com();
        clothesBtn.addActionListener(e -> cl.openClothesCategory());
        cartBtn.addActionListener(e -> cl.showCart());

        Home_com hc = new Home_com();
        homeBtn.addActionListener(e -> hc.openHomeCategory());

        Electronics_com el = new Electronics_com();
        electronicsBtn.addActionListener(e -> el.open_Electronics_Category());

        Furniture_com fc = new Furniture_com() {
            @Override
            void open_product_for_f3() {
          
            }

            @Override
            void open_product_for_f2() {
                
            }

            @Override
            void open_Product_For_f1() {
                
            }

            @Override
            void createProductPanel() {
               
            }
        };
        furnitureBtn.addActionListener(e -> fc.open_Furniture_category());
        frame.setVisible(true);

    
    }

    private static JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 18));  
        button.setBackground(new Color(0, 123, 255));  
        button.setForeground(Color.WHITE);    
        button.setFocusPainted(false); 
        button.setPreferredSize(new Dimension(220, 50)); 
        button.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 10)); 
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
        
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(0, 102, 204));  
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(0, 123, 255)); 
            }
        });

        return button;
    }
}