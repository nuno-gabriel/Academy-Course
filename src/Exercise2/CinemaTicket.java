package Exercise2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CinemaTicket {

    public static void main(String[] args){

        /*
        Escribe un programa que imprima en pantalla el precio de una entrada de cine en función de la edad del cliente.
        El programa debe leer la edad del usuario y calcular el precio de la siguiente manera: (a) Entrada normal:
        7 euros; (b) Niños menores de 5 años: 60% de descuento; (c) Mayores de 60 años: 55% de descuento.
         */

        // First I will put the data I have
        double ticket = 7;
        double descuentoMayores = 0.45d;
        System.out.println("How old are you? ");
        Scanner scanner = new Scanner(System.in);
        double edad = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");


        //Now we will apply the logic
        if(edad < 5){
            System.out.println("Por ser menor de 5 años el precio de tu entrada es " +
                    ticket*0.40 + "€");
        } else if (edad > 60) {
            System.out.println("Por ser mayor de 60 años el precio de tu entrada es " +
                    df.format(ticket*descuentoMayores) + "€");
        }else {
            System.out.println("El precio de tu entrada es " + ticket + "€");
        }
    }
}
