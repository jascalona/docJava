package BUCLES;

public class BucWhile {
    public static void main(String[] args) {
        /*
         * Bucle:
         * Los bucles pueden ejecutar un bloque de código siempre que se alcance una
         * condición especificada.
         * 
         * Los bucles son útiles porque ahorran tiempo, reducen errores y hacen que el
         * código sea más legible.
         * 
         * Bucle While:
         * Este recorre un bloque de código mientras se cumpla una condición
         * especificada true:
         */

        // En el siguiente ejemplo, el código del bucle se ejecutará una y otra vez
        // mientras una variable (i) sea menor que 5:

        int i = 4;
        while (i < 5) { //Este codigo basicamente incrementa la variable 'i' hasta que llegue a su top que es 4 ya que la condicion es (i < 5)
           System.out.println(i);   
           i++;  
        } 

        //Este ejemplo cuenta regresivamente del 3 al 1 y luego muestra "¡Feliz Año Nuevo!" al final:
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("Feliz 2025");


        //Ejercicios de la vidad real, contador regresivo
        int contador = 10;
        while (contador > 0) {
            System.out.println(contador);
            contador--;
        }
        System.out.println("Happy new year");

        //Ejercicio 02 de la vida real agreagndo condicionales (if else) juego de Yatzy consiste en imprimir Yatzy si el numero dado es 6;
        int dice = 2;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy");
            } else {
                System.out.println("Yatzy");
            }
            dice = dice +1;
        }

    }
}