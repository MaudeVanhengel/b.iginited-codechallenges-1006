package com.bignited.caesercipher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a substitioncipher (integer) and a string to encrypt, seperated by a space");
        String inputString = scanner.nextLine();

        String[] inputArguments = inputString.split(" ");
        while (inputIsInvalid(inputString, inputArguments)) {
            System.out.println("Crazy input!");
            System.out.println("try again!");
            inputString = scanner.nextLine();
            inputArguments = inputString.split(" ");
        }
        int substitutionCipher = Integer.parseInt(inputArguments[0]);
        String sourceString = inputArguments[1].toLowerCase();

        String encryptedString = CipherConverter.encrypt(substitutionCipher, sourceString);
        System.out.println("This is your encrypted string");
        System.out.println(encryptedString);

        scanner.close();


    }

    private static boolean inputIsInvalid(String inputString, String[] inputArguments) {
        try {
            if (inputString.equals("") || inputArguments.length != 2) {
                return true;
            }
            Integer.parseInt(inputArguments[0]);
        } catch(NumberFormatException ex) {
            return true;
        }
        return false;
    }
}
