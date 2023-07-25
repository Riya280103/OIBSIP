/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberguessinggame;
import javax.swing.*;

public class NumGuessingGame {
    public static void main(String[] args) {
        int computeNumber = (int) (Math.random() * 100 + 1);
        int userInput = 0 ;
        int attempts = 1;
        
        try{
            while (userInput != computeNumber || attempts<=5 ) {
                String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 100");
                userInput = Integer.parseInt(response);
                if (attempts > 5)
                    JOptionPane.showMessageDialog(null,"OOPs !! Maximum attempts are over !!");
                else  
                {   
                JOptionPane.showMessageDialog(null, " " + guess(userInput, computeNumber, attempts));
                attempts++;
                }
            }
        } catch (Exception e) {
            
        }
    }

    public static String guess(int userInput , int computeNumber , int attempts)
    {
        if (userInput == computeNumber)
            return "OOhhOO!, Your Number is Correct. You Win the Game!" ;     
        else if (userInput > 100)
            return "Invalid Number" ;
        else if (userInput < computeNumber)
            return "Your Guess Number is Smaller." ;
        else if (userInput > computeNumber)
            return "Your Guess Number is Greater." ;   
        else 
            return null ;
    }
}   