/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligono;

import static java.lang.Math.PI;

/**
 *
 * @author guilherme.rmendes
 */
public class Circunferencia extends Poligono {

    private double Raio;

    public Circunferencia(double Raio, int Id) {
        super(Id);
        this.Raio = Raio;
    }

    public double getRaio() {
        return Raio;
    }

    public void setRaio(double Raio) {
        this.Raio = Raio;
    }

    @Override
    public void GetData() {
        System.out.println("Circunferencia, Id: " + getId());
    }

    @Override
    public void GetArea() {
        double area = PI * Math.pow(Raio, 2);
        System.out.println("Area da Circunferencia: " + area);
    }

    @Override
    public void GetPerimetro() {
        double perimetro = ((2 * PI) * Raio);
        System.out.println("Perimetro Circunferencia: " + perimetro);
    }

}
