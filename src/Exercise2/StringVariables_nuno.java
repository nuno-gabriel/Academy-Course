package chapter3;

public class StringVariables {
    public static void main(String[] args){

        /*
        Exercise 2.3. Define two String variables, and check if are the same (if structure).
        Try to use the methods “equals()”, “equalsIgnoreCase()” and “==”. What it happens?
         */

        String var1 = "Hello world";
        String var2 = "Hello world";
        String var3 = "HELLO WORLD";

        if (var1.equals(var2)){
            System.out.println("The Strings are the same");
        }
        else if (var1.equalsIgnoreCase(var3)) {
            System.out.println("The Strings have the same lenght");
        }
        else {
            System.out.println(var1 == var2);
        }


    }
}
