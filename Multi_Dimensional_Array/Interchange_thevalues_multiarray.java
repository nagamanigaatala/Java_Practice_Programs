package com.Arrays;

import java.util.Scanner;

public class Interchange_thevalues_multiarray {

	public static void main(String[] args) {
		//6.Interchange the values of an array by transposing the index values.
        Scanner nobi=new Scanner(System.in);
        System.out.print("Enter the rows size: ");
        int rows = nobi.nextInt();
        
        System.out.print("Enter the col size: ");
        int cols = nobi.nextInt();
        
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = nobi.nextInt();
            }
        }
        int[][] originalarray= new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalarray[j][i] = array[i][j];
            }
        }
        
        int[][] transposedArray = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }
        System.out.println("original array:");
        printArray(originalarray);
       
        System.out.println("Transposed Array:");
        printArray(transposedArray);
        nobi.close();
	}
    
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
