import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalVentas = 0.0;

        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            double ventasDiarias = scanner.nextDouble();

            totalVentas += ventasDiarias;
        }

        System.out.println("El total de ventas de la semana es: $" + totalVentas);

        scanner.close();
    }
}
