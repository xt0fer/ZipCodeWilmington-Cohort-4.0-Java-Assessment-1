package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int palindromes = 0;
        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                StringBuilder reverse = new StringBuilder(input.substring(i, j));
                reverse.reverse();
                if (input.substring(i, j).equals(reverse.toString())) {
                    palindromes++;
                }
            }
        }
        return palindromes;
    }
}

