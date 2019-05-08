package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
       
        int anterior = 1;
        int atual = 0;
        int proximo = 0;
        
        for (int i = 0; i < 30; i++) {
            proximo = atual + anterior;
            System.out.println(proximo);
            anterior = atual;
            atual = proximo;
        }
        
    }
    
}
