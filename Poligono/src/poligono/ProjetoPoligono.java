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
public class ProjetoPoligono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Desenho d = new Desenho("Poligonos");
        d.getPoligonos().add(new Triangulo(10, 10, 6, 1));
        d.getPoligonos().add(new Circunferencia(35, 2));
        d.getPoligonos().add(new Retangulo(10, 2, 3));
        d.MostrarPoligonos();
    }

}
