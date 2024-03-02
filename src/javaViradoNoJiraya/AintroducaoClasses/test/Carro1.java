package src.javaViradoNoJiraya.AintroducaoClasses.test;

import src.javaViradoNoJiraya.AintroducaoClasses.dominio.Carro;

public class Carro1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Corola";
        carro.modelo = "Sedan Executivo";
        carro.ano = 2023;

        System.out.println(carro.nome);
        System.out.println(carro.modelo);
        System.out.println(carro.ano);

        System.out.println("===================================");

        carro2.nome = "Cvic";
        carro2.modelo = "Sedan Executivo";
        carro2.ano = 2024;

        carro2 = carro;

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
