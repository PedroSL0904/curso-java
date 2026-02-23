public class LimpiadorNombres {
    public static void main(String[] args) {

        //Limpiar el nombre de una cancion
        var nombreCancion = "    Linkin Park - Numb    ";
        System.out.println("nombreCancion = " + nombreCancion.trim().replace("-","_").toLowerCase());

    }
}
