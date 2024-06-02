/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ADMIN
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class automations implements ActionListener{
    JFrame frame;
    JSpinner sideAfield, sideBfield, sideCfield, angleAfield, angleBfield, angleCfield;
    JLabel result, note, text, sideA, sideB, sideC, angleA, angleB, angleC;
    JButton calculate, formula, def, generate;
    ImageIcon bg;
    
    
    
    public automations(){
        frame = new JFrame("SAA Case of Law of Sines");
        calculate = new JButton("Calculate");
        def = new JButton("Definition");
        formula = new JButton("Formula");
        generate = new JButton("Generate");
        
        bg = new ImageIcon(getClass().getClassLoader().getResource("assets/auto bg.png"));
        
        frame.setContentPane(new JLabel(new ImageIcon(bg.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT))));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if (e.getSource() == calculate) {
            automation();
        } else if (e.getSource() == formula) {
            form();
        } else if (e.getSource() == def) {
            definition();
        } else if (e.getSource() == generate){
            generate();
        }
    }
    public void form() {
        formula pg = new formula();
        pg.setFrame();
        frame.dispose();
    }

    public void definition() {
        definition pg = new definition();
        pg.setFrame();
        frame.dispose();
    }
    public void generate(){
         String[] strings = {
            "Input values for Side a, Angle B, Angle A",
            "Input values for Side a, Angle C, Angle A",
            "Input values for Side b, Angle B, Angle A",
            "Input values for Side b, Angle B, Angle C",
            "Input values for Side c, Angle C, Angle B",
            "Input values for Side c, Angle C, Angle A"
    };
        Random random = new Random();
        String randStr = strings[random.nextInt(strings.length)];
        text.setText(randStr);

        // Add or modify text fields based on the randomly selected string
        if (randStr.equals("Input values for Side a, Angle B, Angle A")) {
            sideAfield = new JSpinner(new SpinnerNumberModel(0,0,100,1)); 
            sideA = new JLabel("Side a:");
            angleAfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleA = new JLabel("Angle A:");
            angleBfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleB = new JLabel("Angle B:");

            frame.add(sideA, new Rectangle(9,12,3,1));
            frame.add(sideAfield, new Rectangle(11,12,2,1));
            frame.add(angleA, new Rectangle(9,11,3,1));
            frame.add(angleAfield, new Rectangle(11,11,2,1));          
            frame.add(angleB, new Rectangle(9,10,3,1));
            frame.add(angleBfield, new Rectangle(11,10,2,1));
            
        } else if (randStr.equals("Input values for Side a, Angle C, Angle A")) {
            sideAfield = new JSpinner(new SpinnerNumberModel(0,0,100,1));
            sideA = new JLabel("Side a:");
            angleCfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleC = new JLabel("Angle C:");
            angleAfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleA = new JLabel("Angle A:");

            frame.add(sideA, new Rectangle(9,12,3,1));
            frame.add(sideAfield, new Rectangle(11,12,2,1));     
            frame.add(angleC, new Rectangle(9,11,3,1));
            frame.add(angleCfield, new Rectangle(11,11,2,1));            
            frame.add(angleA, new Rectangle(9,10,3,1));
            frame.add(angleAfield, new Rectangle(11,10,2,1)); 
            
        } else if (randStr.equals("Input values for Side b, Angle B, Angle A")) {
            sideBfield = new JSpinner(new SpinnerNumberModel(0,0,100,1));
            sideB = new JLabel("Side b:");
            angleBfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleB = new JLabel("Angle B:");
            angleAfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleA = new JLabel("Angle A:");

            frame.add(sideB, new Rectangle(9,12,3,1));
            frame.add(sideBfield, new Rectangle(11,12,2,1));
            
            frame.add(angleB, new Rectangle(9,11,3,1));
            frame.add(angleBfield, new Rectangle(11,11,2,1));
            
            frame.add(angleA, new Rectangle(9,10,3,1));
            frame.add(angleAfield, new Rectangle(11,10,2,1));
            
        } else if (randStr.equals("Input values for Side b, Angle B, Angle C")) {
            
            sideBfield = new JSpinner(new SpinnerNumberModel(0,0,100,1));
            sideB = new JLabel("Side b:");
            angleBfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleB = new JLabel("Angle B:");
            angleCfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleC = new JLabel("Angle C:");

            frame.add(sideB, new Rectangle(9,12,3,1));
            frame.add(sideBfield, new Rectangle(11,12,2,1));
            
            frame.add(angleB, new Rectangle(9,11,3,1));
            frame.add(angleBfield, new Rectangle(11,11,2,1));
            
            frame.add(angleC, new Rectangle(9,10,3,1));
            frame.add(angleCfield, new Rectangle(11,10,2,1));
            
        } else if (randStr.equals("Input values for Side c, Angle C, Angle B")) {
            sideCfield = new JSpinner(new SpinnerNumberModel(0,0,100,1));
            sideC = new JLabel("Side c:");
            angleBfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleB = new JLabel("Angle B:");
            angleCfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleC = new JLabel("Angle C:");

            frame.add(sideC, new Rectangle(9,12,3,1));
            frame.add(sideCfield, new Rectangle(11,12,2,1));
            
            frame.add(angleC, new Rectangle(9,11,3,1));
            frame.add(angleCfield, new Rectangle(11,11,2,1));
            
            frame.add(angleB, new Rectangle(9,10,3,1));
            frame.add(angleBfield, new Rectangle(11,10,2,1)); 

        } else if (randStr.equals("Input values for Side c, Angle C, Angle A")) {
            sideCfield = new JSpinner(new SpinnerNumberModel(0,0,100,1));
            sideC = new JLabel("Side c:");
            angleAfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleA = new JLabel("Angle A:");
            angleCfield = new JSpinner(new SpinnerNumberModel(0,0,180,1));
            angleC = new JLabel("Angle C:");

            frame.add(sideC, new Rectangle(9,12,3,1));
            frame.add(sideCfield, new Rectangle(11,12,2,1));
            
            frame.add(angleC, new Rectangle(9,11,3,1));
            frame.add(angleCfield, new Rectangle(11,11,2,1));
            
            frame.add(angleA, new Rectangle(9,10,3,1));
            frame.add(angleAfield, new Rectangle(11,10,2,1));
            
        }
      
        
    }
    public void automation(){
        double a = 0, b = 0, c = 0, A = 0, B = 0, C = 0, ARad, BRad, CRad;

        if (sideAfield != null && angleAfield != null && angleBfield != null) {
            a = (int) sideAfield.getValue();
            A = (int) angleAfield.getValue();
            B = (int) angleBfield.getValue();
            C = 180 - B - A;

            ARad = Math.toRadians(A);
            BRad = Math.toRadians(B);
            CRad = Math.toRadians(C);

            b = (a / Math.sin(ARad)) * Math.sin(BRad);
            c = (a / Math.sin(ARad)) * Math.sin(CRad);

            result.setText(String.format("<html>Side b: %.2f<br>Side c: %.2f<br>Angle C: %.2f</html>", b, c, C));
        } else if (sideAfield != null && angleAfield != null && angleCfield != null) {
            a = (int) sideAfield.getValue();
            A = (int) angleAfield.getValue();
            C = (int) angleCfield.getValue();
            B = 180 - A - C;

            ARad = Math.toRadians(A);
            BRad = Math.toRadians(B);
            CRad = Math.toRadians(C);

            b = (a / Math.sin(ARad)) * Math.sin(BRad);
            c = (a / Math.sin(ARad)) * Math.sin(CRad);

            result.setText(String.format("<html>Side b: %.2f<br>Side c: %.2f<br>Angle B: %.2f</html>", b, c, B));
        } else if (sideBfield != null && angleAfield != null && angleBfield != null) {
            b = (int) sideBfield.getValue();
            A = (int) angleAfield.getValue();
            B = (int) angleBfield.getValue();
            C = 180 - A - B;

            ARad = Math.toRadians(A);
            BRad = Math.toRadians(B);
            CRad = Math.toRadians(C);

            a = (b / Math.sin(BRad)) * Math.sin(ARad);
            c = (b / Math.sin(BRad)) * Math.sin(CRad);

            result.setText(String.format("<html>Side a: %.2f<br>Side c: %.2f<br>Angle C: %.2f</html>", a, c, C));
        } else if (sideBfield != null && angleBfield != null && angleCfield != null) {
            b = (int) sideBfield.getValue();
            B = (int) angleBfield.getValue();
            C = (int) angleCfield.getValue();
            A = 180 - B - C;

            ARad = Math.toRadians(A);
            BRad = Math.toRadians(B);
            CRad = Math.toRadians(C);

            a = (b / Math.sin(BRad)) * Math.sin(ARad);
            c = (b / Math.sin(BRad)) * Math.sin(CRad);

            result.setText(String.format("<html>Side a: %.2f<br>Side c: %.2f<br>Angle A: %.2f</html>", a, c, A));
        } else if (sideCfield != null && angleBfield != null && angleCfield != null) {
            c = (int) sideCfield.getValue();
            B = (int) angleBfield.getValue();
            C = (int) angleCfield.getValue();
            A = 180 - B - C;

            ARad = Math.toRadians(A);
            BRad = Math.toRadians(B);
            CRad = Math.toRadians(C);

            a = (c / Math.sin(CRad)) * Math.sin(ARad);
            b = (c / Math.sin(CRad)) * Math.sin(BRad);

            result.setText(String.format("<html>Side a: %.2f<br>Side b: %.2f<br>Angle A: %.2f</html>", a, b, A));
        } else if (sideCfield != null && angleAfield != null && angleCfield != null) {
            c = (int) sideCfield.getValue();
            A = (int) angleAfield.getValue();
            C = (int) angleCfield.getValue();
            B = 180 - A - C;

            ARad = Math.toRadians(A);
            BRad = Math.toRadians(B);
            CRad = Math.toRadians(C);

            a = (c / Math.sin(CRad)) * Math.sin(ARad);
            b = (c / Math.sin(CRad)) * Math.sin(BRad);

            result.setText(String.format("<html>Side a: %.2f<br>Side b: %.2f<br>Angle B: %.2f</html>", a, b +" degrees", B));
        }
    }
    public void setFrame(){
        frame.setLayout(new GraphPaperLayout(new Dimension(24, 18)));
        
        frame.add(calculate, new Rectangle(14,15,4,1));
        calculate.setBackground(new Color(255, 240, 164));  
        calculate.setForeground(new Color(46, 134, 78));
        calculate.setFont(new Font("Courier New", Font.BOLD, 15));
        
        frame.add(def, new Rectangle(2,10,4,1));
        def.setBackground(new Color(255, 240, 164));  
        def.setForeground(new Color(46, 134, 78));
        def.setFont(new Font("Courier New", Font.BOLD, 15));
        
        frame.add(formula, new Rectangle(2,12,4,1));
        formula.setBackground(new Color(255, 240, 164));  
        formula.setForeground(new Color(46, 134, 78));
        formula.setFont(new Font("Courier New", Font.BOLD, 15));
        
        frame.add(generate, new Rectangle(9,6,3,1));
        generate.setBackground(new Color(255, 240, 164));  
        generate.setForeground(new Color(46, 134, 78));
        generate.setFont(new Font("Courier New", Font.BOLD, 15));
        
        text = new JLabel("");
        frame.add(text, new Rectangle(13,6,12,1));
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Courier new", Font.BOLD, 16));
        
        result = new JLabel("");
        frame.add(result, new Rectangle(18,9,12,5));
        result.setForeground(Color.WHITE);
        result.setFont(new Font("Courier new", Font.BOLD, 16));
        
        note = new JLabel("  Note: Can only be generated once.");
        frame.add(note, new Rectangle(0,16,9,1));
        note.setBackground(new Color(157, 131, 6)); 
        note.setForeground(Color.WHITE);
        note.setOpaque(true);
        note.setFont(new Font("Courier new", Font.BOLD, 15));
        
        frame.setVisible(true);
        frame.setSize(1000, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        calculate.addActionListener(this);
        def.addActionListener(this);
        formula.addActionListener(this);
        generate.addActionListener(this);
    }
    
    public static void main(String[] args) {
        automations pg = new automations();
        pg.setFrame();
    }
}
