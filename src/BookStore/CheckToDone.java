package BookStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CheckToDone {

    public CheckToDone(){
        Frames();
    }
    ImageIcon icon = new ImageIcon("siteIcon.png");
    public void Frames(){

        JFrame frame = new JFrame();
        frame.setBounds(370,230,500,170);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel Check = new JLabel("Are you sure you want to purchase these products?");
        Check.setBounds(20,10,450,40);
        Check.setBackground(new Color(0xCE0707));
        Check.setFont(new Font ("Calibri",Font.BOLD, 20) );

        JButton  No = new JButton("No ");
        No.setBounds(260,70,100,30);
        No.setBackground(new Color(0xFFFFFF));
        No.setFocusable(false);
        No.setFont(new Font ("Calibri", Font.BOLD, 16) );
        No.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            try {
                CustomerPage s = new CustomerPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    });

        JButton  yes = new JButton("Yes ");
        yes.setBounds(130,70,100,30);
        yes.setBackground(new Color(0xFFFFFF));
        yes.setFocusable(false);
        yes.setFont(new Font ("Calibri", Font.BOLD, 16) );
        yes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispose();
            PaymentPage f = new PaymentPage();
        }
    });

        JLabel  empty = new JLabel("");
        empty.setBounds(20,20,32,30);

        frame.add(yes);
        frame.add(No);frame.add(Check);
        frame.add(empty);
        frame.setIconImage(icon.getImage());
}

    public static void main(String[] args) {
        CheckToDone c = new CheckToDone();
    }
}

