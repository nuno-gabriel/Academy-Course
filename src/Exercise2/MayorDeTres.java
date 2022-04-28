package Exercise2;


import java.util.Scanner;

public class MayorDeTres {

    public static void main(String[] args){

         /*
        Ejercicio 2.4. Escribe un programa que lea tres números e imprima cuál es el mayor.
        ¿Funciona? Ahora imagina que el desarrollador ha creado este código basándose en los requisitos,
        ¿puedes encontrar alguna situación en la que funcione mal? Ahora intenta arreglar tu código.
         */

        Scanner scanner = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Enter your first name: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double numero2 = scanner.nextDouble();
        System.out.println("Enter your third number: ");
        double numero3 = scanner.nextDouble();

        if (numero1>numero2 && numero1>numero3){
            System.out.println(numero1);
        } else if (numero2>numero1 && numero2>numero3) {
            System.out.println(numero2);
        }else {
            System.out.println(numero3);
        }
    }
}
