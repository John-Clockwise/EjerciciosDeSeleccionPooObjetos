package pooobjetos;

public class Cuadrado {

    double lado;
    double Area;
    double Perimetro;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setPerimetro(double Perimetro) {
        this.Perimetro = Perimetro;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double CuadradoArea(double lado) {

        Area = Math.pow(lado, 2);

        return Area;
    }

    public double CuadradoPerimetro(double lado) {

        Perimetro = 4 * lado;
        return Perimetro;
    }

    public void mostrarCuadradoArea() {
        System.out.println("El Area del Cuadrado es .- " + Area);
    }

    public void mostrarCuadradoPerimetro() {
        System.out.println("El Perimetro del Cuadrado es .- " + Perimetro);
    }
}
