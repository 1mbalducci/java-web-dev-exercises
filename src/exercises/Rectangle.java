package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?: ");
        Integer recLength = input.nextInt();
        System.out.println("What is the width of your rectangle?: ");
        Integer recWidth = input.nextInt();
        input.close();

        int recArea = recLength * recWidth;
        System.out.println("The area of the rectangle is " + recArea + " in^2");
    }
}
