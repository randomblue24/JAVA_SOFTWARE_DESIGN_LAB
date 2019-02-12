import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Hello World!%n"+"Enter something:");

        Scanner input = new Scanner(System.in);
        String inp=input.next();
        System.out.println("You entered: "+ inp);
    }
}