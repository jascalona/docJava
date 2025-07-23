package IF_ELSE;

public class Teoria {
    public static void main(String[] args) {

        // System.out.println(50 != 100);

        int edadUsuario = 15;
        int edadRequerida = 18;

        /*
         * Java tiene las siguientes declaraciones condicionales:
         * 
         * Se utiliza if para especificar un bloque de código que se ejecutará, si una
         * condición especificada es verdadera
         * 
         * Se utiliza else para especificar un bloque de código que se ejecutará, si la
         * misma condición es falsa
         * 
         * Se utiliza else if para especificar una nueva condición para probar, si la
         * primera condición es falsa
         * 
         * Se utiliza switch para especificar muchos bloques alternativos de código que
         * se ejecutarán
         */

        // Ejemplo de if
        if (edadUsuario >= edadRequerida) {
            System.out.println("El Usuario cumple la edad requerida");
        }

        // Ejemplo de else
        if (edadUsuario >= edadRequerida) {
            System.out.println("El Usuario cumple la edad requerida");

        } else {
            System.out.println("Lo sentimos, no cumples la edad requerida!");
        }

        /*
         * Ejemplo de else if
         * NOTA: else ifdeclaración para especificar una nueva condición si la primera
         * condición es false.
         */

        int hora = 14; // 8:00 pm

        if (hora < 12) {
            System.out.println("Buenos dias");
        } else if (hora > 12 && hora < 19) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas Noches");
        }

        String producto = "zapatos";
        int preProducto = 100;
        String metPago1 = "decontado";

        String metPago2 = "cashea";
        int preCuota1 = 50;

        String option = "cashea"; 

        //Crear condiciones que le informe al usuario cuanto debe pagar
        if (option == metPago2 ) {
            System.out.println("El cliente debe pagar un total de: " + preCuota1);
        } else if (option != metPago2 && option != metPago1) {
            System.out.println("El cliente debe pagar un total de: " + preProducto);
        } else{
            System.out.println("Seleccione un metodo de pago!");
        }


    }
}