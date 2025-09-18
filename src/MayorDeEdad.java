import java.util.Scanner;

/**
 * @author Óscar
 */
public class MayorDeEdad {
    public static void main(String[] args) {
        String nombre;
        int edad;
        final int MAYORIA_DE_EDAD = 18;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Escribe tu edad: ");
        edad = sc.nextInt();
<<<<<<< HEAD
        sc.close(); // Cierro el Scanner para liberar recursos
=======
        sc.close();  // Cierro el Scanner para liberar recursos

>>>>>>> 771541d21a7080a5c064e39ed94121381aa57e87
        boolean mayorDeEdad = edad >= MAYORIA_DE_EDAD;

        System.out.println("Hola, " + nombre);
        System.out.println("Eres mayor de edad? " + mayorDeEdad);
    }
}
