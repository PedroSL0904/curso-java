import java.util.Scanner;

public class RecetasDeCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");

        // Solicitamos los datos
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrese los ingredientes necesarios: ");
        var ingredientesReceta = consola.nextLine();
        System.out.print("Ingrese el tiempo de preparación en minutos: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingrese la dificulad de la receta: ");
        var dificultadReceta = consola.nextLine();

        // Imprimimos los datos
        System.out.println("\n--- Receta de cocina ---");
        System.out.println(String.join(" ","\tNombre de la receta:",nombreReceta));
        System.out.println(String.join(" ","\tIngredientes necesarios:",ingredientesReceta));
        System.out.println(String.join(" ","\tTiempo de preparación:",String.valueOf(tiempoPreparacion),"minutos"));
        System.out.println(String.join(" ","\tDificultad:",dificultadReceta));
    }
}
