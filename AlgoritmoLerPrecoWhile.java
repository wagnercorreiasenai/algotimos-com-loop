package javaapplication3;

import java.util.Scanner;

public class AlgoritmoLerPrecoWhile {

    public static void main(String[] args) {
        
        int soma, maiorValor, entrada;
        soma = maiorValor = entrada = 0;
        
        int menorValor = 0;
        int i = 0;
        
        Scanner leia = new Scanner(System.in);
        
        String aux = "";
        
        while(true) {
            System.out.println
            ("Informe o valor do produto:");
            
            aux = leia.next();
            
            if (aux.equals("sair")) {
                System.out.println("Operação finalizada.");
                break;
            }
            
            //Para quem utilizou INT
            entrada = Integer.parseInt(aux);
            
            if (entrada > maiorValor | i == 0) {
                maiorValor = entrada;
            }
            
            if (entrada < menorValor | i == 0) {
                menorValor = entrada;
            }
            
            soma += entrada;
            i++;
        }
        
        System.out.println("O menor valor é: "+menorValor);
        System.out.println("O maior valor é: "+maiorValor);
        System.out.println("A média é: "+(soma/i));
                
    }
    
}
