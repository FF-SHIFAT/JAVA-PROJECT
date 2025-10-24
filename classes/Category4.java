package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Category4 extends JFrame implements ActionListener {

    private Container c;

    private JButton dogFood;
    private JButton catFood;
    private JButton birdFood;

    private JButton back;
    private JButton order;

    private JLabel nmdogFood;
    private JLabel prdogFood;
    private JLabel nmcatFood;
    private JLabel prcatFood;
    private JLabel nmbirdFood;
    private JLabel prbirdFood;

    private JLabel banner;

    private JButton cdogFood;
    private JButton ccatFood;
    private JButton cbirdFood;

    private JCheckBox rdogFood;
    private JCheckBox rcatFood;
    private JCheckBox rbirdFood;

    private JComboBox<String> bdogFood;
    private JComboBox<String> bcatFood;
    private JComboBox<String> bbirdFood;

    private String a[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String b[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String d[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    private String f;

    public Category4(String user) {

        ImageIcon framelogo = new ImageIcon("icons/Logo.jpg");
        setIconImage(framelogo.getImage());

        f = user;

        Icon bicon = new ImageIcon("icons/banner4.jpg");
        Icon dogFoodIcon = new ImageIcon("icons/dogfood.jpg");
        Icon catFoodIcon = new ImageIcon("icons/catfood.jpg");
        Icon birdFoodIcon = new ImageIcon("icons/birdfood.jpg");

        setTitle("Pet Foods");

        setBounds(0, 0, 900, 600);

        setLayout(null);

        setResizable(false);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

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

        dogFood = new JButton(dogFoodIcon);
        dogFood.setBounds(120, 175, 200, 200);
        dogFood.addActionListener(this);
        c.add(dogFood);

        rdogFood = new JCheckBox("Dog Food");
        rdogFood.setBounds(120, 385, 200, 30);
        rdogFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(rdogFood);

        prdogFood = new JLabel("1500 Tk");
        prdogFood.setBounds(150, 415, 150, 20);
        prdogFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(prdogFood);

        bdogFood = new JComboBox<String>(a);
        bdogFood.setBounds(120, 445, 70, 20);
        c.add(bdogFood);

        nmdogFood = new JLabel("Piece");
        nmdogFood.setBounds(200, 445, 50, 20);
        nmdogFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(nmdogFood);

        catFood = new JButton(catFoodIcon);
        catFood.setBounds(350, 175, 200, 200);
        catFood.addActionListener(this);
        c.add(catFood);

        rcatFood = new JCheckBox("Cat Food");
        rcatFood.setBounds(350, 385, 200, 30);
        rcatFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(rcatFood);

        prcatFood = new JLabel("1200 Tk");
        prcatFood.setBounds(380, 415, 150, 20);
        prcatFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(prcatFood);

        bcatFood = new JComboBox<String>(b);
        bcatFood.setBounds(350, 445, 70, 20);
        c.add(bcatFood);

        nmcatFood = new JLabel("Piece");
        nmcatFood.setBounds(430, 445, 50, 20);
        nmcatFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(nmcatFood);

        birdFood = new JButton(birdFoodIcon);
        birdFood.setBounds(600, 175, 200, 200);
        birdFood.addActionListener(this);
        c.add(birdFood);

        rbirdFood = new JCheckBox("Bird Food");
        rbirdFood.setBounds(600, 385, 200, 30);
        rbirdFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(rbirdFood);

        prbirdFood = new JLabel("800 Tk");
        prbirdFood.setBounds(630, 415, 150, 20);
        prbirdFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(prbirdFood);

        bbirdFood = new JComboBox<String>(d);
        bbirdFood.setBounds(600, 445, 70, 20);
        c.add(bbirdFood);

        nmbirdFood = new JLabel("Piece");
        nmbirdFood.setBounds(680, 445, 150, 20);
        nmbirdFood.setFont(new Font("Arial", Font.PLAIN, 15));
        c.add(nmbirdFood);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            new AmaderDokan(f);
            setVisible(false);
        } else if (e.getSource() == order) {
            double totalAmount = 0;
            double dogFoodAmount = 0;
            double catFoodAmount = 0;
            double birdFoodAmount = 0;
            int a = 0;
            int b = 0;
            int c = 0;

            if (rdogFood.isSelected()) {
                a = bdogFood.getSelectedIndex() + 1;
                dogFoodAmount = a * 1500;
            }
            if (rcatFood.isSelected()) {
                b = bcatFood.getSelectedIndex() + 1;
                catFoodAmount = b * 1200;
            }
            if (rbirdFood.isSelected()) {
                c = bbirdFood.getSelectedIndex() + 1;
                birdFoodAmount = c * 800;
            }

            totalAmount = dogFoodAmount + catFoodAmount + birdFoodAmount;
            if (totalAmount != 0) {
                int x = JOptionPane.showConfirmDialog(null, "Your Bill = " + totalAmount + " tk. Confirm Order?", " Confirmation of Order", 0);
                if (x == 0) {
                    setVisible(false);
                    new Payment(totalAmount, "Category4", f);

                    try {
                        File newfile = new File("data\\Last.txt");
                        newfile.createNewFile();
                        FileWriter file = new FileWriter("data\\Last.txt");

                        file.write("Dog Food--- " + a + " Piece----" + dogFoodAmount + " tk."
                                + "\nCat Food----" + b + " Piece---" + catFoodAmount + " tk."
                                + "\nBird Food---" + c + " Piece---" + birdFoodAmount + " tk."
                                + "\n" + totalAmount + " tk Total.");
                        file.close();

                    } catch (IOException io) {
                        JOptionPane.showMessageDialog(null, "An error occurred and failed to create the file");
                        io.printStackTrace();
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select something before placing an order!", "Message", 0);
            }
        }
    }
}
