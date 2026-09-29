public class ejem10static {
    public static void main(String[] args) {
        ejem10 obj1 = new ejem10(  "Juan", 25, "juan@gmail.com");
        System.out.println("nombre: " + obj1.getnombre());
        System.out.println("edad: " + obj1.getedad());
        System.out.println("correo: " + obj1.getcorreo());


           ejem10 obj2 = new ejem10(  "Maria", 30, "Maria@gmail.com");
        System.out.println("nombre: " + obj2.getnombre());
        System.out.println("edad: " + obj2.getedad());
        System.out.println("correo: " + obj2.getcorreo());
    }
    
}
