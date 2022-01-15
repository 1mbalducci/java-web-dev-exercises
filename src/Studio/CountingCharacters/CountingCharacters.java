package Studio.CountingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String choice = input.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        char[] charactersInString = choice.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for(Character l: charactersInString) {
            if(!letterCount.containsKey(l) && !letterCount.equals(" ")) {
                letterCount.put(l, 1);
            } else {
                letterCount.put(l, letterCount.get(l) + 1);
            }
        }

        for(Map.Entry<Character, Integer> character : letterCount.entrySet()){
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }






}


