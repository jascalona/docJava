package variables;

public class ExampVidaReal {
    public static void main(String[] args) {

        /*
         * Ejemplos de la vida real
         * 
         * En nuestros ejemplos, a menudo simplificamos los nombres de las variables
         * para que coincidan con su tipo de dato (myInt o myNum para tipos int , myChar
         * para tipos char, etc.). Esto se hace para evitar confusiones.
         * 
         * Sin embargo, para un ejemplo práctico del uso de variables, hemos creado un
         * programa que almacena diferentes datos sobre un estudiante universitario:
         */

        String name = "Jose";
        int id = 10;
        int age = 22;
        float Fee = 1.58f;
        char Seccion = 'B'; // Las variables de tipo char deben ser definidas con comillas simple ''

        // Print variables
        System.out.println("Nombre Estudiante: " + name);
        System.out.println("Id: " + id);
        System.out.println("Edad: " + age);
        System.out.println("Altuda: " + Fee);
        System.out.println("Seccion: " + Seccion);

        /*
         * Calcular el área de un rectángulo
         * En este ejemplo de la vida real, creamos un programa para calcular el área de
         * un rectángulo (multiplicando el largo por el ancho):
         */

         int width = 40;
         int length = 28;
         int area;
         //Calculo de variables
         area = length * width; 

         System.out.println("El area del rectangulo es: " + area);

    }
}
