package BookStore;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class CustomerPage {
    JFrame Mainframe;
    JLabel cPage, Image1, I2, I3, I4, I5, I6, I7, I8, I9, I10, empty, empty2, empty3;
    JPanel mainPanel;
    JScrollPane scroll;
    static JTextArea product1, p2, p3, p4, p5, p6, p7, p8, p9, p10, ShoppingCartTxtArea, ReportForShoppingCart;
    JButton backBtn, cartBtn, productBtn1, pBtn2, pBtn3, pBtn4, pBtn5, pBtn6, pBtn7, pBtn8, pBtn9, pBtn10;
    String one, two, three, four, five, six, seven, eight, nine, ten;
    ImageIcon icon = new ImageIcon("siteIcon.png");

    static String row11, row12, row13, row14;
    static String row_1, row_2, row_3, row_4;
    static String row_21, row_22, row_23, row_24;
    static String row211, row212, row213, row214;
    static String row_51, row_52, row_53, row_54;
    static String row_61, row_62, row_63, row_64;
    static String row_71, row_72, row_73, row_74;
    static String row_81, row_82, row_83, row_84;
    static String row_101, row_102, row_103, row_104;
    static String row_91, row_92, row_93, row_94;

    public CustomerPage() throws IOException {
        customerPage();
    }

    public void customerPage() throws IOException {

        ShoppingCartTxtArea = new JTextArea(12, 32);
        ShoppingCartTxtArea.setFont(new Font("Calibri", Font.BOLD, 26));

        ReportForShoppingCart = new JTextArea(12, 32);
        ReportForShoppingCart.setFont(new Font("Calibri", Font.BOLD, 26));

        Mainframe = new JFrame("Online Shop");
        empty = new JLabel(" ");
        empty.setBounds(0, 0, 10, 30);

        JLabel bgPic = new JLabel(new ImageIcon("B.jpg"));
        bgPic.setBounds(0, 0, 1100, 700);

        backBtn = new JButton("");
        backBtn.setIcon(new ImageIcon("SS.png"));
        backBtn.setBounds(1190, 20, 80, 45);
        backBtn.setBackground(new Color(0xFFFFFF));
        backBtn.setFont(new Font("Calibri", Font.BOLD, 18));
        backBtn.setFocusable(false);
        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mainframe.dispose();
                FirstPage f = new FirstPage();

            }
        });

        cartBtn = new JButton();
        cartBtn.setIcon(new ImageIcon("WW.png"));
        cartBtn.setFocusable(false);
        cartBtn.setBackground(new Color(0xFFFFFF));
        cartBtn.setBounds(1090, 20, 80, 45);
        cartBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mainframe.dispose();
                ShoppingCart d = new ShoppingCart();
            }
        });

        cPage = new JLabel("Book Shop");
        cPage.setFont(new Font("Arial", Font.BOLD, 40));
        cPage.setBounds(100, 20, 300, 40);
        cPage.setForeground(Color.white);

        File MyFile = new File("Store.txt");

        File photoFile = new File("PhotoFile.txt");
        try {
            if (MyFile.createNewFile()) {
                System.out.println("file with name " + MyFile.getName() + " created.");
            } else {
                System.out.println("");
            }
        } catch (IOException e) {
            e.getMessage();
        }
        try {
            if (photoFile.createNewFile()) {
                System.out.println("file with name " + photoFile.getName() + " created.");
            } else {
                System.out.println();
            }
        } catch (IOException e) {
            e.getMessage();
        }


        if (photoFile.exists()) {
            FileReader r = null;
            try {
                r = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader = new BufferedReader(r);
            int n1;
            String row;
            for (n1 = 1; (row = bufferedReader.readLine()) != null; n1 += 1) {
                if (n1 == 1) {
                    one = row;
                }
            }
        }

        Image1 = new JLabel(new ImageIcon(one));
        Image1.setBounds(100, 125, 250, 300);

        product1 = new JTextArea();
        product1.setBounds(100, 435, 250, 100);
        product1.setFont(new Font("Calibri", Font.BOLD, 30));
        product1.setEditable(false);

        if (MyFile.exists()) {
            FileReader p11 = null;
            try {
                p11 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader11 = new BufferedReader(p11);
            int n, o, m, p;

            n = 1;
            m = 2;
            o = 3;
            p = 4;
            while ((row11 = bufferedReader11.readLine()) != null && (row12 = bufferedReader11.readLine()) != null &&
                    (row13 = bufferedReader11.readLine()) != null && (row14 = bufferedReader11.readLine()) != null) {
                if (n == 1 && m == 2 && o == 3 && p == 4) {
                    product1.append(row11 + "\n" + row12);
                }
                n += 1;
                m += 1;
                o += 1;
                p += 1;
            }
        }
        productBtn1 = new JButton("Purchase");
        productBtn1.setFocusable(false);
        productBtn1.setFont(new Font("Calibri", Font.BOLD, 24));
        productBtn1.setBounds(100, 545, 250, 40);
        productBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                AddToShoppingCart d = new AddToShoppingCart();
                if (MyFile.exists()) {


                    FileReader p11 = null;
                    try {
                        p11 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader bufferedReader111 = new BufferedReader(p11);
                    int n, o, m, p;

                    n = 1;
                    m = 2;
                    o = 3;
                    p = 4;
                    while (true) {
                        try {
                            if (!((row11 = bufferedReader111.readLine()) != null && (row12 = bufferedReader111.readLine()) != null &&
                                    (row13 = bufferedReader111.readLine()) != null && (row14 = bufferedReader111.readLine()) != null))
                                break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (n == 1 && m == 2 && o == 3 && p == 4) {
                            ShoppingCartTxtArea.append(row11 + "\n" + row12 + "\n" + row13 + "\n" + row14 + "\n");
                            ReportForShoppingCart.append(row11 + "\n" + row12 + "\n" + row13 + "\n" + row14 + "\n");
                        }
                        n += 1;
                        m += 1;
                        o += 1;
                        p += 1;
                    }
                }
            }
        });

        if (photoFile.exists()) {
            FileReader photo2 = null;
            try {
                photo2 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader photoRead = new BufferedReader(photo2);
            int n2;
            String row2;
            for (n2 = 3; (row2 = photoRead.readLine()) != null; n2 += 1) {
                if (n2 == 4) {
                    two = row2;
                }
            }
        }

        I2 = new JLabel(new ImageIcon(two));
        I2.setBounds(407, 125, 250, 300);

        p2 = new JTextArea();
        p2.setBounds(407, 435, 250, 100);
        p2.setFont(new Font("Calibri", Font.BOLD, 30));
        p2.setEditable(false);

        if (MyFile.exists()) {
            FileReader p22 = null;
            try {
                p22 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader bufferedReader22 = new BufferedReader(p22);
            int n2Info, o2Info, m2Info, p2Info;

            for (n2Info = 6, m2Info = 7, o2Info = 8, p2Info = 9; (row_1 = bufferedReader22.readLine()) != null
                    && (row_2 = bufferedReader22.readLine()) != null &&
                    (row_3 = bufferedReader22.readLine()) != null && (row_4 = bufferedReader22.readLine()) != null;
                 n2Info += 1, m2Info += 1, o2Info += 1, p2Info += 1) {
                if (n2Info == 7 && m2Info == 8 && o2Info == 9 && p2Info == 10) {
                    p2.append(row_1 + "\n" + row_2);

                }

            }
        }
        pBtn2 = new JButton();
        pBtn2.setFocusable(false);
        pBtn2.setText("Purchase");
        pBtn2.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn2.setBounds(407, 545, 250, 40);
        pBtn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                AddToShoppingCart d = new AddToShoppingCart();
                if (MyFile.exists()) {


                    FileReader p22 = null;
                    try {
                        p22 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader bufferedReader222 = new BufferedReader(p22);
                    int n2Info, o2Info, m2Info, p2Info;
                    n2Info = 6;
                    m2Info = 7;
                    o2Info = 8;
                    p2Info = 9;

                    while (true) {
                        try {
                            if (!((row_1 = bufferedReader222.readLine()) != null
                                    && (row_2 = bufferedReader222.readLine()) != null &&
                                    (row_3 = bufferedReader222.readLine()) != null && (row_4 = bufferedReader222.readLine()) != null))
                                break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (n2Info == 7 && m2Info == 8 && o2Info == 9 && p2Info == 10) {
                            ShoppingCartTxtArea.append(row_1 + "\n" + row_2 + "\n" + row_3 + "\n" + row_4 + "\n");
                            ReportForShoppingCart.append(row_1 + "\n" + row_2 + "\n" + row_3 + "\n" + row_4 + "\n");
                        }
                        n2Info += 1;
                        m2Info += 1;
                        o2Info += 1;
                        p2Info += 1;
                    }
                }
            }
        });

        if (photoFile.exists()) {
            FileReader FR3 = null;

            try {
                FR3 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader BR3 = new BufferedReader(FR3);

            int n3;
            String row3;
            for (n3 = 5; (row3 = BR3.readLine()) != null; n3 += 1) {
                if (n3 == 7) {
                    three = row3;
                }
            }
        }

        I3 = new JLabel(new ImageIcon(three));

        I3.setBounds(714, 125, 250, 300);

        p3 = new JTextArea();
        p3.setBounds(714, 435, 250, 100);
        p3.setFont(new Font("Calibri", Font.BOLD, 30));
        p3.setEditable(false);

        if (MyFile.exists()) {
            FileReader fr3 = null;

            try {
                fr3 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br3 = new BufferedReader(fr3);
            int n_3, o_3, m_3, p_3;

            for (n_3 = 11, m_3 = 12, o_3 = 13, p_3 = 14; (row_21 = br3.readLine()) != null && (row_22 = br3.readLine()) != null &&
                    (row_23 = br3.readLine()) != null && (row_24 = br3.readLine()) != null; n_3 += 1, m_3 += 1, o_3 += 1, p_3 += 1) {
                if (n_3 == 13 && m_3 == 14 && o_3 == 15 && p_3 == 16) {
                    p3.append(row_21 + "\n" + row_22);
                }

            }
        }
        pBtn3 = new JButton();
        pBtn3.setFocusable(false);
        pBtn3.setText("Purchase");
        pBtn3.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn3.setBounds(714, 545, 250, 40);
        pBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                AddToShoppingCart d = new AddToShoppingCart();

                if (MyFile.exists()) {
                    FileReader fr3 = null;
                    try {
                        fr3 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader br3 = new BufferedReader(fr3);
                    int n_3, o_3, m_3, p_3;
                    n_3 = 11;
                    m_3 = 12;
                    o_3 = 13;
                    p_3 = 14;
                    while (true) {
                        try {
                            if (!((row_21 = br3.readLine()) != null && (row_22 = br3.readLine()) != null &&
                                    (row_23 = br3.readLine()) != null && (row_24 = br3.readLine()) != null))
                                break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (n_3 == 13 && m_3 == 14 && o_3 == 15 && p_3 == 16) {
                            ShoppingCartTxtArea.append(row_21 + "\n" + row_22 + "\n" + row_23 + "\n" + row_24 + "\n");
                            ReportForShoppingCart.append(row_21 + "\n" + row_22 + "\n" + row_23 + "\n" + row_24 + "\n");

                            n_3 += 1;
                            m_3 += 1;
                            o_3 += 1;
                            p_3 += 1;

                        }
                    }
                }
            }
        });

        if (photoFile.exists()) {
            FileReader FR4 = null;

            try {
                FR4 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader BR4 = new BufferedReader(FR4);
            int n4;
            String row4;
            for (n4 = 7; (row4 = BR4.readLine()) != null; n4 += 1) {
                if (n4 == 10) {
                    four = row4;
                }
            }
        }

        I4 = new JLabel(new ImageIcon(four));
        I4.setBounds(1021, 125, 250, 300);

        p4 = new JTextArea();
        p4.setBounds(1021, 435, 250, 100);
        p4.setFont(new Font("Calibri", Font.BOLD, 30));
        p4.setEditable(false);

        if (MyFile.exists()) {
            FileReader fr4 = null;
            try {
                fr4 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader br4 = new BufferedReader(fr4);

            int n_4, o_4, m_4, p_4;

            for (n_4 = 16, o_4 = 17, m_4 = 18, p_4 = 19; (row211 = br4.readLine()) != null && (row212 = br4.readLine()) != null &&
                    (row213 = br4.readLine()) != null && (row214 = br4.readLine()) != null; n_4 += 1, m_4 += 1, o_4 += 1, p_4 += 1) {
                if (n_4 == 19 && o_4 == 20 && m_4 == 21 && p_4 == 22) {
                    p4.append(row211 + "\n" + row212);
                }

            }
        }

        pBtn4 = new JButton();
        pBtn4.setFocusable(false);
        pBtn4.setText("Purchase");
        pBtn4.setFont(new Font("Calibri", Font.CENTER_BASELINE, 24));
        pBtn4.setBounds(1021, 545, 250, 40);
        pBtn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (MyFile.exists()) {
                    FileReader fr4 = null;
                    try {
                        fr4 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                    BufferedReader br4 = new BufferedReader(fr4);
                    int n_4, o_4, m_4, p_4;
                    n_4 = 16;
                    o_4 = 17;
                    m_4 = 18;
                    p_4 = 19;
                    while (true) {
                        try {
                            if (!((row211 = br4.readLine()) != null && (row212 = br4.readLine()) != null &&
                                    (row213 = br4.readLine()) != null && (row214 = br4.readLine()) != null)) {
                                break;
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        {
                            if (n_4 == 19 && o_4 == 20 && m_4 == 21 && p_4 == 22) {
                                ShoppingCartTxtArea.append(row211 + "\n" + row212 + "\n" + row213 + "\n" + row214 + "\n");
                                ReportForShoppingCart.append(row211 + "\n" + row212 + "\n" + row213 + "\n" + row214 + "\n");
                            }
                            n_4 += 1;
                            m_4 += 1;
                            o_4 += 1;
                            p_4 += 1;
                        }
                    }
                    AddToShoppingCart d = new AddToShoppingCart();
                }
            }
        });

        if (photoFile.exists()) {
            FileReader FR5 = null;
            {
                try {
                    FR5 = new FileReader(photoFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            BufferedReader BR5 = new BufferedReader(FR5);
            int n5;
            String row5;
            for (n5 = 9; (row5 = BR5.readLine()) != null; n5 += 1) {
                if (n5 == 13) {
                    five = row5;
                }
            }
        }

        I5 = new JLabel(new ImageIcon(five));
        I5.setBounds(100, 635, 250, 300);

        p5 = new JTextArea();
        p5.setBounds(100, 945, 250, 100);
        p5.setFont(new Font("Calibri", Font.BOLD, 30));
        p5.setEditable(false);

        if (MyFile.exists()) {
            FileReader fr5 = null;

            try {
                fr5 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br5 = new BufferedReader(fr5);

            int n_5, o_5, m_5, p_5;

            for (n_5 = 21, m_5 = 22, o_5 = 23, p_5 = 24; (row_51 = br5.readLine()) != null && (row_52 = br5.readLine()) != null &&
                    (row_53 = br5.readLine()) != null && (row_54 = br5.readLine()) != null; n_5 += 1, m_5 += 1, o_5 += 1, p_5 += 1) {
                if (n_5 == 25 && m_5 == 26 && o_5 == 27 && p_5 == 28) {
                    p5.append(row_51 + "\n" + row_52);
                }

            }
        }

        pBtn5 = new JButton();
        pBtn5.setFocusable(false);
        pBtn5.setText("Purchase");
        pBtn5.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn5.setBounds(100, 1055, 250, 40);
        pBtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (MyFile.exists()) {

                    FileReader fr5 = null;
                    try {
                        fr5 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader br5 = new BufferedReader(fr5);

                    int n_5, o_5, m_5, p_5;
                    n_5 = 21;
                    m_5 = 22;
                    o_5 = 23;
                    p_5 = 24;
                    while (true) {
                        try {
                            if (!((row_51 = br5.readLine()) != null && (row_52 = br5.readLine()) != null &&
                                    (row_53 = br5.readLine()) != null && (row_54 = br5.readLine()) != null)) {
                                break;
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (n_5 == 25 && m_5 == 26 && o_5 == 27 && p_5 == 28) {
                            ShoppingCartTxtArea.append(row_51 + "\n" + row_52 + "\n" + row_53 + "\n" + row_54 + "\n");
                            ReportForShoppingCart.append(row_51 + "\n" + row_52 + "\n" + row_53 + "\n" + row_54 + "\n");
                        }
                        n_5 += 1;
                        m_5 += 1;
                        o_5 += 1;
                        p_5 += 1;
                    }
                    AddToShoppingCart d = new AddToShoppingCart();
                }
            }
        });

        if (photoFile.exists()) {
            FileReader FR6 = null;

            try {
                FR6 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader BR6 = new BufferedReader(FR6);

            int n6;
            String row6;
            for (n6 = 11; (row6 = BR6.readLine()) != null; n6 += 1) {
                if (n6 == 16) {
                    six = row6;
                }
            }
        }

        I6 = new JLabel(new ImageIcon(six));
        I6.setBounds(407, 635, 250, 300);

        p6 = new JTextArea();
        p6.setBounds(407, 945, 250, 100);
        p6.setFont(new Font("Calibri", Font.BOLD, 30));
        p6.setEditable(false);

        if (MyFile.exists()) {
            FileReader fr6 = null;

            try {
                fr6 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br6 = new BufferedReader(fr6);

            int n_6, o_6, m_6, p_6;

            for (n_6 = 26, o_6 = 27, m_6 = 28, p_6 = 29; (row_61 = br6.readLine()) != null && (row_62 = br6.readLine()) != null &&
                    (row_63 = br6.readLine()) != null && (row_64 = br6.readLine()) != null; m_6 += 1, n_6 += 1, o_6 += 1, p_6 += 1) {
                if (n_6 == 31 && o_6 == 32 && m_6 == 33 && p_6 == 34) {
                    p6.append(row_61 + "\n" + row_62);
                }
            }
        }

        pBtn6 = new JButton();
        pBtn6.setFocusable(false);
        pBtn6.setText("Purchase");
        pBtn6.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn6.setBounds(407, 1055, 250, 40);
        pBtn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                AddToShoppingCart d = new AddToShoppingCart();

                if (MyFile.exists()) {
                    FileReader fr6 = null;
                    try {
                        fr6 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader br6 = new BufferedReader(fr6);
                    int n_6, o_6, m_6, p_6;
                    n_6 = 26;
                    o_6 = 27;
                    m_6 = 28;
                    p_6 = 29;
                    while (true) {
                        try {
                            if (!((row_61 = br6.readLine()) != null && (row_62 = br6.readLine()) != null &&
                                    (row_63 = br6.readLine()) != null && (row_64 = br6.readLine()) != null))
                                break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (n_6 == 31 && o_6 == 32 && m_6 == 33 && p_6 == 34) {
                            ShoppingCartTxtArea.append(row_61 + "\n" + row_62 + "\n" + row_63 + "\n" + row_64 + "\n");
                            ReportForShoppingCart.append(row_61 + "\n" + row_62 + "\n" + row_63 + "\n" + row_64 + "\n");
                        }
                        m_6 += 1;
                        n_6 += 1;
                        o_6 += 1;
                        p_6 += 1;
                    }
                }
            }
        });

        if (photoFile.exists()) {
            FileReader FR7 = null;

            try {
                FR7 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader BR7 = new BufferedReader(FR7);

            int n7;
            String row7;
            for (n7 = 13; (row7 = BR7.readLine()) != null; n7 += 1) {
                if (n7 == 19) {
                    seven = row7;
                }
            }
        }
        I7 = new JLabel(new ImageIcon(seven));
        I7.setBounds(714, 635, 250, 300);

        p7 = new JTextArea();
        p7.setBounds(714, 945, 250, 100);
        p7.setFont(new Font("Calibri", Font.BOLD, 30));
        p7.setEditable(false);

        if (MyFile.exists()) {
            FileReader fr7 = null;

            try {
                fr7 = new FileReader(MyFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            BufferedReader br7 = new BufferedReader(fr7);
            int n_7, o_7, m_7, p_7;

            for (n_7 = 31, o_7 = 32, m_7 = 33, p_7 = 34; (row_71 = br7.readLine()) != null && (row_72 = br7.readLine()) != null &&
                    (row_73 = br7.readLine()) != null && (row_74 = br7.readLine()) != null; n_7 += 1, m_7 += 1, o_7 += 1, p_7 += 1) {
                if (n_7 == 37 && o_7 == 38 && m_7 == 39 && p_7 == 40) {
                    p7.append(row_71 + "\n" + row_72);
                }
            }
        }
        pBtn7 = new JButton();
        pBtn7.setFocusable(false);
        pBtn7.setText("Purchase");
        pBtn7.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn7.setBounds(714, 1055, 250, 40);
        pBtn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (MyFile.exists()) {
                    FileReader fr7 = null;

                    try {
                        fr7 = new FileReader(MyFile);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    BufferedReader br7 = new BufferedReader(fr7);
                    int n_7, o_7, m_7, p_7;
                    n_7 = 31;
                    o_7 = 32;
                    m_7 = 33;
                    p_7 = 34;
                    while (true) {
                        try {
                            if (!((row_71 = br7.readLine()) != null && (row_72 = br7.readLine()) != null &&
                                    (row_73 = br7.readLine()) != null && (row_74 = br7.readLine()) != null))
                                break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        if (n_7 == 37 && o_7 == 38 && m_7 == 39 && p_7 == 40) {
                            ShoppingCartTxtArea.append(row_71 + "\n" + row_72 + "\n" + row_73 + "\n" + row_74 + "\n");
                        }
                        n_7 += 1;
                        m_7 += 1;
                        o_7 += 1;
                        p_7 += 1;
                    }
                    AddToShoppingCart d = new AddToShoppingCart();
                }
            }
        });

        if (photoFile.exists()) {
            FileReader FR8 = null;

            try {
                FR8 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader BR8 = new BufferedReader(FR8);
            int n8;
            String row8;
            for (n8 = 15; (row8 = BR8.readLine()) != null; n8 += 1) {
                if (n8 == 22) {
                    eight = row8;
                }
            }
        }

        I8 = new JLabel(new ImageIcon(eight));
        I8.setBounds(1021, 635, 250, 300);

        p8 = new JTextArea();
        p8.setBounds(1021, 945, 250, 100);
        p8.setFont(new Font("Calibri", Font.BOLD, 30));
        p8.setEditable(false);

        if (MyFile.exists()) {
            FileReader fr8 = null;
            {
                try {
                    fr8 = new FileReader(MyFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            BufferedReader br8 = new BufferedReader(fr8);
            int n_8, o_8, m_8, p_8;

            for (p_8 = 36, m_8 = 37, o_8 = 38, n_8 = 39; (row_81 = br8.readLine()) != null && (row_82 = br8.readLine()) != null &&
                    (row_83 = br8.readLine()) != null && (row_84 = br8.readLine()) != null; n_8 += 1, m_8 += 1, o_8 += 1, p_8 += 1) {
                if (p_8 == 43 && m_8 == 44 && o_8 == 45 && n_8 == 46) {
                    p8.append(row_81 + "\n" + row_82);
                }

            }
        }

        pBtn8 = new JButton();
        pBtn8.setFocusable(false);
        pBtn8.setText("Purchase");
        pBtn8.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn8.setBounds(1021, 1055, 250, 40);
        pBtn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (MyFile.exists()) {
                    AddToShoppingCart d = new AddToShoppingCart();
                    FileReader fr8 = null;
                    {
                        try {
                            fr8 = new FileReader(MyFile);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    BufferedReader br8 = new BufferedReader(fr8);
                    int n_8, o_8, m_8, p_8;
                    p_8 = 36;
                    m_8 = 37;
                    o_8 = 38;
                    n_8 = 39;
                    while (true) {
                        try {
                            if (!((row_81 = br8.readLine()) != null && (row_82 = br8.readLine()) != null &&
                                    (row_83 = br8.readLine()) != null && (row_84 = br8.readLine()) != null))
                                break;
                        } catch (IOException e) {

                        }

                        if (p_8 == 43 && m_8 == 44 && o_8 == 45 && n_8 == 46) {
                            ShoppingCartTxtArea.append(row_81 + "\n" + row_82 + "\n" + row_83 + "\n" + row_84 + "\n");
                            ReportForShoppingCart.append(row_81 + "\n" + row_82 + "\n" + row_83 + "\n" + row_84 + "\n");
                        }
                        n_8 += 1;
                        m_8 += 1;
                        o_8 += 1;
                        p_8 += 1;
                    }

                }
            }
        });


        if (photoFile.exists()) {
            FileReader FR9 = null;

            try {
                FR9 = new FileReader(photoFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            BufferedReader BR9 = new BufferedReader(FR9);
            int n9;
            String row9;
            for (n9 = 17; (row9 = BR9.readLine()) != null; n9 += 1) {
                if (n9 == 25) {

                    nine = row9;
                }
            }
        }
        I9 = new JLabel(new ImageIcon(nine));
        I9.setBounds(100, 1145, 250, 300);

        p9 = new JTextArea();
        p9.setBounds(100, 1455, 250, 100);
        p9.setFont(new Font("Calibri", Font.BOLD, 30));
        p9.setEditable(false);


        if (MyFile.exists()) {
            FileReader fr9 = null;
            {
                try {
                    fr9 = new FileReader(MyFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            BufferedReader br9 = new BufferedReader(fr9);

            int n_9, o_9, m_9, p_9;

            for (n_9 = 41, m_9 = 42, o_9 = 43, p_9 = 44; (row_91 = br9.readLine()) != null && (row_92 = br9.readLine()) != null &&
                    (row_93 = br9.readLine()) != null && (row_94 = br9.readLine()) != null; n_9 += 1, m_9 += 1, o_9 += 1, p_9 += 1) {
                if (n_9 == 49 && m_9 == 50 && o_9 == 51 && p_9 == 52) {
                    p9.append(row_91 + "\n" + row_92);
                }
            }
        }

        pBtn9 = new JButton();
        pBtn9.setFocusable(false);
        pBtn9.setText("Purchase");
        pBtn9.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn9.setBounds(100, 1565, 250, 40);
        pBtn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (MyFile.exists()) {
                    AddToShoppingCart d = new AddToShoppingCart();

                    FileReader fr9 = null;
                    {
                        try {
                            fr9 = new FileReader(MyFile);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    BufferedReader br9 = new BufferedReader(fr9);

                    int n_9, o_9, m_9, p_9;
                    n_9 = 41;
                    m_9 = 42;
                    o_9 = 43;
                    p_9 = 44;
                    while (true) {
                        try {
                            if (!((row_91 = br9.readLine()) != null && (row_92 = br9.readLine()) != null &&
                                    (row_93 = br9.readLine()) != null && (row_94 = br9.readLine()) != null))
                                break;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        if (n_9 == 49 && m_9 == 50 && o_9 == 51 && p_9 == 52) {
                            ShoppingCartTxtArea.append(row_91 + "\n" + row_92 + "\n" + row_93 + "\n" + row_94 + "\n");
                            ReportForShoppingCart.append(row_91 + "\n" + row_92 + "\n" + row_93 + "\n" + row_94 + "\n");
                        }
                        n_9 += 1;
                        m_9 += 1;
                        o_9 += 1;
                        p_9 += 1;
                    }
                }
            }
        });

        if (photoFile.exists()) {

            FileReader FR10 = null;
            {
                try {
                    FR10 = new FileReader(photoFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            BufferedReader BR10 = new BufferedReader(FR10);
            int n10;
            String row10;
            for (n10 = 19; (row10 = BR10.readLine()) != null; n10 += 1) {
                if (n10 == 28) {
                    ten = row10;
                }
            }
        }


        I10 = new JLabel(new ImageIcon(ten));
        I10.setBounds(407, 1145, 250, 300);

        p10 = new JTextArea();
        p10.setBounds(407, 1455, 250, 100);
        p10.setFont(new Font("Calibri", Font.BOLD, 30));

        if (MyFile.exists()) {
            FileReader fr10 = null;
            {
                try {
                    fr10 = new FileReader(MyFile);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            BufferedReader br10 = new BufferedReader(fr10);
            int n_10, o_10, m_10, p_10;

            for (n_10 = 46, m_10 = 47, o_10 = 48, p_10 = 49; (row_101 = br10.readLine()) != null && (row_102 = br10.readLine()) != null &&
                    (row_103 = br10.readLine()) != null && (row_104 = br10.readLine()) != null; n_10 += 1, m_10 += 1, o_10 += 1, p_10 += 1) {
                if (n_10 == 55 && m_10 == 56 && o_10 == 57 && p_10 == 58) {
                    p10.append(row_101 + "\n" + row_102);
                }
            }
        }

        pBtn10 = new JButton();
        pBtn10.setFocusable(false);
        pBtn10.setText("Purchase");
        pBtn10.setFont(new Font("Calibri", Font.BOLD, 24));
        pBtn10.setBounds(407, 1565, 250, 40);
        pBtn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (MyFile.exists()) {
                    AddToShoppingCart d = new AddToShoppingCart();

                    FileReader fr10 = null;
                    {
                        try {
                            fr10 = new FileReader(MyFile);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    BufferedReader br10 = new BufferedReader(fr10);
                    int n_10, o_10, m_10, p_10;
                    n_10 = 46;
                    m_10 = 47;
                    o_10 = 48;
                    p_10 = 49;

                    while (true) {
                        try {
                            if (!((row_101 = br10.readLine()) != null && (row_102 = br10.readLine()) != null &&
                                    (row_103 = br10.readLine()) != null && (row_104 = br10.readLine()) != null))
                                break;

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                        if (n_10 == 55 && m_10 == 56 && o_10 == 57 && p_10 == 58) {
                            ShoppingCartTxtArea.append(row_101 + "\n" + row_102 + "\n" + row_103 + "\n" + row_104 + "\n");
                            ReportForShoppingCart.append(row_101 + "\n" + row_102 + "\n" + row_103 + "\n" + row_104 + "\n");
                        }
                        n_10 += 1;
                        m_10 += 1;
                        o_10 += 1;
                        p_10 += 1;
                    }
                }
            }
        });

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.darkGray);

        scroll = new JScrollPane(mainPanel);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBackground(new Color(00));
        scroll.setForeground(new Color(00));
        empty2 = new JLabel(" ");
        empty2.setBounds(122, 0, 10, 30);


        Mainframe.setVisible(true);
        Mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Mainframe.setBounds(0, 0, 1371, 730);
        Mainframe.show();
        Mainframe.add(scroll, BorderLayout.CENTER);
        Mainframe.setIconImage(icon.getImage());

        empty3 = new JLabel("");
        empty3.setBounds(20, 2, 20, 33);

        mainPanel.add(bgPic);
        bgPic.add(Image1);
        bgPic.add(I2);
        bgPic.add(I3);
        bgPic.add(I5);
        bgPic.add(I4);
        bgPic.add(I6);
        bgPic.add(I7);
        bgPic.add(I8);
        bgPic.add(I9);
        bgPic.add(empty3);
        bgPic.add(I10);
        bgPic.add(backBtn);
        bgPic.add(cartBtn);
        bgPic.add(empty3);
        bgPic.add(empty);
        bgPic.add(product1);
        bgPic.add(p2);
        bgPic.add(p3);
        bgPic.add(p4);
        bgPic.add(p6);
        bgPic.add(p7);
        bgPic.add(p8);
        bgPic.add(p9);
        bgPic.add(p10);
        bgPic.add(pBtn3);
        bgPic.add(pBtn2);
        bgPic.add(pBtn4);
        bgPic.add(pBtn5);
        bgPic.add(pBtn6);
        bgPic.add(pBtn7);
        bgPic.add(pBtn8);
        bgPic.add(pBtn9);
        bgPic.add(pBtn10);
        bgPic.add(cPage);
        bgPic.add(p5);
        bgPic.add(productBtn1);
        bgPic.add(empty2);
    }

    public static void main(String[] args) throws IOException {
        CustomerPage c = new CustomerPage();
    }
}