package src.javaViradoNoJiraya.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {

        System.out.println("-----------------------------");

        System.out.printf("Estudante 01\nnome: %s\nidade: %d\nsexo: %c\n", estudante.nome, estudante.idade, estudante.sexo);
        //System.out.println("Valeu, JavaScripto");
        estudante.nome = "Gohan";
    }
}
