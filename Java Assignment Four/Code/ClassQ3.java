/*
Name: Abdullah Mehdi    
Regstration No: SP21-BCS-OO2
Class Assignment: suming diagonal elements  
*/

import java.util.*;
import java.lang.*;
public class ClassQ3{
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[4][4];
        System.out.println("Enter elements row by row:");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                double user = input.nextDouble();
                matrix[row][col] = user;  
            }
        }
        System.out.println("Matrix is: ");
        printMatrix(matrix);
        System.out.println("Sum of diagonal elements is: ");
        System.out.println(sumMajorDiagonal(matrix));

    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++){
                if(row == col){  
                    sum += m[row][col]; 
                }
            }
        }
        return sum;
    }
    public static void printMatrix(double[][] matrix){
        System.out.println("--------------------------");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

}        
