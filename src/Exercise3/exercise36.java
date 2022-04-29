package topic3;

import java.util.Scanner;

/* Exercise 3.6. System must request fill numbers until the user write the
 number zero. After that system will print the sum of all the numbers.*/


public class exercise36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value = -1;
        int sum = 0;

        while (value != 0) {
            System.out.print("Type a value: ");
            value = s.nextInt();
            sum = sum + value;
        }

        System.out.println(sum);
    }
}