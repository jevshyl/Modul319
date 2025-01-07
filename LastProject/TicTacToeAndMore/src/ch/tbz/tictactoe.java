package ch.tbz;


import java.util.Scanner;

public class tictactoe {

    grid grid = new grid();

    public tictactoe(){
        Scanner scanner = new Scanner(System.in);
    String x = "null";

        do {

        System.out.println("Player X, please select a spot");
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        scanner.nextLine();
        String player1 = "x";

            if(i > 2 || j > 2){
                System.out.println("Invalid input");
                continue;
            }

            String[][] newLayout;

                newLayout = grid.getLayout();
                newLayout[i][j] = player1;

                grid.displayLayout();

            System.out.println("Player O, please select a spot");
             i = scanner.nextInt();
             j = scanner.nextInt();
            scanner.nextLine();
            String player2 = "o";

            if(i > 2 || j > 2){
                System.out.println("Invalid input");
                continue;

            }

            newLayout = grid.getLayout();
            newLayout[i][j] = player2;

            grid.displayLayout();
















        x = scanner.nextLine();
        } while (!x.equals("exit"));



    }

}
