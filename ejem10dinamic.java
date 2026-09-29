import java.util.ArrayList;
import java.util.List;

public class ejem10dinamic {
    public static void main(String[] args) {
        List<ejem10> lista = new ArrayList<>();
        lista.add(new ejem10("Juan", 25, "Juan@gmail.com"));
        lista.add(new ejem10("Maria", 30, "Maria@gmail.com"));
        lista.add(new ejem10("Pedro", 28, "Pedro@gmail.com"));
        lista.add(new ejem10("Ana", 22, "Ana@gmail.com"));

        for(ejem10 dato : lista) {
            System.out.println("nombre: " +  dato.getnombre());
            System.out.println("edad: " + dato.getedad());
            System.out.println("correo: " + dato.getcorreo());

        }
    }
    
}
