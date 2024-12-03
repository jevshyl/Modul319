import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class isNumeric {

    public static boolean isNumeric(String string){
        if (string == null || string.isEmpty())
            return false;

        for( int i = 0; i < string.length(); i++)
            if (! Character.isDigit(string.charAt(i)))
                return false;

        return true;
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String test;
           do{
               System.out.println("Whats your age?");
               test = scanner.nextLine();
           boolean hasOnlyDigits = isNumeric(test);
            System.out.println(hasOnlyDigits);

           } while (!Objects.equals(test, "exit"));

    }
}