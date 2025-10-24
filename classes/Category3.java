package classes;


import java.awt.*;


import javax.swing.*;


import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Category3 extends JFrame implements ActionListener {


    private Container c;


    private JButton sneaker;

    private JButton wsneaker;

    private JButton shoes;


    private JButton back;

    private JButton order;


    private JLabel nmsneaker;

    private JLabel prsneaker;

    private JLabel nmwsneaker;

    private JLabel prwsneaker;

    private JLabel nmshoes;

    private JLabel prshoes;


    private JLabel banner;


    private JButton csneaker;

    private JButton cwsneaker;

    private JButton cshoes;


    private JCheckBox rsneaker;

    private JCheckBox rwsneaker;

    private JCheckBox rshoes;


    private JComboBox<String> bsneaker;

    private JComboBox<String> bwsneaker;

    private JComboBox<String> bshoes;


    private String a[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private String b[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private String d[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};


    private String f;


    public Category3(String user) {

        ImageIcon framelogo = new ImageIcon("icons/Logo.jpg");
        setIconImage(framelogo.getImage());


        f = user;


        Icon bicon = new ImageIcon("icons/banner3.jpg");

        Icon msneaker = new ImageIcon("icons/msneaker.jpg");

        Icon womensneaker = new ImageIcon("icons/wsneaker.jpg");

        Icon mshoes = new ImageIcon("icons/mshoes.jpg");


        setTitle("Shoes");

        setBounds(0, 0, 900, 600);

        setLayout(null);

        setResizable(false);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);


        c = getContentPane();

        c.setLayout(null);

        //c.setBackground(Color.CYAN);


        back = new JButton("Back");

        back.setBounds(145, 500, 150, 50);

        //back.setBackground(Color.Teal);
		back.setBackground(Color.decode("#33C4FF"));

        back.setOpaque(true);

        back.addActionListener(this);

        c.add(back);


        order = new JButton("Place Order");

        order.setBounds(625, 500, 150, 50);

        //order.setBackground(Color.orange);
		order.setBackground(Color.decode("#33FF68"));

        order.setOpaque(true);

        order.addActionListener(this);

        c.add(order);


        banner = new JLabel(bicon);

        banner.setBounds(0, 0, 900, 150);

        c.add(banner);


        sneaker = new JButton(msneaker);

        sneaker.setBounds(120, 175, 200, 200);

        sneaker.addActionListener(this);

        c.add(sneaker);


        rsneaker = new JCheckBox("Men's Sneaker");

        rsneaker.setBounds(120, 385, 200, 30);

        rsneaker.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(rsneaker);


        prsneaker = new JLabel("2500 Tk");

        prsneaker.setBounds(150, 415, 150, 20);

        prsneaker.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(prsneaker);


        bsneaker = new JComboBox<String>(a);

       bsneaker.setBounds(120, 445, 70, 20);

        c.add(bsneaker);


        nmsneaker = new JLabel("Piece");

        nmsneaker.setBounds(200, 445, 50, 20);

        nmsneaker.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(nmsneaker);


        wsneaker = new JButton(womensneaker);

        wsneaker.setBounds(350, 175, 200, 200);

        wsneaker.addActionListener(this);

        c.add(wsneaker);


        rwsneaker = new JCheckBox("women's Sneaker");

        rwsneaker.setBounds(350, 385, 200, 30);

        rwsneaker.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(rwsneaker);


        prwsneaker = new JLabel("2300 Tk");

        prwsneaker.setBounds(380, 415, 150, 20);

        prwsneaker.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(prwsneaker);


        bwsneaker = new JComboBox<String>(b);

        bwsneaker.setBounds(350, 445, 70, 20);

        c.add(bwsneaker);


        nmwsneaker = new JLabel("Piece");

        nmwsneaker.setBounds(430, 445, 50, 20);

        nmwsneaker.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(nmwsneaker);


        shoes = new JButton(mshoes);

        shoes.setBounds(600, 175, 200, 200);

        shoes.addActionListener(this);

        c.add(shoes);


        rshoes = new JCheckBox("Men Formal Shoes");

        rshoes.setBounds(600, 385, 200, 30);

        rshoes.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(rshoes);


        prshoes = new JLabel("3200 Tk");

        prshoes.setBounds(630, 415, 150, 20);

        prshoes.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(prshoes);


        bshoes = new JComboBox<String>(b);

        bshoes.setBounds(600, 445, 70, 20);

        c.add(bshoes);


        nmshoes = new JLabel("Piece");

        nmshoes.setBounds(680, 445, 150, 20);

        nmshoes.setFont(new Font("Areal", Font.PLAIN, 15));

        c.add(nmshoes);


        setVisible(true);


    }


    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == back) {

            new AmaderDokan(f);

            setVisible(false);

        } else if (e.getSource() == order) {
            double totalAmount = 0;
            double sneakeramount = 0;
            double wsneakeramount = 0;
            double shoesamount = 0;
            int a = 0;
            int b = 0;
            int c = 0;


            if (rsneaker.isSelected() == true) {
                a = (bsneaker.getSelectedIndex()) + 1;
                sneakeramount = a * 2500;
            }
            if (rwsneaker.isSelected() == true) {
                b = bwsneaker.getSelectedIndex() + 1;
                wsneakeramount = b * 2300;
            }
            if (rshoes.isSelected() == true) {
                c = bshoes.getSelectedIndex() + 1;
                shoesamount = c * 3200;
            }

            totalAmount = sneakeramount +
                    wsneakeramount +
                    shoesamount;
            if (totalAmount != 0) {
                int x = JOptionPane.showConfirmDialog(null, "Your Bill = " + totalAmount + " tk. Confirm Order?", " Conformation of Oder", 0);
                if (x == 0) {
                    setVisible(false);
                    new Payment(totalAmount, "Category3", f);

                    try {
                        File newfile = new File("data\\Last.txt");
                        newfile.createNewFile();
                        FileWriter file = new FileWriter("data\\Last.txt");

                        file.write("Sneaker--- " + a + " Piece----" + sneakeramount + " tk."
                                + "\nWsneaker----" + b + " Piece---" + wsneakeramount + " tk."
                                + "\nShoes---" + c + " Piece---" + shoesamount + " tk."
                                + "\n" + totalAmount + " tk Total.");
                        file.close();

                    } catch (IOException io) {
                        JOptionPane.showMessageDialog(null, "An error Occured and failed to create the file");
                        io.printStackTrace();
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select something before placing order!", "Message", 0);
            }
        }


    }


}