package IF_ELSE;

public class Ejercicios1 {
    public static void main(String[] args) {

        // Ejercicio 01 validar si un numero es positivo o negativo
        int statusNm = 10;
        if (statusNm > 0) {
            System.out.println("El numero es positivo");
        } else if (statusNm < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es un 0");
        }

        // Ejercio para saber si el numero ingresado es par o impar
        int NmPI = 3;
        if (NmPI % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }

        // Ejercicio de java Switch (Calcular el dia de la semana)
        int dia = 0;

        if (dia == 0) {
            System.out.println("Por favor ingrese un numero valido de la semana, '0' no es un numero valido ");
        } else {
            switch (dia) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                default:
                    System.out.println("El valor ingresado no corresponde a un dia de la semana: " + dia);
                    break;
            }
        }

        // Ejercicio 02 estructura Switch
        /*
         * 
         * Ejercicio: Calculadora de Operaciones Básicas ➕➖✖️➗
         * Imagina que quieres crear una pequeña calculadora que realice operaciones
         * básicas (suma, resta, multiplicación, división) según la elección del
         * usuario.
         * 
         * Problema:
         * Crea un programa en Java que:
         * 
         * Pida al usuario que introduzca dos números.
         * 
         * Pida al usuario que elija una operación (1 para suma, 2 para resta, 3 para
         * multiplicación, 4 para división). NOTA: EN ESTE EJERCICIO LA PETICION DE OPERACION Y NUMEROS A CALCULAR NO ESTAN HABILITADAS YA QUE EL EJERCICIO FUER REALIZADO CON DATOS STATICOS
         * 
         * Utilice la estructura switch para realizar la operación seleccionada sobre
         * los dos números.
         * 
         * Muestre el resultado de la operación.
         * 
         * Maneje el caso de una opción no válida.
         */

        // Var de carga
        int valor1 = 5;
        int valor2  = 5;

        // Definir tipo de operaciones
        String suma = "suma";
        String resta = "resta";
        String multiplicacion = "multiplicacion";
        String division = "division";

        String option = "division";

        double resultado = 0;

        switch (option) {
            case "suma":
                resultado = valor1 + valor2;
                System.out.println("La operacion fue de tipo 'suma' el resultado fue: " + resultado);
                break;
            case "resta":
                resultado = valor1 - valor2;
                System.out.println("La operacion fue de tipo 'resta' el resultado fue: " + resultado);
            case "multiplicacion":
                resultado = valor1 * valor2;
                System.out.println("La operacion fue de tipo 'multiplicacion' el resultado fue: " + resultado);
            case "division":
            //Evaluar caso de division
            if (valor2 != 0) {
                resultado = valor1 / valor2;
                System.out.println("La operacion fue de tipo 'division' el resultado fue: " + resultado);
            } else{
                System.out.println("Error, no se puede dividir por ''0 ");
            }
    
            default:
                System.out.println("La operacion: " + option + " no es valida");
                break;
        }

    }
}
