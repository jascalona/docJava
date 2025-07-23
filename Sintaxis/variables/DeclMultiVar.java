package variables;
public class DeclMultiVar {
    public static void main(String[] args) {

        /*
         * Declarar muchas variables:
         * Para declarar más de una variable del mismo tipo , puede utilizar una lista
         * separada por comas:
         */

        /*
         * En lugar de escribir:
         
         * int x = 5;
         * int y = 6;
         * int z = 50;
         * System.out.println(x + y + z);
         */

         //Se puede usar:
         int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        //Tambien se puede asignar el mismo valor a multiples variables
        int u , o , p; // en esta fila definimo los nombres de las variables 
        u = o = p = 20; // en esta fila definimos el valor de las variables
        System.out.println(p + o + u);


    }
}
