public class TicketCine {
    public static void main(String[] args) {

        System.out.println("*** Ejercicio de simulacion de un ticket de cine ***");

        // Se define el nombre del cine
        final var NOMBRE_CINE = "QroCine";

        // Se declaran las variables del cliente y la funcion que va a ver
        var nombrePelicula = "Avengers";
        var precioBoleto = 70.0;
        var esEstudiante = false;

        // Se imprime el ticket
        System.out.println(NOMBRE_CINE + " presenta: " + nombrePelicula + " | Precio: " + precioBoleto + " | Descuento: " + esEstudiante);

    }
}
