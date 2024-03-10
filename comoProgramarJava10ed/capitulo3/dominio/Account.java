package comoProgramarJava10ed.capitulo3.dominio;

public class Account {
    private String name; // variavel de instância

    // método para definir o nome no objeto
    public void setName(String name) {
        this.name = name; // armaxzena o nome
    }

    // método para recuperar o nome do objeto
    public String getName() {
        return name; // retorna valor do nome para o chamador
    }
}
