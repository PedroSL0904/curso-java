public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Pedro Sánchez Lucio"; // Correcto y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Pedro Sánchez Lucio"; // Correcto, no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Pedro"; // Incorrecto
        String nombre_cliente = "Pedro"; // Correcto, no aplica buenas practicas
        String _apellido = "Sánchez"; // Correcto y aceptable
        String $apellidoCompleto = "Sánchez Lucio"; // Correcto y aceptable
        int totpzs = 10; // Correcto, no aplica buenas practicas
        int totalPiezas = 10; // Correcto, aplica las buenas practicas
        boolean casado = true; // Correcto, aun puede mejorar
        boolean esCasado = true; // Correcto, aplica las buenas practicas
        boolean isCasado = true; // Correcto, aplica las buenas practicas
        boolean tieneSaldo = true; // Correcto, aplica las buenas practicas
        boolean hasSaldo = true; // Correcto, aplica las buenas practicas
    }
}
