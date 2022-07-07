package com.bignited.caesercipher;

public final class CipherConverter {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(int substitutionCipher, String inputString) {
        if (substitutionCipher < 0) {
            substitutionCipher = 26 - Math.abs(substitutionCipher);
        }
        StringBuilder encryptedString = new StringBuilder("");

        for (int i = 0; i < inputString.length(); i++) {
            char character = inputString.charAt(i);
            int position = ALPHABET.indexOf(character);
            int positionOfEncrypted = (position + substitutionCipher) % ALPHABET.length();
            char encryptedCharacter = ALPHABET.charAt(positionOfEncrypted);

            encryptedString.append(encryptedCharacter);
        }

        return encryptedString.toString();
    }
}
