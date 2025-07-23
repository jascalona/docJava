package Operadores;

public class Operadores {

    public static void main(String[] args) {

        /*
         * Java divide los operadores en los siguientes grupos:
         * 
         * Operadores aritméticos: "+, *, -, /, ++,- -, %"
         * Operadores de asignación: Este es el signo que se usa para asignar un valor a
         * una variable: =
         * Operadores de comparación: =<>
         * Operadores lógicos: "&&, ||, !"
         * Operadores bit a bit
         */

        // Ejemplo de operador aritmetico +
        int num_1 = 100;
        int num_2 = 25;
        int calculo = num_1 + num_2;

        int total = 300 + calculo;

        System.out.println(total);

        // Ejemplo de operador de asignacion
        int x = 10;

        // El operador (+=) agrega un valor a una variable: En este ejmplo le agregamos
        // un nuevo valor a "x"
        x += 10; // 20

        // El operador (-=) resta un valor a una variable: En este ejmplo le agregamos
        // un nuevo valor a "x"
        x -= 5; // 10

        // El operador (*=) resta un valor a una variable: En este ejmplo le agregamos
        // un nuevo valor a "x"
        x *= 2; // 30

        // El operador (/=) resta un valor a una variable: En este ejmplo le agregamos
        // un nuevo valor a "x"
        x /= 2; // 15

        // El operador (%=) calcula el % un valor a una variable: En este ejmplo le
        // agregamos
        // un nuevo valor a "x"
        x %= 2; // 15

        System.out.println(x);

        // Ejemplo de Comparaciones
        int q = 10;
        int d = 15;

        System.out.println(q <= d); // Menor o igual que
        System.out.println(q >= d); // Mayor o igual que
        System.out.println(q == d); // Igual que
        System.out.println(q > d); // Mayor que
        System.out.println(q < d); // Menor que
        System.out.println(q != d); // Diferente a

        /*
         * Operadores Logicos
         * Se usan para determinar la logica entre variables
         */

        // &&: (Y Lógico): Devuelve verdadero si ambas afirmaciones son verdaderas
        int z = 5;
        System.out.println(z > 3 && z < 10); // Res: "true" por que 5 es mayor que 3 y z es menor que 10

        // ||: (O Lógico): Devuelve verdadero si ambas afirmaciones son verdaderas
        System.out.println(z < 5 || z > 2);

        // !: (No Logico): Invierte elresultado, devuelve falso si el resultado es
        // verdadero
        int v = 5;
        System.out.println(!(v > 3 && v < 10)); // returns false because ! (not) is used to reverse the result

    }

}