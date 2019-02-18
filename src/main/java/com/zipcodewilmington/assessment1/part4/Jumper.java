package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int numOneJumps = k%j;
        int numKJumps = (k-numOneJumps)/j;
        return numOneJumps + numKJumps;
    }
}
