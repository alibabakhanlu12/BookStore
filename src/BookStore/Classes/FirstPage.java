package BookStore.Classes;

import BookStore.LoginsPage.LoginForAdmin;
import BookStore.LoginsPage.LoginForCostumer;
import BookStore.LoginsPage.LoginForSeller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstPage {

    JFrame frame;
    JButton SellerBtn, CustomerBtn, AdminBtn, helpBtn;
    JLabel photo2, empty;
    ImageIcon icon = new ImageIcon("BookStore\\img\\siteIcon.png");

    public FirstPage() {
        firstPage();
    }

    public void firstPage() {

        ImageIcon imageIcon = new ImageIcon("BookStore\\img\\firstPage.jpg");

        photo2 = new JLabel();
        photo2.setIcon(imageIcon);
        photo2.setBounds(0, 0, 626, 417);

        SellerBtn = new JButton("As Seller");
        SellerBtn.setBackground(new Color(0xFFFFFF));
        SellerBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        SellerBtn.setBounds(30, 200, 170, 40);
        SellerBtn.setFocusable(false);
        SellerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame.dispose();
                LoginForSeller f = new LoginForSeller();

            }
        });

        CustomerBtn = new JButton("As Customer");
        CustomerBtn.setBackground(new Color(0xFFFFFF));
        CustomerBtn.setBounds(210, 200, 170, 40);
        CustomerBtn.setFocusable(false);
        CustomerBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        CustomerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginForCostumer v = new LoginForCostumer();

            }
        });

        AdminBtn = new JButton("As Admin");
        AdminBtn.setBackground(new Color(0xFFFFFF));
        AdminBtn.setBounds(390, 200, 170, 40);
        AdminBtn.setFocusable(false);
        AdminBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        AdminBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                LoginForAdmin b = new LoginForAdmin();

            }
        });

        helpBtn = new JButton("Help");
        helpBtn.setBounds(500, 320, 70, 30);
        helpBtn.setForeground(new Color(0xD03B3B));
        helpBtn.setFocusable(false);
        helpBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        helpBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                HelpPage g = new HelpPage();
            }
        });

        empty = new JLabel();
        empty.setBounds(10, 20, 333, 33);

        frame = new JFrame();
        frame.setBounds(300, 100, 626, 417);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(0x012C5A));
        frame.setResizable(false);
        frame.setTitle("Main Page");
        frame.setIconImage(icon.getImage());

        frame.add(SellerBtn);
        frame.add(CustomerBtn);
        frame.add(AdminBtn);
        frame.add(helpBtn);
        frame.add(photo2);
        frame.add(empty);
    }

    public static void main(String[] args) {

        FirstPage f = new FirstPage();
    }
}
