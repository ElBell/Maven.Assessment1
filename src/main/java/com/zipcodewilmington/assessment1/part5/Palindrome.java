package com.zipcodewilmington.assessment1.part5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int palindromeCount = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                String currentSubstring = input.substring(i,j);
                if(reverse(currentSubstring).equals(currentSubstring)) {
                    palindromeCount++;
                }
            }
        }
        return palindromeCount;
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
