public class ejem7 {
    private static int contador = 0; // Cambiado a static

    public ejem7() {
         contador = 1;
    }

    public static void incrementadorContador() { // Cambiado a static
        contador++;
    }

    public static int getContador() { // Cambiado a static
        return contador;
    }

    public static void main(String[] args){
        ejem7 obj1 = new ejem7();
        ejem7 obj2 = new ejem7();
        System.out.println("Contador del objeto 1: " + obj1.getContador());
        System.out.println("Contador del objeto 2: " + obj2.getContador()); 
        obj1.incrementadorContador();
        obj2.incrementadorContador();
        System.out.println("Contador del objeto 1 despues de incrementar: * " + obj1.getContador());
        System.out.println("Contador del objeto 2 despues de incrementar: * " + obj2.getContador());
        
        // Ahora sí funciona porque el método es estático:
        System.out.println("Contador estatico despues de incrementar: * " + ejem7.getContador());
    }
}