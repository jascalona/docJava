package variables;
public class Variables {
    public static void main(String[] args) {

        /*
         * String: Almacena texto, como "Hola". Los valores de cadena se escriben entre
         * comillas dobles.
         * 
         * int: almacena números enteros, sin decimales, como 123 o -123
         * 
         * float: almacena números de punto flotante, con decimales, como 19,99 o -19,99
         * 
         * char: Almacena caracteres individuales, como 'a' o 'B'. Los valores de char
         * se escriben entre comillas simples.
         * 
         * boolean: almacena valores con dos estados: verdadero o falso
         * 
         */

        /*
         * Para crear una variable en java debes:
         * 
         * Elige un tipo (como into String)
         * Dale un nombre a la variable (como x, age, o name)
         * Opcionalmente, asígnele un valor usando =
         * 
         */

        // Ejemplo de variable:
        String name = "Jose";
        String surname = "Escalona";

        int x = 200;
        int y = 450;

        System.out.println("Hola, soy " + name + " " + surname);

        System.out.println(x + y);

        // Operacion para sacar el 20%
        int tasa = 145;
        int porcentaje = 20;
        System.out.println(tasa * porcentaje / 100);

        // Operacion para validar si un numero es mayor o menor
        int num_i = 360;
        int num_ii = 320;

        System.out.println(num_i <= num_ii);

        /*
         * Tenga en cuenta que si asigna un nuevo valor a una variable existente,
         * sobrescribirá el valor anterior:
         * 
         */

        int myNum = 15;
        myNum = 20; // myNum is now 20
        System.out.println(myNum);

        /*
         * Variables finales:
         * Si no desea que otros (o usted mismo) sobrescriban los valores existentes,
         * utilice la finalpalabra clave (esto declarará la variable como "final" o
         * "constante", lo que significa inmutable y de solo lectura):
         */

        final int q = 5;
        // q = 20; // will generate an error: cannot assign a value to a final variable
        System.out.println(q);

        // Otros tipos
        // Demostracion de como declarar variables de otros tipos
        int myNum_ii = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

    }

}
