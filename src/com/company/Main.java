package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number for array:");
        if (sc.hasNextInt()) {
            int number1 = sc.nextInt(); //Scanning first number
            System.out.println("Enter second number for array:");
            int number2 = sc.nextInt(); //Scanning second number

            int[][] mass = new int[number1][number2];
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    mass[i][j] = ((int) (Math.random() * 30) - 10);

                }
            }
            System.out.println(Arrays.deepToString(mass));

//      Task 2
//        int sum = 0;
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j = j + 2) {
//                sum = sum + mass[i][j]; // task 2;
//            }
//        }
//        System.out.println("Mass sum "+sum);

//       Task 3
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length-1; j++) {
//				if(mass[i][j]<0){
//					mass[i][j]=0;
//				}
//            }
//        }
//        System.out.println(Arrays.deepToString(mass));


//       Task 4
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length-1; j++) {
//                if(mass[i][j]>0 && mass[i][j+1]<0){
//                    mass[i][j] = mass[i][j]*3;
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(mass));

//         Task 1

//            int min=Integer.MAX_VALUE;
//            int max=Integer.MIN_VALUE;
//            for (int i = 0; i < mass.length; i++) {
//                for (int j = 0; j < mass[i].length; j++) {
//                    if (mass[i][j] < min){
//                        min = mass[i][j];}
//                    if (mass[i][j] > max){
//                        max = mass[i][j];
//                    }
//
//                }
//            }
//
//            System.out.println("Max "+max+" Min "+min);
//            System.out.println(Arrays.deepToString(mass));

//            Task 5
            int min=Integer.MAX_VALUE;
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    if (mass[i][j] < min){
                        min = mass[i][j];}
                    sum = sum + mass[i][j];

                }
            }
            int aver= sum/(number1*number2);
            int result = aver - min;
            System.out.println("Task 5 result = "+result);

        }
    }
}
