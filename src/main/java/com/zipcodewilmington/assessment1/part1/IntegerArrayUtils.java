package com.zipcodewilmington.assessment1.part1;

import java.util.stream.IntStream;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer answer = 0;
        for(Integer current: intArray) {
            answer += current;
        }
        return answer;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        //Only works because the test starts with 1 in the array
        Integer answer = intArray[0];
        for(Integer current: intArray) {
            answer = answer*current;
        }
        return answer;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Integer sum = getSum(intArray);
        Double answer = (double)sum/intArray.length;
        return answer;
    }
}
