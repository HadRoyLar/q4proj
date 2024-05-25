
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Royce Lariego
 */
public class game implements ActionListener {

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
    
    JTextField hyt;

    public game() {

        //Window Parameter
        frame = new JFrame("Game");
        novak = new JButton("");
        course = new JButton("CHANGE");
        hyt = new JTextField("");

        ml = new JButton("97");
        tl = new JButton("(12)");
        br = new JButton("(16)");
        tr = new JButton("(12)");
        sintop = new JLabel("sin");
        sinbot = new JLabel("sin");
        equal = new JLabel("=");
        fraction = new JLabel("-----------------------------------------------------");

        for (int i = 0; i == 7; i++) {

            
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

        frame.add(ml, new Rectangle(9, 9, 2, 2));
        frame.add(tl, new Rectangle(13, 7, 2, 2));
        frame.add(sintop, new Rectangle(15, 7, 2, 2));
        frame.add(tr, new Rectangle(17, 7, 2, 2));
        frame.add(sinbot, new Rectangle(14, 11, 2, 2));
        frame.add(br, new Rectangle(16, 11, 2, 2));
        frame.add(equal, new Rectangle(11, 9, 2, 2));
        frame.add(fraction, new Rectangle(13, 9, 6, 2));

        ml.addActionListener(this);
        tl.addActionListener(this);
        tr.addActionListener(this);
        br.addActionListener(this);
        
        frame.add(hyt, new Rectangle(5,4,10,3));
        

    }

    public static void main(String[] args) {
        game x = new game();
        x.setFrame();

    }
    
    
    double s1; //equals to a
    double s2; //equals to b
    double s3; //equals to c
  
    
    public void sider() {
        
        do {
        angler();
        s1 = ThreadLocalRandom.current().nextDouble(4, 200 + 1);
        s1 = (double) Math.round(s1 * 100) / 100;
        System.out.println("Side 1:: "+s1); 
        s2 = ((s1*(Math.sin(Math.toRadians(a2))))/(Math.sin(Math.toRadians(a1))));
        s2 = (double) Math.round(s2 * 100) / 100;
        System.out.println("Side 2:: "+s2);
        s3 = ((s1*(Math.sin(Math.toRadians(a3))))/(Math.sin(Math.toRadians(a1))));
        s3 = (double) Math.round(s3 * 100) / 100;
        System.out.println("Side 3:: "+s3);
        }
        while((s1==s2) || (s1==s3) || (s2==s3));
        
    }
    double a1; //equals to alpha
    double a2; //equals to beta
    double a3; //equals to gamma
    
     public void angler() {
         
         
       try {
        do {
           a1 = ThreadLocalRandom.current().nextDouble(4, 100 + 1);
           a2 = ThreadLocalRandom.current().nextDouble(4, 100 + 1);
           a3 = ThreadLocalRandom.current().nextDouble(4, 100 + 1);
           
           a1 = (double) Math.round(a1 * 100) / 100;
        a2 = (double) Math.round(a2 * 100) / 100;
        a3 = (double) Math.round(a3 * 100) / 100;
           
        }
        while(((a1+a2+a3)!=180) || ((a1==a2) && (a2==a3) && (a1==a3)));
         }
         catch(ArithmeticException e) {
             System.out.println("Angle Generation Error");
        }
        System.out.println("Angles: "+a1+"+"+a2+"+"+a3+"="+(a1+a2+a3));
        
    }
     
     int decider;
     int velos;
     
     public void sequence() {
         sider();
         newline();
         decider = ThreadLocalRandom.current().nextInt(0, 2 + 1);
         velos = ThreadLocalRandom.current().nextInt(0, 1 + 1);
         
         switch(decider) {
             case 0 -> {
                 //case s1 (a) unknown
                 if(velos==0) {
                     //case beta(a2), b(s2) given
                     System.out.println("GivenIs:");
                     System.out.println("b = "+s1);
                     System.out.println("beta = "+a2);
                     System.out.println("gamma = "+a3);
                     System.out.println("I want to find: a = "+s1);
                     System.out.println("I want to find: alpha = "+a1);
                     
                 }
                 else if(velos==1) {
                     //case gamma(a3), c(s3) given
                     System.out.println("GivenIs:");
                     System.out.println("b = "+s1);
                     System.out.println("beta = "+a2);
                     System.out.println("gamma = "+a3);
                     System.out.println("I want to find: a = "+s1);
                     System.out.println("I want to find: alpha = "+a1);
                     
                     
                     
                 }
             }
             case 1 -> {
                 //case s2 (b) unknown
                 if(velos==0) {
                     //case alpha(a1), a(s1) given
                     if((ml.getText().equals(String.valueOf(s2)))&&
                             (tl.getText().equals(String.valueOf(s1)))&&
                             (tr.getText().equals(String.valueOf(a2)))&&
                             (br.getText().equals(String.valueOf(a1)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                     
                 }
                 else if(velos==1) {
                     //case gamma(a3), c(s3) given
                     if((ml.getText().equals(String.valueOf(s2)))&&
                             (tl.getText().equals(String.valueOf(s3)))&&
                             (tr.getText().equals(String.valueOf(a2)))&&
                             (br.getText().equals(String.valueOf(a3)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                              System.out.println("INCORRECT");
                             }
                 }
             }
             case 2 -> {
                 //case s3 (c) unknown
                 if(velos==0) {
                     //case alpha(a1), a(s1) given
                     if((ml.getText().equals(String.valueOf(s3)))&&
                             (tl.getText().equals(String.valueOf(s1)))&&
                             (tr.getText().equals(String.valueOf(a3)))&&
                             (br.getText().equals(String.valueOf(a1)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                 }
                 else if(velos==1) {
                     //case beta(a2), b(s2) given
                     if((ml.getText().equals(String.valueOf(s3)))&&
                             (tl.getText().equals(String.valueOf(s2)))&&
                             (tr.getText().equals(String.valueOf(a1)))&&
                             (br.getText().equals(String.valueOf(a2)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                 }
             }
         }
         
     }
     
     
     public void checker() {
         switch(decider) {
             case 0 -> {
                 //case s1 (a) unknown
                 if(velos==0) {
                     //case beta(a2), b(s2) given
                     if((ml.getText().equals(String.valueOf(s1)))&&
                             (tl.getText().equals(String.valueOf(s2)))&&
                             (tr.getText().equals(String.valueOf(a1)))&&
                             (br.getText().equals(String.valueOf(a2)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                         System.out.println("INCORRECT");
                             
                             }
                     
                 }
                 else if(velos==1) {
                     //case gamma(a3), c(s3) given
                     if((ml.getText().equals(String.valueOf(s1)))&&
                             (tl.getText().equals(String.valueOf(s3)))&&
                             (tr.getText().equals(String.valueOf(a1)))&&
                             (br.getText().equals(String.valueOf(a3)))) {
                             System.out.println("CORRECT");
                             
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                 }
             }
             case 1 -> {
                 //case s2 (b) unknown
                 if(velos==0) {
                     //case alpha(a1), a(s1) given
                     if((ml.getText().equals(String.valueOf(s2)))&&
                             (tl.getText().equals(String.valueOf(s1)))&&
                             (tr.getText().equals(String.valueOf(a2)))&&
                             (br.getText().equals(String.valueOf(a1)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                     
                 }
                 else if(velos==1) {
                     //case gamma(a3), c(s3) given
                     if((ml.getText().equals(String.valueOf(s2)))&&
                             (tl.getText().equals(String.valueOf(s3)))&&
                             (tr.getText().equals(String.valueOf(a2)))&&
                             (br.getText().equals(String.valueOf(a3)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                              System.out.println("INCORRECT");
                             }
                 }
             }
             case 2 -> {
                 //case s3 (c) unknown
                 if(velos==0) {
                     //case alpha(a1), a(s1) given
                     if((ml.getText().equals(String.valueOf(s3)))&&
                             (tl.getText().equals(String.valueOf(s1)))&&
                             (tr.getText().equals(String.valueOf(a3)))&&
                             (br.getText().equals(String.valueOf(a1)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                 }
                 else if(velos==1) {
                     //case beta(a2), b(s2) given
                     if((ml.getText().equals(String.valueOf(s3)))&&
                             (tl.getText().equals(String.valueOf(s2)))&&
                             (tr.getText().equals(String.valueOf(a1)))&&
                             (br.getText().equals(String.valueOf(a2)))) {
                             System.out.println("CORRECT");
                     }
                         
                     else {
                             System.out.println("INCORRECT");
                             }
                 }
             }
         }
     }
    
     public void newline() {
        vars[0] = String.valueOf(s1);
        vars[1] = String.valueOf(s2);
        vars[2] = String.valueOf(s3);
        vars[3] = String.valueOf(a1);
        vars[4] = String.valueOf(a2);
        vars[5] = String.valueOf(a3);
        vars[6] = String.valueOf((double) Math.round((ThreadLocalRandom.current().nextDouble(4, 100 + 1)) * 100) / 100);
        vars[7] = String.valueOf((double) Math.round((ThreadLocalRandom.current().nextDouble(4, 100 + 1)) * 100) / 100);
    }
     
    String[] vars = new String[8];

    RNG w = new RNG();
    RNG x = new RNG();
    RNG y = new RNG();
    RNG z = new RNG();

    int[] sk = new int[8];
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ml) {
            Random rand = new Random();

            sk = w.gen();
            System.out.println(Arrays.toString(sk));

            if (a > 7) {
                a = 0;
            } else {
            }

            ml.setText(vars[sk[a]]);
            a++;
            float r = (float) (rand.nextFloat() / 2f + 0.5);
            float g = (float) (rand.nextFloat() / 2f + 0.5);
            float b = (float) (rand.nextFloat() / 2f + 0.5);
            ml.setBackground(new Color(r, g, b));

        } else if (e.getSource() == tl) {
            Random rand = new Random();

            sk = x.gen();
            System.out.println(Arrays.toString(sk));

            if (b > 7) {
                b = 0;
            } else {
            }
            tl.setText(vars[sk[b]]);
            b++;

            float r = (float) (rand.nextFloat() / 2f + 0.5);
            float g = (float) (rand.nextFloat() / 2f + 0.5);
            float b = (float) (rand.nextFloat() / 2f + 0.5);
            tl.setBackground(new Color(r, g, b));
            
        } else if (e.getSource() == tr) {
            Random rand = new Random();

            sk = y.gen();
            System.out.println(Arrays.toString(sk));

            if (c > 7) {
                c = 0;
            } else {
            }

            tr.setText(vars[sk[c]]);
            c++;

            float r = (float) (rand.nextFloat() / 2f + 0.5);
            float g = (float) (rand.nextFloat() / 2f + 0.5);
            float b = (float) (rand.nextFloat() / 2f + 0.5);
            tr.setBackground(new Color(r, g, b));

            
        } else if (e.getSource() == br) {
            Random rand = new Random();

            sk = z.gen();
            System.out.println(Arrays.toString(sk));

            if (d > 7) {
                d = 0;
            } else {
            }
            br.setText(vars[sk[d]]);
            d++;
            float r = (float) (rand.nextFloat() / 2f + 0.5);
            float g = (float) (rand.nextFloat() / 2f + 0.5);
            float b = (float) (rand.nextFloat() / 2f + 0.5);
            br.setBackground(new Color(r, g, b));
        }

    }

}
