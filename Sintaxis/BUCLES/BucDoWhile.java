package BUCLES;

public class BucDoWhile {
    public static void main(String[] args) {

        /*
         * El do/whilebucle es una variante del bucle while. Este bucle ejecuta el
         * bloque
         * de código una vez , antes de comprobar si la condición es verdadera. Luego,
         * repite el bucle mientras la condición sea verdadera.
         * 
         */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

        /*
         * Este comportamiento resulta do/whileútil cuando desea asegurarse de que algo
         * suceda al menos una vez, como mostrar un mensaje o solicitar la entrada del
         * usuario.
         */

    }
}