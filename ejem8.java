import java.util.Scanner;
public class ejem8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] arreglo2 = new int[]{6, 7, 8, 9, 10};
        int[] arreglo3 = new int[5];
        int valor;

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese 5 numeros para llenar el arreglo2");
            valor = teclado.nextInt();
            arreglo[i] = valor;
        }

        int i=0;
        while (i < arreglo.length) {
            System.out.println("ingrese  5 numeros para llenar el arreglo2");
            i++;
            if(i >=arreglo2.length){
                break;
            }
            
        }
      int i=0;
      while (i < arreglo2.length) {
            System.out.println("Ingrese 5 numeros para llenar el arreglo2");
            valor = teclado.nextInt();
            arreglo2[i] = valor;
        }
    }
}
