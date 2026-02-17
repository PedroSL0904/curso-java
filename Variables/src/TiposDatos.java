public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java
        //Enteros (su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoEntero = 21473847;
        System.out.println("tipoEntero = " + tipoEntero);
        long tipoLong = 987654321098765432L;
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante (su valor por default es 0.0)
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // D o d para indicar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (su valor por default es '\u0000')
        char tipoChar = 'A'; // Caracteres del tipo unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (su valor por default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Object (su valor por default es null)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Pedro Sanchez";
        System.out.println("nombre = " + nombre);
    }
}
