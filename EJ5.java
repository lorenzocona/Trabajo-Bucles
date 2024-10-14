import java.util.Scanner;

public class EJ5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el número de empleados: ");
            int numeroEmpleados = scanner.nextInt();

            int contador = 0;

            do {
                System.out.print("Ingrese las horas trabajadas por el empleado " + (contador + 1) + ": ");
                int horasTrabajadas = scanner.nextInt();

                if (horasTrabajadas > 40) {
                    int horasExtras = horasTrabajadas - 40;
                    System.out.println("El empleado " + (contador + 1) + " trabajó " + horasExtras + " horas extras.");
                } else {
                    System.out.println("El empleado " + (contador + 1) + " no trabajó horas extras.");
                }

                contador++;
            } while (contador < numeroEmpleados);

            scanner.close();
        }
}
