/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinkit;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author mcparni
 */
public class Ship {
    
    private final int STEP = 50;
    private int cols = 1;
    private int rows = 1;
    
    // squareOne green;
    private Color color = new Color(176, 255, 164);

    
    public Ship() {
    
    }
    
    public JPanel Ship(int type) {
        
        switch(type) {
            case 1 :
               // squareOne green;
               this.color = new Color(176, 255, 164);
               this.cols = 1;
               this.rows = 1;
               break;
            case 2 :
               // squareTwo blue
               this.color = new Color(164, 205, 255);
               this.cols = 2;
               this.rows = 1;
               break;
            case 4 :
               // squareFour orange
               this.color = new Color(255, 206, 164);
               this.cols = 2;
               this.rows = 2;
               break;
            case 6 :
               // squareSix pink 
               this.color = new Color(255, 164, 233);
               this.cols = 2;
               this.rows = 3; 
               break;
            case 8 :
               // squareEight red
               this.color = new Color(255, 164, 164);
               this.cols = 2;
               this.rows = 4;
               break;
            default :
                // squareOne green;
               this.color = new Color(176, 255, 164);
               this.cols = 1;
               this.rows = 1;
               break;
               
        }
        
        JPanel panel = new JPanel();
        panel.setSize(this.cols * STEP, this.rows * STEP);
        panel.setLayout(null);
       
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                panel.add(buildShip((i * STEP), j* STEP));
            }
        }
        
        return panel;
    }
    private JLabel buildShip(int x, int y) {
        JLabel square = new JLabel();
        square.setOpaque(true);
        square.setBackground(this.color);
        square.setBounds(x,y,STEP,STEP);
        return square;
    } 
    
}
