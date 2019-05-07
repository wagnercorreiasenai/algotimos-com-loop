package exercicioloop;

import java.util.Scanner;

public class ExercicioLoopMaiorMenor {

    public static void main(String[] args) {

        int maiorNumero = 0;
        int menorNumero = 0;
        int numeroPar = 0;
        int entrada = 0;
        int contador = 0;

        String aux;

        Scanner leia = new Scanner(System.in);

        while (true) {

            System.out.println("Informe um número:");
            aux = leia.next();

            if (aux.equals("sair")) {
                break;
            }

            entrada = Integer.parseInt(aux);

            if (entrada > maiorNumero | contador == 0) {
                maiorNumero = entrada;
            }

            if (entrada < menorNumero | contador == 0) {
                menorNumero = entrada;
            }

            if (entrada % 2 == 0) {
                numeroPar = entrada;
            }

            contador++;
            System.out.println("Maior número informado: " + maiorNumero);
            System.out.println("Menor número informado: " + menorNumero);
            System.out.println("Último número par informado: " + numeroPar);

        }

    }

}
