package BookStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AdminPage {
    static JFrame frame;
    static JButton backToHome, Report, removeAll, NewMember ,report;
    static JLabel welcomeLabel  , empty3;
    static JLabel empty, empty2;
    ImageIcon icon = new ImageIcon("siteIcon.png");


    public AdminPage() {
        adminPage();
    }

    public void adminPage() {


        JLabel photo = new JLabel(new ImageIcon("Back.jpg"));
        photo.setBounds(0,0,1000,700);

        welcomeLabel = new JLabel(" Admin Page ");
        welcomeLabel.setBounds(60, 20, 500, 70);
        welcomeLabel.setBackground(new Color(0xFFFFFF));
        welcomeLabel.setFont(new Font("Calibri", Font.BOLD, 50));

        Report = new JButton("Report");
        Report.setBounds(310, 500, 100, 40);
        Report.setBackground(new Color(0xFFFFFF));
        Report.setFont(new Font("Calibri", Font.BOLD, 16));
        Report.setFocusable(false);
        Report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                ReportForCart a = new ReportForCart();
            }
        });

        backToHome = new JButton(new ImageIcon("SS.png"));
        backToHome.setBounds(510, 20, 70, 50);
        backToHome.setBackground(new Color(0xFFFFFF));
        backToHome.setFocusable(false);
        backToHome.setFont(new Font("Calibri", Font.BOLD, 16));
        backToHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FirstPage f = new FirstPage();
            }
        });


        removeAll = new JButton("Remove All");
        removeAll.setBounds(50, 250, 130, 40);
        removeAll.setFont(new Font("Calibri", Font.BOLD, 20));
        removeAll.setBackground(new Color(0xFFFFFF));
        removeAll.setFocusable(false);
        removeAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoveActionListener(e);
            }
        });

        NewMember = new JButton("New Member");
        NewMember.setBounds(200, 250, 160, 40);
        NewMember.setBackground(new Color(0xFFFFFF));
        NewMember.setFocusable(false);
        NewMember.setFont(new Font("Calibri", Font.BOLD, 20));
        NewMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FirstPage f = new FirstPage();
            }
        });

        report = new JButton("Report Shopping Cart");
        report.setBounds(380, 250, 200, 40);
        report.setBackground(new Color(0xFFFFFF));
        report.setFocusable(false);
        report.setFont(new Font("Calibri", Font.BOLD, 18));
        report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                ReportForCart v = new ReportForCart();
            }
        });

        empty = new JLabel();
        empty.setBounds(10, 20, 30, 30);

        empty2 = new JLabel();
        empty2.setBounds(120, 20, 30, 30);

        empty3 = new JLabel();
        empty3.setBounds(120, 20, 30, 30);

        frame = new JFrame("Admin Page");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(280, 140, 610, 450);
        frame.add(photo);
        frame.setIconImage(icon.getImage());

        photo.add(backToHome);
        photo.add(report);
        photo.add(welcomeLabel);
        photo.add(NewMember);
        photo.add(backToHome);
        photo.add(removeAll);
        photo.add(empty);
    }

    public void RemoveActionListener(ActionEvent event) {
        System.out.println("Remove Button Pressed!");

        try {
            boolean result = Files.deleteIfExists(Paths.get("Store.txt"));
            if (result) {
                System.out.println("Store File is Deleted!");
            } else {
                System.out.println("Unable to Delete the File!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            boolean result = Files.deleteIfExists(Paths.get("PhotoFile.txt"));
            if (result) {
                System.out.println("Photo File is Deleted!");
            } else {
                System.out.println("Unable to Delete the File!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.dispose();

        JFrame frame = new JFrame();
        frame.setBounds(300, 250, 700, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JLabel empty3 = new JLabel("");
        empty3.setBounds(20, 2, 34, 34);

        JLabel removeAll = new JLabel();
        removeAll.setBounds(20, 20, 500, 70);
        removeAll.setFont(new Font("Calibri", Font.BOLD, 22));
        removeAll.setText("\n All Product Information has been Removed!");

        JButton back = new JButton("Back ");
        back.setBounds(580, 30, 100, 30);
        back.setBackground(new Color(0xFFFFFF));
        back.setFocusable(false);
        back.setFont(new Font("Calibri", Font.BOLD, 18));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                AdminPage s = new AdminPage();
            }
        });
        frame.add(back);
        frame.add(removeAll);
        frame.add(empty3);
    }




}

