package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);
        var n =scn.nextInt();
        solve(n);
    }
    public static void solve(int h) {
        System.out.print("*");
        for (int i = 1; i < h - 2; i++) {
            System.out.print("-");
        }
        System.out.println("*");

        for (int i = 1; i < h - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("\\");

            for (int j = 0; j < h - i - 1; j++) {
                System.out.print("*");
            }
            if (i < h - 2) {
                System.out.println("|");
            } else {
                System.out.println();
            }
        }
        for (int i = 0; i < h - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}