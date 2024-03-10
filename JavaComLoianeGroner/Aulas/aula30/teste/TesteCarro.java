package JavaComLoianeGroner.Aulas.aula30.teste;


import JavaComLoianeGroner.Aulas.aula30.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro("Chevrolet", "Ret", 8, 100, 10);
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        van.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("A autonomia do carro é: " + autonomia);
        System.out.println("A autonomia do carro é: " + van.obterAutonomia());

        double qtdCombustivel = van.calcularCombustivel(320);
        System.out.println("qtdCombustivel: " + qtdCombustivel);
    }
}
