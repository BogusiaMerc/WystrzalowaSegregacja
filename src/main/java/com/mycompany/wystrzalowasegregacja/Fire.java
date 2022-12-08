
package com.mycompany.wystrzalowasegregacja;

import javax.swing.JLabel;


public class Fire {
    private int smietnik_loc = 100;
    private int x,y;
    public static JLabel[] smiec;
    public Fire(JLabel smiec) {
        do {
        this.x = smiec.getX();
        this.y = smiec.getY()-5;
        smiec.setLocation(x,y);
        } while(smiec.getY()>smietnik_loc);
    }
}