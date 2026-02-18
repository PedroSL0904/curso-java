public class TiendaLinea {
    public static void main(String[] args) {
        // Se crean variables para almacenar el detalle de productos de una tienda en linea
        System.out.println("*** Tienda en linea (detalle de un producto) ***");

        String nombreProducto = "Televisión Samsung 55 pulgadas";
        double precioProducto = 18999.99;
        int cantidadDisponible = 12;
        boolean isDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("hasDisponible = " + isDisponible);
        System.out.println("-----------------------------------------------------");


        // Se modifican los valores de cada variable
        nombreProducto = "Televisión Samsung 65 pulgadas";
        precioProducto = 26599.99;
        cantidadDisponible = 0;
        isDisponible = false;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("hasDisponible = " + isDisponible);
    }
}
