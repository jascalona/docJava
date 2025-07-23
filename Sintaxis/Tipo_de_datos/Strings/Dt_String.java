package Tipo_de_datos.Strings;

public class Dt_String {
    public static void main(String[] args) {

        // Crear un string
        String texto = "Hola mundo";

        // Como mostrar la longitud de un string
        String name = "Jose";

        System.out.println("Cantidad de letras por texto: " + name.length());

        /*
         * Otros metodos de cadenas son
         * 
         * toUpperCase: LETRAS EN MAYUSCULAS
         * toLowerCase: letras en minusculas
         */

        String var1 = "Hola mundo";
        System.out.println((var1.toUpperCase())); // Mayusculas
        System.out.println((var1.toLowerCase())); // Minusculas

        /*
         * Otro metodo es encontrar un caracter en la cadena
         * 
         * El método indexOf()  devuelve el índice (la posición) de la primera aparición
         * de un texto especificado en una cadena (incluidos los espacios en blanco):
         * 
         */

         System.out.println(var1.indexOf("mundo")); //La respuesta es 5

    }
}
