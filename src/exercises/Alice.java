package exercises;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        String aliceText = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a term within the Alice text below." + "\n" + aliceText);
        String inputText = input.nextLine().toLowerCase();
        input.close();


        if (aliceText.contains(inputText)) {
            System.out.println("Your text was found!");
            System.out.println(aliceText.indexOf(inputText) + " " + inputText.length());
            String lessText = aliceText.replace("sister"," ");
            System.out.println(lessText);
        }
        else {
            System.out.println("I'm sorry,you text was NOT found!");
        }
    }
}



