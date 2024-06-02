/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gf implements ActionListener {
    JFrame frame;
    JButton back;
    ImageIcon bg = new ImageIcon(getClass().getClassLoader().getResource("assets/1.png"));
    ImageIcon image;

    public gf() {
        frame = new JFrame("Definition of Terms");
        back = new JButton("Back");
        image = new ImageIcon(bg.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT));
        frame.setContentPane(new JLabel(image)); 
        
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == back) {
            frame.dispose();
        }
    }

    
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(24, 18)));
        back.setBackground(new Color(255, 240, 164));  
        back.setForeground(new Color(46, 134, 78));
        back.setFont(new Font("Courier New", Font.BOLD, 15));
        frame.add(back, new Rectangle(19, 16, 4, 1));

        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        back.addActionListener(this); 
    }

    public static void main(String[] args) {
        gf pg = new gf();
        pg.setFrame();
    }
}

