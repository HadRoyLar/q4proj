
import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

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

    
     Font f0 = new Font(Font.DIALOG, Font.BOLD, 15); 
      Font f1 = new Font(Font.SANS_SERIF, Font.TRUETYPE_FONT, 15); 
      Font f2 = new Font(Font.SERIF, Font.TRUETYPE_FONT, 25); 
     
    JButton ml;
    JButton tl;
    JButton br;
    JButton tr;
    JLabel sintop;
    JLabel sinbot;
    JLabel equal;
    JLabel fraction;
    JButton NEWS;
    JLabel AS1;
    JLabel AS2;
    JLabel AS3;
    JLabel timex;
    JLabel highscore;
    int hscore = 0;
    JLabel a180;
    JLabel aeq;
    JLabel p1;
    JLabel p2;
    JLabel p3;
    JLabel triangle;
    
    JLabel hscoretxt;
    JLabel prompt;
    JLabel leaderboard;
    
     MP3Player player = new MP3Player();
    URL bgmuse;
    
    MP3Player press = new MP3Player();
    URL click;
    

    
    /*
    
                  (var1)sin(var2)
     (tosolve) = ------------------
                     sin (var3)
     
     */
    
    
    JTextField α;
    JTextField β;
    JTextField γ;
    int tme = 0;
    
    
    JLabel bg;
    JLabel given = new JLabel("Given is:");
    
    ImageIcon img;
    ImageIcon xe;
    
    
    Timer timer = new Timer(1000, new ActionListener() {
            

            @Override
            public void actionPerformed(ActionEvent e) {
                if (tme==60) {
                    res();
                }
                int yme = 60-tme++;
               timex.setText(String.valueOf(yme));
               frame.invalidate();
               frame.validate();
               if(yme<11) {
                   timex.setForeground(Color.red);
                   press.play();
               }
            }
        });

    JButton sendsel;
    
    public void scorer() {

        int randtime = ThreadLocalRandom.current().nextInt(5, 19 + 1);
        tme-=800;
        int randscor = ThreadLocalRandom.current().nextInt(100, 149 + 1);
        hscore=+randscor;
        highscore.setText(String.valueOf(hscore));
        
        
    }

    
    public game() {
        //Window Parameter
        frame = new JFrame("Game");
        novak = new JButton("");
        course = new JButton("CHANGE");
        NEWS = new JButton("START");
        ml = new JButton("97");
        tl = new JButton("(12)");
        br = new JButton("(16)");
        tr = new JButton("(12)");
        prompt = new JLabel("<html>Complete the formula step by step. Finish the angles on the figure first (figure not for scale). Then select the correct values for the equation using the buttons. Click on <b>start</b> to start. To submit finished equation, press <b>next</b>.</html>");
        sintop = new JLabel("sin");
        sinbot = new JLabel("sin");
        equal = new JLabel("=");
        fraction = new JLabel("------------------------------------------------");
        xe = new ImageIcon(getClass().getClassLoader().getResource("assets/illustration.png"));
        triangle = new JLabel(new ImageIcon(xe.getImage().getScaledInstance(320, 180,  java.awt.Image.SCALE_FAST)));
        prompt.setFont(f1);
        sendsel = new JButton("sendsel");
        a180 = new JLabel("180°");
        leaderboard = new JLabel();
        
        

        AS1 = new JLabel("A");
        AS2 = new JLabel("B");
        AS3 = new JLabel("C");

        α = new JTextField("α");
        β = new JTextField("β");
        γ = new JTextField("γ");

        for (int i = 0; i == 7; i++) {

        }
        //
        vars[0] = "a";
        vars[1] = "b";
        vars[2] = "c";
        vars[3] = α.getText();
        vars[4] = β.getText();
        vars[5] = γ.getText();
        vars[6] = "δ";
        vars[7] = "ε";

        w.init();
        x.init();
        y.init();
        z.init();
        
        timex = new JLabel("60");
        highscore = new JLabel("SCR");
        hscoretxt = new JLabel("HIGHSCORE");
        
        bg = new JLabel();
        aeq = new JLabel("=");
        p1 = new JLabel("+");
        p2= new JLabel("+");
        p3 = new JLabel("+");
        
        
         try {
            bgmuse = new URL(getClass().getResource("assets/game.mp3").toExternalForm());
        } catch (MalformedURLException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        player.addToPlayList(bgmuse);
        
        try {
            click = new URL(getClass().getResource("assets/click.mp3").toExternalForm());
        } catch (MalformedURLException ex) {
            Logger.getLogger(game.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        press.addToPlayList(click);
        

    player.setRepeat(true); 
  
       
    }
    
    int shownext;
    
    
    public void imageset() {
        
        int kj;
         kj = 1;
       
        
        switch(kj) {
            
            case 0 -> {
                
                try{
                this.img = new ImageIcon(getClass().getClassLoader().getResource("assets/bg.png"));
                bg.setIcon(new ImageIcon(img.getImage().getScaledInstance(1100, 600,  java.awt.Image.SCALE_FAST)));
                frame.repaint();
                frame.invalidate();
                frame.validate();
                
                }
                catch(Exception s) {
                    System.out.println("ImageFile Error");
                }
               
                
            }
            
            case 1 -> {
                try{
                this.img = new ImageIcon(getClass().getClassLoader().getResource("assets/bg with scroll.png"));
                bg.setIcon(new ImageIcon(img.getImage().getScaledInstance(1100, 600,  java.awt.Image.SCALE_FAST)));
                frame.repaint();
                frame.invalidate();
                frame.validate();
                }
                catch(Exception s) {
                    System.out.println("ImageFile Error");
                }
                
            }
        
    }
        
    }

    public void setFrame() {
         
timex.setFont(f2);
        //Window Parameters
        frame.setLayout(new GraphPaperLayout(new Dimension(32, 18)));
        frame.setSize(1104, 615);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(triangle, new Rectangle(18,0,10,10));
        frame.add(prompt, new Rectangle(3,0,8,5));
        frame.setResizable(false);
        novak.setText("HELS");

        
        frame.add(given, new Rectangle(2,5,10,1));
        given.setFont(f1);
        novak.addActionListener(this);
        course.addActionListener(this);
        
        
        frame.add(AS1, new Rectangle(5,6,8,1));
        frame.add(AS2, new Rectangle(5,7,8,1));
        frame.add(AS3, new Rectangle(5,8,8,1));
        
        frame.add(α, new Rectangle(18, 8, 2, 1));
        α.setHorizontalAlignment(JTextField.CENTER);
        
        
        frame.add(β, new Rectangle(24, 2, 2, 1));
        β.setHorizontalAlignment(JTextField.CENTER);
        
        
        frame.add(γ, new Rectangle(26, 7, 2, 1));
        γ.setHorizontalAlignment(JTextField.CENTER);
        
        frame.add(leaderboard, new Rectangle(4,10,5,1));
        leaderboard.setFont(f1);
        leaderboard.setForeground(Color.WHITE);
        frame.add(ml, new Rectangle(18, 11, 2, 2));
        frame.add(tl, new Rectangle(22, 9, 2, 2));
        frame.add(sintop, new Rectangle(24, 9, 2, 2));
        frame.add(tr, new Rectangle(26, 9, 2, 2));
        frame.add(sinbot, new Rectangle(24, 13, 2, 2));
        frame.add(br, new Rectangle(26, 13, 2, 2));
        frame.add(equal, new Rectangle(20,11, 2, 2));
        equal.setHorizontalAlignment(JTextField.CENTER);
        frame.add(fraction, new Rectangle(22, 11, 6, 2));
        fraction.setHorizontalAlignment(JTextField.CENTER);
        frame.add(NEWS, new Rectangle(27, 16, 3, 1));
        frame.add(sendsel, new Rectangle(24, 4, 2, 2));
        sendsel.setVisible(false);
        frame.add(timex, new Rectangle(29,1,2,2));
        frame.add(highscore, new Rectangle(10,5,2,2));
        highscore.setVisible(false);
        
        sintop.setHorizontalAlignment(JLabel.CENTER);

        ml.addActionListener(this);
        tl.addActionListener(this);
        tr.addActionListener(this);
        br.addActionListener(this);

        NEWS.addActionListener(this);
        sendsel.addActionListener(this);


        α.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                init();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                init();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        β.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                init();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                init();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        γ.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                init();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                init();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        
        
        frame.add(bg, new Rectangle(0,0,32,18));
        saver();
        imageset();
        
        tr.setFont(f0);
        tl.setFont(f0);
        br.setFont(f0);
        ml.setFont(f0);
        
        br.setMargin(new Insets(0,0,0,0));
        tr.setMargin(new Insets(0,0,0,0));
        tl.setMargin(new Insets(0,0,0,0));
        ml.setMargin(new Insets(0,0,0,0));
        
        saver();
    }
    
    public void res() {
        timer.stop();
        saver();
        NEWS.setEnabled(false);
        player.stop();
    }
    
    
    
    String playername = "Elite";
    
    public void saver() {
            try {
                File haynaku = new File("save.txt");
                Scanner guy = new Scanner(haynaku);
                playername = guy.nextLine();
                String duha = guy.nextLine();
                tempread = Integer.parseInt(duha);
                
                try (FileWriter ohio = new FileWriter("save.txt")) {
                    ohio.write(playername+"\n");
                    if(hscore>tempread) {
                        ohio.write(hscore+"\n");
                        highscore.setText(hscore+"");
                        
                    }
                    else {
                        
                        ohio.write(tempread+"\n");
                        hscore = tempread;
                        highscore.setText(tempread+"");
                    }   }
            catch(IOException s) {
                System.out.println("Save Error");
            }
            }
                catch(FileNotFoundException | NumberFormatException u) {
                try (FileWriter ohio = new FileWriter("save.txt")) {
                    ohio.write(playername+"\n");
                    hscore = 100;
                    if(hscore>tempread) {
                        ohio.write(hscore+"\n");
                        highscore.setText(hscore+"");
                    }
                    else {
                        ohio.write(tempread+"\n");
                        highscore.setText(tempread+"");
                    }   }
            catch(IOException s) {
                System.out.println("Save Error");
            }
            }
            
            leaderboard.setText("<html>Score <b>"+hscore+"</b> by <b>"+playername+"</b></html>");

    }
    
    int tempread = 0;
    
   
    public static void main(String[] args) {
        
        game x = new game();
        x.setFrame();

    }

    double s1; //equals to a
    double s2; //equals to b
    double s3; //equals to c
    
    public void illus() {
        
    }

    public void sider() {

        do {
            angler();
            s1 = ThreadLocalRandom.current().nextDouble(4, 85 + 1);
            s1 = (double) Math.round(s1 * 100) / 100;
            System.out.println("Side 1:: " + s1);
            s2 = ((s1 * (Math.sin(Math.toRadians(a2)))) / (Math.sin(Math.toRadians(a1))));
            s2 = (double) Math.round(s2 * 100) / 100;
            System.out.println("Side 2:: " + s2);
            s3 = ((s1 * (Math.sin(Math.toRadians(a3)))) / (Math.sin(Math.toRadians(a1))));
            s3 = (double) Math.round(s3 * 100) / 100;
            System.out.println("Side 3:: " + s3);
        } while ((s1 == s2) || (s1 == s3) || (s2 == s3));
        
        
        newline();
        
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

            } while (((a1 + a2 + a3) != 180) || ((a1 == a2) && (a2 == a3) && (a1 == a3)) || (((a1 + a2 + a3) != 180) && ((a1 == a2) && (a2 == a3) && (a1 == a3))));
        } catch (ArithmeticException e) {
            System.out.println("Angle Generation Error");
        }
        System.out.println("Angles: " + a1 + "+" + a2 + "+" + a3 + "=" + (a1 + a2 + a3));

    }

    int decider;
    int velos;

    int[] ded;

    public void sequence() {

        sider();

        decider = ThreadLocalRandom.current().nextInt(0, 2 + 1);
        velos = ThreadLocalRandom.current().nextInt(0, 1 + 1);

        switch (decider) {
            case 0 -> {
                //case s1 (a) unknown
                
                 vars[0] = "a";
                    vars[1] = String.valueOf(s2);
                    vars[2] = String.valueOf(s3);
                    given.setText("Given are these values, when a is unknown:");
                    
                    
                if (velos == 0) {
                    //case beta(a2), b(s2) given
                     AS1.setText("b = " + s2);
                    AS2.setText("β = " + a2);
                    AS3.setText("γ = " + a3);
                    
                    
                    α.setText("α");
                    β.setText(a2 + "");
                    γ.setText(a3 + "");

                } else if (velos == 1) {
                    //case gamma(a3), c(s3) given
                    α.setText("α");
                    
                    β.setText(a2 + "");
                    γ.setText(a3 + "");
                    
                    AS1.setText("c = " + s3);
                    AS2.setText("β = " + a2);
                    AS3.setText("γ = " + a3);

                }
            }
            case 1 -> {
                //case s2 (b) unknown
                vars[0] = String.valueOf(s1);
                    vars[1] ="b";
                    vars[2] = String.valueOf(s3);
                    given.setText("Given are these values, when b is unknown:");
                    
                if (velos == 0) {
                    //case alpha(a1), a(s1) given
                    AS1.setText("a = " + s1);
                    AS2.setText("α = " + a1);
                    AS3.setText("γ = " + a3);
                    α.setText(a1 + "");
                    β.setText("β");
                    γ.setText(a3 + "");
                    
                    

                } else if (velos == 1) {
                    //case gamma(a3), c(s3) given
                   AS1.setText("c = " + s3);
                    AS2.setText("α = " + a1);
                    AS3.setText("γ = " + a3);
                    α.setText(a1 + "");
                    β.setText("β");
                    γ.setText(a3 + "");
                }
            }

            case 2 -> {
                //case s3 (c) unknown
                given.setText("Given are these values, when c is unknown:");
                vars[0] = String.valueOf(s1);
                    vars[1] = String.valueOf(s2);
                    vars[2] = "c";
                    
                if (velos == 0) {
                    //case alpha(a1), a(s1) given
                    AS1.setText("a = " + s1);
                    AS2.setText("α = " + a1);
                    AS3.setText("β = " + a2);
                    α.setText(a1 + "");
                    β.setText(a2 + "");
                    γ.setText("γ");
                } else if (velos == 1) {
                    //case beta(a2), b(s2) given
                    AS1.setText("b = " + s2);
                    AS2.setText("α = " + a1);
                    AS3.setText("β =` " + a2);
                    α.setText(a1 + "");
                    β.setText(a2 + "");
                    γ.setText("γ");
                    
                }
            }
        }
        
    }

    public void checker() {
        w.randinit();
        x.randinit();
        y.randinit();
        z.randinit();

        switch (decider) {
            case 0 -> {
                //case s1 (a) unknown
                if (velos == 0) {
                    //case beta(a2), b(s2) given
                    if ((ml.getText().equals(String.valueOf(s1)))
                            && (tl.getText().equals(String.valueOf(s2)))
                            && (tr.getText().equals(String.valueOf(a1)))
                            && (br.getText().equals(String.valueOf(a2))) && α.getText().equals(String.valueOf(a1))) {
                        System.out.println("CORRECT");
                        scorer();
                    } else {
                        System.out.println("INCORRECT");
                    }

                } else if (velos == 1) {
                    //case gamma(a3), c(s3) given
                    if ((ml.getText().equals(String.valueOf(s1)))
                            && (tl.getText().equals(String.valueOf(s3)))
                            && (tr.getText().equals(String.valueOf(a1)))
                            && (br.getText().equals(String.valueOf(a3))) && α.getText().equals(String.valueOf(a1))) {
                        System.out.println("CORRECT");
                        scorer();

                    } else {
                        System.out.println("INCORRECT");
                    }
                }
            }
            case 1 -> {
                //case s2 (b) unknown
                if (velos == 0) {
                    //case alpha(a1), a(s1) given
                    if ((ml.getText().equals(String.valueOf(s2)))
                            && (tl.getText().equals(String.valueOf(s1)))
                            && (tr.getText().equals(String.valueOf(a2)))
                            && (br.getText().equals(String.valueOf(a1))) && β.getText().equals(String.valueOf(a2))) {
                        System.out.println("CORRECT");
                        scorer();
                    } else {
                        System.out.println("INCORRECT");
                    }

                } else if (velos == 1) {
                    //case gamma(a3), c(s3) given
                    if ((ml.getText().equals(String.valueOf(s2)))
                            && (tl.getText().equals(String.valueOf(s3)))
                            && (tr.getText().equals(String.valueOf(a2)))
                            && (br.getText().equals(String.valueOf(a3))) && β.getText().equals(String.valueOf(a2))) {
                        System.out.println("CORRECT");
                        scorer();
                    } else {
                        System.out.println("INCORRECT");
                    }
                }
            }
            case 2 -> {
                //case s3 (c) unknown
                if (velos == 0) {
                    //case alpha(a1), a(s1) given
                    if ((ml.getText().equals(String.valueOf(s3)))
                            && (tl.getText().equals(String.valueOf(s1)))
                            && (tr.getText().equals(String.valueOf(a3)))
                            && (br.getText().equals(String.valueOf(a1))) && γ.getText().equals(String.valueOf(a3))) {
                        System.out.println("CORRECT");
                        scorer();
                    } else {
                        System.out.println("INCORRECT");
                    }
                } else if (velos == 1) {
                    //case beta(a2), b(s2) given
                    if ((ml.getText().equals(String.valueOf(s3)))
                            && (tl.getText().equals(String.valueOf(s2)))
                            && (tr.getText().equals(String.valueOf(a1)))
                            && (br.getText().equals(String.valueOf(a2))) && γ.getText().equals(String.valueOf(a3))) {
                        System.out.println("CORRECT");
                        scorer();
                    } else {
                        System.out.println("INCORRECT");
                    }}}}}

    public void newline() {

        vars[0] = String.valueOf(s1);
        vars[1] = String.valueOf(s2);
        vars[2] = String.valueOf(s3);
        vars[3] = α.getText();
        vars[4] = β.getText();
        vars[5] = γ.getText();
        vars[6] = String.valueOf((double) Math.round((ThreadLocalRandom.current().nextDouble(4, 100 + 1)) * 100) / 100);
        vars[7] = String.valueOf((double) Math.round((ThreadLocalRandom.current().nextDouble(4, 100 + 1)) * 100) / 100);

    }

    public void init() {
        vars[3] = α.getText();
        vars[4] = β.getText();
        vars[5] = γ.getText();
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
    int count;
    
    public void gty() {
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == sendsel) {
            gty();

        } else if (e.getSource() == NEWS) {

            if (count == 0) {
                sequence();
                timer.start();
                frame.invalidate();
                frame.validate();
                  player.play();
                  press.play();
                  NEWS.setText("NEXT");
            } else {
                checker();
                sequence();
            }
            count++;

        } else if (e.getSource() == ml) {
            press.play();
            Random rand = new Random();

            sk = w.gen();

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
            press.play();
            Random rand = new Random();

            sk = x.gen();

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
            press.play();
            Random rand = new Random();

            sk = y.gen();

            if (c > 7) {
                c = 0;
            } else {
            }

            tr.setText("("+vars[sk[c]]+")");
            c++;

            float r = (float) (rand.nextFloat() / 2f + 0.5);
            float g = (float) (rand.nextFloat() / 2f + 0.5);
            float b = (float) (rand.nextFloat() / 2f + 0.5);
            tr.setBackground(new Color(r, g, b));
            

        } else if (e.getSource() == br) {
            press.play();
            Random rand = new Random();
            
            sk = z.gen();

            if (d > 7) {
                d = 0;
            } else {
            }
            br.setText("( "+vars[sk[d]]+" )");
            d++;
            float r = (float) (rand.nextFloat() / 2f + 0.5);
            float g = (float) (rand.nextFloat() / 2f + 0.5);
            float b = (float) (rand.nextFloat() / 2f + 0.5);
            br.setBackground(new Color(r, g, b));
        }

    }

}
