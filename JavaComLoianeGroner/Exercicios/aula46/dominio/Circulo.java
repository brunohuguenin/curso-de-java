package JavaComLoianeGroner.Exercicios.aula46.dominio;

public class Circulo extends Figura2D {
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (Math.pow(raio, 2));
    }
}
