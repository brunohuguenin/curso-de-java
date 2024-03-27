package JavaComLoianeGroner.Aulas.aula55.teste;

import JavaComLoianeGroner.Aulas.aula54.dominio.DiaSemana;

public class TesteEnum {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

//        for (int i = 0; i < dias.length; i++) {
//            System.out.println(dias[i]);
//        }

        for (DiaSemana dia: DiaSemana.values()) {
            System.out.println(dia);
        }
    }

}
