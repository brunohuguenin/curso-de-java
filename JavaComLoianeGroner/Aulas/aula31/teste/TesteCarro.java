package JavaComLoianeGroner.Aulas.aula31.teste;

import JavaComLoianeGroner.Aulas.aula31.dominio.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro onibus = new Carro();

        onibus.setMarca("Mercedes");
        onibus.setNumPassageiros(36);

        String marcaDOCarro = onibus.getMarca();

        System.out.printf("A marca do ônibus é %s\n", marcaDOCarro);
        System.out.printf("A capacidade de passageiros é igual a %d", onibus.getNumPassageiros());
    }
}
