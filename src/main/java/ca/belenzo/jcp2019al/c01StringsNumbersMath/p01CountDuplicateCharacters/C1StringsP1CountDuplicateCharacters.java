package ca.belenzo.jcp2019al.c01StringsNumbersMath.p01CountDuplicateCharacters;

import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

/*
* Count Duplicate Characters
* Write a program that counts duplicate characters from a given string.
 */
public class C1StringsP1CountDuplicateCharacters {

    //public static Map<Character, Integer> countDuplicateCharacterV1(String string) {

    //};

    public static Map<Character, Integer> countDuplicateCharactersV0(String string) {

        if (string == null || string.isBlank()) {
            return Collections.emptyMap();
        }

        Map<Character, Integer> mapOfCountedCharacters = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (mapOfCountedCharacters.get(ch) == null) {
                mapOfCountedCharacters.put(ch, 1);
            } else {
                int count = mapOfCountedCharacters.get(ch);
                count = count + 1;
                mapOfCountedCharacters.put(ch, count);
            }
        }
        return mapOfCountedCharacters;
    }
    // private

}
