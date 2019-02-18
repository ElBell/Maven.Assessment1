package com.zipcodewilmington.assessment1.part1;

import static java.lang.Character.isUpperCase;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversed = reverse(str);
        String reversedCamel = camelCase(reversed);
        return reversedCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] charArray = str.toCharArray();
        String answer = "";
        for(char character: charArray) {
            if(isUpperCase(character)) {
                answer += Character.toLowerCase(character);
            } else {
                answer += Character.toUpperCase(character);
            }
        }

        return answer;
    }
}
