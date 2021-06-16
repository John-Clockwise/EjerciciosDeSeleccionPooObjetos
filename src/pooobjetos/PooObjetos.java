package pooobjetos;

import java.util.Scanner;

public class PooObjetos {

    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5);
        Scanner leer = new Scanner(System.in);
        int opcion;
        try {

            do {
                System.out.println("De la medida de un lado");
                double lado = leer.nextDouble();

                do {
                    // mostrar el menu

                    System.out.println("--------------Menu---------------");
                    System.out.println("El tamaño del lado es .- " + lado);
                    System.out.println("Calcular Area del Cuadrado presione 1");
                    System.out.println("Calcular Perimetro del Cuadrado presione 2");
                    System.out.println("Calcular Volumen del Cubo presione 3");
                    System.out.println("Calcular Perimetro del Cubo presione 4");
                    System.out.println("Cancelar presione 5");
                    System.out.println("Salir presione 6");
                    System.out.println("---------------------------------");
                    opcion = leer.nextInt();

                    switch (opcion) {

                        case 1:
                            cuadrado.CuadradoArea(lado);
                            cuadrado.mostrarCuadradoArea();
                            break;
                        case 2:
                            cuadrado.CuadradoPerimetro(lado);
                            cuadrado.mostrarCuadradoPerimetro();
                            break;
                        case 3:
                            Cuadrado cua = new Cuadrado(lado);
                            Cubo cubo = new Cubo(lado, lado);
                            cubo.mostrarPerimetro();
                            break;
                        case 4:
                            Cuadrado cua1 = new Cuadrado(lado);
                            Cubo cubo1 = new Cubo(lado, lado);
                            cubo1.mostarVolumen();
                            break;
                        case 6:
                            System.exit(0);
                            break;
                    }

                } while (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4);

            } while (opcion == 5);

        } catch (Exception e) {
        }

    }

}
