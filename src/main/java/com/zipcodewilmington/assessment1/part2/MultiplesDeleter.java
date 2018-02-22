package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer idx : ints) {
            if (idx % 2 != 0) { // idx is odd
                result.add(idx);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer idx : ints) {
            if (idx % 2 == 0) { // idx is even
                result.add(idx);
            }
        }
        return result.toArray(new Integer[0]);

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer idx : ints) {
            if (idx % 3 != 0) { // idx is multiple of 3
                result.add(idx);
            }
        }
        return result.toArray(new Integer[0]);
    }

    /**
     * @param ints     array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer idx : ints) {
            if (idx % multiple != 0) { // idx is even
                result.add(idx);
            }
        }
        return result.toArray(new Integer[0]);

    }
}
