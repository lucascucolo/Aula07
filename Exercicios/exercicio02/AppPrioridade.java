package exercicio02;

import java.util.Scanner;

public class AppPrioridade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAtendimento,tamanho;
        String nome, senha,opcao;
        FiladePrioridade pessoa = new FiladePrioridade();
        numAtendimento = 0;
 

         do {
            System.out.println("digite uma opcao");
            System.out.println("a- Fila Normal");
            System.out.println("b- Fila Prioritaria");
            opcao=in.nextLine();
            switch (opcao) {
                
                case "a":
                    System.out.println("digite seu nome");
                    nome = in.nextLine();
                    numAtendimento++;
                    senha = "FN" + numAtendimento;
                    pessoa.addPessoaFilaNormal(nome, senha, numAtendimento);
                    break;
                case "b":
                System.out.println("digite seu nome");
                    nome = in.nextLine();
                    numAtendimento++;
                    senha = "FP" + numAtendimento;
                    pessoa.addPessoaFilaPrioridade(nome, senha, numAtendimento);
                    break;
                default:
                    break;
            }

        } while (!opcao.equals("z")); 
        
        in.close();

        pessoa.addPessoaFilaNormal("Lucas1", "FN1", 1);
        pessoa.addPessoaFilaPrioridade("Lucas2", "FP2", 2);
        pessoa.addPessoaFilaNormal("Lucas3", "FN2", 3);
        pessoa.addPessoaFilaPrioridade("Lucas4", "FP3", 4);
        pessoa.addPessoaFilaPrioridade("Lucas5", "FP4", 5);
        pessoa.addPessoaFilaNormal("Lucas6", "FN3", 6);
        pessoa.addPessoaFilaPrioridade("Lucas7", "FP5", 7);

        tamanho=pessoa.tamanhoFilas();
        for (int i = 0; i < tamanho+1; i++) {
            pessoa.atender();
        }

/*         pessoa.atender();
        pessoa.atender();
        pessoa.atender();
        pessoa.atender();
        pessoa.atender();
        pessoa.atender();
        pessoa.atender();
        pessoa.atender();
 */


        }
    }
