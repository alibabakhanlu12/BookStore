package BookStore.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpPage {
    JFrame frame;
    JButton back;
    JTextArea SellerTextArea;
    JScrollPane scrollPane;
    JLabel empty;
    ImageIcon icon = new ImageIcon("img\\siteIcon.png");

    public HelpPage() {
        AddGUI();
    }

    private void AddGUI() {
        empty = new JLabel();
        empty.setBounds(20, 10, 10, 1);

        back = new JButton("Back");
        back.setBounds(280, 620, 200, 40);
        back.setFont(new Font("Calibri", Font.BOLD, 20));
        back.setBackground(new Color(0x232B86));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FirstPage f = new FirstPage();
            }
        });

        SellerTextArea = new JTextArea(20, 20);
        SellerTextArea.setVisible(true);
        SellerTextArea.setFont(new Font("Calibri", Font.CENTER_BASELINE, 24));
        SellerTextArea.setLineWrap(true);
        SellerTextArea.setBackground(new Color(0xFFFFFF));
        SellerTextArea.setText("\n Seller :\n" +
                " The seller is a person who adds a number of \n goods along" +
                " with their details (product name,\n number,product code," +
                " price and image of the product the customer can to the) " +
                " file for sale  product \n  and add it to his shopping cart."

                + "\n\n  Customer: \n" +
                " A customer is someone who can find the\n product he wants" +
                " from the available goods \n and put it in his shopping cart and buy it.\n"
                +
                "\n\n  Admin : \n  An admin is someone who can access and \n  control all sections." +
                " The admin can also check the specifications of the goods in stock\n\n");

        scrollPane = new JScrollPane(SellerTextArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame = new JFrame("Help");
        frame.setBounds(30, 40, 500, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(scrollPane, BorderLayout.PAGE_START);
        frame.add(back);
        frame.add(empty);
        frame.setIconImage(icon.getImage());
    }
}
