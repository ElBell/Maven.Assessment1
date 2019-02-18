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
                if(reverse(input.substring(i,j)).equals(input.substring(i,j))) {
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
