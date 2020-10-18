package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        int s = 11;
        for (int i = 1; i <= s; i++) {
            if (i < s / 2.0) {
                printLine(i, s);
            } else if (i == s / 2.0) {
                printLine(i - s, s);
            } else {
                printLine(i, s);
            }
            System.out.println();
        }
    }

    private static void printLine(int i, int s) {
        for (int j = 1; j <= s; j++) {
//            int symbols = s + s - 1;
//            if((s - symbols) / 2.0 < j){
//                System.out.print(" ");
//            }
//            else if((s - symbols) / 2.0 > j){
//                System.out.print(" ");
//            }
//            else{
//                System.out.print("*");
//            }
//            System.out.print(i);
            int symbols = s + s - 1;
            int spaces = s - symbols;

            //if(j)
        }
    }
}
