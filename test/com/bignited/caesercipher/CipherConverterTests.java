package com.bignited.caesercipher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherConverterTests {

    private String sourceString;

    @BeforeEach
    public void setUp() {
        sourceString = CipherConverter.ALPHABET;
    }

    @Test
    public void givenSimpleTestCase_whenConvertCipher_returnCorrectEncryptedCipher() {
        int simpleSubstitutionCipher = -3;

        String result = CipherConverter.encrypt(simpleSubstitutionCipher, sourceString);
        String expectedResult = "xyzabcdefghijklmnopqrstuvw";

        assertEquals(expectedResult, result);
    }

    @Test
    public void givenAdvancedTestCase_whenConvertCipher_returnCorrectEncryptedCipher() {
        int advancedSubstitionCipher = 28;

        String result = CipherConverter.encrypt(advancedSubstitionCipher, sourceString);
        String expectedResult = "cdefghijklmnopqrstuvwxyzab";

        assertEquals(expectedResult, result);
    }
}
