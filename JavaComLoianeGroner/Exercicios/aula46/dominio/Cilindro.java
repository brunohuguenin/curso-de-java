package JavaComLoianeGroner.Exercicios.aula46.dominio;

public class Cilindro extends Figura3D {
    private int altura;
    private int raio;



    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
         double areaLateral = 2 * 3.14 * raio * altura;
         double areBase = 3.14 * Math.pow(raio,2);
         double areaTotal = (2 * areBase) + areaLateral;

        return areaTotal;
    }

    @Override
    public double calcularVolume() {
        return 3.14 * Math.pow(raio, 2) * altura;
    }
}
