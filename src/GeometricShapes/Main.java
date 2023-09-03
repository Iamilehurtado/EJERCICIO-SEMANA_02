/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author Iamile
 */
public class Main {
    public static void main(String[] args) {
        Punto puntoA = new Punto(1, 2);
        Punto puntoB = new Punto(3, 4);
        System.out.println(puntoA);
        System.out.println("Distancia entre puntos: " + puntoA.calcularDistancia(puntoB));

        Triangulo triangulo = new Triangulo(new Punto(1, 1), new Punto(3, 1), new Punto(2, 4));
        System.out.println(triangulo);
        System.out.println("Área del triángulo: " + SuperficiePlana.calcularAreaTriangulo(triangulo));
    }
}
