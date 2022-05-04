package topic4;
/*Exercise 4.4. You have to design the code of the access of an account.
    The user can try the access 3 times, if the pin is not correct 3 times, the account will be blocked.
    The pin must be a number of 4 digits.
    The actions of the system should be:
    -       Verify if it’s only a numbers (no letters)
    -       Verify if its only 4 digits (not 3 or 1, it must be 4)
    -       If the pin code doesn’t fit, user must fill again and again (infinite times) until the pin code accomplish the rules.
    -       If the pin code is correct, system allows access to the account.
    -       If the pin code is incorrect, user has other 2 tries. If after the 3 attempts user don’t fill the correct pin code,
    the account will be blocked.
Note: take it easy. Try to develop the code following these steps:
Step 1: First try to create the code to fill the pin code.  Use "String pincode = scanner.next();”.
Step 2:Then try to include the limit of 3 tries.
Step 3: When it works try to include the rule of the 4 elements
Step 4: At the end include the rule that it couldn’t be different of a number.
*/
import java.util.Scanner;

public class    exercise44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = "";
        String pin = "1234";

        for (int i = 3; i > 0; i--) {
            System.out.println("Enter a pin");
            input_string = scanner.next();
            while (input_string.length() != 4) {
                System.out.println("You should input a 4 digit pin:");
                input_string = scanner.next();
            }
            while (!isNumber (input_string)) {
                System.out.println("Only numbers are allowed:");
                input_string = scanner.next();
            }
            if (input_string.equals(pin)) {
                System.out.println("Correct pin. Welcome");
                break;
            } else if (i == 1) {
                System.out.println("Account is blocked");
            } else {
                System.out.println("Pin is incorrect. Try again. You have " + (i - 1) + " more tries.");
            }


        }

    }
        public static boolean isNumber(String text) {
            boolean number = true;
            if (text.length() == 0)
                number = false;
            for (int i = 0; i < text.length(); i++)
                if (!Character.isDigit(text.charAt(i)))
                    number = false;
            return number;
        }

}


