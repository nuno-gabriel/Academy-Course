package topic4;

import java.util.Scanner;

public class exercise43 {
    //Exercise 4.3. Write a program to read an integer value on the keyboard and print an asterisk square of this size.
    // For instance, if the number is 4, the program must print: **** **** **** ****
    public static void main (String [] args){
        
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
