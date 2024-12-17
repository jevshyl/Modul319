package ch.tbz;

import java.time.LocalDateTime;

import java.util.Scanner;

public class Timer {
    Scanner scanner = new Scanner(System.in);
    public LocalDateTime startTimer(){
        System.out.println("Press any key to begin");
        scanner.nextLine();

        return LocalDateTime.now();

    }

    public LocalDateTime endTimer(){
        System.out.println("Press any key to end");
        scanner.nextLine();

        return LocalDateTime.now();
    }

    public void timePlayed(LocalDateTime timerStart, LocalDateTime timerEnd, String username){


        int startingTime = timerStart.getHour() * 3600 + timerStart.getMinute() * 60 + timerStart.getSecond();
        int endingTime = timerEnd.getHour() * 3600 + timerEnd.getMinute() * 60 + timerEnd.getSecond();

        int calcTime= endingTime - startingTime;


        System.out.println(username + " you've played for " + calcTime + " seconds");

    }
}
