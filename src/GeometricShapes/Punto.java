/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GeometricShapes;

/**
 *
 * @author Iamile
 */
public class Punto {
    private int x;
    private int y;

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public Punto(int coordenadaX, int coordenadaY) {
        this.x = coordenadaX;
        this.y = coordenadaY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + x + "," + y;
    }

    public double calcularDistancia(Punto otroPunto) {
        int dx = this.x - otroPunto.x;
        int dy = this.y - otroPunto.y;
        return Math.sqrt(dx * dx + dy * dy);// FORMULA DE HERON
    }

    public double calcularDistancia(int coordenadaX, int coordenadaY) {
        return calcularDistancia(new Punto(coordenadaX, coordenadaY));
    }
}
