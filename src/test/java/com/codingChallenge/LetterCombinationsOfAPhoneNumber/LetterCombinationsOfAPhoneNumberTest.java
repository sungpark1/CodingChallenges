package com.codingChallenge.LetterCombinationsOfAPhoneNumber;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {

    @ParameterizedTest
    @ValueSource(strings = "23")
    void positiveTest(String str) {
        assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), LetterCombinationsOfAPhoneNumber.letterCombinations(str));
    }

    @ParameterizedTest
    @ValueSource(strings = "9")
    void negativeTest(String str) {
        assertNotEquals(List.of("w", "x", "y"), LetterCombinationsOfAPhoneNumber.letterCombinations(str));
    }

}