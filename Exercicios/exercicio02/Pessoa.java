package exercicio02;

public class Pessoa {
    int numAtendimento;
    String nome,senha;

    public Pessoa(String nome, String senha,int numAtendimento) {
        this.senha = senha;
        this.nome = nome;
        this.numAtendimento=numAtendimento;
    }

    public void addPessoa(String nome, String senha) {
        this.senha = senha;
        this.nome = nome;
    }

    public int getNumAtendimento() {
        return numAtendimento;
    }

    public void setNumAtendimento(int numAtendimento) {
        this.numAtendimento = numAtendimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDados() {
        return "Senha: "+senha+"-- Nome: "+nome+"-- NumAtendimento: "+numAtendimento;
    }
    
}