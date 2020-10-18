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
                printLine(i, s, 3);
                //System.out.print("<" + i);
            } else if (i == s / 2 + 1) {
                printLine(i, s, 11);
                //System.out.print("test" + i);
            } else {
                printLine(i, s, 3);
                int res = s - i + 1;
                //System.out.print(">" + res);
            }
            System.out.println();
        }
    }

    private static void printLine(int i, int s, int symbols) {

        if(i == 1 || i == s){
            symbols = 1;
        }
        int spaces = s - symbols;
        int spacesRow = Math.abs(s / 2 - i + 1);
        spacesRow = spacesRow == s ? 0 : spacesRow;
        int intersymbolSpaces = Math.abs(s - symbols - spacesRow * 2)/2;

        System.out.println("intersymbols: " + intersymbolSpaces);
        System.out.println("spaces: " + spacesRow);
        
        int intersymbolSpacesCount = 0;
        int spacesCount = 0;
        int symbolsCount = 0;
        for (int j = 1; j <= s; j++) {
            if(spacesCount < spacesRow){
                spacesCount++;
                System.out.print(" ");
            }
            else{


                symbolsCount++;
                System.out.print("*");

            }


            
        }
    }
}
