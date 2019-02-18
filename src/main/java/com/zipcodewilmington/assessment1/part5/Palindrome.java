package com.zipcodewilmington.assessment1.part5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

    public Integer countPalindromes(String input){
        String[] allSubs = findSubstrings(input);
        int palindromeCount = 0;
        for (String currentString : allSubs) {
            if(reverse(currentString).equals(currentString)) {
                palindromeCount++;
            }
        }

        return palindromeCount;
    }

    public String[] findSubstrings(String input) {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <= input.length(); j++) {
                strings.add(input.substring(i,j));
            }
        }
        return strings.toArray(new String[strings.size()]);
    }

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @Test
    public void testSubstring() {
        System.out.println(Arrays.toString(findSubstrings("aaa")));
        System.out.println(countPalindromes("aaa"));
    }
}
