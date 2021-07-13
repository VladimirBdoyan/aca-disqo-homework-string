package com.company;

import com.company.util.IsValidInputException;
import com.company.util.StringUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Homework Java String Introduction
        String A = sc.nextLine();
        String B = sc.nextLine();
        System.out.println("The A and B length Sum is = " + StringUtil.sumStringLengths(A, B));
        System.out.println("Lexicographically A is greater Than B ? " + StringUtil.compareTo(A, B));
        System.out.println(StringUtil.concatString(A, B, " "));

        // Homework Is Strings are Anagram with sort algorithm
        try {
            if(StringUtil.isAnagramWithSort(A, B)) {
                System.out.println("The strings are anagram ");
            }else {
                System.out.println("The strings are not anagram ");
            }
        } catch (IsValidInputException e) {
            System.out.println(e.getMessage());
        }
        // Homework Is Strings are Anagram with count char values algorithm
        try {
            if(StringUtil.isAnagramWithCount(A, B)) {
                System.out.println("The strings are anagram ");
            }else {
                System.out.println("The strings are not anagram ");
            }
        } catch (IsValidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}