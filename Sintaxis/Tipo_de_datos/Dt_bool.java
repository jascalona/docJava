package Tipo_de_datos;

public class Dt_bool {
    public static void main(String[] args) {

        /*
         * Tipo de datos Boolean
         * Muy a menudo en programación, necesitarás un tipo de dato que solo pueda
         * tener uno de dos valores, como:
         * 
         * SÍ / NO
         * ENCENDIDO / APAGADO
         * VERDADERO / FALSO
         * 
         * Para ello, Java dispone de un tipo de dato (boolean) que sólo puede tomar los
         * valores trueo false:
         */

        boolean isTrue = true;
        boolean isFalse = false;

        int nm_one = 300;
        int nm_tho = 20;

        // Imprimir en pantalla si es el valor de nm_one es menor a nm_tho
        System.out.println(nm_one < nm_tho);

        /*
         * Sesion II Booleanos
         * 
         * Muy a menudo, en programación, necesitará un tipo de dato que solo pueda
         * tener uno de dos valores, como:
         * 
         * SÍ / NO
         * ENCENDIDO / APAGADO
         * VERDADERO / FALSO
         */

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        /*
         * Pensemos en un "ejemplo de la vida real" en el que necesitamos averiguar si
         * una persona tiene la edad suficiente para votar.
         * 
         * Para este ejemplo debemos validar que si el usuario es mayor a 18 anos este
         * puede votar de lo contrario no puede votar
         * 
         */

        String nameUser = "Miguel";
        int edadUsuario = 17;

        int MinEdadRequerida = 18;

        System.out.println(edadUsuario >= MinEdadRequerida);

        /*
         * Un enfoque mejor seria encapsilar el codigo anterior en unas condiciones
         * (id...else) para poder realizar diferentes aciones
         */

        if (edadUsuario >= MinEdadRequerida) {
            System.out.println("El Usuario: " + nameUser + " " + "Puede Votar" );
        } else {
            System.out.println("El usuario: " + nameUser + " No puede votar");
        }

    }

}
