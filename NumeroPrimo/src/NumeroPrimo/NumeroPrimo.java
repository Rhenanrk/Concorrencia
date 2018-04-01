package NumeroPrimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        int inicio, fim, cont = 0, contador = 0;
        long tempoInicio;
        Scanner ler = new Scanner(System.in);

        System.out.println("Numero inicial: ");
        inicio = ler.nextInt();
        System.out.println("Numero final: ");
        fim = ler.nextInt();

        // Inicio do processamento
        tempoInicio = System.currentTimeMillis();
        while (inicio <= fim) {
            for (int i = 1; i <= fim; i++) {
                if (inicio % i == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                contador++;
            }
            inicio++;
            cont = 0;
        }
        System.out.println("=========================================");
        System.out.println("Numeros primos totais: " + contador + ".");
        System.out.println("Tempo de processamento = " + (System.currentTimeMillis() - tempoInicio) + " milisegundos.");
    }
}
