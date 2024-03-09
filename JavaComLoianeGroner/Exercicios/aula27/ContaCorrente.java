package JavaComLoianeGroner.Exercicios.aula27;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double saldo;

    boolean reaLizarSaque(double quantiaASacar) {
        // term saldo na conta
        if (saldo >= quantiaASacar) {
            saldo -= quantiaASacar;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar) {
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void depositarDinheiro(double valorDeposito) {
        saldo += valorDeposito;
    }
}
