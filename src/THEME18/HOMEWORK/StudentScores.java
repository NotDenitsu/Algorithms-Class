package THEME18.HOMEWORK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentScores {
    static double sumAverage = 0.00;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashMap<Integer, HashMap<String, ArrayList<Double>>> studentScores = new HashMap<Integer, HashMap<String, ArrayList<Double>>>();
        int ID;

        while(true) {
            System.out.print("Enter student ID or [0] to finish the table: ");
            ID = Integer.parseInt(input.nextLine());
            if (ID == 0) break;

            HashMap<String, ArrayList<Double>> subjects = new HashMap<String, ArrayList<Double>>();
            String subject;

            while(true){
                System.out.print("Enter subject or END to add a new subject: ");
                subject = input.nextLine();
                if(subject.equals("END")) break;


                ArrayList<Double> grades = new ArrayList<Double>();
                double currentGrade;

                while(true){
                    System.out.print("Enter a valid grade or [0] for the selected subject: ");
                    currentGrade = Double.parseDouble(input.nextLine());
                    if(currentGrade == 0) break;
                    if(currentGrade < 2 || currentGrade > 6) System.out.println("Enter a valid grade [2-6]!");
                    else grades.add(currentGrade);
                }
                subjects.put(subject, grades);
            }
            studentScores.put(ID, subjects);
        }

        System.out.println();

        for (int studentID : studentScores.keySet()) {
            for (String subject : studentScores.get(studentID).keySet()) {
                double average = studentScores.get(studentID).get(subject).stream().mapToDouble(z -> z).average().orElse(0.0);
                System.out.println("Average in " + subject + " is: " + average);
                sumAverage += average;
            }
            System.out.println("Average grade for the student " + studentID + " is: " + sumAverage /studentScores.get(studentID).size());
            sumAverage = 0.00;
            System.out.println();
        }

        for (int studentID : studentScores.keySet()) {
            System.out.println(studentID);
            for (String subject : studentScores.get(studentID).keySet()) {
                System.out.println(subject);

                for (double scores : studentScores.get(studentID).get(subject)) {
                    System.out.print(scores + ", ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
