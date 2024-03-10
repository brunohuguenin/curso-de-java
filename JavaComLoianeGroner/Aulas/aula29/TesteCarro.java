package JavaComLoianeGroner.Aulas.aula29;

public class TesteCarro {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;

        System.out.printf("\nMarca do carro: %s\nModelo: %s\nNúmeros de passageiros: %d\n", fusca.marca, fusca.modelo, fusca.numPassageiros);

        Carro van = new Carro("Fiat", "Ducato", 10, 100, 0.5);
        System.out.println(van.marca);
        System.out.println(van.modelo);
        System.out.println(van.numPassageiros);
        System.out.println(van.capCombustivel);
        System.out.println(van.consumoCombustivel);
    }
}
