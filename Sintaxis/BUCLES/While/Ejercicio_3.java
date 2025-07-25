package BUCLES.While;

public class Ejercicio_3 {
    public static void main(String[] args) {

        /*
         * El objetivo es escribir un programa en Java que calcule la suma de todos los
         * números enteros desde 1 hasta un número N dado. Por ejemplo, si N es 5, la
         * suma sería 1+2+3+4+5=15. Sigue estos pasos para construir tu solución.
         * 
         */

        // Variables
        int limite = 5;
        int suma = 0;
        int contador = 1;

        while (contador <= limite) {
            suma += contador; //con el operador +=le asignamos un nuervo valor a la variable
            contador++;
        }
        System.out.println(suma);

    }
}
