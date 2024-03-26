package JavaComLoianeGroner.Exercicios.aula46.dominio;

public class Cubo extends Figura3D {
    private int aresta;

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    @Override
    public double calcularArea() {
        return Math.pow(aresta, 2) * 6;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(aresta, 3);
    }
}
