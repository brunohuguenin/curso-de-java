package src.javaViradoNoJiraya.BintroducaoMetodos.dominio;

public class Funcionario {
    private  String nome;
    private  int idade;
    private  double[] salarios;
    private double acumulador;


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

        double resultado;
        for (int i = 0; i < salarios.length; i++) {
            acumulador += salarios[i];
        }
        resultado = acumulador / this.salarios.length;
        System.out.printf("A média dos salários durante o tempo que o funcionário esteve na empresa foi de R$%.2f\n", resultado);
    }
    // alt insert

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public void setAcumulador(double acumulador) {
        this.acumulador = acumulador;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

}
