import java.util.ArrayList;
import java.util.TreeSet;

public class Exercicio04 {
    public static void main(String[] args) {
        ArrayList<Integer> arrey = new ArrayList<>();
        TreeSet<Integer> tree = new TreeSet<>();
        int numAleatorio;

        for (int i = 0; i < 1000; i++) {
            numAleatorio = 1 + (int) (Math.random() * 500);
            arrey.add(numAleatorio);
        }

        for (Integer a : arrey) {
            tree.add(a);
        }

        for (Integer t : tree) {
            System.out.print(t+", ");
        }
System.out.println("");
        System.out.println("qtde de elementos no Array"+arrey.size());
        System.out.println("qtde de elemento na arvore: "+tree.size());

        //numeros que não estão na arvore.
        for (int i = 1; i < 501; i++) {
            if(!tree.contains(i)){
                System.out.print(i+", ");
            }
            
        }



    }
}