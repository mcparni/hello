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
public class SquareTwo extends Ship {
    
    private final int SQUARES = 2;
    private final int STEP = 50;
    
    public SquareTwo() {
        System.out.println("Ship SQ2.");
        
    }
    public JPanel makeShip() {
        JPanel squareTwoPanel = new JPanel();
        squareTwoPanel.setSize(100, 50);
        squareTwoPanel.setLayout(null);
       
        for(int i = 0; i < SQUARES; i++) {
            squareTwoPanel.add(buildShip((i * STEP), 0));
        }
        
        return squareTwoPanel;
    }
    private JLabel buildShip(int x, int y) {
        JLabel square = new JLabel();
        square.setOpaque(true);
        square.setBackground(Color.red);
        square.setBounds(x,y,STEP,STEP);
        return square;
    }

}
