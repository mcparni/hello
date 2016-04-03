package sinkit;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Ship {
    
    private final int STEP = 50;
    private int cols = 1;
    private int rows = 1;
    private int shipType = 1;
    private JPanel ship;
    // squareOne green;
    private Color color = new Color(176, 255, 164);

    
    public Ship() {
        this.color = new Color(176, 255, 164);
        this.cols = 1;   
        this.rows = 1;
        this.shipType = 1;
        ship = new JPanel();
        
    }
    
    public int getColumns() {
        return this.cols;
    }
    
    public int getRows() {
        return this.rows;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public int getShipType() {
        return this.shipType;
    }
    
    public int getSquareSize() {
        return this.STEP;
    }
    
    public int getShipWidth() {
        return this.cols;
    }
    
    public int getShipHeight() {
        return this.rows;
    }
    
    public JPanel getShip() {
        return this.ship;
    }
    
    /**
     @param type = valid values(1,2,4,6,8) defaults to 1
     * 
     * 
     */
    public void buildShip(int type) {
        
        switch(type) {
            case 1 :
               // squareOne green;
               this.color = new Color(176, 255, 164);
               this.cols = 1;
               this.rows = 1;
               this.shipType = type;
               break;
            case 2 :
               // squareTwo blue
               this.color = new Color(164, 205, 255);
               this.cols = 2;
               this.rows = 1;
               this.shipType = type;
               break;
            case 4 :
               // squareFour orange
               this.color = new Color(255, 206, 164);
               this.cols = 2;
               this.rows = 2;
               this.shipType = type;
               break;
            case 6 :
               // squareSix pink 
               this.color = new Color(255, 164, 233);
               this.cols = 2;
               this.rows = 3;
               this.shipType = type;
               break;
            case 8 :
               // squareEight red
               this.color = new Color(255, 164, 164);
               this.cols = 2;
               this.rows = 4;
               this.shipType = type;
               break;
            default :
                // squareOne green;
               this.color = new Color(176, 255, 164);
               this.cols = 1;
               this.rows = 1;
               this.shipType = 1;
               break;
               
        }
        
        int w = this.cols * STEP;
        int h = this.rows * STEP;
        Dimension d = new Dimension(w, h);
        this.ship.setSize(w, h);
        this.ship.setMinimumSize(d);
        this.ship.setPreferredSize(d);
        
        this.ship.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.NONE;
        c.weightx = 0;
        c.weighty = 0;
        c.gridx = 1;
        c.gridy = 1;
        c.gridwidth = this.cols;
        c.gridheight =  this.rows;
       
        for(int i = 1; i < (this.cols + 1); i++) {
            for(int j = 1; j < (this.rows + 1); j++) {
                c.gridx = i;
                c.gridy = j;
                c.gridwidth = 1;
                c.gridheight =  1;
                c.fill = GridBagConstraints.NONE;
                c.weightx = 0;
                this.ship.add(addShipBlock(), c, 0);
                
            }
        }
    }
    private JLabel addShipBlock() {
        
        JLabel square = new JLabel("");
        square.setOpaque(true);
        square.setBackground(this.color);
        Dimension d = new Dimension(this.STEP,this.STEP);
        square.setPreferredSize(d);
        square.setMinimumSize(d);
 
        return square;
    } 
    
}
