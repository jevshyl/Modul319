package ch.tbz;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static final int FIELD_SIZE = 4;

    public static void displayBoard(int[][] board) {
        System.out.println("\nBoard:");
        for (int i = 0; i < FIELD_SIZE; i++) {

            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(board[i][j] == 1 ? " O " : " . ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Infos infos = new Infos();
        Timer timer = new Timer();

        infos.addName();
        String username = infos.getUser()[0];

        LocalDateTime start = timer.startTimer();

            int[][] field = {
                    {0, 15, 1, 13},
                    {8, 5, 2, 3},
                    {14, 7, 4, 9},
                    {10, 11, 6, 12}
            };



            int lightCount = 0;

            for (int i = 0; i < FIELD_SIZE; i++) {
                for (int j = 0; j < FIELD_SIZE; j++) {
                    if (field[i][j] != 0) {
                        field[i][j] = 1;
                        lightCount++;
                    } else {
                        field[i][j] = 0;
                    }
                }
            }

            Scanner scanner = new Scanner(System.in);
            int x, y;


            System.out.println("Game: Lights Out");
            System.out.println("The goal is to turn off all the lights.");
            System.out.println("When you write the numbers, the surrounding fields also change their lights.\n");

            while (true) {
                displayBoard(field);

                if (lightCount == 0) {
                    System.out.println("WON-> all lights are turned off.");
                    LocalDateTime end = timer.endTimer();
                    timer.timePlayed(start, end, username);
                    break;
                }


                System.out.printf("Enter row and column to change the light (0-%d) or -1 -1 to quit: ", FIELD_SIZE - 1);
                x = scanner.nextInt();
                y = scanner.nextInt();

                if (x == -1 || y == -1) {
                    System.out.println("Thank you for playing!\nYou exit the game.");
                    LocalDateTime end= timer.endTimer();
                    timer.timePlayed(start, end, username);

                    break;
                }

                if (x >= 0 && x < FIELD_SIZE && y >= 0 && y < FIELD_SIZE) {
                    lightCount = toggleLight(field, x, y, lightCount);


                    if (x > 0) {
                        lightCount = toggleLight(field, x - 1, y, lightCount);
                    }

                    if (x < FIELD_SIZE - 1) {
                        lightCount = toggleLight(field, x + 1, y, lightCount);
                    }
                    if (y > 0) {
                        lightCount = toggleLight(field, x, y - 1, lightCount);
                    }
                    if (y < FIELD_SIZE - 1) {
                        lightCount = toggleLight(field, x, y + 1, lightCount);
                    }
                } else {
                    System.out.printf("WRONG->Please enter numbers between 0 and %d.\n", FIELD_SIZE - 1);
                }
            }

            scanner.close();

        }

        private static int toggleLight(int[][] board, int x, int y, int lightCount) {
            if (board[x][y] == 1) {
                board[x][y] = 0;
                lightCount--;

            } else {
                board[x][y] = 1;
                lightCount++;
            }
            return lightCount;


        }




}




