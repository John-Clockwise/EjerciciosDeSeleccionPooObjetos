package pooobjetos;

public class Cubo extends Cuadrado {

    double Volumen;

    public Cubo(double Lado, double volumen) {
        super(Lado);
        this.Volumen = volumen;
    }

    public void mostrarPerimetro() {
        System.out.println("El Perimetro es .- " + (12 * getLado()));
    }

    public void mostarVolumen() {
        System.out.println("El Volumen es .- " + (Math.pow(getLado(), 3)));
    }

}
