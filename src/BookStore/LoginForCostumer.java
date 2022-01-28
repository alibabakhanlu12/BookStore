package BookStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginForCostumer {

    public LoginForCostumer() {
        AddGUI();
    }
    public void AddGUI() {
        ImageIcon b = new ImageIcon("qq.jpg");

        ImageIcon icon = new ImageIcon("siteIcon.png");

        JLabel photo = new JLabel();
        photo.setBounds(0, 0, 414, 687);
        photo.setIcon(b);

        JLabel UserNameLabel = new JLabel("Username:");
        UserNameLabel.setBounds(105, 120, 200, 40);
        UserNameLabel.setVisible(true);
        UserNameLabel.setFont(new Font("Calibri", Font.BOLD, 20));


        JTextField TxtForUserName = new JTextField();
        TxtForUserName.setBounds(105, 150, 200, 40);
        TxtForUserName.setVisible(true);
        TxtForUserName.setFont(new Font("Calibri", Font.BOLD, 20));

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(105, 200, 200, 40);
        passwordLabel.setFont(new Font("Calibri", Font.BOLD, 20));

        JPasswordField PasswordTxt = new JPasswordField();
        PasswordTxt.setBounds(105, 230, 200, 40);
        PasswordTxt.setFont(new Font(" Calibri", Font.BOLD, 20));

        JFrame MainFrame = new JFrame("Customer Login");
        MainFrame.setBounds(400, 30, 414, 687);
        MainFrame.setVisible(true);
        MainFrame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        MainFrame.setBackground(Color.BLUE);
        MainFrame.setForeground(Color.cyan);
        MainFrame.setResizable(false);
        MainFrame.setIconImage(icon.getImage());

        JButton BackBtn = new JButton("Home");
        BackBtn.setBounds(200, 500, 150, 40);
        BackBtn.setBackground(new Color(0xFFFFFF));
        BackBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        BackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstPage firstPage = new FirstPage();
                MainFrame.dispose();
            }
        });
        JLabel Empty = new JLabel();
        Empty.setBounds(0, 0, 12, 1131);

        JButton LoginBtn = new JButton("Login");
        LoginBtn.setBounds(105, 300, 200, 40);
        LoginBtn.setFont(new Font("Calibri", Font.BOLD, 22));
        LoginBtn.setBackground(new Color(0x1C4DEB));
        LoginBtn.setFocusable(true);
        LoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == LoginBtn) {
                    String user = TxtForUserName.getText();
                    String user2 = PasswordTxt.getText();
                    if (user.equals("customer") && user2.equals("customer")) {
                        MainFrame.dispose();
                        try {
                            CustomerPage f = new CustomerPage();
                        } catch (FileNotFoundException ex) {
                            ex.printStackTrace();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    } else {
                        JFrame WarningFrame = new JFrame("Warning");
                        WarningFrame.setBounds(290, 260, 540, 150);
                        WarningFrame.setVisible(true);

                        JLabel WarningLabel = new JLabel("\n Entered Username Or Password is Wrong!");
                        WarningLabel.setBounds(10, 340, 100, 150);
                        WarningLabel.setFont(new Font("Calibri", Font.BOLD, 22));
                        WarningLabel.setForeground(new Color(0xA80000));
                        JLabel image = new JLabel(new ImageIcon("War.png"));
                        image.setBounds(430,0,96,96);
                        WarningFrame.add(image);
                        WarningFrame.add(WarningLabel);
                    }
                }
            }
        });
        MainFrame.add(UserNameLabel);
        MainFrame.add(passwordLabel);
        MainFrame.add(UserNameLabel);

        MainFrame.add(TxtForUserName);
        MainFrame.add(PasswordTxt);
        MainFrame.add(LoginBtn);
        MainFrame.add(BackBtn);
        MainFrame.add(photo);
        MainFrame.add(Empty);
    }
}



