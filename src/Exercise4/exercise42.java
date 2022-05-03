package topic4;

import java.util.Scanner;

public class exercise42 {
    //Exercise 4.2.  Try to do the exercise of Java Course: chapter 5a but add another two methods.
    // The first one should print the age of the person, and the second one if she is or not a zombie.
    public static void main (String [] args){
        //Greetings
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        //Age
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        //Zombie
        System.out.println("Are you a zombie?");
        String zombie = scanner.next();
        greetUser(name);
        ageOfUser(age);
        isZombie(zombie);

    }
    public static void greetUser(String name){
        System.out.println("Hello there " + name + ".");
    }
    public static void ageOfUser(int age){
        System.out.println("You are " + age + " years old.");
    }
    public static boolean isZombie(String zombie){
        if(zombie.equals("yes")) {
            System.out.println("And you're a zombie");
            return true;
        }
        else {
            System.out.println("And you're not a zombie");
            return false;
        }
    }
}

