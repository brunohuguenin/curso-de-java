package JavaComLoianeGroner.Aulas.aula36.teste;

import JavaComLoianeGroner.Aulas.aula36.dominio.Contato;
import JavaComLoianeGroner.Aulas.aula36.dominio.Endereco;
import JavaComLoianeGroner.Aulas.aula36.dominio.Telefone;

public class ContatoTeste {
    public static void main(String[] args) {
        Contato contato = new Contato();

        contato.setNome("Orochimaro");
       // contato.setEndereco("Logo Ali com a esquina Falta Pouco");

        // relacionamento tem-um endereço
        // Criar objeto endereço
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Lá longe");
        endereco.setNumero("S/N");
        endereco.setComplemento("Depois Dalí");
        endereco.setCidade("Pinamanhaguaba");
        endereco.setEstado("Far Far Way");
        endereco.setCep("23573340");

        contato.setEndereco(endereco);


        //contato.setTelefone("21 9999-9999");

        // relacionamento tem-um telefone
        // Criar um onjeto Telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Iphone 14");
        telefone.setDd("69");
        telefone.setNumero("99999-9999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("Motorola");
        telefone2.setDd("21");
        telefone2.setNumero("96687-9955");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        System.out.println(contato.getNome());

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);

        // Teste de saída no console
        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getNomeRua());
        } else {
            System.out.println("Valeu, Natalino");
        }

//        if (contato != null && contato.getTelefone() != null) {
//            System.out.println(contato.getTelefone().getTipo());
//        } else {
//            System.out.println("Perdeu, mané. Não amola");
//        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone tell: contato.getTelefones()) {
                System.out.println(tell.getTipo() + " - " + tell.getDd() + " " + tell.getNumero());
            }
        }
    }
}
