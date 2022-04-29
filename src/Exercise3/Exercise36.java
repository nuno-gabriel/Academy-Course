package Exercise3;

import java.util.Scanner;

public class Exercise36 {
    public static void main (String[] args){

        /*
        Ejercicio 3.6. El sistema debe pedir que se rellenen los números hasta que el usuario escriba el número cero.
        Después el sistema imprimirá la suma de todos los números.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int sum = 0;

        while (number!=0){
            System.out.println("Enter other name: ");
            number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println(sum);


        scanner.close();
    }
}
