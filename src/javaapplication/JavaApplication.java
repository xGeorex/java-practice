/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author georgejezerniczky
 */
public class JavaApplication {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] myArrayTemp = new int[5];
        char repeat = 'n';
        byte mySelection = 0;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("let's practice some sorting");
        System.out.println("first thing first, we will need to fill our array.");
        
        System.out.println("let's fill the array with 5 number between 1 and 100");
        
        for(int i = 0; i < 5; i++) {
            System.out.print("Number " + (i+1) + ": ");
            myArray[i] = myScanner.nextInt();
        }
        
        myArrayTemp = myArray;
        
        do {
            
            myArray = myArrayTemp;
            System.out.println("Please chose the following option:");
            System.out.println("\t 1. bubble sorting");
            System.out.print("Selected: ");
            mySelection = myScanner.nextByte();
            
            switch (mySelection) {
                case 1:
                    Sorting mySorting = new Sorting();
                    mySorting.bubbleSort(myArray);
                    
                    System.out.print("Our array is: ");
                    for(int i = 0; i < 5; i++) {
                        System.out.print(myArray[i] + " ");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
            System.out.print("Would you like to run it again? (y/n): ");
            repeat = myScanner.next().charAt(0);
        } while (repeat == 'y' || repeat == 'Y');
        System.out.println("bye!");
    }
}
