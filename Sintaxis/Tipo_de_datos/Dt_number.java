package Tipo_de_datos;

public class Dt_number {
    public static void main(String[] args) {

        /*
         * Numeros en java
         * 
         * Los tipos de números primitivos se dividen en dos grupos:
         * 
         * 
         * Enteros
         * Los tipos enteros almacenan números enteros, positivos o negativos (como 123
         * o -456), sin decimales. Los tipos válidos son: (byte, short, int y long) El
         * tipo que se
         * debe usar depende del valor numérico
         * 
         * Decimales
         * Los tipos de punto flotante representan números con una parte fraccionaria,
         * que contiene uno o más decimales. Existen dos tipos: (float y double).
         * 
         */

        // Byte
        /*
         * El tipo de dato (byte) puede almacenar números enteros de -128 a 127. Esto se
         * puede usar en lugar de (int) para ahorrar memoria cuando se este
         * seguro de que el valor estará entre -128 y 127:
         * 
         */

        // Ejmp:
        byte myByte = -127;

        // short
        /*
         * El tipo de dato short se puede usar para almacenar enteros desde -32768 hasta
         * 32767
         */

        short myShort = 8765;

        // int
        /*
         * El tipo de dato (int) puede almacenar números enteros desde -2147483648 hasta
         * 2147483647. tipo de dato mas comun para el uso de numeros enteros
         */

        int myInt = 10000;

        // float y double
        /*
         * Los tipos de datos float y double pueden almacenar números fraccionarios.
         * Tenga en cuenta que debe terminar el valor con una "f" para números de punto
         * flotante y una "d" para números dobles.
         * 
         */

        // Tolera un maximo de 6 y 7 digitos
        float myFloat = 0.14f;

        // Tolera un maximo de 16 digitos
        double myDouble = 0.14d;

        System.out.println(myDouble);

        /*
         * Números científicos
         * 
         * Un número de punto flotante también puede ser un número científico con una
         * "e" para indicar la potencia de 10:
         */

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}