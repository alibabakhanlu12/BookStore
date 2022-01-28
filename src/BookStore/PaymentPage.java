package BookStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PaymentPage {

    public PaymentPage() {
        AddGUI();
    }

    public void AddGUI() {
        JFrame MainFrame = new JFrame("Payment Page");

        ImageIcon icon = new ImageIcon("siteIcon.png");

        JLabel image = new JLabel(new ImageIcon("Back.jpg"));
        image.setBounds(0, 0, 700, 700);

        JLabel pay = new JLabel("Payment Page");
        pay.setBounds(100, 20, 500, 50);
        pay.setForeground(new Color(0xF7000000, true));
        pay.setFont(new Font("Calibri", Font.BOLD, 46));

        JLabel CardNumberLabel = new JLabel("Card Number:");
        CardNumberLabel.setBounds(105, 120, 200, 20);
        CardNumberLabel.setVisible(true);
        CardNumberLabel.setFont(new Font("Calibri", Font.BOLD, 16));


        JPasswordField TxtForCardNumber = new JPasswordField();
        TxtForCardNumber.setBounds(320, 120, 50, 25);
        TxtForCardNumber.setVisible(true);
        TxtForCardNumber.setFont(new Font("Calibri", Font.BOLD, 18));

        JPasswordField TxtForCardNumber2 = new JPasswordField();
        TxtForCardNumber2.setBounds(380, 120, 50, 25);
        TxtForCardNumber2.setVisible(true);
        TxtForCardNumber2.setFont(new Font("Calibri", Font.BOLD, 18));

        JPasswordField TxtForCardNumber3 = new JPasswordField();
        TxtForCardNumber3.setBounds(440, 120, 50, 25);
        TxtForCardNumber3.setVisible(true);
        TxtForCardNumber3.setFont(new Font("Calibri", Font.BOLD, 18));

        JPasswordField TxtForCardNumber4 = new JPasswordField();
        TxtForCardNumber4.setBounds(500, 120, 50, 25);
        TxtForCardNumber4.setVisible(true);
        TxtForCardNumber4.setFont(new Font("Calibri", Font.BOLD, 18));


        JLabel secondPass = new JLabel("Second Pass:");
        secondPass.setBounds(105, 180, 200, 25);
        secondPass.setFont(new Font("Calibri", Font.BOLD, 16));

        JPasswordField SecondPass = new JPasswordField();
        SecondPass.setBounds(320, 180, 60, 25);
        SecondPass.setFont(new Font(" Calibri", Font.BOLD, 18));

        JLabel Cvv2 = new JLabel("Cvv2:");
        Cvv2.setBounds(105, 240, 300, 25);
        Cvv2.setFont(new Font("RBNo2", Font.BOLD, 16));
        Cvv2.setFont(new Font("Calibri", Font.BOLD, 16));

        JPasswordField Cvv2Pass = new JPasswordField();
        Cvv2Pass.setBounds(320, 240, 60, 25);
        Cvv2Pass.setFont(new Font(" RBNo2", Font.BOLD, 18));

        JLabel date = new JLabel("Date:");
        date.setBounds(105, 300, 300, 30);
        date.setFont(new Font("RBNo2", Font.BOLD, 16));
        date.setFont(new Font("Calibri", Font.BOLD, 16));

        JTextField datePassYear = new JTextField();
        datePassYear.setBounds(320, 300, 50, 25);
        datePassYear.setFont(new Font(" RBNo2", Font.BOLD, 18));

        JTextField datePassMonth = new JTextField();
        datePassMonth.setBounds(380, 300, 50, 25);
        datePassMonth.setFont(new Font(" RBNo2", Font.BOLD, 18));

        JTextField datePassDay = new JTextField();
        datePassDay.setBounds(440, 300, 40, 25);
        datePassDay.setFont(new Font(" RBNo2", Font.BOLD, 18));

        JLabel EmailLabel = new JLabel("Email:");
        EmailLabel.setBounds(105, 360, 200, 20);
        EmailLabel.setFont(new Font("Calibri", Font.BOLD, 16));


        JTextField emailPass = new JTextField();
        emailPass.setBounds(320, 360, 200, 25);
        emailPass.setFont(new Font("Calibri", Font.BOLD, 18));


        JButton BackBtn = new JButton("Home");
        BackBtn.setBounds(5700, 10, 150, 30);
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


        JButton PayBtn = new JButton("Payment");
        PayBtn.setBounds(305, 450, 200, 40);
        PayBtn.setFont(new Font("RBNo2", Font.BOLD, 16));
        PayBtn.setBackground(new Color(0x1C4DEB));
        PayBtn.setFocusable(true);
        PayBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        PayBtn.setFocusable(false);
        PayBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == PayBtn) {
                    String ForCardNumber = TxtForCardNumber.getText();
                    String ForCardNumber2 = TxtForCardNumber2.getText();
                    String ForCardNumber3 = TxtForCardNumber3.getText();
                    String ForCardNumber4 = TxtForCardNumber4.getText();
                    String secondPass1 = SecondPass.getText();
                    String Cvc = Cvv2Pass.getText();
                    String PassYear = datePassYear.getText();
                    String PassMonth = datePassMonth.getText();
                    String PassDay = datePassDay.getText();
                    String EmailPass = emailPass.getText();
                    if (ForCardNumber.equals("1021") && ForCardNumber2.equals("1231")
                            && ForCardNumber3.equals("1324") && ForCardNumber4.equals("4252")
                            && secondPass1.equals("1381") && Cvc.equals("1231") && PassYear.equals("2024")
                            && PassMonth.equals("13") && PassDay.equals("04") && EmailPass.equals("admin@gmail.com")
                    ) {
                        MainFrame.dispose();
                        EndPage f = new EndPage();
                    } else {
                        JFrame WarningFrame = new JFrame("Warning");
                        WarningFrame.setBounds(290, 260, 540, 150);
                        WarningFrame.setVisible(true);

                        JLabel WarningLabel = new JLabel("\n Entered Information is Wrong!");
                        WarningLabel.setBounds(10, 340, 100, 150);
                        WarningLabel.setFont(new Font("Calibri", Font.BOLD, 22));
                        WarningLabel.setForeground(new Color(0xA80000));
                        JLabel image = new JLabel(new ImageIcon("War.png"));
                        image.setBounds(430, 0, 96, 96);
                        WarningFrame.add(image);
                        WarningFrame.add(WarningLabel);
                    }
                }
            }
        });

        MainFrame.setBounds(400, 60, 700, 700);
        MainFrame.setVisible(true);
        MainFrame.setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        MainFrame.setBackground(Color.BLUE);
        MainFrame.setForeground(Color.cyan);
        MainFrame.setResizable(false);
        MainFrame.setIconImage(icon.getImage());

        MainFrame.add(CardNumberLabel);
        MainFrame.add(Cvv2);
        MainFrame.add(secondPass);
        MainFrame.add(TxtForCardNumber);
        MainFrame.add(TxtForCardNumber2);
        MainFrame.add(TxtForCardNumber3);
        MainFrame.add(TxtForCardNumber4);
        MainFrame.add(datePassDay);
        MainFrame.add(EmailLabel);
        MainFrame.add(emailPass);
        MainFrame.add(secondPass);
        MainFrame.add(date);
        MainFrame.add(pay);
        MainFrame.add(datePassYear);
        MainFrame.add(datePassMonth);

        MainFrame.add(TxtForCardNumber);
        MainFrame.add(Cvv2Pass);
        MainFrame.add(PayBtn);
        MainFrame.add(BackBtn);
        MainFrame.add(SecondPass);
        MainFrame.add(image);
        MainFrame.add(Empty);

    }

    public static void main(String[] args) {
        PaymentPage f = new PaymentPage();
    }
}



