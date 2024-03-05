package src.javaViradoNoJiraya.BintroducaoMetodos.dominio;

public class Funcionario {
    public  String nome;
    public  int idade;
    public  double[] salarios;


    public void imprimirDadosS() {
        if (salarios == null) {
            return;
        }
        System.out.printf("Nome do funcionário: %s\nIdade do funcionário: %d\n", this.nome, this.idade);

        for (int i = 0; i < 1; i++) {
            System.out.println("Salário no primeiro ano: R$" + this.salarios[0]);
            System.out.println("Salário no segundo ao quarto ano: R$" + this.salarios[1]);
            System.out.println("Salário no quinto ao sexto ano: R$" + this.salarios[2]);
        }


        imprimirMediaSalarios();
    }
 
    public void imprimirMediaSalarios() {
        if (salarios == null) {
            return;
        }
        double acumulador = 0;
        double resultado;
        for (int i = 0; i < salarios.length; i++) {
            acumulador += salarios[i];
        }
        resultado = acumulador / this.salarios.length;
        System.out.printf("A média dos salários durante o tempo que o funcionário esteve na empresa foi de R$%.2f\n", resultado);
    }
}
