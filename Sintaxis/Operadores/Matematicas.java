package Operadores;

public class Matematicas {
    public static void main(String[] args) {

        /*
         * La clase Java Math tiene muchos métodos que le permiten realizar tareas
         * matemáticas con números.
         * 
         */

        int x = 10;
        int y = 5;

        int j = -45;

        // El método Math.max() se puede utilizar para encontrar el valor más alto de x
        // e y Math.max(x,y)
        System.out.println(Math.max(x, y));

        // El método Math.min() se puede utilizar para encontrar el valor más bajo de x
        // e y :Math.min(x,y)
        System.out.println(Math.min(x, y));

        // El método Math.sqrt() devuelve la raíz cuadrada de x :Math.sqrt(x)
        System.out.println(Math.sqrt(x));

        // El método Math.abs() devuelve el valor absoluto (positivo) de x :Math.abs(x)
        System.out.println(Math.abs(j));

        // El metodo Math.random() devuelve un número aleatorio entre 0,0 (inclusive) y
        // 1,0 (exclusivo):

        /*
         * NOTA:Para tener más control sobre el número aleatorio, por ejemplo, si solo
         * desea un número aleatorio entre 0 y 100, puede utilizar la siguiente fórmula:
         * 
         */
        System.out.println(Math.random() * 20);

    }
}
