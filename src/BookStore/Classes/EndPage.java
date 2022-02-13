package BookStore.Classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndPage {
    JFrame frame;
    JLabel PayDone;
    JLabel Check;
    JButton yes, No;
    JLabel empty;
    ImageIcon icon = new ImageIcon("img\\siteIcon.png");

    public EndPage() {
        Add();
    }

    public void Add() {


        frame = new JFrame();
        frame.setBounds(250, 220, 500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setIconImage(icon.getImage());

        PayDone = new JLabel("Payment Successfully Done!");
        PayDone.setBounds(20, 10, 450, 40);
        PayDone.setBackground(new Color(0xCE0707));
        PayDone.setFont(new Font("Calibri", Font.BOLD, 20));


        Check = new JLabel("Do you want to re-enter the main page?");
        Check.setBounds(20, 50, 450, 40);
        Check.setBackground(new Color(0xCE0707));
        Check.setFont(new Font("Calibri", Font.BOLD, 20));

        No = new JButton("No ");
        No.setBounds(260, 100, 100, 30);
        No.setBackground(new Color(0xFFFFFF));
        No.setFocusable(false);
        No.setFont(new Font("Calibri", Font.BOLD, 16));
        No.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                JFrame frame2 = new JFrame();
                frame2.setBounds(250, 220, 550, 220);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setVisible(true);
                JLabel End = new JLabel("We hope you've enjoyed the project!");
                End.setBounds(20, 40, 450, 40);
                End.setForeground(new Color(0xCE0707));
                End.setFont(new Font("Calibri", Font.BOLD, 30));

                JButton b = new JButton("It was good!");
                b.setBounds(260, 120, 170, 30);
                b.setBackground(new Color(0xFFFFFF));
                b.setFocusable(false);
                b.setFont(new Font("Calibri", Font.BOLD, 16));
                b.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame2.dispose();
                    }
                });
                JButton b2 = new JButton("It was very good!");
                b2.setBounds(80, 120, 170, 30);
                b2.setBackground(new Color(0xFFFFFF));
                b2.setFocusable(false);
                b2.setFont(new Font("Calibri", Font.BOLD, 16));
                b2.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        frame2.dispose();
                    }
                });
                JLabel empty12 = new JLabel("");
                empty12.setBounds(20, 20, 32, 30);

                frame2.add(End);
                frame2.add(b);
                frame2.add(b2);
                frame2.add(empty12);

            }
        });
        yes = new JButton("Yes ");
        yes.setBounds(130, 100, 100, 30);
        yes.setBackground(new Color(0xFFFFFF));
        yes.setFocusable(false);
        yes.setFont(new Font("Calibri", Font.BOLD, 16));
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FirstPage f = new FirstPage();
            }
        });

        empty = new JLabel("");
        empty.setBounds(20, 20, 32, 30);

        frame.add(yes);
        frame.add(No);
        frame.add(Check);
        frame.add(PayDone);
        frame.add(empty);
    }


}





