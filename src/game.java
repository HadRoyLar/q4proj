import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Royce Lariego
 */


public class game implements ActionListener{
    
     JFrame frame;
     JButton novak;
     JButton course;
     
     JButton ml;
     JButton tl;
     JButton br;
     JButton tr;
     
     /*
    
                  (var1)sin(var2)
     (tosolve) = ------------------
                     sin (var3)
     
     */
     
     JTextField alpha;
     JTextField beta;
     JTextField gamma;
     
     public game() {
         
         //Window Parameter
         frame = new JFrame("Game");
         novak = new JButton("");
         course = new JButton("CHANGE");
         
         
         for(int i=0; i==7; i++) {
             
         }
         
         //
         
         vars[0] = "a";
         vars[1] = "b";
         vars[2] = "c";
         vars[3] = "α";
         vars[4] = "β";
         vars[5] = "γ";
         vars[6] = "δ";
         vars[7] = "ε";
         
         s.init();
        t.init();
        u.init();
        v.init();
        w.init();
        x.init();
        y.init();
        z.init();
         
     }
     
     public void setFrame() {
        
         //Window Parameters
        frame.setLayout(new GraphPaperLayout(new Dimension(32, 18)));
        frame.setSize(1120, 630);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(novak, new Rectangle(14,8,2,2));
        frame.add(course, new Rectangle(16,8,2,2));
        novak.setText("HELS");
        
        novak.addActionListener(this);
        course.addActionListener(this);
        
        
     }
     
     public static void main(String[] args) {
        game x = new game();
        x.setFrame();
        
        
    }
     
     String[] vars = new String[8];
     
     RNG s = new RNG();
     RNG t = new RNG();
     RNG u = new RNG();
     RNG v = new RNG();
     RNG w = new RNG();
     RNG x = new RNG();
     RNG y = new RNG();
     RNG z = new RNG();
     
     int[] sk = new int[8];
     int g=0;
     
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==novak) {
            Random rand = new Random();
            
            sk = x.gen();
            System.out.println(Arrays.toString(sk));
            
            
            if(g>7) {
                g=0;
            }
            else{}
            
                novak.setText(vars[sk[g]]);
                g++;
                
                float r = (float) (rand.nextFloat() / 2f + 0.5);
float g =   (float) (rand.nextFloat() / 2f + 0.5);
float b =   (float) (rand.nextFloat() / 2f + 0.5);
                novak.setBackground(new Color(r,g,b));
                novak.setOpaque(false);
                novak.setFocusPainted(false);
                novak.setBorderPainted(false);
            
        }
        else if(e.getSource()==course) {
            x.randinit();
            
        }
        
        
        
        
        
    }
     
    public void blog() {
        
        
        
    }
    
}
