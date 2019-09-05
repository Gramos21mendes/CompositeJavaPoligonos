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
public class Retangulo extends Poligono {

    private double LadoA;
    private double LadoB;

    public Retangulo(double LadoA, double LadoB, int Id) {
        super(Id);
        this.LadoA = LadoA;
        this.LadoB = LadoB;
    }
    
    public double getLadoA() {
        return LadoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public void setLadoA(double LadoA) {
        this.LadoA = LadoA;
    }

    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }

    @Override
    public void GetData() {
        System.out.println("Retangulo");
    }

    @Override
    public void GetArea() {
         double area = LadoA * LadoB;
         System.out.println("Area do Retangulo: " + area);
    }

    @Override
    public void GetPerimetro() {
        double area = ((2*LadoA) + (2*LadoB));
         System.out.println("Perimetro do Retangulo: " + area);
    }

}
