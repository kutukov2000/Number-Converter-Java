package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(binaryToDecimal("11111"));
    }

    private static int binaryToDecimal(String binary) {
        char[] charBinaryArray = binary.toCharArray();
        int decimal = 0;
        int coef = binary.length() - 1;

        for (int i = 0; i < binary.length(); i++) {
            if (charBinaryArray[i] == '1')
                decimal += Math.pow(2, coef);
            coef--;
        }

        return decimal;
    }
}