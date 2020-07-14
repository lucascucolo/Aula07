package exercicio02;

import java.util.LinkedList;
import java.util.Queue;

public class FiladePrioridade {
    Pessoa pessoa;
    Queue<Pessoa> filaNormal = new LinkedList<>();
    Queue<Pessoa> filaPrioridade = new LinkedList<>();
    int contador=0;

    public FiladePrioridade() {

    }

    public boolean addPessoaFilaNormal(String nome, String senha, int numAtendimento) {
        Pessoa p = new Pessoa(nome, senha,numAtendimento);
        if (numAtendimento > 0) {
            filaNormal.add(p);
            return true;
        }
        return false;
    }

    public boolean addPessoaFilaPrioridade(String nome, String senha, int numAtendimento) {
        if (numAtendimento > 0) {
            Pessoa p = new Pessoa(nome, senha,numAtendimento);
            filaPrioridade.add(p);
            return true;
        }
        return false;
    }

    public void listarFN() {
        while (!filaNormal.isEmpty()) {
            System.out.println(filaNormal.remove());
        }
        
    }
    
    public void listarFP() {
        while (!filaPrioridade.isEmpty()) {
            System.out.println(filaPrioridade.remove());
        }
        
    }
    
    public void atender(){
        if(!filaNormal.isEmpty()){
            if(!filaPrioridade.isEmpty() && contador<2){
                System.out.println("atendimento Prioritario: "+filaPrioridade.remove().getDados());
                contador++;
            }else{
                contador=0;
                System.out.println("atendimento Normal     : "+filaNormal.remove().getDados());             
            }
        }else{
            System.out.println("Todomundo ja foi atendido");
        }

    }
    
    public int tamanhoFilas(){
        return filaNormal.size()+filaPrioridade.size();
    }
}
