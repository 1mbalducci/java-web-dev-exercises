package exercises;

import java.util.Scanner;

public class MilesDriven {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many miles have you driven?: ");
    int miles = input.nextInt();
    System.out.println("How many gallons of gas have you used?: ");
    int gasUsed = input.nextInt();
    input.close();

    int milesPerGallon = (miles/ gasUsed);
        System.out.println("Your miles per gallon is " + milesPerGallon );
    }
}
