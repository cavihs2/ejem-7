import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejem10 {
    String nombre;
    int edad;
    String correo;

    // Constructor con parámetros
    public ejem10(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Constructor vacío
    public ejem10() {}

    // Setters (reciben valor y son void)
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

    // Getters (NO reciben valor y devuelven el tipo correspondiente)
    public String getnombre() {
        return this.nombre;
    }

    public int getedad() {
        return this.edad;
    }

    public String getcorreo() {
        return this.correo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ejem10> lista = new ArrayList<>();

        System.out.print("¿Cuántos registros deseas ingresar?: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Registro " + (i + 1) + " ---");

            System.out.print("Ingresa el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Ingresa el correo: ");
            String correo = scanner.nextLine();

            // Guardas el objeto en la lista
            lista.add(new ejem10(nombre, edad, correo));
        }

        System.out.println("\n========== DATOS ALMACENADOS ==========");
        for (ejem10 dato : lista) {
            System.out.println("Nombre: " + dato.getnombre());
            System.out.println("Edad:   " + dato.getedad());
            System.out.println("Correo: " + dato.getcorreo());
            System.out.println("---------------------------------------");
        }

        scanner.close();
    }
}

