import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horasEstudiar = 0;
        int horasEjercicios = 0;
        int horasLeer = 0;
        int horasTiempoLibre = 0;

        String[] actividades = {"estudiar", "hacer ejercicios", "leer", "tiempo libre"};
        int index = 0;

        while (index < actividades.length) {
            System.out.print("Ingrese las horas dedicadas a " + actividades[index] + ": ");
            int horas = scanner.nextInt();

            switch (index) {
                case 0:
                    horasEstudiar = horas;
                    break;
                case 1:
                    horasEjercicios = horas;
                    break;
                case 2:
                    horasLeer = horas;
                    break;
                case 3:
                    horasTiempoLibre = horas;
                    break;
            }
            index++;
        }

        int tiempoTotal = horasEstudiar + horasEjercicios + horasLeer + horasTiempoLibre;

        System.out.println("El tiempo total dedicado a actividades es: " + tiempoTotal + " horas.");

        scanner.close();
    }
}
