package Tipo_de_datos;

public class Concatenacion {
    public static void main(String[] args){

        //Se puede usar el operador: "+" para realizar las concatenaciones

        String name = "Jose";
        
        String surname = "Escalona";
        
        System.out.println(name + surname);

        //Tambien se puede usar el: concat() solo para concatenar string
        System.out.println(name.concat(" ").concat(surname));

    }
}
