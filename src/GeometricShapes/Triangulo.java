/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author Iamile
 */
public class Triangulo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private String nombre;

    public Triangulo() {
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
        this.nombre = "Triángulo";
    }

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.punto1 = p1;
        this.punto2 = p2;
        this.punto3 = p3;
        this.nombre = "Triángulo";
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private double calcularDistancia(Punto p1, Punto p2) {
        return p1.calcularDistancia(p2);
    }

    private double calcularSemiperimetro() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        return (lado1 + lado2 + lado3) / 2.0;
    }

    protected double calcularArea() {
        double semiperimetro = calcularSemiperimetro();
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " +
               getPunto1().toString() + "," + getPunto2().toString() + "," + getPunto3().toString();
    }
}
