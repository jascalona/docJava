package Tipo_de_datos;

public class CarcateresEspeciales {
    public static void main(String[] args) {

        String txt2 = " M";
        String txt = "Hola" + txt2 + "undo";

        System.out.println(txt);

        /*
         * Para el caso en que se requiera agregar caracteres especiales dento de una
         * cadena:
         * 
         * \'\' = 'Vikings'
         * \"\" = "Vikings"
         * \\ = = \Vikings
         */
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt3);


        /*Otra secuencia de escape muy usal son:
         * 
         * \n = Nueva Linea
         * \r = Retorno de linea
         * \t = Tablulador 
         * \b = Retroceso
         * \f = Avance de pagina
        */



    }
}