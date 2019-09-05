/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

/**
 *
 * @author guilherme.rmendes
 */
public class Triangulo extends Poligono {

    private double LadoA;
    private double LadoB;
    private double LadoC;

    public Triangulo(double LadoA, double LadoB, double LadoC, int Id) {
        super(Id);
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.LadoC = LadoC;
    }

    public double getLadoA() {
        return LadoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public double getLadoC() {
        return LadoC;
    }

    public void setLadoA(double LadoA) {
        this.LadoA = LadoA;
    }

    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }

    public void setLadoC(double LadoC) {
        this.LadoC = LadoC;
    }

    @Override
    public void GetData() {
        System.out.println("Triangulo");
    }

    @Override
    public void GetArea() {
        double s = (LadoA + LadoB + LadoC) / 2;
        double area = Math.pow(s * (s - LadoA) * (s - LadoB) * (s - LadoC), 0.5);
        System.out.println("Area do Triangulo: " + area);
    }

    @Override
    public void GetPerimetro() {
        double soma = (LadoA + LadoB + LadoC);
        System.out.println("Perimetro Triangulo: " + soma);
    }

}
