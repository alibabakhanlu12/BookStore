package BookStore.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static BookStore.Classes.CustomerPage.ShoppingCartTxtArea;



public class ShoppingCart {


    public ShoppingCart() {
        shoppingCart();
    }

    public void shoppingCart() {
        JFrame f = new JFrame("Cart");
        ImageIcon icon = new ImageIcon("BookStore\\img\\siteIcon.png");

        JScrollPane d = new JScrollPane(ShoppingCartTxtArea);
        d.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton backBtn = new JButton("Back to Customer");
        backBtn.setBounds(500, 20, 230, 40);
        backBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        backBtn.setFocusable(false);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    f.dispose();
                    CustomerPage c = new CustomerPage();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        JButton done = new JButton("Done");
        done.setFont(new Font("Calibri", Font.BOLD, 22));
        done.setFocusable(false);
        done.setBounds(320, 600, 140, 30);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
                CheckToDone c = new CheckToDone();
            }
        });

        JLabel label2 = new JLabel();
        label2.setBounds(0, 0, 200, 50);
        label2.setFont(new Font("Calibri", Font.BOLD, 20));
        JLabel label = new JLabel("Shopping Cart");
        label.setBounds(60, 10, 400, 100);
        label.setFont(new Font("Calibri", Font.BOLD, 60));

        JLabel label1 = new JLabel("You can see all the products you've added to your shopping cart.");
        label1.setBounds(55, 140, 550, 50);
        label1.setFont(new Font("Calibri", Font.BOLD, 20));

        JPanel panel = new JPanel();
        panel.setBounds(0, 200, 800, 400);

        f.setVisible(true);
        f.setBounds(200, 20, 800, 700);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setIconImage(icon.getImage());

        panel.add(d, BorderLayout.CENTER);
        f.add(panel);
        f.add(done);
        f.add(label);
        f.add(label1);
        f.add(backBtn);
        f.add(label2);
    }

}
