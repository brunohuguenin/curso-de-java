package src.javaViradoNoJiraya.GassociaoresEstaticos.domain;

public class Jogador {
    private String nome;

    public void imprime() {
        System.out.print(this.nome + " ");
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

