import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many tests?");
        Scanner scanner = new Scanner(System.in);
        int howManyGrades = scanner.nextInt();


        if (howManyGrades == 2) {
            System.out.println("Enter the grade for test1:");
            double test1 = scanner.nextInt();
                if (test1 > 6 || test1 < 1) {
                    System.out.println("Your test grade is greater than 6 or lower than 1, ERROR"); }
        else{
            System.out.println("Enter the grade for test2:");
            double test2 = scanner.nextInt();
                if (test2 > 6 || test2 < 1) {
                    System.out.println("Your test grade is greater than 6 or lower than 1, ERROR");
        }else{
               double testAverage = (test1 + test2) / 2;
               System.out.println("your grade is: " + testAverage);}
            }
        }else{
               System.out.println("Error");}
        }
    }

