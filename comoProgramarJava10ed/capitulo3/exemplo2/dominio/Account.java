package comoProgramarJava10ed.capitulo3.exemplo2.dominio;

public class Account {

    private String name;
    private double balance;


    // Construtor de Account que recebe dois parâmetros
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance > 0.0) {
            this.balance = balance;
        }

    }

    public  void  deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

}
