package variables;
public class VariablesImpresion {
    public static void main(String[] args) {

        // También puedes usar el + carácter para agregar una variable a otra variable:
        String name = "Jose";
        String surname = "Escalona";

        String FullName = name + " " + surname;

        System.out.println(FullName);

        /*
         * Para valores numéricos, el + carácter funciona como un operador matemático
         * (tenga en cuenta que aquí utilizamos intvariables (enteras)):
         * 
         */

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

    }
}
