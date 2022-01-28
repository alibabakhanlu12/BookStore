package BookStore;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SellerPage {

    static JFrame frame;
    static JLabel name, Price, code, Numbers, Empty, label, PagePhoto, welcomeLabel;
    static JTextField nameTxt, codeTxt, NumbersTxt, PriceTxt;
    static JTable table;
    static JScrollPane TableScroll;
    static JButton photoBtn, AddBtn, backToHome, ShowTable, Clear;
    static ImageIcon photo12;
    static JPanel panel;
    ImageIcon icon = new ImageIcon("siteIcon.png");

    static String[] photo = new String[10];
    static String[] nameArray = new String[10];
    static Double[] PriceArray = new Double[10];
    static long[] codeArray = new long[10];
    static long[] NumbersArray = new long[10];

    static File InformationFile;
    static File photoFile;
    static File ShoppingCartFile;
    static String EnteredName;
    static Double EnteredPrice;
    static long EnteredCode, EnteredNumbers;

    public SellerPage() throws IOException {
        sellerPage();
    }

    public void sellerPage() {

        frame = new JFrame();

        welcomeLabel = new JLabel();
        welcomeLabel.setText("Seller Page");
        welcomeLabel.setBounds(70, 10, 500, 70);
        welcomeLabel.setForeground(new Color(0xFFFFFF));
        welcomeLabel.setFont(new Font("Calibri", Font.BOLD, 60));

        backToHome = new JButton("");
        backToHome.setIcon(new ImageIcon("SS.png"));
        backToHome.setBounds(740, 10, 80, 45);
        backToHome.setBackground(new Color(0xFFFFFF));
        backToHome.setFont(new Font("Calibri", Font.BOLD, 18));
        backToHome.setFocusable(false);
        backToHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FirstPage f = new FirstPage();
            }
        });

        label = new JLabel("");
        label.setBounds(0, 23, 23, 32);

        photo12 = new ImageIcon("Back.jpg");
        PagePhoto = new JLabel();
        PagePhoto.setIcon(photo12);
        PagePhoto.setBounds(0, 0, 845, 726);

        name = new JLabel("Name  ");
        name.setBounds(110, 150, 100, 30);
        name.setForeground(new Color(0xFFFFFF));
        name.setFont(new Font("Calibri", Font.BOLD, 25));

        nameTxt = new JTextField();
        nameTxt.setBounds(210, 150, 100, 30);
        nameTxt.setFont(new Font("Calibri", Font.BOLD, 20));

        Price = new JLabel("Price ");
        Price.setBounds(110, 200, 100, 30);
        Price.setForeground(new Color(0xFFFFFF));
        Price.setFont(new Font("Calibri", Font.BOLD, 25));

        PriceTxt = new JTextField();
        PriceTxt.setBounds(210, 200, 100, 30);
        PriceTxt.setFont(new Font("Calibri", Font.BOLD, 25));

        code = new JLabel("Code  ");
        code.setBounds(110, 250, 100, 30);
        code.setForeground(new Color(0xFFFFFF));
        code.setFont(new Font("Calibri", Font.BOLD, 25));

        codeTxt = new JTextField();
        codeTxt.setBounds(210, 250, 100, 30);
        codeTxt.setFont(new Font("Calibri", Font.BOLD, 25));

        Numbers = new JLabel("Count  ");
        Numbers.setBounds(110, 300, 100, 30);
        Numbers.setForeground(new Color(0xFFFFFF));
        Numbers.setFont(new Font("Calibri", Font.BOLD, 25));

        NumbersTxt = new JTextField();
        NumbersTxt.setBounds(210, 300, 100, 30);
        NumbersTxt.setFont(new Font("Calibri", Font.BOLD, 25));

        Empty = new JLabel("");
        Empty.setBounds(0, 0, 100, 50);
        Empty.setFont(new Font("Calibri", Font.BOLD, 25));


        Clear = new JButton("Clear");
        Clear.setBackground(new Color(0xFFFFFF));
        Clear.setBounds(210, 360, 100, 30);
        Clear.setFocusable(false);
        Clear.setFont(new Font("Calibri", Font.BOLD, 25));
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");
            }
        });

        AddBtn = new JButton("Add");
        AddBtn.setBackground(new Color(0xFFFFFF));
        AddBtn.setBounds(210, 400, 100, 30);
        AddBtn.setFocusable(false);
        AddBtn.setFont(new Font("Calibri", Font.BOLD, 20));
        AddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    AddAction(event);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        photoFile = new File("PhotoFile.txt");
        try {
            if (photoFile.createNewFile()) {
                System.out.println("File with name PhotoFile Created!");
            } else {
            }
        } catch (IOException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }
        InformationFile = new File("Store.txt");
        try {
            if (InformationFile.createNewFile()) {
                System.out.println("File with name : " + InformationFile.getName() + " Created!");
            } else {
            }
        } catch (IOException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }
        ShoppingCartFile = new File("BookStore.ShoppingCart.txt");
        try {
            if (ShoppingCartFile.createNewFile()) {
                System.out.println("File with name   " + ShoppingCartFile.getName() + " Created!");
            } else {
            }
        } catch (IOException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }

        photoBtn = new JButton("Upload Photo");
        photoBtn.setBounds(200, 450, 140, 30);
        photoBtn.setBackground(new Color(0xFFFFFF));
        photoBtn.setFocusable(false);
        photoBtn.setFont(new Font("Calibri", Font.BOLD, 16));
        photoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                for (int i = 0; i < NumbersArray.length; i++) {
                    FileWriter writer = null;
                    try {
                        writer = new FileWriter(photoFile);

                        JFileChooser chooser = new JFileChooser();
                        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                                "JPG & png Images", "jpg", "png");
                        chooser.setFileFilter(filter);

                        int returnVal = chooser.showOpenDialog(null);
                        if (returnVal == JFileChooser.OPEN_DIALOG) {

                            photo[i] = chooser.getSelectedFile().getPath();
                            writer.append(photo[0] + "\n");
                            writer.append(photo[1] + "\n");
                            writer.append(photo[2] + "\n");
                            writer.append(photo[3] + "\n");
                            writer.append(photo[4] + "\n");
                            writer.append(photo[5] + "\n");
                            writer.append(photo[6] + "\n");
                            writer.append(photo[7] + "\n");
                            writer.append(photo[8] + "\n");
                            writer.append(photo[9] + "\n");
                        }
                        writer.close();
                    } catch (IOException e) {
                        System.out.println("we have Error ");
                        e.printStackTrace();
                    }

                }
            }
        });

        frame.add(PagePhoto);
        PagePhoto.add(AddBtn);
        PagePhoto.add(name);
        PagePhoto.add(Price);
        PagePhoto.add(codeTxt);
        PagePhoto.add(code);
        PagePhoto.add(PriceTxt);
        PagePhoto.add(nameTxt);
        PagePhoto.add(NumbersTxt);
        PagePhoto.add(Numbers);
        PagePhoto.add(photoBtn);
        PagePhoto.add(backToHome);
        PagePhoto.add(welcomeLabel);
        PagePhoto.add(label);
        PagePhoto.add(Clear);
        frame.add(Empty);

        ShowTable = new JButton(" Show Table");
        ShowTable.setFocusable(false);
        ShowTable.setBounds(200, 490, 140, 30);
        ShowTable.setBackground(new Color(0xFFFFFF));
        ShowTable.setFocusable(false);
        ShowTable.setFont(new Font("Calibri", Font.BOLD, 16));
        ShowTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object columns[][] = {
                        {1, nameArray[0], codeArray[0], NumbersArray[0], PriceArray[0]},
                        {2, nameArray[1], codeArray[1], NumbersArray[1], PriceArray[1]},
                        {3, nameArray[2], codeArray[2], NumbersArray[2], PriceArray[2]},
                        {4, nameArray[3], codeArray[3], NumbersArray[3], PriceArray[3]},
                        {5, nameArray[4], codeArray[4], NumbersArray[4], PriceArray[4]},
                        {6, nameArray[5], codeArray[5], NumbersArray[5], PriceArray[5]},
                        {7, nameArray[6], codeArray[6], NumbersArray[6], PriceArray[6]},
                        {8, nameArray[7], codeArray[7], NumbersArray[7], PriceArray[7]},
                        {9, nameArray[8], codeArray[8], NumbersArray[8], PriceArray[8]},
                        {10, nameArray[9], codeArray[9], NumbersArray[9], PriceArray[9]},
                };
                Object row[] = {"Number", "Name", "Code", "Count", "Price"};
                panel = new JPanel();
                panel.setBounds(350, 220, 470, 280);
                panel.setVisible(true);

                table = new JTable(columns, row);
                table.setVisible(true);
                table.setFocusable(false);
                table.setRowHeight(25);
                table.setGridColor(new Color(0x00266B));
                table.setFont(new Font("Calibri", Font.BOLD, 16));
                table.setFillsViewportHeight(true);

                TableScroll = new JScrollPane(table);
                TableScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

                panel.add(TableScroll);
                PagePhoto.add(panel);
            }
        });
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(190, 5, 845, 726);
        frame.setIconImage(icon.getImage());
        PagePhoto.add(ShowTable);
    }

    private static void AddAction(ActionEvent event) throws IOException {

        EnteredPrice = Double.valueOf(PriceTxt.getText());
        EnteredCode = Long.parseLong(codeTxt.getText());
        EnteredName = nameTxt.getText();
        EnteredNumbers = Integer.parseInt(NumbersTxt.getText());

        FileWriter myWriter = new FileWriter(InformationFile);
        try {

            if (nameArray[0] == null) {
                nameArray[0] = EnteredName;
                codeArray[0] = EnteredCode;
                PriceArray[0] = EnteredPrice;
                NumbersArray[0] = EnteredNumbers;
                System.out.println("Account " + (1) + " Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[1] == null) {
                nameArray[1] = EnteredName;
                codeArray[1] = EnteredCode;
                PriceArray[1] = EnteredPrice;
                NumbersArray[1] = EnteredNumbers;
                System.out.println("Account 2 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[2] == null) {
                nameArray[2] = EnteredName;
                codeArray[2] = EnteredCode;
                PriceArray[2] = EnteredPrice;
                NumbersArray[2] = EnteredNumbers;
                System.out.println("Account 3 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[3] == null) {
                nameArray[3] = EnteredName;
                codeArray[3] = EnteredCode;
                PriceArray[3] = EnteredPrice;
                NumbersArray[3] = EnteredNumbers;
                System.out.println("Account 4 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[4] == null) {
                nameArray[4] = EnteredName;
                codeArray[4] = EnteredCode;
                PriceArray[4] = EnteredPrice;
                NumbersArray[4] = EnteredNumbers;
                System.out.println("Account 5 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[5] == null) {
                nameArray[5] = EnteredName;
                codeArray[5] = EnteredCode;
                PriceArray[5] = EnteredPrice;
                NumbersArray[5] = EnteredNumbers;
                System.out.println("Account 6 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[6] == null) {
                nameArray[6] = EnteredName;
                codeArray[6] = EnteredCode;
                PriceArray[6] = EnteredPrice;
                NumbersArray[6] = EnteredNumbers;
                System.out.println("Account 7 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[7] == null) {
                nameArray[7] = EnteredName;
                codeArray[7] = EnteredCode;
                PriceArray[7] = EnteredPrice;
                NumbersArray[7] = EnteredNumbers;
                System.out.println("Account 8 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[8] == null) {
                nameArray[8] = EnteredName;
                codeArray[8] = EnteredCode;
                PriceArray[8] = EnteredPrice;
                NumbersArray[8] = EnteredNumbers;
                System.out.println("Account 9 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");

            } else if (nameArray[9] == null) {
                nameArray[9] = EnteredName;
                codeArray[9] = EnteredCode;
                PriceArray[9] = EnteredPrice;
                NumbersArray[9] = EnteredNumbers;
                System.out.println("Account 10 Created");
                nameTxt.setText("");
                PriceTxt.setText("");
                codeTxt.setText("");
                NumbersTxt.setText("");
                System.out.println(" All Accounts created  successfully");
            }
            for (int i = 0; i < nameArray.length; i++) {
                myWriter.write((i + 1) + " - Name :" + nameArray[i] + "\n");
                myWriter.write((i + 1) + " - Price :" + PriceArray[i] + " $\n");
                myWriter.write((i + 1) + " - Code :" + codeArray[i] + "\n");
                myWriter.write((i + 1) + " -  Number :" + NumbersArray[i] + "\n");

            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("There was an error!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        SellerPage d = new SellerPage();

    }
}