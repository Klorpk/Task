package org.example;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        var scn = new Scanner(System.in);
        var h=scn.nextInt();
        int firstSlash = 1;
        System.out.println("*");
        for (int r = 0; r < h-1; r++) {
            if ( r == h - 2) {
                System.out.print("*");
                for (int c = 1; c < h - 1; c++) {
                    System.out.print("-");
                }
                System.out.println("*");
            } else {
                System.out.print("|");
                for (int c = 1; c < h-1; c++) {
                    char ch = ' ';
                    if (c == firstSlash) {
                        ch = '\\';
                    }
                    System.out.print(ch);
                }
                System.out.println(" ");
                firstSlash++;
            }
        }
    }
}
