package comoProgramarJava10ed.capitulo3.exemplo1.dominio;


public class Account {

    private String name; // variavel de instância

    // o construtor inicializa name com nome do parâmetro
    public Account(String name) { // o nome do construtor é nome da classe
        this.name = name;
    }

    // método para definir o nome no objeto
    public void setName(String name) {
        this.name = name; // armaxzena o nome
    }

    // método para recuperar o nome do objeto
    public String getName() {
        return name; // retorna valor do nome para o chamador
    }
}
