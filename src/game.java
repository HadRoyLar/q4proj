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
     JLabel sintop;
     JLabel sinbot;
     JLabel equal;
     JLabel fraction;
     
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
         
         
         ml = new JButton("97");
         tl = new JButton("(12)");
         br = new JButton("(16)");
         tr = new JButton("(12)");
         sintop = new JLabel("sin");
         sinbot = new JLabel("sin");
         equal = new JLabel("=");
         fraction = new JLabel("-----------------------------------------------------");
         
         
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
        novak.setText("HELS");
        
        novak.addActionListener(this);
        course.addActionListener(this);
        
        frame.add(ml, new Rectangle(9,9,2,2));
        frame.add(tl, new Rectangle(13,7,2,2));
        frame.add(sintop, new Rectangle(15,7,2,2));
        frame.add(tr, new Rectangle(17,7,2,2));
        frame.add(sinbot, new Rectangle(14,11,2,2));
        frame.add(br, new Rectangle(16,11,2,2));
        frame.add(equal, new Rectangle(11,9,2,2));
        frame.add(fraction, new Rectangle(13,9,6,2));
        
        ml.addActionListener(this);
        tl.addActionListener(this);
        tr.addActionListener(this);
        br.addActionListener(this);
        
        
     }
     
     public static void main(String[] args) {
        game x = new game();
        x.setFrame();
        
    }
     
     public void sequence() {
         
     }
     
     String[] vars = new String[8];
     
     
     RNG w = new RNG();
     RNG x = new RNG();
     RNG y = new RNG();
     RNG z = new RNG();
     
     int[] sk = new int[8];
     int a=0;
     int b=0;
     int c=0;
     int d=0;
     
     @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==ml) {
            Random rand = new Random();
            
            sk = w.gen();
            System.out.println(Arrays.toString(sk));
            
            
            if(a>7) {
                a=0;
            }
            else{}
            
                ml.setText(vars[sk[a]]);
                a++;
                
                float r = (float) (rand.nextFloat() / 2f + 0.5);
float g =   (float) (rand.nextFloat() / 2f + 0.5);
float b =   (float) (rand.nextFloat() / 2f + 0.5);
                ml.setBackground(new Color(r,g,b));
            
        }
        else if(e.getSource()==tl) {
            Random rand = new Random();
            
            sk = x.gen();
            System.out.println(Arrays.toString(sk));
            
            
            if(b>7) {
                b=0;
            }
            else{}
            
                tl.setText(vars[sk[b]]);
                b++;
                
                float r = (float) (rand.nextFloat() / 2f + 0.5);
float g =   (float) (rand.nextFloat() / 2f + 0.5);
float b =   (float) (rand.nextFloat() / 2f + 0.5);
                tl.setBackground(new Color(r,g,b));
        }
        else if(e.getSource()==tr) {
            Random rand = new Random();
            
            sk = y.gen();
            System.out.println(Arrays.toString(sk));
            
            
            if(c>7) {
                c=0;
            }
            else{}
            
                tr.setText(vars[sk[c]]);
                c++;
                
                float r = (float) (rand.nextFloat() / 2f + 0.5);
float g =   (float) (rand.nextFloat() / 2f + 0.5);
float b =   (float) (rand.nextFloat() / 2f + 0.5);
                tr.setBackground(new Color(r,g,b));
            
        }
        else if(e.getSource()==br) {
            Random rand = new Random();
            
            sk = z.gen();
            System.out.println(Arrays.toString(sk));
            
            
            if(d>7) {
                d=0;
            }
            else{}
            
                br.setText(vars[sk[d]]);
                d++;
                
                float r = (float) (rand.nextFloat() / 2f + 0.5);
float g =   (float) (rand.nextFloat() / 2f + 0.5);
float b =   (float) (rand.nextFloat() / 2f + 0.5);
               br.setBackground(new Color(r,g,b));
        }
        
        
        
        
    }
     
    
}
