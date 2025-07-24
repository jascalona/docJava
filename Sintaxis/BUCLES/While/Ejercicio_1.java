package BUCLES.While;

public class Ejercicio_1 {

    // Ejercicio: Vaciado del tanque
    /*
     * Este ejercicio demuestra el uso de un bucle while para simular el vaciado de
     * un tanque de agua, utilizando un volumen inicial definido estáticamente. No
     * se requiere ninguna entrada por parte del usuario.
     * 
     * Detalles y Requisitos:
     * -----------------------------------------------------------------------------
     * -----------
     * Datos Estáticos:
     * 
     * Temperatura Inicial del Agua: 20.0 grados Celsius.
     * 
     * Temperatura Objetivo: 50.0 grados Celsius.
     * 
     * Límite de Temperatura Segura: 60.0 grados Celsius. (Si la temperatura supera
     * este valor, el calentamiento debe detenerse inmediatamente).
     * 
     * Aumento de Temperatura por Ciclo: 3.5 grados Celsius.
     * 
     * -----------------------------------------------------------------------------
     * -------
     * Lógica del Bucle while:
     * 
     * Usa un bucle while para simular los ciclos de calentamiento.
     * 
     * El bucle debe continuar mientras la temperatura actual del agua sea menor que
     * la temperatura objetivo Y menor o igual que el límite de temperatura segura.
     * 
     * En cada ciclo, aumenta la temperatura del agua según el Aumento de
     * Temperatura por Ciclo.
     * 
     * Importante: Después de aumentar la temperatura en cada ciclo, verifica si la
     * nueva temperatura ha superado el Límite de Temperatura Segura. Si lo hace,
     * debes detener el calentamiento inmediatamente y mostrar un mensaje de
     * advertencia.
     * 
     * -----------------------------------------------------------------------------
     * ------
     * Salida por Consola:
     * 
     * Al inicio, muestra la temperatura inicial y la temperatura objetivo.
     * 
     * En cada ciclo, imprime la temperatura actual del agua, formateada a una sola
     * cifra decimal.
     * 
     * Al finalizar el proceso, muestra un mensaje indicando si se alcanzó la
     * temperatura objetivo o si se detuvo por el límite de seguridad, junto con la
     * temperatura final.
     * 
     * -----------------------------------------------------------------------------
     * -----
     * Simulación de Tiempo (Opcional pero recomendado):
     * 
     * Puedes añadir una pequeña pausa (Thread.sleep()) en cada ciclo para simular
     * que el calentamiento toma tiempo y hacer la salida más legible. Maneja la
     * InterruptedException si la usas.
     */

    // Paso 01 declaracion de variables

    static double tempActual = 20.0; // Temperatura Actual (variable que cambiará)
    static final double tempObjetivo = 50.0; // Temperatura Objetivo
    static final double tempSegura = 60.0; // Temperatura Final (segura)
    static final double tempxCiclo = 3.5;

    public static void main(String[] args) {

        /*
         * Paso 2: Implementar el Método main
         * El método main es el punto de entrada de tu programa. Aquí debes inicializar
         * la simulación y llamar al método que realizará el calentamiento.
         * 
         * Dentro del método main, imprime un mensaje inicial que muestre la temperatura
         * inicial y la temperatura objetivo.
         * 
         * Llama al método calentarAgua() (que crearás en el siguiente paso) para
         * iniciar el proceso.
         */
        System.out.println("\n---Simulador de Calentamiento Solar---");
        System.out.println("La Temperatura inicial es: " + tempActual + "°C");
        System.out.println("La Temperatura Objetivo es: " + tempObjetivo + "°C");
        System.out.println("Limite de Temperatura segura: " + tempSegura + "°C");
        System.out.println("\n---Iniciar proceso de medicion---");

        /*
         * Paso 3: Crear el Método calentarAgua()
         * Este es el corazón de tu programa, donde estará el bucle while.
         * 
         * Define el método como public static void calentarAgua().
         * 
         * Implementa el bucle while: La condición del while debe verificar si la
         * temperaturaActual es menor que la TEMPERATURA_OBJETIVO Y si temperaturaActual
         * es menor o igual que el LIMITE_SEGURIDAD.
         */

        calentarAgua();
        // El mensaje final se imprimirá después de que calentarAgua() termine
        // Se agregará al final del método calentarAgua para un mejor control del flujo

    }

    /*
     * Paso 4: Crear el Método calentarAgua() "fuera del metodo main"
     * Este es el corazón de tu programa, donde estará el bucle while.
     * 
     * Define el método como public static void calentarAgua().
     * 
     * Implementa el bucle while: La condición del while debe verificar si la
     * temperaturaActual es menor que la TEMPERATURA_OBJETIVO Y si temperaturaActual
     * es menor o igual que el LIMITE_SEGURIDAD.
     */

    // Metodo calentarAgua();
    public static void calentarAgua() {

        /*
         * Dentro del bucle:
         * 
         * Incrementa la temperatura: temperaturaActual += AUMENTO_POR_CICLO;
         * 
         * Verifica el límite de seguridad: Justo después de aumentar la temperatura,
         * necesitas verificar si temperaturaActual ha superado el LIMITE_SEGURIDAD. Si
         * es así, imprime una advertencia y usa un break; para salir del bucle while
         * inmediatamente.
         * 
         */

        while (tempActual < tempObjetivo && tempActual <= tempSegura) {
            tempActual += tempxCiclo;
            // Este es el caso que define el final del bucle ya que la condicion se detiene
            // al momento en el que tempActual es mayor que tempObjetivo
            System.out.println("Medida de temperatura actual: " + tempActual + " °C");
            if (tempActual > tempSegura) {
                System.out.println("\n!Advertencia¡ la temperatura actual ha excedido la temperatura segura, medidor actual: " + tempActual + " °C");
                break;
            }
        }

        /*
         * Después del bucle: Una vez que el bucle while termina (ya sea porque se
         * alcanzó la temperatura objetivo o se superó el límite de seguridad), imprime
         * un mensaje final para indicar el resultado y la temperatura final.
         */

         if (tempActual >= tempObjetivo) {
            System.out.println("\nObjetivo alccanzado, la temperatura final es de: " + tempActual + " °C 'Estable' ");
         } else {
            System.out.println("\nError, los niveles de temperatura fueron exedidos, llame a servicio tecnico!");
         }

    }
}
