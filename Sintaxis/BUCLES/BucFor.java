package BUCLES;

public class BucFor {
    public static void main(String[] args) {

        /*
         * El bucle for es estructura de control que permite repetir un bloque de código
         * un número
         * específico de veces o hasta que se cumpla una condición.
         */

        // Ejemplo, imprimir numeros del 0 al 10
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        /*
         * Ejemplo explicado
         * La declaración 1 establece una variable antes de que comience el bucle: int i = 0
         * 
         * La instrucción 2 define la condición para que se ejecute el bucle: i < 5. Si
         * la condición es verdadera, el bucle se ejecutará de nuevo; si es falsa, el
         * bucle finaliza.
         * 
         * La declaración 3 aumenta un valor cada vez que se ejecuta el bloque de
         * código:i++
         */

         //Calcula la suma de numeros  del 1 al 5
         int sum = 0;
         for(int i = 1; i <= 5; i++){
            sum = sum + i; 
         }
         System.out.println("El valor de su suma es: " + sum);

         //Ejemplo de cuenta regresiva
         for(int contador = 10;  contador > 0; contador-- ){
            System.out.println(contador);
         }

    }
}
