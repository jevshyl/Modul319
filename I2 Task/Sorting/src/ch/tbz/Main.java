package ch.tbz;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static int iZ1;
    static int iZ2;
    static int iZ3;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        change change = new change();
    do{
        System.out.println("Whats your first number?");
        iZ1 = scanner.nextInt();
        System.out.println("Whats your second number?");
        iZ2 = scanner.nextInt();
        System.out.println("Whats your third number?");
        iZ3 = scanner.nextInt();
        scanner.nextLine();

        if(iZ1 > iZ2){
            change.Tausche1();
        }

        if (iZ2 > iZ3){
            change.Tausche2();

        }

        if (iZ1 > iZ2){
            change.Tausche1();
        }

        if(iZ1 == iZ2 && iZ2 == iZ3){
            System.out.println("Your numbers should have the same value");}

        System.out.println("Z1: " + iZ1 + " is smaller than Z2: " + iZ2 + " is smaller than Z3: " + iZ3);

    System.out.println("Repeat? (yes to repeat, no for exit");
    }while(Objects.equals(scanner.nextLine(), "yes"));

    }
}
