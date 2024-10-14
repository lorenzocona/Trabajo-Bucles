import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de productos: ");
        int numeroProductos = scanner.nextInt();

        for (int i = 0; i < numeroProductos; i++) {
            System.out.print("Ingrese la cantidad disponible para el producto " + (i + 1) + ": ");
            int cantidadDisponible = scanner.nextInt();

            if (cantidadDisponible < 5) {
                System.out.println("Es necesario realizar un pedido para el producto " + (i + 1) + ".");
            }
        }
        scanner.close();
    }
}
