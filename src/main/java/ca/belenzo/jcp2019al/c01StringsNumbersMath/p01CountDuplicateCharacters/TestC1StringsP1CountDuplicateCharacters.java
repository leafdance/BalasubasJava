package ca.belenzo.jcp2019al.c01StringsNumbersMath.p01CountDuplicateCharacters;

import java.util.Arrays;
import java.util.Map;

public class TestC1StringsP1CountDuplicateCharacters {

    private static final String TEXT = "Four scores and seven years ago.";

    public static void main(String[] args) {

        Map<Character, Integer> duplicatesV0 = C1StringsP1CountDuplicateCharacters.countDuplicateCharactersV0(TEXT);
        System.out.println(Arrays.toString(duplicatesV0.entrySet().toArray()));
    }
}
