package Exercise2;

public class Stringvariables {

    public static void main(String[] args){

        /*
        Ejercicio 2.3. Define dos variables de tipo String, y comprueba si son iguales (si estructura).
        Intenta utilizar los métodos "equals()", "equalsIgnoreCase()" y "==". ¿Qué ocurre?
         */

        String var1 = "Hello mundo";
        String var2 = "Adios mundo";

        boolean var3 = var1.equals(var2);
        boolean var4 = var1.equalsIgnoreCase(var2);
        boolean var5 = var1 == var2;

        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
