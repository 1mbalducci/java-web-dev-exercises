package ch3exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args) {
    ArrayList<Integer> numbersArray= new ArrayList<>(Arrays.asList(7,8,9,9,5,4,1,0,4,3));
    ArrayList<String> wordList= new ArrayList<>(Arrays.asList("This", "is","sampl", "would", "not"));
    Double sumOfList= 0.0;


        for (int i=0; i<numbersArray.size(); i++ ){
                if (numbersArray.get(i) % 2 == 0) {
                    sumOfList += numbersArray.get(i);
                }
        }

        System.out.println(sumOfList);
        countToFive(wordList);
    }

    public static void countToFive(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word length");
        Integer wordLength= input.nextInt();
        for (String words : wordList) {
            if (words.length()==wordLength){
                System.out.println(words);
            }
        }

    }


}
