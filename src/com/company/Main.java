package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println("The A and B length Sum is = " + sumStringLengths(A, B));
        System.out.println("Lexicographically A is greater Than B ? " + compareTo(A, B));
        concatStringAndPrint(A,B);
    }

    static int sumStringLengths(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int lengthSum = x.length + y.length;
        return lengthSum;
    }

    static String compareTo(String a, String b) {
        if (a.compareTo(b) > 0) {
            return "Yes";
        }
        return "No";
    }

    static void concatStringAndPrint (String a, String b){
        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);
        a = a + " " + b;
        System.out.println(a);


    }
}