/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author georgejezerniczky
 */
public class Sorting {
    private int temp;
    
    Sorting(){
        
    }
    
    public int[] bubbleSort(int arr[]){
        int n = arr.length - 1;
        
        if (n <= 0) {
            System.out.println("The array is empty :(");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    if (arr[j] > arr[j+1]) {
                        this.temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = this.temp;
                    printArray(arr);
                    }
                }
            }
        }
        
        return arr;
    }
    
    public void printArray(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print(", " + arr[i]);
            }
            
        }
        System.out.print("]");
        System.out.println();
    }
}