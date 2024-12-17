package ch.tbz;

import java.util.Arrays;
import java.util.Scanner;

public class Infos {

    Scanner scanner = new Scanner(System.in);
    private final String[] user = new String[2];

    public void addName(){

        System.out.println("Whats your name?");
        user[0] = scanner.nextLine();
        System.out.println("Hi " + user[0]+ "\nWhats your age?");
        user[1] = scanner.nextLine();
        System.out.println(Arrays.toString(user));

    }


    public String[] getUser() {
        return user;
    }

}
