public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Detalle de la reservación de hoteles ***");

        // Se establecen valores iniciales y se mandan a imprimir
        var nombreCompletoCliente = "Pedro Sánchez";
        var diasEstancia = 5;
        var tarifaDiaria = 1000.50;
        var tieneVistaAlMar = false;

        System.out.println("nombreCompletoCliente = " + nombreCompletoCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
        System.out.println();

        // Se modifican valores y se vuelven a imprimir
        nombreCompletoCliente = "Pedro Sánchez Lucio";
        diasEstancia = 6;
        tarifaDiaria = 950.50;
        tieneVistaAlMar = true;

        System.out.println("Nuevos datos de la reservación");
        System.out.println("nombreCompletoCliente = " + nombreCompletoCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }
}
