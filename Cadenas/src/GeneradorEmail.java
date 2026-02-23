public class GeneradorEmail {
    public static void main(String[] args) {
        // Generador de email

        // Datos del estudiante
        var nombreCompletoAlumno = "Pedro Sanchez Lucio";
        System.out.println("nombreCompletoAlumno = " + nombreCompletoAlumno);
        var nombreInstitucion = "Universidad Internacional de Queretaro";
        var dominio = ".com";

        // Generacion de email
        var emailAlumno = nombreCompletoAlumno.replace(" ",".").toLowerCase() + "@a." +
                nombreInstitucion.substring(0,11).toLowerCase() +
                nombreInstitucion.substring(0,2).toLowerCase() +
                nombreInstitucion.substring(nombreInstitucion.indexOf(" ")+1,nombreInstitucion.indexOf(" ")+2).toLowerCase() +
                nombreInstitucion.substring(nombreInstitucion.lastIndexOf(" ") + 1,nombreInstitucion.lastIndexOf(" ") + 2).toLowerCase() +
                dominio;
        System.out.println("emailAlumno = " + emailAlumno);

    }
}
