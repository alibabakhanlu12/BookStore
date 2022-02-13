package BookStore.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddToShoppingCart {
    JFrame frame;
    JLabel AddToCart;
    JButton Ok;
    JLabel empty;

    ImageIcon icon = new ImageIcon("img\\siteIcon.png");

    public AddToShoppingCart() {
        Add();
    }

    public void Add() {


        frame = new JFrame();
        frame.setBounds(350, 290, 500, 140);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        AddToCart = new JLabel("Successfully Added to the Shopping Cart!");
        AddToCart.setBounds(70, 20, 450, 40);
        AddToCart.setBackground(new Color(0xCE0707));
        AddToCart.setFont(new Font("Calibri", Font.BOLD, 20));


        Ok = new JButton("OK ");
        Ok.setBounds(200, 65, 100, 30);
        Ok.setBackground(new Color(0xFFFFFF));
        Ok.setFocusable(false);
        Ok.setFont(new Font("Calibri", Font.BOLD, 16));
        Ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });

        empty = new JLabel("");
        empty.setBounds(20, 20, 32, 30);

        frame.add(AddToCart);
        frame.add(Ok);
        frame.add(empty);
        frame.setIconImage(icon.getImage());
    }

}


