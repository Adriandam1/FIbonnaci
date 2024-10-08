public class Fibonaci extends Thread {
    private final int n;

    public Fibonaci(int n) {
        this.n = n; // Guardamos el número de términos a calcular
    }

    @Override
    public void run() {
        calcularFibonacci();
    }

    private void calcularFibonacci() {
        System.out.println("Cálculo de los primeros " + n + " números de Fibonacci:");
        long[] fibonacci = new long[n]; // Usamos long para manejar números más grandes
        // Inicialización de los dos primeros elementos
        if (n >= 1) {
            fibonacci[0] = 1;
            System.out.print(fibonacci[0] + " ");
        }
        if (n >= 2) {
            fibonacci[1] = 1;
            System.out.print(fibonacci[1] + " ");
        }

        // Cálculo de los siguientes elementos
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2]; // Suma de los dos anteriores
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println("\nCálculo completado.");

    }
}
