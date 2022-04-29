package topic3;

import java.util.Scanner;

public class exercise33 {
    public static void main (String [] args){
        System.out.println("Enter the name of the animal:");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();
        while (!(animal.equals("koala") )) {
            System.out.println("This is not the correct animal. Try again:");
            animal = scanner.next();

        }
        System.out.println(animal);

    }
}
