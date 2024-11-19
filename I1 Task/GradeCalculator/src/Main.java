import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double total = 0;
        int howManyGrades;


            while(true) {
                System.out.println("How many tests?");
                howManyGrades = scanner.nextInt();

                if (howManyGrades < 3) {
                    System.out.println("Error");


                }else{
                    break;
                }
            }


        for (int i = 1; i <= howManyGrades; i++) {

            double grade;
            while(true) {

            System.out.println("Enter the grade for test" +i);
            grade = scanner.nextDouble();
                if (grade > 6 || grade < 1) {

                    System.out.println("Your test grade is greater than 6 or lower than 1, ERROR"); }
                else{
                    total += grade;
                    break;
        }
            }
        }
            double average = total / howManyGrades;
                System.out.println("Your grade average is: " + average);
    }
}



