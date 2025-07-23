package Tipo_de_datos;

public class Ejm_vida_real {
    public static void main(String[] args) {

        // Tipos de datos aplicados en la vida real

        // Ejemplo de costo total de varios articulos
        int idCodigo =7651;
        String tp_fruta = "Fresa";
        double precio = 0.50d;
        int cantidad = 2;
        char money = '$';

        // Variable que almacena el calculo del producto
       double total = precio * cantidad;

        System.out.println("Producto: " + tp_fruta + " " + "Codigo del producto: " + idCodigo);
        System.out.println("Cantidad de productos: " + cantidad);
        System.out.println("Total a pagar: " + total + money);
    }

}
