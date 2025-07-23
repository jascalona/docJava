package Tipo_de_datos;

public class Conversiones_tp_datos {
    public static void main(String[] args) {

        /*
         * Conversión de tipos en Java
         * La conversión de tipos es cuando se asigna un valor de un tipo de datos
         * primitivo a otro tipo.
         * 
         * En Java, hay dos tipos de conversión:
         * 
         * Conversión de ensanchamiento (automática): conversión de un tipo más pequeño
         * a un tamaño de tipo más grande
         * byte-> short-> - char> - int> long-> - float> ->double
         * 
         * Reducción de tamaño (manual): conversión de un tipo más grande a un tipo de
         * tamaño más pequeño
         * double-> float-> long-> - int> - char> - short> ->byte
         */

        /*
         * Ensanchamiento de la fundición:
         * La conversión de ensanchamiento se realiza automáticamente al pasar un tipo
         * de tamaño más pequeño a un tipo de tamaño más grande:
         */

        int preci_fru = 2;
        int cantidad = 5;

        double calculo = cantidad * preci_fru;

        System.out.println(preci_fru);
        System.out.println("Calculo total: " + calculo);

        /*
         * Reducción de la longitud de la colada
         * La restricción de la conversión debe realizarse manualmente colocando el tipo
         * entre paréntesis () delante del valor:
         */

        double preci_fru_2 = 2.5d;
        int cantidad_2 = 5;

        int reducc = (int) preci_fru_2 * cantidad; // Reduccion de double a int

        System.out.println("Calculo total entero: " + reducc);

        // Caso II cuadre de notas
        /*
         * Cada materia tiene un puntaje maximo de 20 pts para sacar el promedio del
         * estudiante sume mutiplique el valor de cada materia y dividala entre la cantidad de las mismas (6)
         */
        double matematicas = 8.6d;
        double castellano = 10d;
        double ingles = 15d;
        double biologia = 0.4d;
        double historia = 10d;
        double fisica = 20d;

        //Variable que realiza la reduccion a enteros y calculo el puntaje final del semestre
        double calculo_pts = matematicas + castellano + ingles + biologia + historia + fisica;

        int total_pts =(int) calculo_pts / 6;

         System.out.println("Puntaje total del estudiante: " + total_pts);

    }
}
