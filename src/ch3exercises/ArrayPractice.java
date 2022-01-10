package ch3exercises;

public class ArrayPractice {
    public static void  main(String[] args){
    int[] numbersArr = {1, 1, 2, 3, 5, 8};

    for (int i=0; i<numbersArr.length; i++ ){
        if (numbersArr[i] % 2 != 0) {
            System.out.println(numbersArr[i]);
        }
    }

    String sentancePract = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
    String[] individualWords = sentancePract.split("\\.");
    for (int i=0; i<individualWords.length; i++){
        System.out.println(individualWords[i]);
        }
    }
}
