package ch3exercises.HashMapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentHashMap {
   static public void main (String[] args){
       HashMap<Integer,String> classRoster= new HashMap<>();
       Scanner input = new Scanner(System.in);
       String newStudent;

       System.out.println("Please Enter your students and ID #s (or ENTER to finish) ");
// Get Students names and Idnumbers
       do{
           System.out.println("Student: ");
           newStudent = input.nextLine();

           if (!newStudent.equals("")) {
               System.out.print("ID Number: ");
               Integer newIdNumber = input.nextInt();
               classRoster.put(newIdNumber,newStudent);

               // Read in the newline before looping back
               input.nextLine();
           }

       } while(!newStudent.equals(""));
       input.close();

       // Print class roster
       System.out.println("\nClass roster:");
       double sum = 0.0;

       for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
           System.out.println(student.getValue() + "'s ID is " + student.getKey());

       }
       System.out.println("The number of students is " + classRoster.size());

   }
}


