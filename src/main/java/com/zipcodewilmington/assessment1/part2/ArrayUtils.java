package com.zipcodewilmington.assessment1.part2;
import java.lang.*;
import java.util.*;
import java.util.stream.Stream;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count =0;
        for(Object current : objectArray) {
            if(current.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        Object[] answer = new Integer[objectArray.length-getNumberOfOccurrences(objectArray, objectToRemove)];
        int index = 0;
        for(Object current : objectArray) {
            if(!current.equals(objectToRemove)) {
                answer[index] = current;
                index++;
            }
        }
        return answer;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */


    public static Object getMostCommon(Object[] objectArray) {
       return sortArray(objectArray)[objectArray.length - 1];
    }
    private static Object[] sortArray(Object[] objectArray) {
        Arrays.sort(objectArray,
                (a, b) -> getNumberOfOccurrences(objectArray, a) - getNumberOfOccurrences(objectArray, b));
        return objectArray;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        return sortArray(objectArray)[0];
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Object[] answer = new Integer[objectArray.length+objectArrayToAdd.length];
        System.arraycopy(objectArray, 0, answer, 0, objectArray.length);
        System.arraycopy(objectArrayToAdd, 0, answer, objectArray.length, objectArrayToAdd.length);
        return answer;
    }
}
