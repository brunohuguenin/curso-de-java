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

//    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_,double consumoCombustivel_) {
//        marca = marca_;
//        modelo = modelo_;
//        numPassageiros = numPassageiros_;
//        capCombustivel = capCombustivel_;
//        consumoCombustivel = consumoCombustivel_;
//    }


    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }
}
