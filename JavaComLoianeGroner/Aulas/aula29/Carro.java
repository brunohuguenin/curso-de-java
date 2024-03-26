package JavaComLoianeGroner.Aulas.aula29;

public class Carro {
    String marca;
    String modelo;
     int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }


    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
}
