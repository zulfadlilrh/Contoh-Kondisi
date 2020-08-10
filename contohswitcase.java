/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contohkondisi;

/**
 *
 * @author Acer
 */
public class contohswitcase {
    

 public static void main(String args[]) {

      char grade = 'B';

      switch(grade) {
         case 'A' :
            System.out.println("Perfect!");
            break;
         case 'B' :
            System.out.println("Excellent!");
            break;
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}