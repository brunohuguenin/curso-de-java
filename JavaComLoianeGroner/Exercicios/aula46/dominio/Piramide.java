package JavaComLoianeGroner.Exercicios.aula46.dominio;

public class Piramide extends Figura3D {
    private double altura;
    private double arestaBase;
    private double apotema;
    private Figura2D base;
    private int poliBae;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public int getPoliBae() {
        return poliBae;
    }

    public void setPoliBae(int poliBae) {
        this.poliBae = poliBae;
    }

    @Override
    public double calcularArea() {
        double areaLateral = poliBae * ((arestaBase * apotema) / 2);

        if (base != null) {
            return areaLateral * base.calcularArea();
        } else {
            return 0;
        }

    }

    @Override
    public double calcularVolume() {
        if (base != null) {
            return (base.calcularArea() * altura) / 3;
        } else {
            return 0;
        }

    }
}
