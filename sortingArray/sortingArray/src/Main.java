import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

//        //Statisches Array
//        String[] sorting = new String [5];
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please write in 5 words");
//
//        for(int i = 0; i < sorting.length; i++){
//          sorting[i] = scanner.nextLine();
//        }
//        for(int i = 0; i < sorting.length; i++){
//           System.out.print(sorting[i]);
//            System.out.print(" ");
//        }
//        for(int i = sorting.length; i >= 0; i--){
//            System.out.print(sorting[i]);
//            System.out.print(" ");
//        }


//Dynamisches Array

            ArrayList<String> sortWords = new ArrayList<>();


            while(true) {
                String input = scanner.nextLine();
                if(input.equals(".")){
                break;
                }
                sortWords.add(input);
            }


               for (String sortWord : sortWords) {
                   System.out.print(sortWord);
                   System.out.print(" ");

               }
                for (int l = sortWords.size()-1; l >= 0; l--){
                    System.out.print(sortWords.get(l));
                    System.out.print(" ");



    }
    }

}
