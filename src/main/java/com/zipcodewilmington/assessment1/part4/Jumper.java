package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        return -1;
    }
}
/*

public int jumps(int k, int j) {
        return (k/j) + (k%j);
 */

/*
    public int jumps(int k, int j) {
        int position = 0;
        int movesMade = 0;
        int jumpTypeOne = 1;
        int answer = 0;
        if (j <= k) {
            for (int i = 0; position + j <= k; i++) {
                position = position + j;
                movesMade++;
            }
            if (position + j > k) {
                for (int x = 0; position < k; x++) {
                    position = position + jumpTypeOne;
                    movesMade++;
                }
            }
        }
        else if (j > k) {
            movesMade = k;
            }
        return movesMade;
        }

     } */