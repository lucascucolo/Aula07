
import java.util.Stack;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {

        String frase, palavra[];
        Stack<Character> pilha = new Stack<>();

        frase = "ESTE EXERCICIO E MUITO FACIL";

        /*
         * for (int i = 0; i < frase.length(); i++) { pilha.push(frase.charAt(i)); }
         */

        palavra = frase.split("\s");

        for (int i = 0; i < palavra.length; i++) {
            for (int j = 0; j < palavra[i].length(); j++) {
                pilha.push(palavra[i].charAt(j));
            }
            while (!pilha.isEmpty()) {
                System.out.print(pilha.pop());
            }
            System.out.print(" ");
        }

    }
}