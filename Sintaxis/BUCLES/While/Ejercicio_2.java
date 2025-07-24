package BUCLES.While;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        /*
         * Explicación del Código:
         * 
         * import java.util.Random; y import java.util.Scanner;: Estas líneas importan
         * las clases necesarias. Random se usa para generar el número secreto y Scanner
         * para leer la entrada del usuario desde la consola.
         * 
         * Random random = new Random();: Crea una instancia de la clase Random.
         * 
         * int numeroSecreto = random.nextInt(100) + 1;: Genera un número entero
         * aleatorio. random.nextInt(100) genera un número entre 0 y 99. Le sumamos 1
         * para que el rango sea de 1 a 100.
         * 
         * Scanner scanner = new Scanner(System.in);: Crea una instancia de la clase
         * Scanner para obtener la entrada del usuario.
         * 
         * int intentoUsuario; y int contadorIntentos = 0;: Declaran variables para
         * almacenar el intento del usuario y para contar cuántos intentos le toma.
         * 
         * while (true): Aquí es donde entra en juego el bucle while. Se usa true como
         * condición para crear un bucle infinito inicialmente. Esto significa que el
         * bucle continuará ejecutándose indefinidamente hasta que se encuentre una
         * instrucción break.
         * 
         * System.out.print("Introduce tu intento: ");: Pide al usuario que introduzca
         * un número.
         * 
         * intentoUsuario = scanner.nextInt();: Lee el número entero que el usuario
         * introduce.
         * 
         * contadorIntentos++;: Incrementa el contador de intentos con cada nueva
         * adivinanza.
         * 
         * if (intentoUsuario == numeroSecreto): Comprueba si el usuario adivinó el
         * número.
         * 
         * Si es correcto, imprime un mensaje de felicitación, muestra la cantidad de
         * intentos y luego ejecuta break;, que sale del bucle while, terminando el
         * juego.
         * 
         * else if (intentoUsuario < numeroSecreto): Si el intento es menor que el
         * número secreto, le dice al usuario que es "Demasiado bajo".
         * 
         * else { ... }: Si no es correcto y no es bajo, entonces debe ser alto, así que
         * le dice al usuario que es "Demasiado alto".
         * 
         * scanner.close();: Es buena práctica cerrar el objeto Scanner una vez que ya
         * no se necesita, para liberar recursos del sistema.
         * 
         * Este ejercicio te permite ver cómo un bucle while puede ser usado para
         * repetir una serie de acciones hasta que una condición específica se cumpla
         * (en este caso, adivinar el número correcto).
         */

        // Crear Instancia del metodo random
        Random randomAletorio = new Random();

        // Numero aletorio entre (0 y 100) NOTA: al final debe sumarle 1 para que llegue
        // a los 100 numeros

        int numAletorio = randomAletorio.nextInt(10) + 1;

        //Crear la Instancia de del metodo Scanner (En este caso no se puede declarar objeto ya que debe devolver un entero)
        Scanner inpuScanner = new Scanner(System.in);
        System.out.println("Hola, bienvenido al juego adivina el numero, introduce el numero que creas correspondiente");


        int intentoUsuario;
        int contadorIntentos = 0;

        while (true) {
            //Leer el numero que el usuario ingreso
            intentoUsuario = inpuScanner.nextInt();
            contadorIntentos++;

            if (intentoUsuario == numAletorio) {
                System.out.println("Felicidades, has adivinado el numero aletorio");
                break;
            } 
            else if (intentoUsuario > numAletorio) {
                System.out.println("Te dare una pista, el numero que ingresaste es mayor al que intentas adivinar");
            } else{
                System.out.println("Te dare una pista, el numero que ingresaste es menor al que intentas adivinar");
            }
        }

        
        System.out.println("\nFelicidades el numero era: " + intentoUsuario);
        System.out.println("Numero de intentos: " +contadorIntentos);


    }
}