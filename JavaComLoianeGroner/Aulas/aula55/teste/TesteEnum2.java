package JavaComLoianeGroner.Aulas.aula55.teste;

import JavaComLoianeGroner.Aulas.aula53.dominio.DiaSemana;

public class TesteEnum2 {
    public static void main(String[] args) {

//        DiaSemana dia;

        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");

        System.out.println(dia);

    }
}
