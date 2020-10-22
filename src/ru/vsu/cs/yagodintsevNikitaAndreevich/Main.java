package ru.vsu.cs.yagodintsevNikitaAndreevich;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите нечётный размер: ");
        int size = scanner.nextInt();
        int height = 0;
        int x = 0;
        int centre = (size + 1) / 2;

        for (int weight = 1; weight <= size; weight++){
            if (weight == centre
                    || height + 1 == centre
                    || weight + height == centre
                    || height == weight - centre
                    || height + 2 == centre + weight
                    || height + 1 == centre + size - weight){
                System.out.print(x);
                x++;
                if (x == 10){
                    x = 0;
                }}
            else System.out.print(" ");
            if (weight == size){
                weight = 0;
                height++;
                System.out.println();
                if (height == size){
                    break;
                }
            }
        }
//        int s = 11;
//        for (int i = 1; i <= s; i++) {
//            if (i < s / 2.0) {
//                printLine(i, s, 3);
//                //System.out.print("<" + i);
//            } else if (i == s / 2 + 1) {
//                printLine(i, s, 11);
//                //System.out.print("test" + i);
//            } else {
//                printLine(i, s, 3);
//                int res = s - i + 1;
//                //System.out.print(">" + res);
//            }
//            System.out.println();
//        }
    }

//    private static void printLine(int i, int s, int symbols) {
//
//        if(i == 1 || i == s){
//            symbols = 1;
//        }
//        int spaces = s - symbols;
//        int spacesRow = Math.abs(s / 2 - i + 1);
//        spacesRow = spacesRow == s ? 0 : spacesRow;
//        int intersymbolSpaces = Math.abs(s - symbols - spacesRow * 2)/2;
//
//        System.out.println("intersymbols: " + intersymbolSpaces);
//        System.out.println("spaces: " + spacesRow);
//
//        int intersymbolSpacesCount = 0;
//        int spacesCount = 0;
//        int firstSpaces = 0;
//        int symbolsCount = 0;
//        int symbolPrint = 0;
//        for (int j = 1; j <= s; j++) {
//            if(spacesCount < spacesRow && firstSpaces != 1){
//                spacesCount++;
//                firstSpaces = 0;
//                System.out.print(" ");
//            }
//            else{
//                if(intersymbolSpacesCount == intersymbolSpaces){
////                    if(symbolPrint == 0) {
////                        symbolPrint = 1;
//                        intersymbolSpacesCount = 0;
//                        System.out.print("*");
////                    }
////                    else{
////                        System.out.print("*");
////                    }
//                }
//                else{
//                    intersymbolSpacesCount++;
//                    System.out.print(" ");
//                    symbolPrint = 0;
//                }
//
//                firstSpaces = 1;
//
//                if(symbols + spacesCount + intersymbolSpacesCount * 2 < j){
//                    firstSpaces = 0;
//                    spacesCount = 0;
//                }
//
//            }
//
//        }
//    }
}
