package com.company.util;


import com.company.constant.Constants;
import com.company.exception.ValidationException;

/**
 * Created with IntelliJ IDEA.
 * User: Vladimir
 * Date: 13.07.2021.
 * Time: 11:35.
 */
public class StringUtil {
    public static int sumStringLengths(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int lengthSum = x.length + y.length;
        return lengthSum;
    }

    public static String compareTo(String a, String b) {
        if (a.compareTo(b) > 0) {
            return "Yes";
        }
        return "No";
    }

    public static String capitalizeString(String a, String b, String separator) {
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        return a + separator + b;
    }

    public static boolean isAnagramWithSort(String a, String b) throws ValidationException {

        // test for invalid input and initial quick test for non-anagrams
        if (isValidInput(a, b)) {
            // String will be Sorted for compare each other
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();
            SortingUtil.quickSort(arr1, 0, arr1.length - 1);
            SortingUtil.quickSort(arr2, 0, arr1.length - 1);

            // Compare sorted strings
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
        } else {
            throw new ValidationException("Not Valid input Arguments");
        }
        return true;
    }


    public static boolean isAnagramWithCount(String a, String b) throws ValidationException {
        // test for invalid input and initial quick test for non-anagrams
        if (isValidInput(a, b)) {

            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();

            int[] count = new int[Constants.ALPHABETIC_CHARS_COUNT];

            // For each character in input strings increment count corresponding count array
            // and check in count Array if the Strings character values is equal or not
            for (int i = 0; i < arr1.length; i++) {
                count[arr1[i] - 'a']++;
                count[arr2[i] - 'a']--;
            }
            for (int i = 0; i < Constants.ALPHABETIC_CHARS_COUNT; i++) {
                if (count[i] != 0) {
                    return false;
                }
            }
        } else {
            throw new ValidationException("Not Valid input Arguments");
        }
        return true;
    }


    static boolean isValidInput(String a, String b) {

        if (a == null || b == null || a.equals("") || b.equals("") || a.length() > 50 || b.length() > 50) {
            System.out.println("Please try again and input correct Strings");
            return false;
        } else if (a.length() != b.length()) {
            System.out.println("The strings are not anagram because they have different sizes ");
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            if (arr1[i] < Constants.a_Vlaue || arr1[i] > Constants.z_Vlaue || arr2[i] < Constants.a_Vlaue || arr2[i] > Constants.z_Vlaue) {
                System.out.println("Please try again and input correct alphabetic characters ");
                return false;
            }
        }
        return true;
    }
}
