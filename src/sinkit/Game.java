/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinkit;

/**
 *
 * @author miika
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
    }
}
