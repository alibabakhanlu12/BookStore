package BookStore.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static BookStore.Classes.CustomerPage.ReportForShoppingCart;



public class ReportForCart {
    JButton back;
    JFrame frame;
    ImageIcon icon = new ImageIcon("img\\siteIcon.png");
    JLabel empty , showAllinCart;
    JScrollPane scroll;
    public ReportForCart(){
        AddReport();
    }
    public void AddReport(){


        JScrollPane d = new JScrollPane(ReportForShoppingCart);
        d.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        showAllinCart = new JLabel("Show Cart");
        showAllinCart.setBounds(50,100,450,100);
        showAllinCart.setBackground(new Color(0xCE0707));
        showAllinCart.setFont(new Font ("Calibri", Font.BOLD, 56) );

        back = new JButton("back ");
        back.setBounds(680,20,100,30);
        back.setBackground(new Color(0xFFFFFF));
        back.setFont(new Font ("Calibri", Font.BOLD, 16) );
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AdminPage s = new AdminPage();
            }
        });

        empty = new JLabel("");
        empty.setBounds(20,20,32,30);

        frame = new JFrame();
        frame.setBounds(150,20,800,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(icon.getImage());

        frame.add(d,BorderLayout.PAGE_END);
        frame.add(showAllinCart);
        frame.add(back);
        frame.add(empty);
    }



}