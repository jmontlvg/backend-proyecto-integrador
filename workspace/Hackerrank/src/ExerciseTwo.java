import java.util.Scanner;

public class ExerciseTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de consultas
        int q = scanner.nextInt();

        // Validar rango de 'q'
        if (q >= 0 && q <= 500) {
            // Procesar cada consulta
            for (int i = 0; i < q; i++) {
                // Leer los valores de a, b, y n
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

                // Validar rangos de 'a', 'b', y 'n'
                if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 1 && n <= 15)) {
                    // Inicializar suma con el valor de 'a'
                    int sum = a;

                    // Generar y mostrar los términos de la serie
                    for (int j = 0; j < n; j++) {
                        // Calcular 2^j * b manualmente
                        int term = 1;
                        for (int k = 0; k < j; k++) {
                            term *= 2;
                        }
                        sum += term * b;

                        // Imprimir el término
                        System.out.print(sum + " ");
                    }

                    // Imprimir una nueva línea después de cada serie
                    System.out.println();
                } else {
                    // Imprimir mensaje de error si 'a', 'b' o 'n' están fuera de rango
                    System.out.println("Invalid input: a, b, and n must satisfy 0 <= a, b <= 50 and 1 <= n <= 15.");
                }
            }
        } else {
            // Imprimir mensaje de error si 'q' está fuera de rango
            System.out.println("Invalid input: q must satisfy 0 <= q <= 500.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}