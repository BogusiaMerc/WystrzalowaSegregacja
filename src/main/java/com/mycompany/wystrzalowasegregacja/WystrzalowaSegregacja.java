
package com.mycompany.wystrzalowasegregacja;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WystrzalowaSegregacja extends JFrame {
     
    public JPanel game_window;
    private static boolean strzal = true;
    /**
     * Przycisk wyjscia
     */
    //private final JButton exit_button;
    /**
     * Punkty
     */
    //private static JLabel points;
    public static JLabel smietnik; /**smietnik*/
    private final String zdj_smietnika = "img/smietnik.png"; /**zdjecie glownego bohatera*/
    public static JLabel[] smiec; /**smietnik*/
    private final String zdj_smiec = "img/szklo1.png"; /**zdjecie glownego bohatera*/
    
    private static JButton fire_btn;
    
    
    public WystrzalowaSegregacja() {
        this.setTitle("Wystrzałowa Segregacja");
        this.setVisible(true);
        
        game_window = new JPanel();
        this.add(game_window);
        this.setContentPane(game_window);
        this.getContentPane().setBackground(Color.CYAN);
        this.getContentPane().setPreferredSize(new Dimension(1024,768));
        game_window.setLayout(null);
        
        smietnik = new JLabel(new ImageIcon(zdj_smietnika));
        smietnik.setLocation(420, 100);
        smietnik.setSize(120,159);
        this.getContentPane().add(smietnik);
        
        smiec = new JLabel[20];
        smiec[0] = new JLabel(new ImageIcon("img/szklo1.png"));
        smiec[0].setLocation(420, 500);
        smiec[0].setSize(150,150);
        this.getContentPane().add(smiec[0]);
        
        this.fire_btn = new JButton("FIRE");
        fire_btn.setSize(100,50);
        fire_btn.setLocation(100,520);
        fire_btn.setBackground(Color.white);
        this.getContentPane().add(fire_btn);
        
        
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new WystrzalowaSegregacja();
        
        //wstępne
       fire_btn.addActionListener(e->{
            strzal = !strzal;
            fire_btn.setEnabled(strzal);
            new Fire(smiec[0]);
        });
        
    }
    
    
}
