package Homework_week_8_NimishaPatel;

import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */
public class Programme_14_DiamondPattern {
    public static void printDimond(int r, char ch){
        int i = 1;
        int j;
        while (i <= r){
            j = 1;
            while (j++ <= r - i){
                System.out.print("");
            }
            j = 1;
            while (j++ <= i * 2-1){
                System.out.println(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0){
            j = 1;
            while (j++ <= r - 1){
                System.out.println(" ");
            }
            j = 1;
            while (j++ <= i * 2-1){
                System.out.println(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //Scanner diclaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of raw : ");
        int a = scanner.nextInt();
        System.out.println("Enter the symbol : ");
        char c = scanner.next().charAt(0);
        printDimond(a, c);
        //closing the scanner object
        scanner.close();
    }
}
