package IF_ELSE;

public class JavaSwitch {
    public static void main(String[] args) {

        /*
         * En lugar de escribir muchos if else, puedes usar la declaracion switch
         * 
         * Así es como funciona:
         * 
         * La expresión switch se evalúa una vez.
         * El valor de la expresión se compara con los valores de cada case.
         * Si hay una coincidencia, se ejecuta el bloque de código asociado.
         * Las palabras clave (breaky y default) son opcionales y se describirán más
         * adelante en este capítulo.
         * 
         * 
         * Explicación detallada:
         * 
         * Función:
         * La sentencia switch permite ejecutar diferentes bloques de código basados en
         * el valor de una expresión. Cada case representa un valor posible de esa
         * expresión.
         * 
         * Estructura:
         * Dentro de un switch, cada case se define con la palabra clave case seguida de
         * un valor constante (un entero, un enum, o una cadena de texto en versiones
         * recientes de Java) y dos puntos (:).
         * 
         * Coincidencia:
         * Cuando la expresión del switch coincide con el valor de un case, el bloque de
         * código asociado a ese case se ejecuta.
         * 
         * Continuación (o no) de la ejecución:
         * Sin la palabra clave break al final de un bloque case, la ejecución
         * continuará con el siguiente case (comportamiento llamado "fall-through").
         * Para evitar esto y que solo se ejecute el bloque del case correspondiente, es
         * común usar break al final de cada bloque case.
         * 
         * El siguiente ejemplo utiliza el número de día de la semana para calcular el
         * nombre del día de la semana:
         */

        int dia = 9;
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
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");                
            default:
                System.out.println("EL numero ingresado no coincide con un dia");
                break;
        }





    }

}