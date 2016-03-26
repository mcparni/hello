/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author mcparni
 */
public class Game {
    
    public Game() {
        System.out.println("Game init");
        Board board = new Board();
        SquareEight bigOne = new SquareEight();
        SquareSix mediumOne = new SquareSix();
        SquareFour littleOne = new SquareFour();
        SquareTwo tinyOne = new SquareTwo();
        SquareOne microOne = new SquareOne();
        
        JFrame gameFrame = new JFrame("Sink-it");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.getContentPane().add(tinyOne.makeShip());
        gameFrame.setSize(1024,576);
        gameFrame.setVisible(true);
        
    }
}
