/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.brickbreaker;
import javax.swing.JFrame;

/**
 *
 * @author ankush
 */
public class BrickBreaker {

    public static void main(String[] args) {
        JFrame obj = new JFrame("BrickBreaker");//creats and sets title of the frame
        GamePlay gameplay = new GamePlay();//instance of the GamePlay class in the main method of main class
        obj.setBounds(10,10,700,600);//sets the location of frame(x,y position) as well as dimensions
        obj.setLocationRelativeTo(null);//sets the frame to center location
        //obj.setTitle("BrickBreaker");//sets title of the frame
        obj.setResizable(false);//prohibits user to change the size of frame
        obj.add(gameplay);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes JFrame on exit button
        obj.setVisible(true);//displaying the final frame with changes
    }
}
