package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {

        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();
        int count = 1;

        for (char character : charactersInString) {
            if (Character.isLetter(character) || Character.isDigit(character) || Character.isSpaceChar(character)); {
                if (characters.containsKey(character)) {
                    characters.put(character, characters.get(character)+1);
                } else {
                    characters.put(character, count);
                }
            }
        }

        for (Map.Entry<Character, Integer> character : characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
