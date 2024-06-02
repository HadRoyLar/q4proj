
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.net.URL;
import jaco.mp3.player.MP3Player;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
GAMECODE: HadRoyLar
AUTOCODE: DisisK
ASSETS: maykhai
*/

public class menu implements ActionListener{
    JFrame frame;
    JLabel navback;
    JLabel menutxt;
    
    Font  f1  = new Font(Font.SANS_SERIF, Font.BOLD,  21);
    Font  f2  = new Font(Font.SANS_SERIF, Font.BOLD,  35);
    Font  f4  = new Font(Font.SANS_SERIF, Font.PLAIN,  17);
    Font f0 = new Font(Font.DIALOG, Font.BOLD, 30); 
    JButton auto;
    JButton game;
    JButton exit;
    JLabel img;
    JLabel diakomalandi;
    PlaySound bgMusic;
    ImageIcon windowicon;
    
    MP3Player player = new MP3Player();
    URL bgmuse;
    
    MP3Player press = new MP3Player();
    URL click;
    
    public menu() { 
        //RoundedButton Basics, example = new RoundedButton("text here", radius, shadeofgreywhenpressed,withborder,transpbackground)
        //*MAIN - FRAMEWORK - TEMP* navbar code
        frame=new JFrame("Menu");
        this.windowicon = new ImageIcon(getClass().getClassLoader().getResource("assets/illustration.png"));
        frame.setIconImage(windowicon.getImage());
        navback = new JLabel();
        menutxt = new JLabel("Prelude"); 
        diakomalandi = new JLabel("SixthMvt");
        //* END 
        auto = new JButton("Automation");
        game = new JButton("Game");
        exit = new JButton("Help"); 
        img = new JLabel(new ImageIcon(getClass().getResource("assets/bg.png")));
    }
   
    public void setFrame() {
        frame.setContentPane(img);
        frame.setLayout(new GraphPaperLayout(new Dimension(29,15)));
        frame.add(menutxt, new Rectangle(30, 26, 8, 1));
        frame.getContentPane().setBackground(new Color(113, 30, 37, 255));
        frame.setSize(1050,580);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        
       diakomalandi.setForeground(Color.WHITE);
       menutxt.setForeground(Color.WHITE);
       
        frame.add(auto, new Rectangle(11,2,20,2));
        frame.add(game, new Rectangle(11,5,20,2));
        frame.add(exit, new Rectangle(11,8,20,2));
        auto.setFont(f0);
        game.setFont(f0);
        exit.setFont(f0);
        game.addActionListener(this);
        frame.add(menutxt, new Rectangle(25, 14, 8, 1));
        menutxt.setFont(f1);
        menutxt.setHorizontalAlignment(JLabel.LEFT);
        menutxt.setVisible(true);
        menutxt.setOpaque(false);
        frame.add(diakomalandi, new Rectangle(1, 14, 8, 1));
        diakomalandi.setFont(f4);
        diakomalandi.setHorizontalAlignment(JLabel.LEFT);
        diakomalandi.setVisible(true);
        frame.add(navback, new Rectangle(0,14,42,2));
        navback.setBackground(new Color(67, 67, 67, 255));
        navback.setVisible(true);
        navback.setOpaque(true);
        navback.setBackground(new Color(200,200,200,90));
        frame.setVisible(true);
        exit.addActionListener(this);
        auto.addActionListener(this);
        
         try {
            bgmuse = new URL(getClass().getResource("assets/sadmenu.mp3").toExternalForm());
        } catch (MalformedURLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        player.addToPlayList(bgmuse);
        
        try {
            click = new URL(getClass().getResource("assets/click.mp3").toExternalForm());
        } catch (MalformedURLException ex) {
            Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        press.addToPlayList(click);
        

    player.setRepeat(true); 
    player.play();
        
    }
    
    public static void main(String[] args) throws FileNotFoundException
    {
        menu q = new menu();
        q.setFrame();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource()==(game)) {  
            press.play();
           
        }
        
        
        else if(e.getSource()==(auto)) {    
            
            
            press.play();
            
        }  
        else if(e.getSource()==(exit)) {
            
            game s = new game();
            frame.dispose();
            s.setFrame();
            press.play();
            player.stop();
                   
        }}

}
        
        
        
  



