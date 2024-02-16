package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(decimalToBinary("123"));
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

    private static String decimalToBinary(String decimal) {
        int decimalNumber = Integer.parseInt(decimal);
        int coef = (int) (Math.log(decimalNumber) / Math.log(2));

        StringBuilder builder = new StringBuilder();
        while (coef >= 0) {
            if (decimalNumber - Math.pow(2, coef) >= 0) {
                decimalNumber -= Math.pow(2, coef);
                builder.append(1);
            } else {
                builder.append(0);
            }
            coef--;
        }

        return builder.toString();
    }
}