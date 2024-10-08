import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de términos de la sucesión de Fibonacci que deseas calcular:");

        int n = sc.nextInt(); // cantidad de numeros a calcular

        // Creamos y empezamos el hilo
        Fibonaci fibonacciThread = new Fibonaci(n);
        fibonacciThread.start();
        System.out.println("Iniciando calculos...");

        try {
            fibonacciThread.join(); // Esperamos a que el hilo termine
        } catch (InterruptedException e) {
            System.err.println("El hilo fue interrumpido: " + e.getMessage());
        }
        System.out.println("Programa finalizado");
        sc.close();
    }
}
