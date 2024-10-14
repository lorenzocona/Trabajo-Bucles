import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double tarifaPorHora = 15.0;

        System.out.print("Ingrese la cantidad de empleados: ");
        int cantidadEmpleados = scanner.nextInt();

        int contador = 0;

        while (contador < cantidadEmpleados) {
            System.out.print("Ingrese las horas trabajadas para el empleado " + (contador + 1) + ": ");
            int horasTrabajadas = scanner.nextInt();

            double salarioSemanal = horasTrabajadas * tarifaPorHora;

            System.out.println("El salario semanal del empleado " + (contador + 1) + " es: $" + salarioSemanal);

            contador++;
        }
        scanner.close();
    }
}
